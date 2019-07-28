package typings.awsDashSdk.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelStorage extends js.Object {
  /**
    * Use this to store channel data in an S3 bucket that you manage.
    */
  var customerManagedS3: js.UndefOr[CustomerManagedChannelS3Storage] = js.undefined
  /**
    * Use this to store channel data in an S3 bucket managed by the AWS IoT Analytics service.
    */
  var serviceManagedS3: js.UndefOr[ServiceManagedChannelS3Storage] = js.undefined
}

object ChannelStorage {
  @scala.inline
  def apply(
    customerManagedS3: CustomerManagedChannelS3Storage = null,
    serviceManagedS3: ServiceManagedChannelS3Storage = null
  ): ChannelStorage = {
    val __obj = js.Dynamic.literal()
    if (customerManagedS3 != null) __obj.updateDynamic("customerManagedS3")(customerManagedS3)
    if (serviceManagedS3 != null) __obj.updateDynamic("serviceManagedS3")(serviceManagedS3)
    __obj.asInstanceOf[ChannelStorage]
  }
}

