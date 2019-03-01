package typings
package applicationinsightsDashJsLib.MicrosoftNs.ApplicationInsightsNs.ContextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUser extends js.Object {
  /**
    * The account acquisition date.
    */
  var accountAcquisitionDate: java.lang.String
  /**
    * The account ID.
    */
  var accountId: java.lang.String
  /**
    * The user agent string.
    */
  var agent: java.lang.String
  /**
    * Authenticated user id
    */
  var authenticatedId: java.lang.String
  /**
    * The telemetry configuration.
    */
  var config: js.Any
  /**
    * The user ID.
    */
  var id: java.lang.String
  /**
    * The store region.
    */
  var storeRegion: java.lang.String
}

object IUser {
  @scala.inline
  def apply(
    accountAcquisitionDate: java.lang.String,
    accountId: java.lang.String,
    agent: java.lang.String,
    authenticatedId: java.lang.String,
    config: js.Any,
    id: java.lang.String,
    storeRegion: java.lang.String
  ): IUser = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("accountAcquisitionDate")(accountAcquisitionDate)
    __obj.updateDynamic("accountId")(accountId)
    __obj.updateDynamic("agent")(agent)
    __obj.updateDynamic("authenticatedId")(authenticatedId)
    __obj.updateDynamic("config")(config)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("storeRegion")(storeRegion)
    __obj.asInstanceOf[IUser]
  }
}

