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

