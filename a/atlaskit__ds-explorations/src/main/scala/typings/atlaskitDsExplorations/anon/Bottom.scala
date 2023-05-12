package typings.atlaskitDsExplorations.anon

import typings.emotionUtils.mod.SerializedStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bottom extends StObject {
  
  var bottom: SerializedStyles
  
  var middle: SerializedStyles
  
  var top: SerializedStyles
}
object Bottom {
  
  inline def apply(bottom: SerializedStyles, middle: SerializedStyles, top: SerializedStyles): Bottom = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], middle = middle.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bottom]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Bottom] (val x: Self) extends AnyVal {
    
    inline def setBottom(value: SerializedStyles): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setMiddle(value: SerializedStyles): Self = StObject.set(x, "middle", value.asInstanceOf[js.Any])
    
    inline def setTop(value: SerializedStyles): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
  }
}
