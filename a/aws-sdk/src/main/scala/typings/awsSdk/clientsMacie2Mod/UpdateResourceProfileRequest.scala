package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateResourceProfileRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the S3 bucket that the request applies to.
    */
  var resourceArn: string
  
  /**
    * The new sensitivity score for the bucket. Valid values are: 100, assign the maximum score and apply the Sensitive label to the bucket; and, null (empty), assign a score that Amazon Macie calculates automatically after you submit the request.
    */
  var sensitivityScoreOverride: js.UndefOr[integer] = js.undefined
}
object UpdateResourceProfileRequest {
  
  inline def apply(resourceArn: string): UpdateResourceProfileRequest = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateResourceProfileRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateResourceProfileRequest] (val x: Self) extends AnyVal {
    
    inline def setResourceArn(value: string): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
    
    inline def setSensitivityScoreOverride(value: integer): Self = StObject.set(x, "sensitivityScoreOverride", value.asInstanceOf[js.Any])
    
    inline def setSensitivityScoreOverrideUndefined: Self = StObject.set(x, "sensitivityScoreOverride", js.undefined)
  }
}
