package typings.awsSdk.clientsPersonalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteEventTrackerRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the event tracker to delete.
    */
  var eventTrackerArn: Arn
}
object DeleteEventTrackerRequest {
  
  inline def apply(eventTrackerArn: Arn): DeleteEventTrackerRequest = {
    val __obj = js.Dynamic.literal(eventTrackerArn = eventTrackerArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEventTrackerRequest]
  }
  
  extension [Self <: DeleteEventTrackerRequest](x: Self) {
    
    inline def setEventTrackerArn(value: Arn): Self = StObject.set(x, "eventTrackerArn", value.asInstanceOf[js.Any])
  }
}
