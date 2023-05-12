package typings.atlaskitPrimitives.anon

import typings.atlaskitPrimitives.atlaskitPrimitivesStrings.absolute
import typings.atlaskitPrimitives.atlaskitPrimitivesStrings.fixed
import typings.atlaskitPrimitives.atlaskitPrimitivesStrings.relative
import typings.atlaskitPrimitives.atlaskitPrimitivesStrings.static
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Absolute extends StObject {
  
  val absolute: typings.atlaskitPrimitives.atlaskitPrimitivesStrings.absolute
  
  val fixed: typings.atlaskitPrimitives.atlaskitPrimitivesStrings.fixed
  
  val relative: typings.atlaskitPrimitives.atlaskitPrimitivesStrings.relative
  
  val static: typings.atlaskitPrimitives.atlaskitPrimitivesStrings.static
}
object Absolute {
  
  inline def apply(): Absolute = {
    val __obj = js.Dynamic.literal(absolute = "absolute", fixed = "fixed", relative = "relative", static = "static")
    __obj.asInstanceOf[Absolute]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Absolute] (val x: Self) extends AnyVal {
    
    inline def setAbsolute(value: absolute): Self = StObject.set(x, "absolute", value.asInstanceOf[js.Any])
    
    inline def setFixed(value: fixed): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
    
    inline def setRelative(value: relative): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
    
    inline def setStatic(value: static): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
  }
}
