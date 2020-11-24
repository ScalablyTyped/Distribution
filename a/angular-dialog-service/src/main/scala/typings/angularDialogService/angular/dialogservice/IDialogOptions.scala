package typings.angularDialogService.angular.dialogservice

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDialogOptions extends js.Object {
  
  /**
    * Set to false to disable animations on new modal/backdrop. Does not toggle animations for modals/backdrops that are already displayed.
    *
    * @default false
    */
  var animation: js.UndefOr[Boolean] = js.native
  
  /**
    * controls the presence of a backdrop
    * Allowed values:
    *   - true (default)
    *   - false (no backdrop)
    *   - 'static' backdrop is present but modal window is not closed when clicking outside of the modal window
    *
    * @default true
    */
  var backdrop: js.UndefOr[Boolean | String] = js.native
  
  /**
    * additional CSS class(es) to be added to a modal backdrop template
    *
    * @default 'dialogs-backdrop-default'
    */
  var backdropClass: js.UndefOr[String] = js.native
  
  /**
    * indicates whether the dialog should be closable by hitting the ESC key
    *
    * @default true
    */
  var keyboard: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional suffix of modal window class. The value used is appended to the `modal-` class, i.e. a value of `sm` gives `modal-sm`.
    *
    * @default 'lg'
    */
  var size: js.UndefOr[String] = js.native
  
  /**
    * additional CSS class(es) to be added to a modal window template
    *
    * @default 'dialogs-default'
    */
  var windowClass: js.UndefOr[String] = js.native
}
object IDialogOptions {
  
  @scala.inline
  def apply(): IDialogOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDialogOptions]
  }
  
  @scala.inline
  implicit class IDialogOptionsOps[Self <: IDialogOptions] (val x: Self) extends AnyVal {
    
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
    def setAnimation(value: Boolean): Self = this.set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    
    @scala.inline
    def setBackdrop(value: Boolean | String): Self = this.set("backdrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackdrop: Self = this.set("backdrop", js.undefined)
    
    @scala.inline
    def setBackdropClass(value: String): Self = this.set("backdropClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackdropClass: Self = this.set("backdropClass", js.undefined)
    
    @scala.inline
    def setKeyboard(value: Boolean): Self = this.set("keyboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyboard: Self = this.set("keyboard", js.undefined)
    
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setWindowClass(value: String): Self = this.set("windowClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindowClass: Self = this.set("windowClass", js.undefined)
  }
}
