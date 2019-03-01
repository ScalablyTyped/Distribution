package typings
package apolloDashEngineDashReportingDashProtobufLib.distProtobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IReportHeader extends js.Object {
  /** ReportHeader agentVersion */
  var agentVersion: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /** ReportHeader hostname */
  var hostname: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /** ReportHeader runtimeVersion */
  var runtimeVersion: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /** ReportHeader schemaHash */
  var schemaHash: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /** ReportHeader schemaTag */
  var schemaTag: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /** ReportHeader service */
  var service: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /** ReportHeader serviceVersion */
  var serviceVersion: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /** ReportHeader uname */
  var uname: js.UndefOr[java.lang.String | scala.Null] = js.undefined
}

object IReportHeader {
  @scala.inline
  def apply(
    agentVersion: java.lang.String = null,
    hostname: java.lang.String = null,
    runtimeVersion: java.lang.String = null,
    schemaHash: java.lang.String = null,
    schemaTag: java.lang.String = null,
    service: java.lang.String = null,
    serviceVersion: java.lang.String = null,
    uname: java.lang.String = null
  ): IReportHeader = {
    val __obj = js.Dynamic.literal()
    if (agentVersion != null) __obj.updateDynamic("agentVersion")(agentVersion)
    if (hostname != null) __obj.updateDynamic("hostname")(hostname)
    if (runtimeVersion != null) __obj.updateDynamic("runtimeVersion")(runtimeVersion)
    if (schemaHash != null) __obj.updateDynamic("schemaHash")(schemaHash)
    if (schemaTag != null) __obj.updateDynamic("schemaTag")(schemaTag)
    if (service != null) __obj.updateDynamic("service")(service)
    if (serviceVersion != null) __obj.updateDynamic("serviceVersion")(serviceVersion)
    if (uname != null) __obj.updateDynamic("uname")(uname)
    __obj.asInstanceOf[IReportHeader]
  }
}

