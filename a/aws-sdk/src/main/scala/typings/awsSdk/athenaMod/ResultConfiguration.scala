package typings.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResultConfiguration extends js.Object {
  /**
    * If query results are encrypted in Amazon S3, indicates the encryption option used (for example, SSE-KMS or CSE-KMS) and key information. This is a client-side setting. If workgroup settings override client-side settings, then the query uses the encryption configuration that is specified for the workgroup, and also uses the location for storing query results specified in the workgroup. See WorkGroupConfiguration$EnforceWorkGroupConfiguration and Workgroup Settings Override Client-Side Settings.
    */
  var EncryptionConfiguration: js.UndefOr[typings.awsSdk.athenaMod.EncryptionConfiguration] = js.native
  /**
    * The location in Amazon S3 where your query results are stored, such as s3://path/to/query/bucket/. To run the query, you must specify the query results location using one of the ways: either for individual queries using either this setting (client-side), or in the workgroup, using WorkGroupConfiguration. If none of them is set, Athena issues an error that no output location is provided. For more information, see Query Results. If workgroup settings override client-side settings, then the query uses the settings specified for the workgroup. See WorkGroupConfiguration$EnforceWorkGroupConfiguration.
    */
  var OutputLocation: js.UndefOr[String] = js.native
}

object ResultConfiguration {
  @scala.inline
  def apply(): ResultConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResultConfiguration]
  }
  @scala.inline
  implicit class ResultConfigurationOps[Self <: ResultConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEncryptionConfiguration(value: EncryptionConfiguration): Self = this.set("EncryptionConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncryptionConfiguration: Self = this.set("EncryptionConfiguration", js.undefined)
    @scala.inline
    def setOutputLocation(value: String): Self = this.set("OutputLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputLocation: Self = this.set("OutputLocation", js.undefined)
  }
  
}

