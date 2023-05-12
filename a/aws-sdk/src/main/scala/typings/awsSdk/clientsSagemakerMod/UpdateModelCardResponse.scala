package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateModelCardResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the updated model card.
    */
  var ModelCardArn: typings.awsSdk.clientsSagemakerMod.ModelCardArn
}
object UpdateModelCardResponse {
  
  inline def apply(ModelCardArn: ModelCardArn): UpdateModelCardResponse = {
    val __obj = js.Dynamic.literal(ModelCardArn = ModelCardArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateModelCardResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateModelCardResponse] (val x: Self) extends AnyVal {
    
    inline def setModelCardArn(value: ModelCardArn): Self = StObject.set(x, "ModelCardArn", value.asInstanceOf[js.Any])
  }
}
