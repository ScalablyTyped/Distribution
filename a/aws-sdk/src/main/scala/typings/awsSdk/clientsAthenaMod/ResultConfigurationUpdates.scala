package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResultConfigurationUpdates extends StObject {
  
  /**
    * The ACL configuration for the query results.
    */
  var AclConfiguration: js.UndefOr[typings.awsSdk.clientsAthenaMod.AclConfiguration] = js.undefined
  
  /**
    * The encryption configuration for query and calculation results.
    */
  var EncryptionConfiguration: js.UndefOr[typings.awsSdk.clientsAthenaMod.EncryptionConfiguration] = js.undefined
  
  /**
    * The Amazon Web Services account ID that you expect to be the owner of the Amazon S3 bucket specified by ResultConfiguration$OutputLocation. If set, Athena uses the value for ExpectedBucketOwner when it makes Amazon S3 calls to your specified output location. If the ExpectedBucketOwner Amazon Web Services account ID does not match the actual owner of the Amazon S3 bucket, the call fails with a permissions error. If workgroup settings override client-side settings, then the query uses the ExpectedBucketOwner setting that is specified for the workgroup, and also uses the location for storing query results specified in the workgroup. See WorkGroupConfiguration$EnforceWorkGroupConfiguration and Workgroup Settings Override Client-Side Settings.
    */
  var ExpectedBucketOwner: js.UndefOr[AwsAccountId] = js.undefined
  
  /**
    * The location in Amazon S3 where your query and calculation results are stored, such as s3://path/to/query/bucket/. For more information, see Working with query results, recent queries, and output files. If workgroup settings override client-side settings, then the query uses the location for the query results and the encryption configuration that are specified for the workgroup. The "workgroup settings override" is specified in EnforceWorkGroupConfiguration (true/false) in the WorkGroupConfiguration. See WorkGroupConfiguration$EnforceWorkGroupConfiguration.
    */
  var OutputLocation: js.UndefOr[ResultOutputLocation] = js.undefined
  
  /**
    * If set to true, indicates that the previously-specified ACL configuration for queries in this workgroup should be ignored and set to null. If set to false or not set, and a value is present in the AclConfiguration of ResultConfigurationUpdates, the AclConfiguration in the workgroup's ResultConfiguration is updated with the new value. For more information, see Workgroup Settings Override Client-Side Settings.
    */
  var RemoveAclConfiguration: js.UndefOr[BoxedBoolean] = js.undefined
  
  /**
    * If set to "true", indicates that the previously-specified encryption configuration (also known as the client-side setting) for queries in this workgroup should be ignored and set to null. If set to "false" or not set, and a value is present in the EncryptionConfiguration in ResultConfigurationUpdates (the client-side setting), the EncryptionConfiguration in the workgroup's ResultConfiguration will be updated with the new value. For more information, see Workgroup Settings Override Client-Side Settings.
    */
  var RemoveEncryptionConfiguration: js.UndefOr[BoxedBoolean] = js.undefined
  
  /**
    * If set to "true", removes the Amazon Web Services account ID previously specified for ResultConfiguration$ExpectedBucketOwner. If set to "false" or not set, and a value is present in the ExpectedBucketOwner in ResultConfigurationUpdates (the client-side setting), the ExpectedBucketOwner in the workgroup's ResultConfiguration is updated with the new value. For more information, see Workgroup Settings Override Client-Side Settings.
    */
  var RemoveExpectedBucketOwner: js.UndefOr[BoxedBoolean] = js.undefined
  
  /**
    * If set to "true", indicates that the previously-specified query results location (also known as a client-side setting) for queries in this workgroup should be ignored and set to null. If set to "false" or not set, and a value is present in the OutputLocation in ResultConfigurationUpdates (the client-side setting), the OutputLocation in the workgroup's ResultConfiguration will be updated with the new value. For more information, see Workgroup Settings Override Client-Side Settings.
    */
  var RemoveOutputLocation: js.UndefOr[BoxedBoolean] = js.undefined
}
object ResultConfigurationUpdates {
  
  inline def apply(): ResultConfigurationUpdates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResultConfigurationUpdates]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResultConfigurationUpdates] (val x: Self) extends AnyVal {
    
    inline def setAclConfiguration(value: AclConfiguration): Self = StObject.set(x, "AclConfiguration", value.asInstanceOf[js.Any])
    
    inline def setAclConfigurationUndefined: Self = StObject.set(x, "AclConfiguration", js.undefined)
    
    inline def setEncryptionConfiguration(value: EncryptionConfiguration): Self = StObject.set(x, "EncryptionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setEncryptionConfigurationUndefined: Self = StObject.set(x, "EncryptionConfiguration", js.undefined)
    
    inline def setExpectedBucketOwner(value: AwsAccountId): Self = StObject.set(x, "ExpectedBucketOwner", value.asInstanceOf[js.Any])
    
    inline def setExpectedBucketOwnerUndefined: Self = StObject.set(x, "ExpectedBucketOwner", js.undefined)
    
    inline def setOutputLocation(value: ResultOutputLocation): Self = StObject.set(x, "OutputLocation", value.asInstanceOf[js.Any])
    
    inline def setOutputLocationUndefined: Self = StObject.set(x, "OutputLocation", js.undefined)
    
    inline def setRemoveAclConfiguration(value: BoxedBoolean): Self = StObject.set(x, "RemoveAclConfiguration", value.asInstanceOf[js.Any])
    
    inline def setRemoveAclConfigurationUndefined: Self = StObject.set(x, "RemoveAclConfiguration", js.undefined)
    
    inline def setRemoveEncryptionConfiguration(value: BoxedBoolean): Self = StObject.set(x, "RemoveEncryptionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setRemoveEncryptionConfigurationUndefined: Self = StObject.set(x, "RemoveEncryptionConfiguration", js.undefined)
    
    inline def setRemoveExpectedBucketOwner(value: BoxedBoolean): Self = StObject.set(x, "RemoveExpectedBucketOwner", value.asInstanceOf[js.Any])
    
    inline def setRemoveExpectedBucketOwnerUndefined: Self = StObject.set(x, "RemoveExpectedBucketOwner", js.undefined)
    
    inline def setRemoveOutputLocation(value: BoxedBoolean): Self = StObject.set(x, "RemoveOutputLocation", value.asInstanceOf[js.Any])
    
    inline def setRemoveOutputLocationUndefined: Self = StObject.set(x, "RemoveOutputLocation", js.undefined)
  }
}
