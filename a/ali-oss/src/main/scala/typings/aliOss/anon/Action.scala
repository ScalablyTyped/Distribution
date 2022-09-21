package typings.aliOss.anon

import typings.aliOss.aliOssStrings.Allow
import typings.aliOss.aliOssStrings.Deny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Action extends StObject {
  
  var Action: js.Array[String]
  
  var Effect: Allow | Deny
  
  var Principal: js.Array[String]
  
  var Resource: js.Array[String]
}
object Action {
  
  inline def apply(
    Action: js.Array[String],
    Effect: Allow | Deny,
    Principal: js.Array[String],
    Resource: js.Array[String]
  ): Action = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], Effect = Effect.asInstanceOf[js.Any], Principal = Principal.asInstanceOf[js.Any], Resource = Resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  
  extension [Self <: Action](x: Self) {
    
    inline def setAction(value: js.Array[String]): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    inline def setActionVarargs(value: String*): Self = StObject.set(x, "Action", js.Array(value*))
    
    inline def setEffect(value: Allow | Deny): Self = StObject.set(x, "Effect", value.asInstanceOf[js.Any])
    
    inline def setPrincipal(value: js.Array[String]): Self = StObject.set(x, "Principal", value.asInstanceOf[js.Any])
    
    inline def setPrincipalVarargs(value: String*): Self = StObject.set(x, "Principal", js.Array(value*))
    
    inline def setResource(value: js.Array[String]): Self = StObject.set(x, "Resource", value.asInstanceOf[js.Any])
    
    inline def setResourceVarargs(value: String*): Self = StObject.set(x, "Resource", js.Array(value*))
  }
}
