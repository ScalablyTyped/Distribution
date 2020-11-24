package typings.activexLibreoffice.com_.sun.star.form.validation

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies an interface for listening for changes in the validity constraints represented by an {@link XValidator} . */
@js.native
trait XValidityConstraintListener extends XEventListener {
  
  /**
    * called when the validity constraint represented by an {@link XValidator} , at which the listener is registered, changed.
    * @param Source The event source. The member {@link com.sun.star.lang.EventObject.Source} represents the validator component whose validity constraint changed.
    */
  def validityConstraintChanged(Source: EventObject): Unit = js.native
}
object XValidityConstraintListener {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    validityConstraintChanged: EventObject => Unit
  ): XValidityConstraintListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), validityConstraintChanged = js.Any.fromFunction1(validityConstraintChanged))
    __obj.asInstanceOf[XValidityConstraintListener]
  }
  
  @scala.inline
  implicit class XValidityConstraintListenerOps[Self <: XValidityConstraintListener] (val x: Self) extends AnyVal {
    
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
    def setValidityConstraintChanged(value: EventObject => Unit): Self = this.set("validityConstraintChanged", js.Any.fromFunction1(value))
  }
}
