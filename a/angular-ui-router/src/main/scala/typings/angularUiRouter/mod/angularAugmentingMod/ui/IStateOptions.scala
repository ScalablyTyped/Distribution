package typings.angularUiRouter.mod.angularAugmentingMod.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStateOptions extends js.Object {
  
  /**
    *  {boolean=true}, If true will inherit url parameters from current url.
    */
  var inherit: js.UndefOr[Boolean] = js.native
  
  /**
    * {boolean=true|string=} - If true will update the url in the location bar, if false will not. If string, must be "replace", which will update url and also replace last history record.
    */
  var location: js.UndefOr[Boolean | String] = js.native
  
  /**
    * {boolean=true}, If true will broadcast $stateChangeStart and $stateChangeSuccess events.
    */
  @JSName("notify")
  var notify_FIStateOptions: js.UndefOr[Boolean] = js.native
  
  /**
    * {object=$state.$current}, When transitioning with relative path (e.g '^'), defines which state to be relative from.
    */
  var relative: js.UndefOr[IState] = js.native
  
  /**
    * {boolean=false|string|IState}, If true will force transition even if the state or params have not changed, aka a reload of the same state. It differs from reloadOnSearch because you'd use this when you want to force a reload when everything is the same, including search params.
    */
  var reload: js.UndefOr[Boolean | String | IState] = js.native
}
object IStateOptions {
  
  @scala.inline
  def apply(): IStateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStateOptions]
  }
  
  @scala.inline
  implicit class IStateOptionsOps[Self <: IStateOptions] (val x: Self) extends AnyVal {
    
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
    def setInherit(value: Boolean): Self = this.set("inherit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInherit: Self = this.set("inherit", js.undefined)
    
    @scala.inline
    def setLocation(value: Boolean | String): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setNotify(value: Boolean): Self = this.set("notify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotify: Self = this.set("notify", js.undefined)
    
    @scala.inline
    def setRelative(value: IState): Self = this.set("relative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelative: Self = this.set("relative", js.undefined)
    
    @scala.inline
    def setReload(value: Boolean | String | IState): Self = this.set("reload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReload: Self = this.set("reload", js.undefined)
  }
}
