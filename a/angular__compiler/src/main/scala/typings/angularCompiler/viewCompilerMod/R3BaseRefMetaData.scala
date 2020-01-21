package typings.angularCompiler.viewCompilerMod

import org.scalablytyped.runtime.StringDictionary
import typings.angularCompiler.apiMod.R3HostMetadata
import typings.angularCompiler.apiMod.R3QueryMetadata
import typings.angularCompiler.outputAstMod.Expression
import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait R3BaseRefMetaData extends js.Object {
  var host: js.UndefOr[R3HostMetadata] = js.undefined
  var inputs: js.UndefOr[StringDictionary[String | (js.Tuple2[String, String])]] = js.undefined
  var name: String
  var outputs: js.UndefOr[StringDictionary[String]] = js.undefined
  var queries: js.UndefOr[js.Array[R3QueryMetadata]] = js.undefined
  var `type`: Expression
  var typeSourceSpan: ParseSourceSpan
  var viewQueries: js.UndefOr[js.Array[R3QueryMetadata]] = js.undefined
}

object R3BaseRefMetaData {
  @scala.inline
  def apply(
    name: String,
    `type`: Expression,
    typeSourceSpan: ParseSourceSpan,
    host: R3HostMetadata = null,
    inputs: StringDictionary[String | (js.Tuple2[String, String])] = null,
    outputs: StringDictionary[String] = null,
    queries: js.Array[R3QueryMetadata] = null,
    viewQueries: js.Array[R3QueryMetadata] = null
  ): R3BaseRefMetaData = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], typeSourceSpan = typeSourceSpan.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (inputs != null) __obj.updateDynamic("inputs")(inputs.asInstanceOf[js.Any])
    if (outputs != null) __obj.updateDynamic("outputs")(outputs.asInstanceOf[js.Any])
    if (queries != null) __obj.updateDynamic("queries")(queries.asInstanceOf[js.Any])
    if (viewQueries != null) __obj.updateDynamic("viewQueries")(viewQueries.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3BaseRefMetaData]
  }
}

