package typings
package atAngularCompilerLib.srcRender3ViewApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait R3QueryMetadata extends js.Object {
  /**
    * Whether to include only direct children or all descendants.
    */
  var descendants: scala.Boolean
  /**
    * Whether to read only the first matching result, or an array of results.
    */
  var first: scala.Boolean
  /**
    * Either an expression representing a type for the query predicate, or a set of string selectors.
    */
  var predicate: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression | js.Array[java.lang.String]
  /**
    * Name of the property on the class to update with query results.
    */
  var propertyName: java.lang.String
  /**
    * An expression representing a type to read from each matched node, or null if the default value
    * for a given node is to be returned.
    */
  var read: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression | scala.Null
}

object R3QueryMetadata {
  @scala.inline
  def apply(
    descendants: scala.Boolean,
    first: scala.Boolean,
    predicate: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression | js.Array[java.lang.String],
    propertyName: java.lang.String,
    read: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression = null
  ): R3QueryMetadata = {
    val __obj = js.Dynamic.literal(descendants = descendants, first = first, predicate = predicate.asInstanceOf[js.Any], propertyName = propertyName)
    if (read != null) __obj.updateDynamic("read")(read)
    __obj.asInstanceOf[R3QueryMetadata]
  }
}

