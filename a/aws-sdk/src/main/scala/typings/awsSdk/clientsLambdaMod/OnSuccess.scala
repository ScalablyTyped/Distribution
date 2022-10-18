package typings.awsSdk.clientsLambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnSuccess extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the destination resource.
    */
  var Destination: js.UndefOr[DestinationArn] = js.undefined
}
object OnSuccess {
  
  inline def apply(): OnSuccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnSuccess]
  }
  
  extension [Self <: OnSuccess](x: Self) {
    
    inline def setDestination(value: DestinationArn): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationUndefined: Self = StObject.set(x, "Destination", js.undefined)
  }
}
