package typings
package awsDashSdkLib.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SupportedEndpointType extends js.Object {
  /**
    * The type of endpoint.
    */
  var EndpointType: js.UndefOr[ReplicationEndpointTypeValue] = js.undefined
  /**
    * The expanded name for the engine name. For example, if the EngineName parameter is "aurora," this value would be "Amazon Aurora MySQL."
    */
  var EngineDisplayName: js.UndefOr[String] = js.undefined
  /**
    * The database engine name. Valid values, depending on the EndPointType, include mysql, oracle, postgres, mariadb, aurora, aurora-postgresql, redshift, s3, db2, azuredb, sybase, sybase, dynamodb, mongodb, and sqlserver.
    */
  var EngineName: js.UndefOr[String] = js.undefined
  /**
    * Indicates if Change Data Capture (CDC) is supported.
    */
  var SupportsCDC: js.UndefOr[Boolean] = js.undefined
}

object SupportedEndpointType {
  @scala.inline
  def apply(
    EndpointType: ReplicationEndpointTypeValue = null,
    EngineDisplayName: String = null,
    EngineName: String = null,
    SupportsCDC: js.UndefOr[Boolean] = js.undefined
  ): SupportedEndpointType = {
    val __obj = js.Dynamic.literal()
    if (EndpointType != null) __obj.updateDynamic("EndpointType")(EndpointType.asInstanceOf[js.Any])
    if (EngineDisplayName != null) __obj.updateDynamic("EngineDisplayName")(EngineDisplayName)
    if (EngineName != null) __obj.updateDynamic("EngineName")(EngineName)
    if (!js.isUndefined(SupportsCDC)) __obj.updateDynamic("SupportsCDC")(SupportsCDC)
    __obj.asInstanceOf[SupportedEndpointType]
  }
}

