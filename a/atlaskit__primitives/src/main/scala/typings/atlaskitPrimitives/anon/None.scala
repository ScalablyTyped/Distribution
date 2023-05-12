package typings.atlaskitPrimitives.anon

import typings.atlaskitPrimitives.atlaskitPrimitivesStrings.none
import typings.atlaskitPrimitives.atlaskitPrimitivesStrings.solid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait None extends StObject {
  
  val none: typings.atlaskitPrimitives.atlaskitPrimitivesStrings.none
  
  val solid: typings.atlaskitPrimitives.atlaskitPrimitivesStrings.solid
}
object None {
  
  inline def apply(): None = {
    val __obj = js.Dynamic.literal(none = "none", solid = "solid")
    __obj.asInstanceOf[None]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: None] (val x: Self) extends AnyVal {
    
    inline def setNone(value: none): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    inline def setSolid(value: solid): Self = StObject.set(x, "solid", value.asInstanceOf[js.Any])
  }
}
