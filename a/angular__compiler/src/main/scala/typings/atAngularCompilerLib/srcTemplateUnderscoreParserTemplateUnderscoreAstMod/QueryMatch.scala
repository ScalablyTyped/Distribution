package typings
package atAngularCompilerLib.srcTemplateUnderscoreParserTemplateUnderscoreAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryMatch extends js.Object {
  var queryId: scala.Double
  var value: atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileTokenMetadata
}

object QueryMatch {
  @scala.inline
  def apply(
    queryId: scala.Double,
    value: atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileTokenMetadata
  ): QueryMatch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("queryId")(queryId)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[QueryMatch]
  }
}

