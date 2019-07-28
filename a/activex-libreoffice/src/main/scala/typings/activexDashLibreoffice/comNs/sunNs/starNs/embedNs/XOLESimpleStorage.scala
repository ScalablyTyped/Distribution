package typings.activexDashLibreoffice.comNs.sunNs.starNs.embedNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNameContainer
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XComponent
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface allows to access and change contents of OLE storages.
  *
  * This is a simple container allowing the access to OLE storages. The subcomponents are either OLE storages themselves or streams.
  */
trait XOLESimpleStorage
  extends XNameContainer
     with XComponent
     with XTransactedObject
     with XClassifiedObject

object XOLESimpleStorage {
  @scala.inline
  def apply(
    ClassID: SafeArray[Double],
    ClassName: String,
    ElementNames: SafeArray[String],
    ElementType: `type`,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    commit: () => Unit,
    dispose: () => Unit,
    getByName: String => js.Any,
    getClassID: () => SafeArray[Double],
    getClassName: () => String,
    getElementNames: () => SafeArray[String],
    getElementType: () => `type`,
    hasByName: String => Boolean,
    hasElements: () => Boolean,
    insertByName: (String, js.Any) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeByName: String => Unit,
    removeEventListener: XEventListener => Unit,
    replaceByName: (String, js.Any) => Unit,
    revert: () => Unit,
    setClassInfo: (SeqEquiv[Double], String) => Unit
  ): XOLESimpleStorage = {
    val __obj = js.Dynamic.literal(ClassID = ClassID, ClassName = ClassName, ElementNames = ElementNames, ElementType = ElementType, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), commit = js.Any.fromFunction0(commit), dispose = js.Any.fromFunction0(dispose), getByName = js.Any.fromFunction1(getByName), getClassID = js.Any.fromFunction0(getClassID), getClassName = js.Any.fromFunction0(getClassName), getElementNames = js.Any.fromFunction0(getElementNames), getElementType = js.Any.fromFunction0(getElementType), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), insertByName = js.Any.fromFunction2(insertByName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeByName = js.Any.fromFunction1(removeByName), removeEventListener = js.Any.fromFunction1(removeEventListener), replaceByName = js.Any.fromFunction2(replaceByName), revert = js.Any.fromFunction0(revert), setClassInfo = js.Any.fromFunction2(setClassInfo))
  
    __obj.asInstanceOf[XOLESimpleStorage]
  }
}

