package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3JobManifestGenerator extends StObject {
  
  /**
    * Determines whether or not to write the job's generated manifest to a bucket.
    */
  var EnableManifestOutput: Boolean
  
  /**
    * The Amazon Web Services account ID that owns the bucket the generated manifest is written to. If provided the generated manifest bucket's owner Amazon Web Services account ID must match this value, else the job fails.
    */
  var ExpectedBucketOwner: js.UndefOr[AccountId] = js.undefined
  
  /**
    * Specifies rules the S3JobManifestGenerator should use to use to decide whether an object in the source bucket should or should not be included in the generated job manifest.
    */
  var Filter: js.UndefOr[JobManifestGeneratorFilter] = js.undefined
  
  /**
    * Specifies the location the generated manifest will be written to.
    */
  var ManifestOutputLocation: js.UndefOr[S3ManifestOutputLocation] = js.undefined
  
  /**
    * The source bucket used by the ManifestGenerator.
    */
  var SourceBucket: S3BucketArnString
}
object S3JobManifestGenerator {
  
  inline def apply(EnableManifestOutput: Boolean, SourceBucket: S3BucketArnString): S3JobManifestGenerator = {
    val __obj = js.Dynamic.literal(EnableManifestOutput = EnableManifestOutput.asInstanceOf[js.Any], SourceBucket = SourceBucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3JobManifestGenerator]
  }
  
  extension [Self <: S3JobManifestGenerator](x: Self) {
    
    inline def setEnableManifestOutput(value: Boolean): Self = StObject.set(x, "EnableManifestOutput", value.asInstanceOf[js.Any])
    
    inline def setExpectedBucketOwner(value: AccountId): Self = StObject.set(x, "ExpectedBucketOwner", value.asInstanceOf[js.Any])
    
    inline def setExpectedBucketOwnerUndefined: Self = StObject.set(x, "ExpectedBucketOwner", js.undefined)
    
    inline def setFilter(value: JobManifestGeneratorFilter): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "Filter", js.undefined)
    
    inline def setManifestOutputLocation(value: S3ManifestOutputLocation): Self = StObject.set(x, "ManifestOutputLocation", value.asInstanceOf[js.Any])
    
    inline def setManifestOutputLocationUndefined: Self = StObject.set(x, "ManifestOutputLocation", js.undefined)
    
    inline def setSourceBucket(value: S3BucketArnString): Self = StObject.set(x, "SourceBucket", value.asInstanceOf[js.Any])
  }
}
