package typings.awsDashSdk.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListRoutesOutput extends js.Object {
  /**
    * The nextToken value to include in a future ListRoutes request.
    When the results of a ListRoutes request exceed limit, you can
    use this value to retrieve the next page of results. This value is null when
    there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.native
  /**
    * The list of existing routes for the specified service mesh and virtual router.
    */
  var routes: RouteList = js.native
}

object ListRoutesOutput {
  @scala.inline
  def apply(routes: RouteList, nextToken: String = null): ListRoutesOutput = {
    val __obj = js.Dynamic.literal(routes = routes.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRoutesOutput]
  }
}

