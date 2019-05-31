package typings
package awsDashSdkLib.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatastoreStorage extends js.Object {
  /**
    * Use this to store data store data in an S3 bucket that you manage.
    */
  var customerManagedS3: js.UndefOr[CustomerManagedDatastoreS3Storage] = js.undefined
  /**
    * Use this to store data store data in an S3 bucket managed by the AWS IoT Analytics service.
    */
  var serviceManagedS3: js.UndefOr[ServiceManagedDatastoreS3Storage] = js.undefined
}

object DatastoreStorage {
  @scala.inline
  def apply(
    customerManagedS3: CustomerManagedDatastoreS3Storage = null,
    serviceManagedS3: ServiceManagedDatastoreS3Storage = null
  ): DatastoreStorage = {
    val __obj = js.Dynamic.literal()
    if (customerManagedS3 != null) __obj.updateDynamic("customerManagedS3")(customerManagedS3)
    if (serviceManagedS3 != null) __obj.updateDynamic("serviceManagedS3")(serviceManagedS3)
    __obj.asInstanceOf[DatastoreStorage]
  }
}

