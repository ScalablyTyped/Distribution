package typings.angularCompiler.compileMetadataMod

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
    val __obj = js.Dynamic.literal(descendants = descendants.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any], propertyName = propertyName.asInstanceOf[js.Any], read = read.asInstanceOf[js.Any], selectors = selectors.asInstanceOf[js.Any])
    if (!js.isUndefined(static)) __obj.updateDynamic("static")(static.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompileQueryMetadata]
  }
}

