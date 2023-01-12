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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Production] (val x: Self) extends AnyVal {
      
      inline def setProduction(value: String): Self = StObject.set(x, "production", value.asInstanceOf[js.Any])
      
      inline def setStaging(value: String): Self = StObject.set(x, "staging", value.asInstanceOf[js.Any])
    }
  }
  
  trait ProductionString extends StObject {
    
    var production: String
  }
  object ProductionString {
    
    inline def apply(production: String): ProductionString = {
      val __obj = js.Dynamic.literal(production = production.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProductionString]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ProductionString] (val x: Self) extends AnyVal {
      
      inline def setProduction(value: String): Self = StObject.set(x, "production", value.asInstanceOf[js.Any])
    }
  }
}
