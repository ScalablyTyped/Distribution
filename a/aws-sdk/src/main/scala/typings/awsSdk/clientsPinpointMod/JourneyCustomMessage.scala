package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JourneyCustomMessage extends StObject {
  
  /**
    * The message content that's passed to an AWS Lambda function or to a web hook.
    */
  var Data: js.UndefOr[string] = js.undefined
}
object JourneyCustomMessage {
  
  inline def apply(): JourneyCustomMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JourneyCustomMessage]
  }
  
  extension [Self <: JourneyCustomMessage](x: Self) {
    
    inline def setData(value: string): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "Data", js.undefined)
  }
}
