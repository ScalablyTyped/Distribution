package typings.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResultConfigurationUpdates extends js.Object {
  /**
    * The encryption configuration for the query results.
    */
  var EncryptionConfiguration: js.UndefOr[typings.awsSdk.athenaMod.EncryptionConfiguration] = js.native
  /**
    * The location in Amazon S3 where your query results are stored, such as s3://path/to/query/bucket/. For more information, see Query Results If workgroup settings override client-side settings, then the query uses the location for the query results and the encryption configuration that are specified for the workgroup. The "workgroup settings override" is specified in EnforceWorkGroupConfiguration (true/false) in the WorkGroupConfiguration. See WorkGroupConfiguration$EnforceWorkGroupConfiguration.
    */
  var OutputLocation: js.UndefOr[String] = js.native
  /**
    * If set to "true", indicates that the previously-specified encryption configuration (also known as the client-side setting) for queries in this workgroup should be ignored and set to null. If set to "false" or not set, and a value is present in the EncryptionConfiguration in ResultConfigurationUpdates (the client-side setting), the EncryptionConfiguration in the workgroup's ResultConfiguration will be updated with the new value. For more information, see Workgroup Settings Override Client-Side Settings.
    */
  var RemoveEncryptionConfiguration: js.UndefOr[BoxedBoolean] = js.native
  /**
    * If set to "true", indicates that the previously-specified query results location (also known as a client-side setting) for queries in this workgroup should be ignored and set to null. If set to "false" or not set, and a value is present in the OutputLocation in ResultConfigurationUpdates (the client-side setting), the OutputLocation in the workgroup's ResultConfiguration will be updated with the new value. For more information, see Workgroup Settings Override Client-Side Settings.
    */
  var RemoveOutputLocation: js.UndefOr[BoxedBoolean] = js.native
}

object ResultConfigurationUpdates {
  @scala.inline
  def apply(
    EncryptionConfiguration: EncryptionConfiguration = null,
    OutputLocation: String = null,
    RemoveEncryptionConfiguration: js.UndefOr[BoxedBoolean] = js.undefined,
    RemoveOutputLocation: js.UndefOr[BoxedBoolean] = js.undefined
  ): ResultConfigurationUpdates = {
    val __obj = js.Dynamic.literal()
    if (EncryptionConfiguration != null) __obj.updateDynamic("EncryptionConfiguration")(EncryptionConfiguration.asInstanceOf[js.Any])
    if (OutputLocation != null) __obj.updateDynamic("OutputLocation")(OutputLocation.asInstanceOf[js.Any])
    if (!js.isUndefined(RemoveEncryptionConfiguration)) __obj.updateDynamic("RemoveEncryptionConfiguration")(RemoveEncryptionConfiguration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(RemoveOutputLocation)) __obj.updateDynamic("RemoveOutputLocation")(RemoveOutputLocation.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultConfigurationUpdates]
  }
}

