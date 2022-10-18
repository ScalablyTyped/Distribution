package typings.awsSdk.clientsLexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteIntentVersionRequest extends StObject {
  
  /**
    * The name of the intent.
    */
  var name: IntentName
  
  /**
    * The version of the intent to delete. You cannot delete the $LATEST version of the intent. To delete the $LATEST version, use the DeleteIntent operation.
    */
  var version: NumericalVersion
}
object DeleteIntentVersionRequest {
  
  inline def apply(name: IntentName, version: NumericalVersion): DeleteIntentVersionRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteIntentVersionRequest]
  }
  
  extension [Self <: DeleteIntentVersionRequest](x: Self) {
    
    inline def setName(value: IntentName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: NumericalVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
