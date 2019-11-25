package typings.atAngularCompiler.srcCompileUnderscoreMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompileTokenMetadata extends js.Object {
  var identifier: js.UndefOr[CompileIdentifierMetadata | CompileTypeMetadata] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object CompileTokenMetadata {
  @scala.inline
  def apply(identifier: CompileIdentifierMetadata | CompileTypeMetadata = null, value: js.Any = null): CompileTokenMetadata = {
    val __obj = js.Dynamic.literal()
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompileTokenMetadata]
  }
}

