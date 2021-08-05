package typings.arangodb

import typings.arangodb.Foxx.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NodeJS {
  
  trait Module extends StObject {
    
    var context: Context
  }
  object Module {
    
    inline def apply(context: Context): Module = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
      __obj.asInstanceOf[Module]
    }
    
    extension [Self <: Module](x: Self) {
      
      inline def setContext(value: Context): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    }
  }
}
