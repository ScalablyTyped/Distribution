package typings.atlaskitPrimitives.anon

import typings.atlaskitPrimitives.atlaskitPrimitivesStrings.auto
import typings.atlaskitPrimitives.atlaskitPrimitivesStrings.hidden
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Auto extends StObject {
  
  val auto: typings.atlaskitPrimitives.atlaskitPrimitivesStrings.auto
  
  val hidden: typings.atlaskitPrimitives.atlaskitPrimitivesStrings.hidden
}
object Auto {
  
  inline def apply(): Auto = {
    val __obj = js.Dynamic.literal(auto = "auto", hidden = "hidden")
    __obj.asInstanceOf[Auto]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Auto] (val x: Self) extends AnyVal {
    
    inline def setAuto(value: auto): Self = StObject.set(x, "auto", value.asInstanceOf[js.Any])
    
    inline def setHidden(value: hidden): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
  }
}
