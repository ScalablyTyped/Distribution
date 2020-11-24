package typings.angularCompiler.compileMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompileQueryMetadata extends js.Object {
  
  var descendants: Boolean = js.native
  
  var first: Boolean = js.native
  
  var propertyName: String = js.native
  
  var read: CompileTokenMetadata = js.native
  
  var selectors: js.Array[CompileTokenMetadata] = js.native
  
  var static: js.UndefOr[Boolean] = js.native
}
object CompileQueryMetadata {
  
  @scala.inline
  def apply(
    descendants: Boolean,
    first: Boolean,
    propertyName: String,
    read: CompileTokenMetadata,
    selectors: js.Array[CompileTokenMetadata]
  ): CompileQueryMetadata = {
    val __obj = js.Dynamic.literal(descendants = descendants.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any], propertyName = propertyName.asInstanceOf[js.Any], read = read.asInstanceOf[js.Any], selectors = selectors.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompileQueryMetadata]
  }
  
  @scala.inline
  implicit class CompileQueryMetadataOps[Self <: CompileQueryMetadata] (val x: Self) extends AnyVal {
    
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
    def setDescendants(value: Boolean): Self = this.set("descendants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirst(value: Boolean): Self = this.set("first", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyName(value: String): Self = this.set("propertyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRead(value: CompileTokenMetadata): Self = this.set("read", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorsVarargs(value: CompileTokenMetadata*): Self = this.set("selectors", js.Array(value :_*))
    
    @scala.inline
    def setSelectors(value: js.Array[CompileTokenMetadata]): Self = this.set("selectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatic(value: Boolean): Self = this.set("static", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatic: Self = this.set("static", js.undefined)
  }
}
