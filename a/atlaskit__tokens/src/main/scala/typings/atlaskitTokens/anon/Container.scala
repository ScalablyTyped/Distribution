package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Container extends StObject {
  
  var container: Gutter
  
  var scale: `025`
}
object Container {
  
  inline def apply(container: Gutter, scale: `025`): Container = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[Container]
  }
  
  extension [Self <: Container](x: Self) {
    
    inline def setContainer(value: Gutter): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setScale(value: `025`): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
  }
}
