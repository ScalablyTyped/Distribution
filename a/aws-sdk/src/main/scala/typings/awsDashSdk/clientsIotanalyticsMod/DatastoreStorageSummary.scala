package typings.awsDashSdk.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatastoreStorageSummary extends js.Object {
  /**
    * Used to store data store data in an S3 bucket that you manage.
    */
  var customerManagedS3: js.UndefOr[CustomerManagedDatastoreS3StorageSummary] = js.undefined
  /**
    * Used to store data store data in an S3 bucket managed by the AWS IoT Analytics service.
    */
  var serviceManagedS3: js.UndefOr[ServiceManagedDatastoreS3StorageSummary] = js.undefined
}

object DatastoreStorageSummary {
  @scala.inline
  def apply(
    customerManagedS3: CustomerManagedDatastoreS3StorageSummary = null,
    serviceManagedS3: ServiceManagedDatastoreS3StorageSummary = null
  ): DatastoreStorageSummary = {
    val __obj = js.Dynamic.literal()
    if (customerManagedS3 != null) __obj.updateDynamic("customerManagedS3")(customerManagedS3)
    if (serviceManagedS3 != null) __obj.updateDynamic("serviceManagedS3")(serviceManagedS3)
    __obj.asInstanceOf[DatastoreStorageSummary]
  }
}

