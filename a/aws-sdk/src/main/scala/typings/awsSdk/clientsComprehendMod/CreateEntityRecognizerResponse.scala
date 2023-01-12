package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateEntityRecognizerResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) that identifies the entity recognizer.
    */
  var EntityRecognizerArn: js.UndefOr[typings.awsSdk.clientsComprehendMod.EntityRecognizerArn] = js.undefined
}
object CreateEntityRecognizerResponse {
  
  inline def apply(): CreateEntityRecognizerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateEntityRecognizerResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateEntityRecognizerResponse] (val x: Self) extends AnyVal {
    
    inline def setEntityRecognizerArn(value: EntityRecognizerArn): Self = StObject.set(x, "EntityRecognizerArn", value.asInstanceOf[js.Any])
    
    inline def setEntityRecognizerArnUndefined: Self = StObject.set(x, "EntityRecognizerArn", js.undefined)
  }
}
