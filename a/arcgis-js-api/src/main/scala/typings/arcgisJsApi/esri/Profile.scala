package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Profile extends StObject {
  
  /**
    * The Arcade type definitions for profile variables used as input to the compiled expression.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-arcade.html#Profile)
    */
  var variables: js.Array[ProfileVariable]
}
object Profile {
  
  inline def apply(variables: js.Array[ProfileVariable]): Profile = {
    val __obj = js.Dynamic.literal(variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[Profile]
  }
  
  extension [Self <: Profile](x: Self) {
    
    inline def setVariables(value: js.Array[ProfileVariable]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    
    inline def setVariablesVarargs(value: ProfileVariable*): Self = StObject.set(x, "variables", js.Array(value*))
  }
}
