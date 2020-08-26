package typings.applicationinsightsJs.Microsoft.ApplicationInsights.Context

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IUser extends js.Object {
  /**
    * The account acquisition date.
    */
  var accountAcquisitionDate: String = js.native
  /**
    * The account ID.
    */
  var accountId: String = js.native
  /**
    * The user agent string.
    */
  var agent: String = js.native
  /**
    * Authenticated user id
    */
  var authenticatedId: String = js.native
  /**
    * The telemetry configuration.
    */
  var config: js.Any = js.native
  /**
    * The user ID.
    */
  var id: String = js.native
  /**
    * The store region.
    */
  var storeRegion: String = js.native
}

object IUser {
  @scala.inline
  def apply(
    accountAcquisitionDate: String,
    accountId: String,
    agent: String,
    authenticatedId: String,
    config: js.Any,
    id: String,
    storeRegion: String
  ): IUser = {
    val __obj = js.Dynamic.literal(accountAcquisitionDate = accountAcquisitionDate.asInstanceOf[js.Any], accountId = accountId.asInstanceOf[js.Any], agent = agent.asInstanceOf[js.Any], authenticatedId = authenticatedId.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], storeRegion = storeRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUser]
  }
  @scala.inline
  implicit class IUserOps[Self <: IUser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccountAcquisitionDate(value: String): Self = this.set("accountAcquisitionDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAgent(value: String): Self = this.set("agent", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuthenticatedId(value: String): Self = this.set("authenticatedId", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfig(value: js.Any): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setStoreRegion(value: String): Self = this.set("storeRegion", value.asInstanceOf[js.Any])
  }
  
}

