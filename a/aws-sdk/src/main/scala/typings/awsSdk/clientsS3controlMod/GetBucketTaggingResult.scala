package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBucketTaggingResult extends StObject {
  
  /**
    * The tags set of the Outposts bucket.
    */
  var TagSet: S3TagSet
}
object GetBucketTaggingResult {
  
  inline def apply(TagSet: S3TagSet): GetBucketTaggingResult = {
    val __obj = js.Dynamic.literal(TagSet = TagSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketTaggingResult]
  }
  
  extension [Self <: GetBucketTaggingResult](x: Self) {
    
    inline def setTagSet(value: S3TagSet): Self = StObject.set(x, "TagSet", value.asInstanceOf[js.Any])
    
    inline def setTagSetVarargs(value: S3Tag*): Self = StObject.set(x, "TagSet", js.Array(value*))
  }
}
