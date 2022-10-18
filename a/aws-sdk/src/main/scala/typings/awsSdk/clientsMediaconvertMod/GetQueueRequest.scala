package typings.awsSdk.clientsMediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetQueueRequest extends StObject {
  
  /**
    * The name of the queue that you want information about.
    */
  var Name: string
}
object GetQueueRequest {
  
  inline def apply(Name: string): GetQueueRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetQueueRequest]
  }
  
  extension [Self <: GetQueueRequest](x: Self) {
    
    inline def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
