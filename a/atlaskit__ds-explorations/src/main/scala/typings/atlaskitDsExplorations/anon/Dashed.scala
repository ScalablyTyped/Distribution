package typings.atlaskitDsExplorations.anon

import typings.emotionUtils.mod.SerializedStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dashed extends StObject {
  
  var dashed: SerializedStyles
  
  var dotted: SerializedStyles
  
  var none: SerializedStyles
  
  var solid: SerializedStyles
}
object Dashed {
  
  inline def apply(
    dashed: SerializedStyles,
    dotted: SerializedStyles,
    none: SerializedStyles,
    solid: SerializedStyles
  ): Dashed = {
    val __obj = js.Dynamic.literal(dashed = dashed.asInstanceOf[js.Any], dotted = dotted.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], solid = solid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dashed]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Dashed] (val x: Self) extends AnyVal {
    
    inline def setDashed(value: SerializedStyles): Self = StObject.set(x, "dashed", value.asInstanceOf[js.Any])
    
    inline def setDotted(value: SerializedStyles): Self = StObject.set(x, "dotted", value.asInstanceOf[js.Any])
    
    inline def setNone(value: SerializedStyles): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    inline def setSolid(value: SerializedStyles): Self = StObject.set(x, "solid", value.asInstanceOf[js.Any])
  }
}
