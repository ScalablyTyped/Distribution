package typings.awsSdk.clientsLexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetIntentRequest extends StObject {
  
  /**
    * The name of the intent. The name is case sensitive. 
    */
  var name: IntentName
  
  /**
    * The version of the intent.
    */
  var version: Version
}
object GetIntentRequest {
  
  inline def apply(name: IntentName, version: Version): GetIntentRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIntentRequest]
  }
  
  extension [Self <: GetIntentRequest](x: Self) {
    
    inline def setName(value: IntentName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Version): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
