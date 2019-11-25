package typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IReportHeader extends js.Object {
  /** ReportHeader agentVersion */
  var agentVersion: js.UndefOr[String | Null] = js.undefined
  /** ReportHeader hostname */
  var hostname: js.UndefOr[String | Null] = js.undefined
  /** ReportHeader runtimeVersion */
  var runtimeVersion: js.UndefOr[String | Null] = js.undefined
  /** ReportHeader schemaHash */
  var schemaHash: js.UndefOr[String | Null] = js.undefined
  /** ReportHeader schemaTag */
  var schemaTag: js.UndefOr[String | Null] = js.undefined
  /** ReportHeader service */
  var service: js.UndefOr[String | Null] = js.undefined
  /** ReportHeader serviceVersion */
  var serviceVersion: js.UndefOr[String | Null] = js.undefined
  /** ReportHeader uname */
  var uname: js.UndefOr[String | Null] = js.undefined
}

object IReportHeader {
  @scala.inline
  def apply(
    agentVersion: String = null,
    hostname: String = null,
    runtimeVersion: String = null,
    schemaHash: String = null,
    schemaTag: String = null,
    service: String = null,
    serviceVersion: String = null,
    uname: String = null
  ): IReportHeader = {
    val __obj = js.Dynamic.literal()
    if (agentVersion != null) __obj.updateDynamic("agentVersion")(agentVersion.asInstanceOf[js.Any])
    if (hostname != null) __obj.updateDynamic("hostname")(hostname.asInstanceOf[js.Any])
    if (runtimeVersion != null) __obj.updateDynamic("runtimeVersion")(runtimeVersion.asInstanceOf[js.Any])
    if (schemaHash != null) __obj.updateDynamic("schemaHash")(schemaHash.asInstanceOf[js.Any])
    if (schemaTag != null) __obj.updateDynamic("schemaTag")(schemaTag.asInstanceOf[js.Any])
    if (service != null) __obj.updateDynamic("service")(service.asInstanceOf[js.Any])
    if (serviceVersion != null) __obj.updateDynamic("serviceVersion")(serviceVersion.asInstanceOf[js.Any])
    if (uname != null) __obj.updateDynamic("uname")(uname.asInstanceOf[js.Any])
    __obj.asInstanceOf[IReportHeader]
  }
}

