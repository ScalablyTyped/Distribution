package typings.activexAccess.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DrawObject extends StObject {
  
  val drawObject: js.Any
}
object DrawObject {
  
  inline def apply(drawObject: js.Any): DrawObject = {
    val __obj = js.Dynamic.literal(drawObject = drawObject.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawObject]
  }
  
  extension [Self <: DrawObject](x: Self) {
    
    inline def setDrawObject(value: js.Any): Self = StObject.set(x, "drawObject", value.asInstanceOf[js.Any])
  }
}
