package typings.awsSdk.clientsSsmsapMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeregisterApplicationInput extends StObject {
  
  /**
    * 
    */
  var ApplicationId: typings.awsSdk.clientsSsmsapMod.ApplicationId
}
object DeregisterApplicationInput {
  
  inline def apply(ApplicationId: ApplicationId): DeregisterApplicationInput = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeregisterApplicationInput]
  }
  
  extension [Self <: DeregisterApplicationInput](x: Self) {
    
    inline def setApplicationId(value: ApplicationId): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
  }
}
