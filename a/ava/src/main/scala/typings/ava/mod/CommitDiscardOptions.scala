package typings.ava.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommitDiscardOptions extends js.Object {
  
  /**
  	 * Whether the logs should be included in those of the parent test.
  	 */
  var retainLogs: js.UndefOr[Boolean] = js.native
}
object CommitDiscardOptions {
  
  @scala.inline
  def apply(): CommitDiscardOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommitDiscardOptions]
  }
  
  @scala.inline
  implicit class CommitDiscardOptionsOps[Self <: CommitDiscardOptions] (val x: Self) extends AnyVal {
    
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
    def setRetainLogs(value: Boolean): Self = this.set("retainLogs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetainLogs: Self = this.set("retainLogs", js.undefined)
  }
}
