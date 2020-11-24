package typings.apolloProtobufjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IToJSONOptions extends js.Object {
  
  /** Serializes comments. */
  var keepComments: js.UndefOr[Boolean] = js.native
}
object IToJSONOptions {
  
  @scala.inline
  def apply(): IToJSONOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IToJSONOptions]
  }
  
  @scala.inline
  implicit class IToJSONOptionsOps[Self <: IToJSONOptions] (val x: Self) extends AnyVal {
    
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
    def setKeepComments(value: Boolean): Self = this.set("keepComments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepComments: Self = this.set("keepComments", js.undefined)
  }
}
