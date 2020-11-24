package typings.activexLibreoffice.com_.sun.star.form

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XChild
import typings.activexLibreoffice.com_.sun.star.container.XContainer
import typings.activexLibreoffice.com_.sun.star.container.XContainerListener
import typings.activexLibreoffice.com_.sun.star.container.XEnumeration
import typings.activexLibreoffice.com_.sun.star.container.XEnumerationAccess
import typings.activexLibreoffice.com_.sun.star.container.XIndexContainer
import typings.activexLibreoffice.com_.sun.star.container.XNameContainer
import typings.activexLibreoffice.com_.sun.star.lang.XComponent
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.script.ScriptEventDescriptor
import typings.activexLibreoffice.com_.sun.star.script.XEventAttacherManager
import typings.activexLibreoffice.com_.sun.star.script.XScriptListener
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.activexLibreoffice.com_.sun.star.util.XCloneable
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @since LibreOffice 4.1 */
@js.native
trait XForms
  extends XNameContainer
     with XContainer
     with XIndexContainer
     with XEnumerationAccess
     with XEventAttacherManager
     with XChild
     with XCloneable
     with XComponent
object XForms {
  
  @scala.inline
  def apply(
    Count: Double,
    ElementNames: SafeArray[String],
    ElementType: `type`,
    Parent: XInterface,
    acquire: () => Unit,
    addContainerListener: XContainerListener => Unit,
    addEventListener: XEventListener => Unit,
    addScriptListener: XScriptListener => Unit,
    attach: (Double, XInterface, js.Any) => Unit,
    createClone: () => XCloneable,
    createEnumeration: () => XEnumeration,
    detach: (Double, XInterface) => Unit,
    dispose: () => Unit,
    getByIndex: Double => js.Any,
    getByName: String => js.Any,
    getCount: () => Double,
    getElementNames: () => SafeArray[String],
    getElementType: () => `type`,
    getParent: () => XInterface,
    getScriptEvents: Double => SafeArray[ScriptEventDescriptor],
    hasByName: String => Boolean,
    hasElements: () => Boolean,
    insertByIndex: (Double, js.Any) => Unit,
    insertByName: (String, js.Any) => Unit,
    insertEntry: Double => Unit,
    queryInterface: `type` => js.Any,
    registerScriptEvent: (Double, ScriptEventDescriptor) => Unit,
    registerScriptEvents: (Double, SeqEquiv[ScriptEventDescriptor]) => Unit,
    release: () => Unit,
    removeByIndex: Double => Unit,
    removeByName: String => Unit,
    removeContainerListener: XContainerListener => Unit,
    removeEntry: Double => Unit,
    removeEventListener: XEventListener => Unit,
    removeScriptListener: XScriptListener => Unit,
    replaceByIndex: (Double, js.Any) => Unit,
    replaceByName: (String, js.Any) => Unit,
    revokeScriptEvent: (Double, String, String, String) => Unit,
    revokeScriptEvents: Double => Unit,
    setParent: XInterface => Unit
  ): XForms = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], ElementNames = ElementNames.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addContainerListener = js.Any.fromFunction1(addContainerListener), addEventListener = js.Any.fromFunction1(addEventListener), addScriptListener = js.Any.fromFunction1(addScriptListener), attach = js.Any.fromFunction3(attach), createClone = js.Any.fromFunction0(createClone), createEnumeration = js.Any.fromFunction0(createEnumeration), detach = js.Any.fromFunction2(detach), dispose = js.Any.fromFunction0(dispose), getByIndex = js.Any.fromFunction1(getByIndex), getByName = js.Any.fromFunction1(getByName), getCount = js.Any.fromFunction0(getCount), getElementNames = js.Any.fromFunction0(getElementNames), getElementType = js.Any.fromFunction0(getElementType), getParent = js.Any.fromFunction0(getParent), getScriptEvents = js.Any.fromFunction1(getScriptEvents), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), insertByIndex = js.Any.fromFunction2(insertByIndex), insertByName = js.Any.fromFunction2(insertByName), insertEntry = js.Any.fromFunction1(insertEntry), queryInterface = js.Any.fromFunction1(queryInterface), registerScriptEvent = js.Any.fromFunction2(registerScriptEvent), registerScriptEvents = js.Any.fromFunction2(registerScriptEvents), release = js.Any.fromFunction0(release), removeByIndex = js.Any.fromFunction1(removeByIndex), removeByName = js.Any.fromFunction1(removeByName), removeContainerListener = js.Any.fromFunction1(removeContainerListener), removeEntry = js.Any.fromFunction1(removeEntry), removeEventListener = js.Any.fromFunction1(removeEventListener), removeScriptListener = js.Any.fromFunction1(removeScriptListener), replaceByIndex = js.Any.fromFunction2(replaceByIndex), replaceByName = js.Any.fromFunction2(replaceByName), revokeScriptEvent = js.Any.fromFunction4(revokeScriptEvent), revokeScriptEvents = js.Any.fromFunction1(revokeScriptEvents), setParent = js.Any.fromFunction1(setParent))
    __obj.asInstanceOf[XForms]
  }
}
