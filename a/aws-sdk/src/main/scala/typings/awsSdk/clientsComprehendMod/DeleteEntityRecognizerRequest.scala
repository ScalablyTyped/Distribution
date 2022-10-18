package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteEntityRecognizerRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) that identifies the entity recognizer.
    */
  var EntityRecognizerArn: typings.awsSdk.clientsComprehendMod.EntityRecognizerArn
}
object DeleteEntityRecognizerRequest {
  
  inline def apply(EntityRecognizerArn: EntityRecognizerArn): DeleteEntityRecognizerRequest = {
    val __obj = js.Dynamic.literal(EntityRecognizerArn = EntityRecognizerArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEntityRecognizerRequest]
  }
  
  extension [Self <: DeleteEntityRecognizerRequest](x: Self) {
    
    inline def setEntityRecognizerArn(value: EntityRecognizerArn): Self = StObject.set(x, "EntityRecognizerArn", value.asInstanceOf[js.Any])
  }
}
