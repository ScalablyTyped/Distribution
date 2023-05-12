package typings.atlaskitDsExplorations.anon

import typings.emotionUtils.mod.SerializedStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Absolute extends StObject {
  
  var absolute: SerializedStyles
  
  var fixed: SerializedStyles
  
  var relative: SerializedStyles
  
  var static: SerializedStyles
}
object Absolute {
  
  inline def apply(
    absolute: SerializedStyles,
    fixed: SerializedStyles,
    relative: SerializedStyles,
    static: SerializedStyles
  ): Absolute = {
    val __obj = js.Dynamic.literal(absolute = absolute.asInstanceOf[js.Any], fixed = fixed.asInstanceOf[js.Any], relative = relative.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any])
    __obj.asInstanceOf[Absolute]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Absolute] (val x: Self) extends AnyVal {
    
    inline def setAbsolute(value: SerializedStyles): Self = StObject.set(x, "absolute", value.asInstanceOf[js.Any])
    
    inline def setFixed(value: SerializedStyles): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
    
    inline def setRelative(value: SerializedStyles): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
    
    inline def setStatic(value: SerializedStyles): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
  }
}
