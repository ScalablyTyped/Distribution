package typings.awsSdk.clientsLexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Intent extends StObject {
  
  /**
    * The name of the intent.
    */
  var intentName: IntentName
  
  /**
    * The version of the intent.
    */
  var intentVersion: Version
}
object Intent {
  
  inline def apply(intentName: IntentName, intentVersion: Version): Intent = {
    val __obj = js.Dynamic.literal(intentName = intentName.asInstanceOf[js.Any], intentVersion = intentVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[Intent]
  }
  
  extension [Self <: Intent](x: Self) {
    
    inline def setIntentName(value: IntentName): Self = StObject.set(x, "intentName", value.asInstanceOf[js.Any])
    
    inline def setIntentVersion(value: Version): Self = StObject.set(x, "intentVersion", value.asInstanceOf[js.Any])
  }
}
