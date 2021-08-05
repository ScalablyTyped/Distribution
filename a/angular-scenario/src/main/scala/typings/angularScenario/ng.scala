package typings.angularScenario

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ng {
  
  trait IAngularStatic extends StObject {
    
    var scenario: js.Any
  }
  object IAngularStatic {
    
    inline def apply(scenario: js.Any): IAngularStatic = {
      val __obj = js.Dynamic.literal(scenario = scenario.asInstanceOf[js.Any])
      __obj.asInstanceOf[IAngularStatic]
    }
    
    extension [Self <: IAngularStatic](x: Self) {
      
      inline def setScenario(value: js.Any): Self = StObject.set(x, "scenario", value.asInstanceOf[js.Any])
    }
  }
}
