package typings.atlaskitDsExplorations.anon

import typings.emotionUtils.mod.SerializedStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait End extends StObject {
  
  var center: SerializedStyles
  
  var end: SerializedStyles
  
  var flexEnd: SerializedStyles
  
  var flexStart: SerializedStyles
  
  var `space-between`: SerializedStyles
  
  var spaceBetween: SerializedStyles
  
  var start: SerializedStyles
}
object End {
  
  inline def apply(
    center: SerializedStyles,
    end: SerializedStyles,
    flexEnd: SerializedStyles,
    flexStart: SerializedStyles,
    `space-between`: SerializedStyles,
    spaceBetween: SerializedStyles,
    start: SerializedStyles
  ): End = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], flexEnd = flexEnd.asInstanceOf[js.Any], flexStart = flexStart.asInstanceOf[js.Any], spaceBetween = spaceBetween.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("space-between")(`space-between`.asInstanceOf[js.Any])
    __obj.asInstanceOf[End]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: End] (val x: Self) extends AnyVal {
    
    inline def setCenter(value: SerializedStyles): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setEnd(value: SerializedStyles): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setFlexEnd(value: SerializedStyles): Self = StObject.set(x, "flexEnd", value.asInstanceOf[js.Any])
    
    inline def setFlexStart(value: SerializedStyles): Self = StObject.set(x, "flexStart", value.asInstanceOf[js.Any])
    
    inline def `setSpace-between`(value: SerializedStyles): Self = StObject.set(x, "space-between", value.asInstanceOf[js.Any])
    
    inline def setSpaceBetween(value: SerializedStyles): Self = StObject.set(x, "spaceBetween", value.asInstanceOf[js.Any])
    
    inline def setStart(value: SerializedStyles): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
