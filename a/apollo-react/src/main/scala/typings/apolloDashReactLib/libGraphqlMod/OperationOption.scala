package typings
package apolloDashReactLib.libGraphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationOption extends js.Object {
  var name: js.UndefOr[java.lang.String] = js.undefined
  var options: js.UndefOr[js.Object | (js.Function1[/* props */ js.Any, QueryOptions | MutationOptions])] = js.undefined
  var props: js.UndefOr[js.Function1[/* props */ js.Any, _]] = js.undefined
  var skip: js.UndefOr[scala.Boolean | (js.Function1[/* props */ js.Any, scala.Boolean])] = js.undefined
  var withRef: js.UndefOr[scala.Boolean] = js.undefined
}

object OperationOption {
  @scala.inline
  def apply(
    name: java.lang.String = null,
    options: js.Object | (js.Function1[/* props */ js.Any, QueryOptions | MutationOptions]) = null,
    props: js.Function1[/* props */ js.Any, _] = null,
    skip: scala.Boolean | (js.Function1[/* props */ js.Any, scala.Boolean]) = null,
    withRef: js.UndefOr[scala.Boolean] = js.undefined
  ): OperationOption = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (props != null) __obj.updateDynamic("props")(props)
    if (skip != null) __obj.updateDynamic("skip")(skip.asInstanceOf[js.Any])
    if (!js.isUndefined(withRef)) __obj.updateDynamic("withRef")(withRef)
    __obj.asInstanceOf[OperationOption]
  }
}

