package typings.angularCompiler.compileMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompileDiDependencyMetadata extends js.Object {
  
  var isAttribute: js.UndefOr[Boolean] = js.native
  
  var isHost: js.UndefOr[Boolean] = js.native
  
  var isOptional: js.UndefOr[Boolean] = js.native
  
  var isSelf: js.UndefOr[Boolean] = js.native
  
  var isSkipSelf: js.UndefOr[Boolean] = js.native
  
  var isValue: js.UndefOr[Boolean] = js.native
  
  var token: js.UndefOr[CompileTokenMetadata] = js.native
  
  var value: js.UndefOr[js.Any] = js.native
}
object CompileDiDependencyMetadata {
  
  @scala.inline
  def apply(): CompileDiDependencyMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompileDiDependencyMetadata]
  }
  
  @scala.inline
  implicit class CompileDiDependencyMetadataOps[Self <: CompileDiDependencyMetadata] (val x: Self) extends AnyVal {
    
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
    def setIsAttribute(value: Boolean): Self = this.set("isAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsAttribute: Self = this.set("isAttribute", js.undefined)
    
    @scala.inline
    def setIsHost(value: Boolean): Self = this.set("isHost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsHost: Self = this.set("isHost", js.undefined)
    
    @scala.inline
    def setIsOptional(value: Boolean): Self = this.set("isOptional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsOptional: Self = this.set("isOptional", js.undefined)
    
    @scala.inline
    def setIsSelf(value: Boolean): Self = this.set("isSelf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsSelf: Self = this.set("isSelf", js.undefined)
    
    @scala.inline
    def setIsSkipSelf(value: Boolean): Self = this.set("isSkipSelf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsSkipSelf: Self = this.set("isSkipSelf", js.undefined)
    
    @scala.inline
    def setIsValue(value: Boolean): Self = this.set("isValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsValue: Self = this.set("isValue", js.undefined)
    
    @scala.inline
    def setToken(value: CompileTokenMetadata): Self = this.set("token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToken: Self = this.set("token", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
