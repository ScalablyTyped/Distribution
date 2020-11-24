package typings.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): ResultConfigurationUpdates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResultConfigurationUpdates]
  }
  
  @scala.inline
  implicit class ResultConfigurationUpdatesOps[Self <: ResultConfigurationUpdates] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setRemoveEncryptionConfiguration(value: BoxedBoolean): Self = this.set("RemoveEncryptionConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveEncryptionConfiguration: Self = this.set("RemoveEncryptionConfiguration", js.undefined)
    
    @scala.inline
    def setRemoveOutputLocation(value: BoxedBoolean): Self = this.set("RemoveOutputLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveOutputLocation: Self = this.set("RemoveOutputLocation", js.undefined)
  }
}
