package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBucketStatisticsResponse extends StObject {
  
  /**
    * The total number of buckets.
    */
  var bucketCount: js.UndefOr[long] = js.undefined
  
  /**
    * The total number of buckets that are publicly accessible due to a combination of permissions settings for each bucket.
    */
  var bucketCountByEffectivePermission: js.UndefOr[BucketCountByEffectivePermission] = js.undefined
  
  /**
    * The total number of buckets whose settings do or don't specify default server-side encryption behavior for objects that are added to the buckets.
    */
  var bucketCountByEncryptionType: js.UndefOr[BucketCountByEncryptionType] = js.undefined
  
  /**
    * The total number of buckets whose bucket policies do or don't require server-side encryption of objects when objects are added to the buckets.
    */
  var bucketCountByObjectEncryptionRequirement: js.UndefOr[BucketCountPolicyAllowsUnencryptedObjectUploads] = js.undefined
  
  /**
    * The total number of buckets that are or aren't shared with other Amazon Web Services accounts, Amazon CloudFront origin access identities (OAIs), or CloudFront origin access controls (OACs).
    */
  var bucketCountBySharedAccessType: js.UndefOr[BucketCountBySharedAccessType] = js.undefined
  
  /**
    * The aggregated sensitive data discovery statistics for the buckets. If automated sensitive data discovery is currently disabled for your account, the value for each statistic is 0.
    */
  var bucketStatisticsBySensitivity: js.UndefOr[BucketStatisticsBySensitivity] = js.undefined
  
  /**
    * The total number of objects that Amazon Macie can analyze in the buckets. These objects use a supported storage class and have a file name extension for a supported file or storage format.
    */
  var classifiableObjectCount: js.UndefOr[long] = js.undefined
  
  /**
    * The total storage size, in bytes, of all the objects that Amazon Macie can analyze in the buckets. These objects use a supported storage class and have a file name extension for a supported file or storage format. If versioning is enabled for any of the buckets, this value is based on the size of the latest version of each applicable object in the buckets. This value doesn't reflect the storage size of all versions of all applicable objects in the buckets.
    */
  var classifiableSizeInBytes: js.UndefOr[long] = js.undefined
  
  /**
    * The date and time, in UTC and extended ISO 8601 format, when Amazon Macie most recently retrieved bucket or object metadata from Amazon S3 for the buckets.
    */
  var lastUpdated: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The total number of objects in the buckets.
    */
  var objectCount: js.UndefOr[long] = js.undefined
  
  /**
    * The total storage size, in bytes, of the buckets. If versioning is enabled for any of the buckets, this value is based on the size of the latest version of each object in the buckets. This value doesn't reflect the storage size of all versions of the objects in the buckets.
    */
  var sizeInBytes: js.UndefOr[long] = js.undefined
  
  /**
    * The total storage size, in bytes, of the objects that are compressed (.gz, .gzip, .zip) files in the buckets. If versioning is enabled for any of the buckets, this value is based on the size of the latest version of each applicable object in the buckets. This value doesn't reflect the storage size of all versions of the applicable objects in the buckets.
    */
  var sizeInBytesCompressed: js.UndefOr[long] = js.undefined
  
  /**
    * The total number of objects that Amazon Macie can't analyze in the buckets. These objects don't use a supported storage class or don't have a file name extension for a supported file or storage format.
    */
  var unclassifiableObjectCount: js.UndefOr[ObjectLevelStatistics] = js.undefined
  
  /**
    * The total storage size, in bytes, of the objects that Amazon Macie can't analyze in the buckets. These objects don't use a supported storage class or don't have a file name extension for a supported file or storage format.
    */
  var unclassifiableObjectSizeInBytes: js.UndefOr[ObjectLevelStatistics] = js.undefined
}
object GetBucketStatisticsResponse {
  
  inline def apply(): GetBucketStatisticsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBucketStatisticsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetBucketStatisticsResponse] (val x: Self) extends AnyVal {
    
    inline def setBucketCount(value: long): Self = StObject.set(x, "bucketCount", value.asInstanceOf[js.Any])
    
    inline def setBucketCountByEffectivePermission(value: BucketCountByEffectivePermission): Self = StObject.set(x, "bucketCountByEffectivePermission", value.asInstanceOf[js.Any])
    
    inline def setBucketCountByEffectivePermissionUndefined: Self = StObject.set(x, "bucketCountByEffectivePermission", js.undefined)
    
    inline def setBucketCountByEncryptionType(value: BucketCountByEncryptionType): Self = StObject.set(x, "bucketCountByEncryptionType", value.asInstanceOf[js.Any])
    
    inline def setBucketCountByEncryptionTypeUndefined: Self = StObject.set(x, "bucketCountByEncryptionType", js.undefined)
    
    inline def setBucketCountByObjectEncryptionRequirement(value: BucketCountPolicyAllowsUnencryptedObjectUploads): Self = StObject.set(x, "bucketCountByObjectEncryptionRequirement", value.asInstanceOf[js.Any])
    
    inline def setBucketCountByObjectEncryptionRequirementUndefined: Self = StObject.set(x, "bucketCountByObjectEncryptionRequirement", js.undefined)
    
    inline def setBucketCountBySharedAccessType(value: BucketCountBySharedAccessType): Self = StObject.set(x, "bucketCountBySharedAccessType", value.asInstanceOf[js.Any])
    
    inline def setBucketCountBySharedAccessTypeUndefined: Self = StObject.set(x, "bucketCountBySharedAccessType", js.undefined)
    
    inline def setBucketCountUndefined: Self = StObject.set(x, "bucketCount", js.undefined)
    
    inline def setBucketStatisticsBySensitivity(value: BucketStatisticsBySensitivity): Self = StObject.set(x, "bucketStatisticsBySensitivity", value.asInstanceOf[js.Any])
    
    inline def setBucketStatisticsBySensitivityUndefined: Self = StObject.set(x, "bucketStatisticsBySensitivity", js.undefined)
    
    inline def setClassifiableObjectCount(value: long): Self = StObject.set(x, "classifiableObjectCount", value.asInstanceOf[js.Any])
    
    inline def setClassifiableObjectCountUndefined: Self = StObject.set(x, "classifiableObjectCount", js.undefined)
    
    inline def setClassifiableSizeInBytes(value: long): Self = StObject.set(x, "classifiableSizeInBytes", value.asInstanceOf[js.Any])
    
    inline def setClassifiableSizeInBytesUndefined: Self = StObject.set(x, "classifiableSizeInBytes", js.undefined)
    
    inline def setLastUpdated(value: js.Date): Self = StObject.set(x, "lastUpdated", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedUndefined: Self = StObject.set(x, "lastUpdated", js.undefined)
    
    inline def setObjectCount(value: long): Self = StObject.set(x, "objectCount", value.asInstanceOf[js.Any])
    
    inline def setObjectCountUndefined: Self = StObject.set(x, "objectCount", js.undefined)
    
    inline def setSizeInBytes(value: long): Self = StObject.set(x, "sizeInBytes", value.asInstanceOf[js.Any])
    
    inline def setSizeInBytesCompressed(value: long): Self = StObject.set(x, "sizeInBytesCompressed", value.asInstanceOf[js.Any])
    
    inline def setSizeInBytesCompressedUndefined: Self = StObject.set(x, "sizeInBytesCompressed", js.undefined)
    
    inline def setSizeInBytesUndefined: Self = StObject.set(x, "sizeInBytes", js.undefined)
    
    inline def setUnclassifiableObjectCount(value: ObjectLevelStatistics): Self = StObject.set(x, "unclassifiableObjectCount", value.asInstanceOf[js.Any])
    
    inline def setUnclassifiableObjectCountUndefined: Self = StObject.set(x, "unclassifiableObjectCount", js.undefined)
    
    inline def setUnclassifiableObjectSizeInBytes(value: ObjectLevelStatistics): Self = StObject.set(x, "unclassifiableObjectSizeInBytes", value.asInstanceOf[js.Any])
    
    inline def setUnclassifiableObjectSizeInBytesUndefined: Self = StObject.set(x, "unclassifiableObjectSizeInBytes", js.undefined)
  }
}
