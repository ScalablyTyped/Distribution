package typings.atAngularCompiler.srcProviderUnderscoreAnalyzerMod

import typings.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompileQueryMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryWithId extends js.Object {
  var meta: CompileQueryMetadata
  var queryId: Double
}

object QueryWithId {
  @scala.inline
  def apply(meta: CompileQueryMetadata, queryId: Double): QueryWithId = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], queryId = queryId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[QueryWithId]
  }
}

