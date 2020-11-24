package typings.angularBreadcrumb.mod.angularAugmentingMod.ncy

import typings.angularBreadcrumb.mod.angularAugmentingMod.ui.IState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait breadcrumbService extends js.Object {
  
  /**
    * Return the last step of the breadcrumb, generally the one relative to the current state, expect if it is configured as skipped (the method returns its parent). As getStatesChain, the state object is enriched with ncyBreadcrumbLink.
    **/
  def getLastStep(): IState = js.native
  
  /**
    * Returns the state chain to the current state (i.e. all the steps of the breadcrumb). It's an array of state object enriched with the module-specific property ncyBreadcrumbLink (the href for the breadcrumb step).
    **/
  def getStatesChain(): js.Array[IState] = js.native
}
object breadcrumbService {
  
  @scala.inline
  def apply(getLastStep: () => IState, getStatesChain: () => js.Array[IState]): breadcrumbService = {
    val __obj = js.Dynamic.literal(getLastStep = js.Any.fromFunction0(getLastStep), getStatesChain = js.Any.fromFunction0(getStatesChain))
    __obj.asInstanceOf[breadcrumbService]
  }
  
  @scala.inline
  implicit class breadcrumbServiceOps[Self <: breadcrumbService] (val x: Self) extends AnyVal {
    
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
    def setGetLastStep(value: () => IState): Self = this.set("getLastStep", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetStatesChain(value: () => js.Array[IState]): Self = this.set("getStatesChain", js.Any.fromFunction0(value))
  }
}
