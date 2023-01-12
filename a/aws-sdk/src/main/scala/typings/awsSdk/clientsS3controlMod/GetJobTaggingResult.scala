package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetJobTaggingResult extends StObject {
  
  /**
    * The set of tags associated with the S3 Batch Operations job.
    */
  var Tags: js.UndefOr[S3TagSet] = js.undefined
}
object GetJobTaggingResult {
  
  inline def apply(): GetJobTaggingResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetJobTaggingResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetJobTaggingResult] (val x: Self) extends AnyVal {
    
    inline def setTags(value: S3TagSet): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: S3Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
