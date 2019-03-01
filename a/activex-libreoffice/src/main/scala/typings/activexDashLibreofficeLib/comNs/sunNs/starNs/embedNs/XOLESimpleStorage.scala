package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface allows to access and change contents of OLE storages.
  *
  * This is a simple container allowing the access to OLE storages. The subcomponents are either OLE storages themselves or streams.
  */
trait XOLESimpleStorage
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent
     with XTransactedObject
     with XClassifiedObject

object XOLESimpleStorage {
  @scala.inline
  def apply(
    ClassID: activexDashInteropLib.SafeArray[scala.Double],
    ClassName: java.lang.String,
    ElementNames: activexDashInteropLib.SafeArray[java.lang.String],
    ElementType: activexDashLibreofficeLib.`type`,
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    commit: js.Function0[scala.Unit],
    dispose: js.Function0[scala.Unit],
    getByName: js.Function1[java.lang.String, js.Any],
    getClassID: js.Function0[activexDashInteropLib.SafeArray[scala.Double]],
    getClassName: js.Function0[java.lang.String],
    getElementNames: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    getElementType: js.Function0[activexDashLibreofficeLib.`type`],
    hasByName: js.Function1[java.lang.String, scala.Boolean],
    hasElements: js.Function0[scala.Boolean],
    insertByName: js.Function2[java.lang.String, js.Any, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeByName: js.Function1[java.lang.String, scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    replaceByName: js.Function2[java.lang.String, js.Any, scala.Unit],
    revert: js.Function0[scala.Unit],
    setClassInfo: js.Function2[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], 
      java.lang.String, 
      scala.Unit
    ]
  ): XOLESimpleStorage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ClassID")(ClassID)
    __obj.updateDynamic("ClassName")(ClassName)
    __obj.updateDynamic("ElementNames")(ElementNames)
    __obj.updateDynamic("ElementType")(ElementType)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("commit")(commit)
    __obj.updateDynamic("dispose")(dispose)
    __obj.updateDynamic("getByName")(getByName)
    __obj.updateDynamic("getClassID")(getClassID)
    __obj.updateDynamic("getClassName")(getClassName)
    __obj.updateDynamic("getElementNames")(getElementNames)
    __obj.updateDynamic("getElementType")(getElementType)
    __obj.updateDynamic("hasByName")(hasByName)
    __obj.updateDynamic("hasElements")(hasElements)
    __obj.updateDynamic("insertByName")(insertByName)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeByName")(removeByName)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.updateDynamic("replaceByName")(replaceByName)
    __obj.updateDynamic("revert")(revert)
    __obj.updateDynamic("setClassInfo")(setClassInfo)
    __obj.asInstanceOf[XOLESimpleStorage]
  }
}

