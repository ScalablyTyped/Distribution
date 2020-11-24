package typings.appBuilderLib.macCodeSignMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CodeSigningInfo extends js.Object {
  
  var keychainFile: js.UndefOr[String | Null] = js.native
}
object CodeSigningInfo {
  
  @scala.inline
  def apply(): CodeSigningInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodeSigningInfo]
  }
  
  @scala.inline
  implicit class CodeSigningInfoOps[Self <: CodeSigningInfo] (val x: Self) extends AnyVal {
    
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
    def setKeychainFile(value: String): Self = this.set("keychainFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeychainFile: Self = this.set("keychainFile", js.undefined)
    
    @scala.inline
    def setKeychainFileNull: Self = this.set("keychainFile", null)
  }
}
