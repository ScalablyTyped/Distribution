package typings.awsDashSdk.clientsAthenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultConfiguration extends js.Object {
  /**
    * If query results are encrypted in Amazon S3, indicates the encryption option used (for example, SSE-KMS or CSE-KMS) and key information. This is a client-side setting. If workgroup settings override client-side settings, then the query uses the encryption configuration that is specified for the workgroup, and also uses the location for storing query results specified in the workgroup. See WorkGroupConfiguration$EnforceWorkGroupConfiguration and Workgroup Settings Override Client-Side Settings.
    */
  var EncryptionConfiguration: js.UndefOr[typings.awsDashSdk.clientsAthenaMod.EncryptionConfiguration] = js.undefined
  /**
    * The location in Amazon S3 where your query results are stored, such as s3://path/to/query/bucket/. For more information, see Queries and Query Result Files. If workgroup settings override client-side settings, then the query uses the location for the query results and the encryption configuration that are specified for the workgroup. The "workgroup settings override" is specified in EnforceWorkGroupConfiguration (true/false) in the WorkGroupConfiguration. See WorkGroupConfiguration$EnforceWorkGroupConfiguration.
    */
  var OutputLocation: js.UndefOr[String] = js.undefined
}

object ResultConfiguration {
  @scala.inline
  def apply(EncryptionConfiguration: EncryptionConfiguration = null, OutputLocation: String = null): ResultConfiguration = {
    val __obj = js.Dynamic.literal()
    if (EncryptionConfiguration != null) __obj.updateDynamic("EncryptionConfiguration")(EncryptionConfiguration)
    if (OutputLocation != null) __obj.updateDynamic("OutputLocation")(OutputLocation)
    __obj.asInstanceOf[ResultConfiguration]
  }
}

