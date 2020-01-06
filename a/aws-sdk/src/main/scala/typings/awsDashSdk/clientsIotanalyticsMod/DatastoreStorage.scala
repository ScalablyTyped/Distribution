package typings.awsDashSdk.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatastoreStorage extends js.Object {
  /**
    * Use this to store data store data in an S3 bucket that you manage. When customer managed storage is selected, the "retentionPeriod" parameter is ignored. The choice of service-managed or customer-managed S3 storage cannot be changed after creation of the data store.
    */
  var customerManagedS3: js.UndefOr[CustomerManagedDatastoreS3Storage] = js.native
  /**
    * Use this to store data store data in an S3 bucket managed by the AWS IoT Analytics service. The choice of service-managed or customer-managed S3 storage cannot be changed after creation of the data store.
    */
  var serviceManagedS3: js.UndefOr[ServiceManagedDatastoreS3Storage] = js.native
}

object DatastoreStorage {
  @scala.inline
  def apply(
    customerManagedS3: CustomerManagedDatastoreS3Storage = null,
    serviceManagedS3: ServiceManagedDatastoreS3Storage = null
  ): DatastoreStorage = {
    val __obj = js.Dynamic.literal()
    if (customerManagedS3 != null) __obj.updateDynamic("customerManagedS3")(customerManagedS3.asInstanceOf[js.Any])
    if (serviceManagedS3 != null) __obj.updateDynamic("serviceManagedS3")(serviceManagedS3.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatastoreStorage]
  }
}

