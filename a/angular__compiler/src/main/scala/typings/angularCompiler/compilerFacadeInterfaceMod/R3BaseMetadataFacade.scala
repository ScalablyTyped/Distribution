package typings.angularCompiler.compilerFacadeInterfaceMod

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
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], propMetadata = propMetadata.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (inputs != null) __obj.updateDynamic("inputs")(inputs.asInstanceOf[js.Any])
    if (outputs != null) __obj.updateDynamic("outputs")(outputs.asInstanceOf[js.Any])
    if (queries != null) __obj.updateDynamic("queries")(queries.asInstanceOf[js.Any])
    if (viewQueries != null) __obj.updateDynamic("viewQueries")(viewQueries.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3BaseMetadataFacade]
  }
}

