package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.NamedValue
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** such listener will be informed if tab's was inserted/removed from an {@link XSimpleTabController} instance or if the properties of a tab was changed. */
@js.native
trait XTabListener extends XEventListener {
  
  /** a tab was activated (e.g. by using mouse/keyboard or method {@link XSimpleTabController.activateTab()} */
  def activated(ID: Double): Unit = js.native
  
  /**
    * a tab was changed within it's properties.
    * @param ID the unique ID of the changed tab.
    * @param Properties the current set of properties for this tab.
    */
  def changed(ID: Double, Properties: SeqEquiv[NamedValue]): Unit = js.native
  
  /** a tab was deactivated, because another tab became the new active state. */
  def deactivated(ID: Double): Unit = js.native
  
  /**
    * a new tab was inserted.
    * @param ID this is the unique ID of this new tab.
    */
  def inserted(ID: Double): Unit = js.native
  
  /**
    * a tab was removed.
    * @param ID this was the unique ID of this tab.
    */
  def removed(ID: Double): Unit = js.native
}
object XTabListener {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    activated: Double => Unit,
    changed: (Double, SeqEquiv[NamedValue]) => Unit,
    deactivated: Double => Unit,
    disposing: EventObject => Unit,
    inserted: Double => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removed: Double => Unit
  ): XTabListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), activated = js.Any.fromFunction1(activated), changed = js.Any.fromFunction2(changed), deactivated = js.Any.fromFunction1(deactivated), disposing = js.Any.fromFunction1(disposing), inserted = js.Any.fromFunction1(inserted), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removed = js.Any.fromFunction1(removed))
    __obj.asInstanceOf[XTabListener]
  }
  
  @scala.inline
  implicit class XTabListenerOps[Self <: XTabListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActivated(value: Double => Unit): Self = this.set("activated", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChanged(value: (Double, SeqEquiv[NamedValue]) => Unit): Self = this.set("changed", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDeactivated(value: Double => Unit): Self = this.set("deactivated", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInserted(value: Double => Unit): Self = this.set("inserted", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoved(value: Double => Unit): Self = this.set("removed", js.Any.fromFunction1(value))
  }
}
