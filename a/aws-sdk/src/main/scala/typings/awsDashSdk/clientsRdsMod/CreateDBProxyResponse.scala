package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDBProxyResponse extends js.Object {
  /**
    * The DBProxy structure corresponding to the new proxy.
    */
  var DBProxy: js.UndefOr[typings.awsDashSdk.clientsRdsMod.DBProxy] = js.native
}

object CreateDBProxyResponse {
  @scala.inline
  def apply(DBProxy: DBProxy = null): CreateDBProxyResponse = {
    val __obj = js.Dynamic.literal()
    if (DBProxy != null) __obj.updateDynamic("DBProxy")(DBProxy.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDBProxyResponse]
  }
}

