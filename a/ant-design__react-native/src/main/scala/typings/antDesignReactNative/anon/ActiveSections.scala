package typings.antDesignReactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveSections extends StObject {
  
  var activeSections: js.Array[Double]
}
object ActiveSections {
  
  inline def apply(activeSections: js.Array[Double]): ActiveSections = {
    val __obj = js.Dynamic.literal(activeSections = activeSections.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveSections]
  }
  
  extension [Self <: ActiveSections](x: Self) {
    
    inline def setActiveSections(value: js.Array[Double]): Self = StObject.set(x, "activeSections", value.asInstanceOf[js.Any])
    
    inline def setActiveSectionsVarargs(value: Double*): Self = StObject.set(x, "activeSections", js.Array(value :_*))
  }
}
