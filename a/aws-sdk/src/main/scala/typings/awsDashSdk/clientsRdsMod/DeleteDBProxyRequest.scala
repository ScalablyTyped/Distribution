package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDBProxyRequest extends js.Object {
  /**
    * The name of the DB proxy to delete.
    */
  var DBProxyName: String = js.native
}

object DeleteDBProxyRequest {
  @scala.inline
  def apply(DBProxyName: String): DeleteDBProxyRequest = {
    val __obj = js.Dynamic.literal(DBProxyName = DBProxyName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteDBProxyRequest]
  }
}

