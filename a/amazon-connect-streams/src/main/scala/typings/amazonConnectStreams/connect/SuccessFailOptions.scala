package typings.amazonConnectStreams.connect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SuccessFailOptions extends js.Object {
  
  /** A callback that executes when the operation has an error. */
  val failure: js.UndefOr[SuccessFailCallback[js.Array[String]]] = js.native
  
  /** A callback that executes when the operation completes successfully. */
  val success: js.UndefOr[SuccessFailCallback[js.Array[js.Any]]] = js.native
}
object SuccessFailOptions {
  
  @scala.inline
  def apply(): SuccessFailOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuccessFailOptions]
  }
  
  @scala.inline
  implicit class SuccessFailOptionsOps[Self <: SuccessFailOptions] (val x: Self) extends AnyVal {
    
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
    def setFailure(value: js.Array[String] => Unit): Self = this.set("failure", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFailure: Self = this.set("failure", js.undefined)
    
    @scala.inline
    def setSuccess(value: js.Array[js.Any] => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
}
