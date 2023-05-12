package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Radius extends StObject {
  
  var radius: `100`
  
  var width: `050`
}
object Radius {
  
  inline def apply(radius: `100`, width: `050`): Radius = {
    val __obj = js.Dynamic.literal(radius = radius.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Radius]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Radius] (val x: Self) extends AnyVal {
    
    inline def setRadius(value: `100`): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: `050`): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
