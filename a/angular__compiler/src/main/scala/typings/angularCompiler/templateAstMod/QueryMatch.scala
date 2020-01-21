package typings.angularCompiler.templateAstMod

import typings.angularCompiler.compileMetadataMod.CompileTokenMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryMatch extends js.Object {
  var queryId: Double
  var value: CompileTokenMetadata
}

object QueryMatch {
  @scala.inline
  def apply(queryId: Double, value: CompileTokenMetadata): QueryMatch = {
    val __obj = js.Dynamic.literal(queryId = queryId.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[QueryMatch]
  }
}

