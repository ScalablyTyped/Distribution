package typings.awsDashSdk.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelStorage extends js.Object {
  /**
    * Use this to store channel data in an S3 bucket that you manage. If customer managed storage is selected, the "retentionPeriod" parameter is ignored. The choice of service-managed or customer-managed S3 storage cannot be changed after creation of the channel.
    */
  var customerManagedS3: js.UndefOr[CustomerManagedChannelS3Storage] = js.native
  /**
    * Use this to store channel data in an S3 bucket managed by the AWS IoT Analytics service. The choice of service-managed or customer-managed S3 storage cannot be changed after creation of the channel.
    */
  var serviceManagedS3: js.UndefOr[ServiceManagedChannelS3Storage] = js.native
}

object ChannelStorage {
  @scala.inline
  def apply(
    customerManagedS3: CustomerManagedChannelS3Storage = null,
    serviceManagedS3: ServiceManagedChannelS3Storage = null
  ): ChannelStorage = {
    val __obj = js.Dynamic.literal()
    if (customerManagedS3 != null) __obj.updateDynamic("customerManagedS3")(customerManagedS3.asInstanceOf[js.Any])
    if (serviceManagedS3 != null) __obj.updateDynamic("serviceManagedS3")(serviceManagedS3.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelStorage]
  }
}

