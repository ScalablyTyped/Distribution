package typings.angularCompiler.providerAnalyzerMod

import typings.angularCompiler.compileMetadataMod.CompileQueryMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryWithId extends js.Object {
  
  var meta: CompileQueryMetadata = js.native
  
  var queryId: Double = js.native
}
object QueryWithId {
  
  @scala.inline
  def apply(meta: CompileQueryMetadata, queryId: Double): QueryWithId = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], queryId = queryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryWithId]
  }
  
  @scala.inline
  implicit class QueryWithIdOps[Self <: QueryWithId] (val x: Self) extends AnyVal {
    
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
    def setMeta(value: CompileQueryMetadata): Self = this.set("meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryId(value: Double): Self = this.set("queryId", value.asInstanceOf[js.Any])
  }
}
