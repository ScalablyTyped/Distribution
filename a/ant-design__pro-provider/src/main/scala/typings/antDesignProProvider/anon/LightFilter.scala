package typings.antDesignProProvider.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LightFilter extends StObject {
  
  var lightFilter: Clear
}
object LightFilter {
  
  inline def apply(lightFilter: Clear): LightFilter = {
    val __obj = js.Dynamic.literal(lightFilter = lightFilter.asInstanceOf[js.Any])
    __obj.asInstanceOf[LightFilter]
  }
  
  extension [Self <: LightFilter](x: Self) {
    
    inline def setLightFilter(value: Clear): Self = StObject.set(x, "lightFilter", value.asInstanceOf[js.Any])
  }
}
