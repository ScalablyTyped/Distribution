package typings.awsDashSdk.clientsQuicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDataSourceRequest extends js.Object {
  /**
    * The AWS account ID.
    */
  var AwsAccountId: typings.awsDashSdk.clientsQuicksightMod.AwsAccountId = js.native
  /**
    * The credentials that QuickSight that uses to connect to your underlying source. Currently, only credentials based on user name and password are supported.
    */
  var Credentials: js.UndefOr[DataSourceCredentials] = js.native
  /**
    * The ID of the data source. This ID is unique per AWS Region for each AWS account. 
    */
  var DataSourceId: ResourceId = js.native
  /**
    * The parameters that QuickSight uses to connect to your underlying source.
    */
  var DataSourceParameters: js.UndefOr[typings.awsDashSdk.clientsQuicksightMod.DataSourceParameters] = js.native
  /**
    * A display name for the data source.
    */
  var Name: ResourceName = js.native
  /**
    * Secure Socket Layer (SSL) properties that apply when QuickSight connects to your underlying source.
    */
  var SslProperties: js.UndefOr[typings.awsDashSdk.clientsQuicksightMod.SslProperties] = js.native
  /**
    * Use this parameter only when you want QuickSight to use a VPC connection when connecting to your underlying source.
    */
  var VpcConnectionProperties: js.UndefOr[typings.awsDashSdk.clientsQuicksightMod.VpcConnectionProperties] = js.native
}

object UpdateDataSourceRequest {
  @scala.inline
  def apply(
    AwsAccountId: AwsAccountId,
    DataSourceId: ResourceId,
    Name: ResourceName,
    Credentials: DataSourceCredentials = null,
    DataSourceParameters: DataSourceParameters = null,
    SslProperties: SslProperties = null,
    VpcConnectionProperties: VpcConnectionProperties = null
  ): UpdateDataSourceRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], DataSourceId = DataSourceId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    if (Credentials != null) __obj.updateDynamic("Credentials")(Credentials.asInstanceOf[js.Any])
    if (DataSourceParameters != null) __obj.updateDynamic("DataSourceParameters")(DataSourceParameters.asInstanceOf[js.Any])
    if (SslProperties != null) __obj.updateDynamic("SslProperties")(SslProperties.asInstanceOf[js.Any])
    if (VpcConnectionProperties != null) __obj.updateDynamic("VpcConnectionProperties")(VpcConnectionProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDataSourceRequest]
  }
}

