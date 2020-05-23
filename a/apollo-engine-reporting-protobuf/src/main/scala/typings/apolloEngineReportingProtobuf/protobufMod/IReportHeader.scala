package typings.apolloEngineReportingProtobuf.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IReportHeader extends js.Object {
  /** ReportHeader agentVersion */
  var agentVersion: js.UndefOr[String | Null] = js.undefined
  /** ReportHeader executableSchemaId */
  var executableSchemaId: js.UndefOr[String | Null] = js.undefined
  /** ReportHeader hostname */
  var hostname: js.UndefOr[String | Null] = js.undefined
  /** ReportHeader runtimeVersion */
  var runtimeVersion: js.UndefOr[String | Null] = js.undefined
  /** ReportHeader schemaTag */
  var schemaTag: js.UndefOr[String | Null] = js.undefined
  /** ReportHeader serviceVersion */
  var serviceVersion: js.UndefOr[String | Null] = js.undefined
  /** ReportHeader uname */
  var uname: js.UndefOr[String | Null] = js.undefined
}

object IReportHeader {
  @scala.inline
  def apply(
    agentVersion: js.UndefOr[Null | String] = js.undefined,
    executableSchemaId: js.UndefOr[Null | String] = js.undefined,
    hostname: js.UndefOr[Null | String] = js.undefined,
    runtimeVersion: js.UndefOr[Null | String] = js.undefined,
    schemaTag: js.UndefOr[Null | String] = js.undefined,
    serviceVersion: js.UndefOr[Null | String] = js.undefined,
    uname: js.UndefOr[Null | String] = js.undefined
  ): IReportHeader = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(agentVersion)) __obj.updateDynamic("agentVersion")(agentVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(executableSchemaId)) __obj.updateDynamic("executableSchemaId")(executableSchemaId.asInstanceOf[js.Any])
    if (!js.isUndefined(hostname)) __obj.updateDynamic("hostname")(hostname.asInstanceOf[js.Any])
    if (!js.isUndefined(runtimeVersion)) __obj.updateDynamic("runtimeVersion")(runtimeVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(schemaTag)) __obj.updateDynamic("schemaTag")(schemaTag.asInstanceOf[js.Any])
    if (!js.isUndefined(serviceVersion)) __obj.updateDynamic("serviceVersion")(serviceVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(uname)) __obj.updateDynamic("uname")(uname.asInstanceOf[js.Any])
    __obj.asInstanceOf[IReportHeader]
  }
}

