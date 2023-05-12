package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateModelCardResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the successfully created model card.
    */
  var ModelCardArn: typings.awsSdk.clientsSagemakerMod.ModelCardArn
}
object CreateModelCardResponse {
  
  inline def apply(ModelCardArn: ModelCardArn): CreateModelCardResponse = {
    val __obj = js.Dynamic.literal(ModelCardArn = ModelCardArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateModelCardResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateModelCardResponse] (val x: Self) extends AnyVal {
    
    inline def setModelCardArn(value: ModelCardArn): Self = StObject.set(x, "ModelCardArn", value.asInstanceOf[js.Any])
  }
}
