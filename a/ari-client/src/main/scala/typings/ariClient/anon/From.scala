package typings.ariClient.anon

import typings.ariClient.mod.Containers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait From extends StObject {
  
  var body: js.UndefOr[String] = js.undefined
  
  var from: String
  
  var variables: js.UndefOr[Containers] = js.undefined
}
object From {
  
  inline def apply(from: String): From = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any])
    __obj.asInstanceOf[From]
  }
  
  extension [Self <: From](x: Self) {
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setVariables(value: Containers): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    
    inline def setVariablesUndefined: Self = StObject.set(x, "variables", js.undefined)
  }
}
