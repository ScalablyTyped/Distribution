package typings.awsSdk.clientsAcmpcaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessDescription extends StObject {
  
  /**
    * The location of AccessDescription information.
    */
  var AccessLocation: GeneralName
  
  /**
    * The type and format of AccessDescription information.
    */
  var AccessMethod: typings.awsSdk.clientsAcmpcaMod.AccessMethod
}
object AccessDescription {
  
  inline def apply(AccessLocation: GeneralName, AccessMethod: AccessMethod): AccessDescription = {
    val __obj = js.Dynamic.literal(AccessLocation = AccessLocation.asInstanceOf[js.Any], AccessMethod = AccessMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessDescription]
  }
  
  extension [Self <: AccessDescription](x: Self) {
    
    inline def setAccessLocation(value: GeneralName): Self = StObject.set(x, "AccessLocation", value.asInstanceOf[js.Any])
    
    inline def setAccessMethod(value: AccessMethod): Self = StObject.set(x, "AccessMethod", value.asInstanceOf[js.Any])
  }
}
