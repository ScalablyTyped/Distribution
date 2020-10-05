package typings.angularCompiler.templateAstMod

import typings.angularCompiler.compileMetadataMod.CompileTokenMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryMatch extends js.Object {
  var queryId: Double = js.native
  var value: CompileTokenMetadata = js.native
}

object QueryMatch {
  @scala.inline
  def apply(queryId: Double, value: CompileTokenMetadata): QueryMatch = {
    val __obj = js.Dynamic.literal(queryId = queryId.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryMatch]
  }
  @scala.inline
  implicit class QueryMatchOps[Self <: QueryMatch] (val x: Self) extends AnyVal {
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
    def setQueryId(value: Double): Self = this.set("queryId", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: CompileTokenMetadata): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

