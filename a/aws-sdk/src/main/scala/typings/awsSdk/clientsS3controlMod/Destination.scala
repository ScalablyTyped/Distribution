package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Destination extends StObject {
  
  /**
    * Specify this property only in a cross-account scenario (where the source and destination bucket owners are not the same), and you want to change replica ownership to the Amazon Web Services account that owns the destination bucket. If this property is not specified in the replication configuration, the replicas are owned by same Amazon Web Services account that owns the source object.  This is not supported by Amazon S3 on Outposts buckets. 
    */
  var AccessControlTranslation: js.UndefOr[typings.awsSdk.clientsS3controlMod.AccessControlTranslation] = js.undefined
  
  /**
    * The destination bucket owner's account ID. 
    */
  var Account: js.UndefOr[AccountId] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the access point for the destination bucket where you want S3 on Outposts to store the replication results.
    */
  var Bucket: BucketIdentifierString
  
  /**
    * A container that provides information about encryption. If SourceSelectionCriteria is specified, you must specify this element.  This is not supported by Amazon S3 on Outposts buckets. 
    */
  var EncryptionConfiguration: js.UndefOr[typings.awsSdk.clientsS3controlMod.EncryptionConfiguration] = js.undefined
  
  /**
    *  A container that specifies replication metrics-related settings. 
    */
  var Metrics: js.UndefOr[typings.awsSdk.clientsS3controlMod.Metrics] = js.undefined
  
  /**
    * A container that specifies S3 Replication Time Control (S3 RTC) settings, including whether S3 RTC is enabled and the time when all objects and operations on objects must be replicated. Must be specified together with a Metrics block.   This is not supported by Amazon S3 on Outposts buckets. 
    */
  var ReplicationTime: js.UndefOr[typings.awsSdk.clientsS3controlMod.ReplicationTime] = js.undefined
  
  /**
    *  The storage class to use when replicating objects. All objects stored on S3 on Outposts are stored in the OUTPOSTS storage class. S3 on Outposts uses the OUTPOSTS storage class to create the object replicas.   Values other than OUTPOSTS are not supported by Amazon S3 on Outposts.  
    */
  var StorageClass: js.UndefOr[ReplicationStorageClass] = js.undefined
}
object Destination {
  
  inline def apply(Bucket: BucketIdentifierString): Destination = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[Destination]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Destination] (val x: Self) extends AnyVal {
    
    inline def setAccessControlTranslation(value: AccessControlTranslation): Self = StObject.set(x, "AccessControlTranslation", value.asInstanceOf[js.Any])
    
    inline def setAccessControlTranslationUndefined: Self = StObject.set(x, "AccessControlTranslation", js.undefined)
    
    inline def setAccount(value: AccountId): Self = StObject.set(x, "Account", value.asInstanceOf[js.Any])
    
    inline def setAccountUndefined: Self = StObject.set(x, "Account", js.undefined)
    
    inline def setBucket(value: BucketIdentifierString): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    inline def setEncryptionConfiguration(value: EncryptionConfiguration): Self = StObject.set(x, "EncryptionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setEncryptionConfigurationUndefined: Self = StObject.set(x, "EncryptionConfiguration", js.undefined)
    
    inline def setMetrics(value: Metrics): Self = StObject.set(x, "Metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsUndefined: Self = StObject.set(x, "Metrics", js.undefined)
    
    inline def setReplicationTime(value: ReplicationTime): Self = StObject.set(x, "ReplicationTime", value.asInstanceOf[js.Any])
    
    inline def setReplicationTimeUndefined: Self = StObject.set(x, "ReplicationTime", js.undefined)
    
    inline def setStorageClass(value: ReplicationStorageClass): Self = StObject.set(x, "StorageClass", value.asInstanceOf[js.Any])
    
    inline def setStorageClassUndefined: Self = StObject.set(x, "StorageClass", js.undefined)
  }
}
