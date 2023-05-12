package typings.atlaskitDsExplorations.anon

import typings.emotionUtils.mod.SerializedStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Badge extends StObject {
  
  var badge: SerializedStyles
  
  var normal: SerializedStyles
  
  var rounded: SerializedStyles
}
object Badge {
  
  inline def apply(badge: SerializedStyles, normal: SerializedStyles, rounded: SerializedStyles): Badge = {
    val __obj = js.Dynamic.literal(badge = badge.asInstanceOf[js.Any], normal = normal.asInstanceOf[js.Any], rounded = rounded.asInstanceOf[js.Any])
    __obj.asInstanceOf[Badge]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Badge] (val x: Self) extends AnyVal {
    
    inline def setBadge(value: SerializedStyles): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
    
    inline def setNormal(value: SerializedStyles): Self = StObject.set(x, "normal", value.asInstanceOf[js.Any])
    
    inline def setRounded(value: SerializedStyles): Self = StObject.set(x, "rounded", value.asInstanceOf[js.Any])
  }
}
