package typings
package atAngularCompilerLib.srcRender3ViewCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait R3BaseRefMetaData extends js.Object {
  var host: js.UndefOr[atAngularCompilerLib.srcRender3ViewApiMod.R3HostMetadata] = js.undefined
  var inputs: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])]
  ] = js.undefined
  var name: java.lang.String
  var outputs: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var queries: js.UndefOr[js.Array[atAngularCompilerLib.srcRender3ViewApiMod.R3QueryMetadata]] = js.undefined
  var typeSourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan
  var viewQueries: js.UndefOr[js.Array[atAngularCompilerLib.srcRender3ViewApiMod.R3QueryMetadata]] = js.undefined
}

object R3BaseRefMetaData {
  @scala.inline
  def apply(
    name: java.lang.String,
    typeSourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan,
    host: atAngularCompilerLib.srcRender3ViewApiMod.R3HostMetadata = null,
    inputs: org.scalablytyped.runtime.StringDictionary[java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])] = null,
    outputs: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    queries: js.Array[atAngularCompilerLib.srcRender3ViewApiMod.R3QueryMetadata] = null,
    viewQueries: js.Array[atAngularCompilerLib.srcRender3ViewApiMod.R3QueryMetadata] = null
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

