package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResultConfiguration extends StObject {
  
  /**
    * Indicates that an Amazon S3 canned ACL should be set to control ownership of stored query results. Currently the only supported canned ACL is BUCKET_OWNER_FULL_CONTROL. This is a client-side setting. If workgroup settings override client-side settings, then the query uses the ACL configuration that is specified for the workgroup, and also uses the location for storing query results specified in the workgroup. For more information, see WorkGroupConfiguration$EnforceWorkGroupConfiguration and Workgroup Settings Override Client-Side Settings.
    */
  var AclConfiguration: js.UndefOr[typings.awsSdk.clientsAthenaMod.AclConfiguration] = js.undefined
  
  /**
    * If query results are encrypted in Amazon S3, indicates the encryption option used (for example, SSE_KMS or CSE_KMS) and key information. This is a client-side setting. If workgroup settings override client-side settings, then the query uses the encryption configuration that is specified for the workgroup, and also uses the location for storing query results specified in the workgroup. See WorkGroupConfiguration$EnforceWorkGroupConfiguration and Workgroup Settings Override Client-Side Settings.
    */
  var EncryptionConfiguration: js.UndefOr[typings.awsSdk.clientsAthenaMod.EncryptionConfiguration] = js.undefined
  
  /**
    * The Amazon Web Services account ID that you expect to be the owner of the Amazon S3 bucket specified by ResultConfiguration$OutputLocation. If set, Athena uses the value for ExpectedBucketOwner when it makes Amazon S3 calls to your specified output location. If the ExpectedBucketOwner Amazon Web Services account ID does not match the actual owner of the Amazon S3 bucket, the call fails with a permissions error. This is a client-side setting. If workgroup settings override client-side settings, then the query uses the ExpectedBucketOwner setting that is specified for the workgroup, and also uses the location for storing query results specified in the workgroup. See WorkGroupConfiguration$EnforceWorkGroupConfiguration and Workgroup Settings Override Client-Side Settings.
    */
  var ExpectedBucketOwner: js.UndefOr[AwsAccountId] = js.undefined
  
  /**
    * The location in Amazon S3 where your query results are stored, such as s3://path/to/query/bucket/. To run the query, you must specify the query results location using one of the ways: either for individual queries using either this setting (client-side), or in the workgroup, using WorkGroupConfiguration. If none of them is set, Athena issues an error that no output location is provided. For more information, see Query Results. If workgroup settings override client-side settings, then the query uses the settings specified for the workgroup. See WorkGroupConfiguration$EnforceWorkGroupConfiguration.
    */
  var OutputLocation: js.UndefOr[ResultOutputLocation] = js.undefined
}
object ResultConfiguration {
  
  inline def apply(): ResultConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResultConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResultConfiguration] (val x: Self) extends AnyVal {
    
    inline def setAclConfiguration(value: AclConfiguration): Self = StObject.set(x, "AclConfiguration", value.asInstanceOf[js.Any])
    
    inline def setAclConfigurationUndefined: Self = StObject.set(x, "AclConfiguration", js.undefined)
    
    inline def setEncryptionConfiguration(value: EncryptionConfiguration): Self = StObject.set(x, "EncryptionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setEncryptionConfigurationUndefined: Self = StObject.set(x, "EncryptionConfiguration", js.undefined)
    
    inline def setExpectedBucketOwner(value: AwsAccountId): Self = StObject.set(x, "ExpectedBucketOwner", value.asInstanceOf[js.Any])
    
    inline def setExpectedBucketOwnerUndefined: Self = StObject.set(x, "ExpectedBucketOwner", js.undefined)
    
    inline def setOutputLocation(value: ResultOutputLocation): Self = StObject.set(x, "OutputLocation", value.asInstanceOf[js.Any])
    
    inline def setOutputLocationUndefined: Self = StObject.set(x, "OutputLocation", js.undefined)
  }
}
