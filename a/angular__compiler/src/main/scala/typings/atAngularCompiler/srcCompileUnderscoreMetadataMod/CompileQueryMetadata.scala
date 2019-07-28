package typings.atAngularCompiler.srcCompileUnderscoreMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompileQueryMetadata extends js.Object {
  var descendants: Boolean
  var first: Boolean
  var propertyName: String
  var read: CompileTokenMetadata
  var selectors: js.Array[CompileTokenMetadata]
  var static: js.UndefOr[Boolean] = js.undefined
}

object CompileQueryMetadata {
  @scala.inline
  def apply(
    descendants: Boolean,
    first: Boolean,
    propertyName: String,
    read: CompileTokenMetadata,
    selectors: js.Array[CompileTokenMetadata],
    static: js.UndefOr[Boolean] = js.undefined
  ): CompileQueryMetadata = {
    val __obj = js.Dynamic.literal(descendants = descendants, first = first, propertyName = propertyName, read = read, selectors = selectors)
    if (!js.isUndefined(static)) __obj.updateDynamic("static")(static)
    __obj.asInstanceOf[CompileQueryMetadata]
  }
}

