package typings.applicationinsightsDashJs.MicrosoftNs.ApplicationInsightsNs.ContextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUser extends js.Object {
  /**
    * The account acquisition date.
    */
  var accountAcquisitionDate: String
  /**
    * The account ID.
    */
  var accountId: String
  /**
    * The user agent string.
    */
  var agent: String
  /**
    * Authenticated user id
    */
  var authenticatedId: String
  /**
    * The telemetry configuration.
    */
  var config: js.Any
  /**
    * The user ID.
    */
  var id: String
  /**
    * The store region.
    */
  var storeRegion: String
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
    val __obj = js.Dynamic.literal(accountAcquisitionDate = accountAcquisitionDate, accountId = accountId, agent = agent, authenticatedId = authenticatedId, config = config, id = id, storeRegion = storeRegion)
  
    __obj.asInstanceOf[IUser]
  }
}

