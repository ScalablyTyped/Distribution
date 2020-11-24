package typings.angularCompiler.compileMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompileIdentifierMetadata extends js.Object {
  
  var reference: js.Any = js.native
}
object CompileIdentifierMetadata {
  
  @scala.inline
  def apply(reference: js.Any): CompileIdentifierMetadata = {
    val __obj = js.Dynamic.literal(reference = reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompileIdentifierMetadata]
  }
  
  @scala.inline
  implicit class CompileIdentifierMetadataOps[Self <: CompileIdentifierMetadata] (val x: Self) extends AnyVal {
    
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
    def setReference(value: js.Any): Self = this.set("reference", value.asInstanceOf[js.Any])
  }
}
