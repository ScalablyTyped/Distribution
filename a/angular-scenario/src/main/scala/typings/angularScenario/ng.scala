package typings.angularScenario

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ng {
  
  trait IAngularStatic extends StObject {
    
    var scenario: js.Any
  }
  object IAngularStatic {
    
    @scala.inline
    def apply(scenario: js.Any): IAngularStatic = {
      val __obj = js.Dynamic.literal(scenario = scenario.asInstanceOf[js.Any])
      __obj.asInstanceOf[IAngularStatic]
    }
    
    @scala.inline
    implicit class IAngularStaticMutableBuilder[Self <: IAngularStatic] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setScenario(value: js.Any): Self = StObject.set(x, "scenario", value.asInstanceOf[js.Any])
    }
  }
}
