package typings.acmeClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Production extends StObject {
    
    var production: String
    
    var staging: String
  }
  object Production {
    
    inline def apply(production: String, staging: String): Production = {
      val __obj = js.Dynamic.literal(production = production.asInstanceOf[js.Any], staging = staging.asInstanceOf[js.Any])
      __obj.asInstanceOf[Production]
    }
    
    extension [Self <: Production](x: Self) {
      
      inline def setProduction(value: String): Self = StObject.set(x, "production", value.asInstanceOf[js.Any])
      
      inline def setStaging(value: String): Self = StObject.set(x, "staging", value.asInstanceOf[js.Any])
    }
  }
}
