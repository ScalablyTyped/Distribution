package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateClassificationScopeRequest extends StObject {
  
  /**
    * The unique identifier for the Amazon Macie resource that the request applies to.
    */
  var id: string
  
  /**
    * The S3 buckets to add or remove from the exclusion list defined by the classification scope.
    */
  var s3: js.UndefOr[S3ClassificationScopeUpdate] = js.undefined
}
object UpdateClassificationScopeRequest {
  
  inline def apply(id: string): UpdateClassificationScopeRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateClassificationScopeRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateClassificationScopeRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: string): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setS3(value: S3ClassificationScopeUpdate): Self = StObject.set(x, "s3", value.asInstanceOf[js.Any])
    
    inline def setS3Undefined: Self = StObject.set(x, "s3", js.undefined)
  }
}
