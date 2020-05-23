package typings.apolloReact.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationOption extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var options: js.UndefOr[js.Object | (js.Function1[/* props */ js.Any, QueryOptions | MutationOptions])] = js.undefined
  var props: js.UndefOr[js.Function1[/* props */ js.Any, _]] = js.undefined
  var skip: js.UndefOr[Boolean | (js.Function1[/* props */ js.Any, Boolean])] = js.undefined
  var withRef: js.UndefOr[Boolean] = js.undefined
}

object OperationOption {
  @scala.inline
  def apply(
    name: String = null,
    options: js.Object | (js.Function1[/* props */ js.Any, QueryOptions | MutationOptions]) = null,
    props: /* props */ js.Any => _ = null,
    skip: Boolean | (js.Function1[/* props */ js.Any, Boolean]) = null,
    withRef: js.UndefOr[Boolean] = js.undefined
  ): OperationOption = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (props != null) __obj.updateDynamic("props")(js.Any.fromFunction1(props))
    if (skip != null) __obj.updateDynamic("skip")(skip.asInstanceOf[js.Any])
    if (!js.isUndefined(withRef)) __obj.updateDynamic("withRef")(withRef.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationOption]
  }
}

