package typings.awsSdk.clientsLookoutvisionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeModelPackagingJobResponse extends StObject {
  
  /**
    * The description of the model packaging job. 
    */
  var ModelPackagingDescription: js.UndefOr[typings.awsSdk.clientsLookoutvisionMod.ModelPackagingDescription] = js.undefined
}
object DescribeModelPackagingJobResponse {
  
  inline def apply(): DescribeModelPackagingJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeModelPackagingJobResponse]
  }
  
  extension [Self <: DescribeModelPackagingJobResponse](x: Self) {
    
    inline def setModelPackagingDescription(value: ModelPackagingDescription): Self = StObject.set(x, "ModelPackagingDescription", value.asInstanceOf[js.Any])
    
    inline def setModelPackagingDescriptionUndefined: Self = StObject.set(x, "ModelPackagingDescription", js.undefined)
  }
}
