package typings.awsSdk.clientsIottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSceneResponse extends StObject {
  
  /**
    * The ARN of the scene.
    */
  var arn: TwinMakerArn
  
  /**
    * The date and time when the scene was created.
    */
  var creationDateTime: js.Date
}
object CreateSceneResponse {
  
  inline def apply(arn: TwinMakerArn, creationDateTime: js.Date): CreateSceneResponse = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], creationDateTime = creationDateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSceneResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateSceneResponse] (val x: Self) extends AnyVal {
    
    inline def setArn(value: TwinMakerArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setCreationDateTime(value: js.Date): Self = StObject.set(x, "creationDateTime", value.asInstanceOf[js.Any])
  }
}
