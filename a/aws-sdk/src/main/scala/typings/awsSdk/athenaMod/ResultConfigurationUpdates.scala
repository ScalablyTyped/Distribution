package typings.awsSdk.athenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResultConfigurationUpdates extends StObject {
  
  /**
    * The encryption configuration for the query results.
    */
  var EncryptionConfiguration: js.UndefOr[typings.awsSdk.athenaMod.EncryptionConfiguration] = js.undefined
  
  /**
    * The location in Amazon S3 where your query results are stored, such as s3://path/to/query/bucket/. For more information, see Query Results If workgroup settings override client-side settings, then the query uses the location for the query results and the encryption configuration that are specified for the workgroup. The "workgroup settings override" is specified in EnforceWorkGroupConfiguration (true/false) in the WorkGroupConfiguration. See WorkGroupConfiguration$EnforceWorkGroupConfiguration.
    */
  var OutputLocation: js.UndefOr[String] = js.undefined
  
  /**
    * If set to "true", indicates that the previously-specified encryption configuration (also known as the client-side setting) for queries in this workgroup should be ignored and set to null. If set to "false" or not set, and a value is present in the EncryptionConfiguration in ResultConfigurationUpdates (the client-side setting), the EncryptionConfiguration in the workgroup's ResultConfiguration will be updated with the new value. For more information, see Workgroup Settings Override Client-Side Settings.
    */
  var RemoveEncryptionConfiguration: js.UndefOr[BoxedBoolean] = js.undefined
  
  /**
    * If set to "true", indicates that the previously-specified query results location (also known as a client-side setting) for queries in this workgroup should be ignored and set to null. If set to "false" or not set, and a value is present in the OutputLocation in ResultConfigurationUpdates (the client-side setting), the OutputLocation in the workgroup's ResultConfiguration will be updated with the new value. For more information, see Workgroup Settings Override Client-Side Settings.
    */
  var RemoveOutputLocation: js.UndefOr[BoxedBoolean] = js.undefined
}
object ResultConfigurationUpdates {
  
  @scala.inline
  def apply(): ResultConfigurationUpdates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResultConfigurationUpdates]
  }
  
  @scala.inline
  implicit class ResultConfigurationUpdatesMutableBuilder[Self <: ResultConfigurationUpdates] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncryptionConfiguration(value: EncryptionConfiguration): Self = StObject.set(x, "EncryptionConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionConfigurationUndefined: Self = StObject.set(x, "EncryptionConfiguration", js.undefined)
    
    @scala.inline
    def setOutputLocation(value: String): Self = StObject.set(x, "OutputLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputLocationUndefined: Self = StObject.set(x, "OutputLocation", js.undefined)
    
    @scala.inline
    def setRemoveEncryptionConfiguration(value: BoxedBoolean): Self = StObject.set(x, "RemoveEncryptionConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveEncryptionConfigurationUndefined: Self = StObject.set(x, "RemoveEncryptionConfiguration", js.undefined)
    
    @scala.inline
    def setRemoveOutputLocation(value: BoxedBoolean): Self = StObject.set(x, "RemoveOutputLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveOutputLocationUndefined: Self = StObject.set(x, "RemoveOutputLocation", js.undefined)
  }
}
