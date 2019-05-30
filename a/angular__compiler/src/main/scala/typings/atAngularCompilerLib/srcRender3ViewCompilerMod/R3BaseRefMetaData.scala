package typings
package atAngularCompilerLib.srcRender3ViewCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait R3BaseRefMetaData extends js.Object {
  var inputs: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])]
  ] = js.undefined
  var outputs: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var queries: js.UndefOr[js.Array[atAngularCompilerLib.srcRender3ViewApiMod.R3QueryMetadata]] = js.undefined
  var viewQueries: js.UndefOr[js.Array[atAngularCompilerLib.srcRender3ViewApiMod.R3QueryMetadata]] = js.undefined
}

object R3BaseRefMetaData {
  @scala.inline
  def apply(
    inputs: org.scalablytyped.runtime.StringDictionary[java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])] = null,
    outputs: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    queries: js.Array[atAngularCompilerLib.srcRender3ViewApiMod.R3QueryMetadata] = null,
    viewQueries: js.Array[atAngularCompilerLib.srcRender3ViewApiMod.R3QueryMetadata] = null
  ): R3BaseRefMetaData = {
    val __obj = js.Dynamic.literal()
    if (inputs != null) __obj.updateDynamic("inputs")(inputs)
    if (outputs != null) __obj.updateDynamic("outputs")(outputs)
    if (queries != null) __obj.updateDynamic("queries")(queries)
    if (viewQueries != null) __obj.updateDynamic("viewQueries")(viewQueries)
    __obj.asInstanceOf[R3BaseRefMetaData]
  }
}

