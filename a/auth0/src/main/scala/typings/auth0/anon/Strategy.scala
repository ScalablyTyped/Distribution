package typings.auth0.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Strategy extends StObject {
  
  var name: String
  
  var strategy: String
}
object Strategy {
  
  inline def apply(name: String, strategy: String): Strategy = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], strategy = strategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Strategy]
  }
  
  extension [Self <: Strategy](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStrategy(value: String): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
  }
}
