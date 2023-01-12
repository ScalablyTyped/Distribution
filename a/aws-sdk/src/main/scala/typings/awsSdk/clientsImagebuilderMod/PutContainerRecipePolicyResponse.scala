package typings.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutContainerRecipePolicyResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the container recipe that this policy was applied to.
    */
  var containerRecipeArn: js.UndefOr[ContainerRecipeArn] = js.undefined
  
  /**
    * The request ID that uniquely identifies this request.
    */
  var requestId: js.UndefOr[NonEmptyString] = js.undefined
}
object PutContainerRecipePolicyResponse {
  
  inline def apply(): PutContainerRecipePolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutContainerRecipePolicyResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutContainerRecipePolicyResponse] (val x: Self) extends AnyVal {
    
    inline def setContainerRecipeArn(value: ContainerRecipeArn): Self = StObject.set(x, "containerRecipeArn", value.asInstanceOf[js.Any])
    
    inline def setContainerRecipeArnUndefined: Self = StObject.set(x, "containerRecipeArn", js.undefined)
    
    inline def setRequestId(value: NonEmptyString): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}
