package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopTrainingEntityRecognizerRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) that identifies the entity recognizer currently being trained.
    */
  var EntityRecognizerArn: typings.awsSdk.clientsComprehendMod.EntityRecognizerArn
}
object StopTrainingEntityRecognizerRequest {
  
  inline def apply(EntityRecognizerArn: EntityRecognizerArn): StopTrainingEntityRecognizerRequest = {
    val __obj = js.Dynamic.literal(EntityRecognizerArn = EntityRecognizerArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopTrainingEntityRecognizerRequest]
  }
  
  extension [Self <: StopTrainingEntityRecognizerRequest](x: Self) {
    
    inline def setEntityRecognizerArn(value: EntityRecognizerArn): Self = StObject.set(x, "EntityRecognizerArn", value.asInstanceOf[js.Any])
  }
}
