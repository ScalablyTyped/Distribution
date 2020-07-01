package typings.apolloEngineReporting.reportingOperationTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EdgeServerInfo extends js.Object {
  var bootId: String
  var executableSchemaId: String
  var graphVariant: String
  var libraryVersion: js.UndefOr[String | Null] = js.undefined
  var platform: js.UndefOr[String | Null] = js.undefined
  var runtimeVersion: js.UndefOr[String | Null] = js.undefined
  var serverId: js.UndefOr[String | Null] = js.undefined
  var userVersion: js.UndefOr[String | Null] = js.undefined
}

object EdgeServerInfo {
  @scala.inline
  def apply(
    bootId: String,
    executableSchemaId: String,
    graphVariant: String,
    libraryVersion: js.UndefOr[Null | String] = js.undefined,
    platform: js.UndefOr[Null | String] = js.undefined,
    runtimeVersion: js.UndefOr[Null | String] = js.undefined,
    serverId: js.UndefOr[Null | String] = js.undefined,
    userVersion: js.UndefOr[Null | String] = js.undefined
  ): EdgeServerInfo = {
    val __obj = js.Dynamic.literal(bootId = bootId.asInstanceOf[js.Any], executableSchemaId = executableSchemaId.asInstanceOf[js.Any], graphVariant = graphVariant.asInstanceOf[js.Any])
    if (!js.isUndefined(libraryVersion)) __obj.updateDynamic("libraryVersion")(libraryVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(platform)) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (!js.isUndefined(runtimeVersion)) __obj.updateDynamic("runtimeVersion")(runtimeVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(serverId)) __obj.updateDynamic("serverId")(serverId.asInstanceOf[js.Any])
    if (!js.isUndefined(userVersion)) __obj.updateDynamic("userVersion")(userVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[EdgeServerInfo]
  }
}

