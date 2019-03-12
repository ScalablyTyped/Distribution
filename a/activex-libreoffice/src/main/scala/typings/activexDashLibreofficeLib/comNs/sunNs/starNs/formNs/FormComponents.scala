package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies the capabilities of a collection of {@link FormComponents} .
  *
  * The collection must provide the possibility of adding and removing components by name and by index. The name of a component is not necessarily unique,
  * so the collection must be able to handle duplicate entry names.
  * @see FormComponent
  */
trait FormComponents
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XContainer
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexContainer
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumerationAccess
     with activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.XEventAttacherManager

object FormComponents {
  @scala.inline
  def apply(
    Count: scala.Double,
    ElementNames: stdLib.SafeArray[java.lang.String],
    ElementType: activexDashLibreofficeLib.`type`,
    acquire: () => scala.Unit,
    addContainerListener: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XContainerListener => scala.Unit,
    addScriptListener: activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.XScriptListener => scala.Unit,
    attach: (scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, js.Any) => scala.Unit,
    createEnumeration: () => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumeration,
    detach: (scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface) => scala.Unit,
    getByIndex: scala.Double => js.Any,
    getByName: java.lang.String => js.Any,
    getCount: () => scala.Double,
    getElementNames: () => stdLib.SafeArray[java.lang.String],
    getElementType: () => activexDashLibreofficeLib.`type`,
    getScriptEvents: scala.Double => stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.ScriptEventDescriptor],
    hasByName: java.lang.String => scala.Boolean,
    hasElements: () => scala.Boolean,
    insertByIndex: (scala.Double, js.Any) => scala.Unit,
    insertByName: (java.lang.String, js.Any) => scala.Unit,
    insertEntry: scala.Double => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    registerScriptEvent: (scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.ScriptEventDescriptor) => scala.Unit,
    registerScriptEvents: (scala.Double, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.ScriptEventDescriptor]) => scala.Unit,
    release: () => scala.Unit,
    removeByIndex: scala.Double => scala.Unit,
    removeByName: java.lang.String => scala.Unit,
    removeContainerListener: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XContainerListener => scala.Unit,
    removeEntry: scala.Double => scala.Unit,
    removeScriptListener: activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.XScriptListener => scala.Unit,
    replaceByIndex: (scala.Double, js.Any) => scala.Unit,
    replaceByName: (java.lang.String, js.Any) => scala.Unit,
    revokeScriptEvent: (scala.Double, java.lang.String, java.lang.String, java.lang.String) => scala.Unit,
    revokeScriptEvents: scala.Double => scala.Unit
  ): FormComponents = {
    val __obj = js.Dynamic.literal(Count = Count, ElementNames = ElementNames, ElementType = ElementType, acquire = js.Any.fromFunction0(acquire), addContainerListener = js.Any.fromFunction1(addContainerListener), addScriptListener = js.Any.fromFunction1(addScriptListener), attach = js.Any.fromFunction3(attach), createEnumeration = js.Any.fromFunction0(createEnumeration), detach = js.Any.fromFunction2(detach), getByIndex = js.Any.fromFunction1(getByIndex), getByName = js.Any.fromFunction1(getByName), getCount = js.Any.fromFunction0(getCount), getElementNames = js.Any.fromFunction0(getElementNames), getElementType = js.Any.fromFunction0(getElementType), getScriptEvents = js.Any.fromFunction1(getScriptEvents), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), insertByIndex = js.Any.fromFunction2(insertByIndex), insertByName = js.Any.fromFunction2(insertByName), insertEntry = js.Any.fromFunction1(insertEntry), queryInterface = js.Any.fromFunction1(queryInterface), registerScriptEvent = js.Any.fromFunction2(registerScriptEvent), registerScriptEvents = js.Any.fromFunction2(registerScriptEvents), release = js.Any.fromFunction0(release), removeByIndex = js.Any.fromFunction1(removeByIndex), removeByName = js.Any.fromFunction1(removeByName), removeContainerListener = js.Any.fromFunction1(removeContainerListener), removeEntry = js.Any.fromFunction1(removeEntry), removeScriptListener = js.Any.fromFunction1(removeScriptListener), replaceByIndex = js.Any.fromFunction2(replaceByIndex), replaceByName = js.Any.fromFunction2(replaceByName), revokeScriptEvent = js.Any.fromFunction4(revokeScriptEvent), revokeScriptEvents = js.Any.fromFunction1(revokeScriptEvents))
  
    __obj.asInstanceOf[FormComponents]
  }
}

