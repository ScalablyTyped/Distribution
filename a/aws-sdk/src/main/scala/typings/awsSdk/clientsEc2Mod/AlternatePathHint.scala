package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlternatePathHint extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the component.
    */
  var ComponentArn: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the component.
    */
  var ComponentId: js.UndefOr[String] = js.undefined
}
object AlternatePathHint {
  
  inline def apply(): AlternatePathHint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlternatePathHint]
  }
  
  extension [Self <: AlternatePathHint](x: Self) {
    
    inline def setComponentArn(value: String): Self = StObject.set(x, "ComponentArn", value.asInstanceOf[js.Any])
    
    inline def setComponentArnUndefined: Self = StObject.set(x, "ComponentArn", js.undefined)
    
    inline def setComponentId(value: String): Self = StObject.set(x, "ComponentId", value.asInstanceOf[js.Any])
    
    inline def setComponentIdUndefined: Self = StObject.set(x, "ComponentId", js.undefined)
  }
}
