package typings.angularUiBootstrap.mod.angularAugmentingMod.ui.bootstrap

import typings.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IModalInstanceService extends js.Object {
  
  /**
    * A method that can be used to close a modal, passing a result. If `preventDefault` is called on the `modal.closing` event then the modal will remain open.
    */
  def close(): Unit = js.native
  def close(result: js.Any): Unit = js.native
  
  /**
    * A promise that is resolved when a modal is closed and the animation completes.
    */
  var closed: IPromise[_] = js.native
  
  /**
    * A method that can be used to dismiss a modal, passing a reason. If `preventDefault` is called on the `modal.closing` event then the modal will remain open.
    */
  def dismiss(): Unit = js.native
  def dismiss(reason: js.Any): Unit = js.native
  
  /**
    * A promise that is resolved when a modal gets opened after downloading content's template and resolving all variables.
    */
  var opened: IPromise[_] = js.native
  
  /**
    * A promise that is resolved when a modal is rendered.
    */
  var rendered: IPromise[_] = js.native
  
  /**
    * A promise that is resolved when a modal is closed and rejected when a modal is dismissed.
    */
  var result: IPromise[_] = js.native
}
