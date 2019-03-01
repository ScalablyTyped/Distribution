package typings
package atAngularCompilerLib.srcCompileUnderscoreMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompileDiDependencyMetadata extends js.Object {
  var isAttribute: js.UndefOr[scala.Boolean] = js.undefined
  var isHost: js.UndefOr[scala.Boolean] = js.undefined
  var isOptional: js.UndefOr[scala.Boolean] = js.undefined
  var isSelf: js.UndefOr[scala.Boolean] = js.undefined
  var isSkipSelf: js.UndefOr[scala.Boolean] = js.undefined
  var isValue: js.UndefOr[scala.Boolean] = js.undefined
  var token: js.UndefOr[CompileTokenMetadata] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object CompileDiDependencyMetadata {
  @scala.inline
  def apply(
    isAttribute: js.UndefOr[scala.Boolean] = js.undefined,
    isHost: js.UndefOr[scala.Boolean] = js.undefined,
    isOptional: js.UndefOr[scala.Boolean] = js.undefined,
    isSelf: js.UndefOr[scala.Boolean] = js.undefined,
    isSkipSelf: js.UndefOr[scala.Boolean] = js.undefined,
    isValue: js.UndefOr[scala.Boolean] = js.undefined,
    token: CompileTokenMetadata = null,
    value: js.Any = null
  ): CompileDiDependencyMetadata = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isAttribute)) __obj.updateDynamic("isAttribute")(isAttribute)
    if (!js.isUndefined(isHost)) __obj.updateDynamic("isHost")(isHost)
    if (!js.isUndefined(isOptional)) __obj.updateDynamic("isOptional")(isOptional)
    if (!js.isUndefined(isSelf)) __obj.updateDynamic("isSelf")(isSelf)
    if (!js.isUndefined(isSkipSelf)) __obj.updateDynamic("isSkipSelf")(isSkipSelf)
    if (!js.isUndefined(isValue)) __obj.updateDynamic("isValue")(isValue)
    if (token != null) __obj.updateDynamic("token")(token)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[CompileDiDependencyMetadata]
  }
}

