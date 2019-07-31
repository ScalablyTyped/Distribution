package typings.atAngularCompiler.srcCompilerUnderscoreFacadeUnderscoreInterfaceMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait R3BaseMetadataFacade extends js.Object {
  var inputs: js.UndefOr[StringDictionary[String | (js.Tuple2[String, String])]] = js.undefined
  var name: String
  var outputs: js.UndefOr[StringDictionary[String]] = js.undefined
  var propMetadata: StringDictionary[js.Array[_]]
  var queries: js.UndefOr[js.Array[R3QueryMetadataFacade]] = js.undefined
  var `type`: js.Any
  var viewQueries: js.UndefOr[js.Array[R3QueryMetadataFacade]] = js.undefined
}

object R3BaseMetadataFacade {
  @scala.inline
  def apply(
    name: String,
    propMetadata: StringDictionary[js.Array[_]],
    `type`: js.Any,
    inputs: StringDictionary[String | (js.Tuple2[String, String])] = null,
    outputs: StringDictionary[String] = null,
    queries: js.Array[R3QueryMetadataFacade] = null,
    viewQueries: js.Array[R3QueryMetadataFacade] = null
  ): R3BaseMetadataFacade = {
    val __obj = js.Dynamic.literal(name = name, propMetadata = propMetadata)
    __obj.updateDynamic("type")(`type`)
    if (inputs != null) __obj.updateDynamic("inputs")(inputs)
    if (outputs != null) __obj.updateDynamic("outputs")(outputs)
    if (queries != null) __obj.updateDynamic("queries")(queries)
    if (viewQueries != null) __obj.updateDynamic("viewQueries")(viewQueries)
    __obj.asInstanceOf[R3BaseMetadataFacade]
  }
}

