package typings.atAngularCompiler.srcRender3ViewCompilerMod

import org.scalablytyped.runtime.StringDictionary
import typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
import typings.atAngularCompiler.srcRender3ViewApiMod.R3HostMetadata
import typings.atAngularCompiler.srcRender3ViewApiMod.R3QueryMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait R3BaseRefMetaData extends js.Object {
  var host: js.UndefOr[R3HostMetadata] = js.undefined
  var inputs: js.UndefOr[StringDictionary[String | (js.Tuple2[String, String])]] = js.undefined
  var name: String
  var outputs: js.UndefOr[StringDictionary[String]] = js.undefined
  var queries: js.UndefOr[js.Array[R3QueryMetadata]] = js.undefined
  var typeSourceSpan: ParseSourceSpan
  var viewQueries: js.UndefOr[js.Array[R3QueryMetadata]] = js.undefined
}

object R3BaseRefMetaData {
  @scala.inline
  def apply(
    name: String,
    typeSourceSpan: ParseSourceSpan,
    host: R3HostMetadata = null,
    inputs: StringDictionary[String | (js.Tuple2[String, String])] = null,
    outputs: StringDictionary[String] = null,
    queries: js.Array[R3QueryMetadata] = null,
    viewQueries: js.Array[R3QueryMetadata] = null
  ): R3BaseRefMetaData = {
    val __obj = js.Dynamic.literal(name = name, typeSourceSpan = typeSourceSpan)
    if (host != null) __obj.updateDynamic("host")(host)
    if (inputs != null) __obj.updateDynamic("inputs")(inputs)
    if (outputs != null) __obj.updateDynamic("outputs")(outputs)
    if (queries != null) __obj.updateDynamic("queries")(queries)
    if (viewQueries != null) __obj.updateDynamic("viewQueries")(viewQueries)
    __obj.asInstanceOf[R3BaseRefMetaData]
  }
}

