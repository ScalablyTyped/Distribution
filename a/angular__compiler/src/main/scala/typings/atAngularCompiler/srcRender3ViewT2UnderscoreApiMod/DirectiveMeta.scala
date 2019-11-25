package typings.atAngularCompiler.srcRender3ViewT2UnderscoreApiMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectiveMeta extends js.Object {
  /**
    * Name under which the directive is exported, if any (exportAs in Angular).
    *
    * Null otherwise
    */
  var exportAs: js.Array[String] | Null
  /**
    * Set of inputs which this directive claims.
    *
    * Goes from property names to field names.
    */
  var inputs: StringDictionary[String | (js.Tuple2[String, String])]
  /**
    * Whether the directive is a component.
    */
  var isComponent: Boolean
  /**
    * Name of the directive class (used for debugging).
    */
  var name: String
  /**
    * Set of outputs which this directive claims.
    *
    * Goes from property names to field names.
    */
  var outputs: StringDictionary[String]
}

object DirectiveMeta {
  @scala.inline
  def apply(
    inputs: StringDictionary[String | (js.Tuple2[String, String])],
    isComponent: Boolean,
    name: String,
    outputs: StringDictionary[String],
    exportAs: js.Array[String] = null
  ): DirectiveMeta = {
    val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any], isComponent = isComponent.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any])
    if (exportAs != null) __obj.updateDynamic("exportAs")(exportAs.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectiveMeta]
  }
}

