package typings.angularCompiler.compileMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompileDiDependencyMetadata extends js.Object {
  var isAttribute: js.UndefOr[Boolean] = js.undefined
  var isHost: js.UndefOr[Boolean] = js.undefined
  var isOptional: js.UndefOr[Boolean] = js.undefined
  var isSelf: js.UndefOr[Boolean] = js.undefined
  var isSkipSelf: js.UndefOr[Boolean] = js.undefined
  var isValue: js.UndefOr[Boolean] = js.undefined
  var token: js.UndefOr[CompileTokenMetadata] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object CompileDiDependencyMetadata {
  @scala.inline
  def apply(
    isAttribute: js.UndefOr[Boolean] = js.undefined,
    isHost: js.UndefOr[Boolean] = js.undefined,
    isOptional: js.UndefOr[Boolean] = js.undefined,
    isSelf: js.UndefOr[Boolean] = js.undefined,
    isSkipSelf: js.UndefOr[Boolean] = js.undefined,
    isValue: js.UndefOr[Boolean] = js.undefined,
    token: CompileTokenMetadata = null,
    value: js.Any = null
  ): CompileDiDependencyMetadata = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isAttribute)) __obj.updateDynamic("isAttribute")(isAttribute.asInstanceOf[js.Any])
    if (!js.isUndefined(isHost)) __obj.updateDynamic("isHost")(isHost.asInstanceOf[js.Any])
    if (!js.isUndefined(isOptional)) __obj.updateDynamic("isOptional")(isOptional.asInstanceOf[js.Any])
    if (!js.isUndefined(isSelf)) __obj.updateDynamic("isSelf")(isSelf.asInstanceOf[js.Any])
    if (!js.isUndefined(isSkipSelf)) __obj.updateDynamic("isSkipSelf")(isSkipSelf.asInstanceOf[js.Any])
    if (!js.isUndefined(isValue)) __obj.updateDynamic("isValue")(isValue.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompileDiDependencyMetadata]
  }
}

