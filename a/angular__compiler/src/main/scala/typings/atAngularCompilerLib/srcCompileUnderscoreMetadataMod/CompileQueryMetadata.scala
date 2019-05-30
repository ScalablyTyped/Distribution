package typings
package atAngularCompilerLib.srcCompileUnderscoreMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompileQueryMetadata extends js.Object {
  var descendants: scala.Boolean
  var first: scala.Boolean
  var propertyName: java.lang.String
  var read: CompileTokenMetadata
  var selectors: js.Array[CompileTokenMetadata]
  var static: js.UndefOr[scala.Boolean] = js.undefined
}

object CompileQueryMetadata {
  @scala.inline
  def apply(
    descendants: scala.Boolean,
    first: scala.Boolean,
    propertyName: java.lang.String,
    read: CompileTokenMetadata,
    selectors: js.Array[CompileTokenMetadata],
    static: js.UndefOr[scala.Boolean] = js.undefined
  ): CompileQueryMetadata = {
    val __obj = js.Dynamic.literal(descendants = descendants, first = first, propertyName = propertyName, read = read, selectors = selectors)
    if (!js.isUndefined(static)) __obj.updateDynamic("static")(static)
    __obj.asInstanceOf[CompileQueryMetadata]
  }
}

