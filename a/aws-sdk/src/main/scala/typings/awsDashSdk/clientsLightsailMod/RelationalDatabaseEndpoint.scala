package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelationalDatabaseEndpoint extends js.Object {
  /**
    * Specifies the DNS address of the database.
    */
  var address: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * Specifies the port that the database is listening on.
    */
  var port: js.UndefOr[integer] = js.undefined
}

object RelationalDatabaseEndpoint {
  @scala.inline
  def apply(address: NonEmptyString = null, port: js.UndefOr[integer] = js.undefined): RelationalDatabaseEndpoint = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address)
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port)
    __obj.asInstanceOf[RelationalDatabaseEndpoint]
  }
}

