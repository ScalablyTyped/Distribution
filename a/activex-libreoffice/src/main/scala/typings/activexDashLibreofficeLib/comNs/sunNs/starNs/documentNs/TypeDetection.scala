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
    ElementNames: stdLib.SafeArray[java.lang.String],
    ElementType: activexDashLibreofficeLib.`type`,
    acquire: () => scala.Unit,
    addFlushListener: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XFlushListener => scala.Unit,
    createSubSetEnumerationByProperties: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.NamedValue] => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumeration,
    createSubSetEnumerationByQuery: java.lang.String => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumeration,
    flush: () => scala.Unit,
    getByName: java.lang.String => js.Any,
    getElementNames: () => stdLib.SafeArray[java.lang.String],
    getElementType: () => activexDashLibreofficeLib.`type`,
    hasByName: java.lang.String => scala.Boolean,
    hasElements: () => scala.Boolean,
    insertByName: (java.lang.String, js.Any) => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    queryTypeByDescriptor: (js.Array[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
    ], scala.Boolean) => java.lang.String,
    queryTypeByURL: java.lang.String => java.lang.String,
    release: () => scala.Unit,
    removeByName: java.lang.String => scala.Unit,
    removeFlushListener: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XFlushListener => scala.Unit,
    replaceByName: (java.lang.String, js.Any) => scala.Unit
  ): TypeDetection = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames, ElementType = ElementType, acquire = js.Any.fromFunction0(acquire), addFlushListener = js.Any.fromFunction1(addFlushListener), createSubSetEnumerationByProperties = js.Any.fromFunction1(createSubSetEnumerationByProperties), createSubSetEnumerationByQuery = js.Any.fromFunction1(createSubSetEnumerationByQuery), flush = js.Any.fromFunction0(flush), getByName = js.Any.fromFunction1(getByName), getElementNames = js.Any.fromFunction0(getElementNames), getElementType = js.Any.fromFunction0(getElementType), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), insertByName = js.Any.fromFunction2(insertByName), queryInterface = js.Any.fromFunction1(queryInterface), queryTypeByDescriptor = js.Any.fromFunction2(queryTypeByDescriptor), queryTypeByURL = js.Any.fromFunction1(queryTypeByURL), release = js.Any.fromFunction0(release), removeByName = js.Any.fromFunction1(removeByName), removeFlushListener = js.Any.fromFunction1(removeFlushListener), replaceByName = js.Any.fromFunction2(replaceByName))
  
    __obj.asInstanceOf[TypeDetection]
  }
}

