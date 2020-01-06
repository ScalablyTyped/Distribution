package typings.awsDashSdk.clientsKendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceConfiguration extends js.Object {
  /**
    * Provides information necessary to create a connector for a database.
    */
  var DatabaseConfiguration: js.UndefOr[typings.awsDashSdk.clientsKendraMod.DatabaseConfiguration] = js.native
  /**
    * Provides information to create a connector for a document repository in an Amazon S3 bucket.
    */
  var S3Configuration: js.UndefOr[S3DataSourceConfiguration] = js.native
  /**
    * Provides information necessary to create a connector for a Microsoft SharePoint site.
    */
  var SharePointConfiguration: js.UndefOr[typings.awsDashSdk.clientsKendraMod.SharePointConfiguration] = js.native
}

object DataSourceConfiguration {
  @scala.inline
  def apply(
    DatabaseConfiguration: DatabaseConfiguration = null,
    S3Configuration: S3DataSourceConfiguration = null,
    SharePointConfiguration: SharePointConfiguration = null
  ): DataSourceConfiguration = {
    val __obj = js.Dynamic.literal()
    if (DatabaseConfiguration != null) __obj.updateDynamic("DatabaseConfiguration")(DatabaseConfiguration.asInstanceOf[js.Any])
    if (S3Configuration != null) __obj.updateDynamic("S3Configuration")(S3Configuration.asInstanceOf[js.Any])
    if (SharePointConfiguration != null) __obj.updateDynamic("SharePointConfiguration")(SharePointConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceConfiguration]
  }
}

