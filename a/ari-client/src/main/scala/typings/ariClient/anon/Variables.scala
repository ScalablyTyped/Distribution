package typings.ariClient.anon

import typings.ariClient.mod.Containers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Variables extends StObject {
  
  var body: js.UndefOr[String] = js.undefined
  
  var from: String
  
  var resource: String
  
  var tech: String
  
  var variables: js.UndefOr[Containers] = js.undefined
}
object Variables {
  
  inline def apply(from: String, resource: String, tech: String): Variables = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], tech = tech.asInstanceOf[js.Any])
    __obj.asInstanceOf[Variables]
  }
  
  extension [Self <: Variables](x: Self) {
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setTech(value: String): Self = StObject.set(x, "tech", value.asInstanceOf[js.Any])
    
    inline def setVariables(value: Containers): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    
    inline def setVariablesUndefined: Self = StObject.set(x, "variables", js.undefined)
  }
}
