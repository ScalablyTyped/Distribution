package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * encapsulate a type detection service and provide read/write access on it's configuration data.
  *
  * It's possible to make a "flat" detection which may use internal configuration data only - or a "deep" detection which use special {@link
  * ExtendedTypeDetection} services to look into the document stream. Last mode can be suppressed to perform the operation. Of course the results can't be
  * guaranteed then. (e.g. in case the extension was changed)
  */
trait TypeDetection
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer
     with XTypeDetection
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XContainerQuery
     with activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XFlushable

object TypeDetection {
  @scala.inline
  def apply(
    ElementNames: activexDashInteropLib.SafeArray[java.lang.String],
    ElementType: activexDashLibreofficeLib.`type`,
    acquire: js.Function0[scala.Unit],
    addFlushListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XFlushListener, scala.Unit],
    createSubSetEnumerationByProperties: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.NamedValue], 
      activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumeration
    ],
    createSubSetEnumerationByQuery: js.Function1[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumeration
    ],
    flush: js.Function0[scala.Unit],
    getByName: js.Function1[java.lang.String, js.Any],
    getElementNames: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    getElementType: js.Function0[activexDashLibreofficeLib.`type`],
    hasByName: js.Function1[java.lang.String, scala.Boolean],
    hasElements: js.Function0[scala.Boolean],
    insertByName: js.Function2[java.lang.String, js.Any, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    queryTypeByDescriptor: js.Function2[
      js.Array[
        activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
      ], 
      scala.Boolean, 
      java.lang.String
    ],
    queryTypeByURL: js.Function1[java.lang.String, java.lang.String],
    release: js.Function0[scala.Unit],
    removeByName: js.Function1[java.lang.String, scala.Unit],
    removeFlushListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XFlushListener, scala.Unit],
    replaceByName: js.Function2[java.lang.String, js.Any, scala.Unit]
  ): TypeDetection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ElementNames")(ElementNames)
    __obj.updateDynamic("ElementType")(ElementType)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addFlushListener")(addFlushListener)
    __obj.updateDynamic("createSubSetEnumerationByProperties")(createSubSetEnumerationByProperties)
    __obj.updateDynamic("createSubSetEnumerationByQuery")(createSubSetEnumerationByQuery)
    __obj.updateDynamic("flush")(flush)
    __obj.updateDynamic("getByName")(getByName)
    __obj.updateDynamic("getElementNames")(getElementNames)
    __obj.updateDynamic("getElementType")(getElementType)
    __obj.updateDynamic("hasByName")(hasByName)
    __obj.updateDynamic("hasElements")(hasElements)
    __obj.updateDynamic("insertByName")(insertByName)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("queryTypeByDescriptor")(queryTypeByDescriptor)
    __obj.updateDynamic("queryTypeByURL")(queryTypeByURL)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeByName")(removeByName)
    __obj.updateDynamic("removeFlushListener")(removeFlushListener)
    __obj.updateDynamic("replaceByName")(replaceByName)
    __obj.asInstanceOf[TypeDetection]
  }
}

