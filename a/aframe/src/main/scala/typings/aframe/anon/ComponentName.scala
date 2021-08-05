package typings.aframe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentName extends StObject {
  
  var componentName: String
}
object ComponentName {
  
  inline def apply(componentName: String): ComponentName = {
    val __obj = js.Dynamic.literal(componentName = componentName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentName]
  }
  
  extension [Self <: ComponentName](x: Self) {
    
    inline def setComponentName(value: String): Self = StObject.set(x, "componentName", value.asInstanceOf[js.Any])
  }
}
