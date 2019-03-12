package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface can be used to attach script events to a number of objects that give access to the definition of events that should be attached to
  * them, e.g., by supporting XEventsSupplier
  */
trait XScriptEventsAttacher
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Attaches the events defined by {@link XScriptEventsSupplier} to the corresponding object implementing {@link XScriptEventsSupplier} .
    * @param Objects Sequence of all objects. Usually the objects should directly support {@link XScriptEventsAttacher} to define the events but this is not s
    * @param xListener All events (if defined by {@link XScriptEventsSupplier} ) that are fired by one of the objects are mapped into a {@link ScriptEvent} an
    * @param Helper Helper object for the implementation. This value will be passed to the {@link XScriptListener} as Helper property in the {@link ScriptEvent} .
    */
  def attachEvents(
    Objects: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface],
    xListener: XScriptListener,
    Helper: js.Any
  ): scala.Unit
}

object XScriptEventsAttacher {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    attachEvents: (activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface], XScriptListener, js.Any) => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XScriptEventsAttacher = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), attachEvents = js.Any.fromFunction3(attachEvents), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XScriptEventsAttacher]
  }
}

