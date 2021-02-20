package typings.amapJsSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlwaysShow extends StObject {
  
  var alwaysShow: js.UndefOr[Boolean] = js.native
  
  var cursor: js.UndefOr[String] = js.native
  
  var hideFloorBar: js.UndefOr[Boolean] = js.native
  
  var opacity: js.UndefOr[Double] = js.native
  
  var zIndex: js.UndefOr[Double] = js.native
}
object AlwaysShow {
  
  @scala.inline
  def apply(): AlwaysShow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlwaysShow]
  }
  
  @scala.inline
  implicit class AlwaysShowMutableBuilder[Self <: AlwaysShow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlwaysShow(value: Boolean): Self = StObject.set(x, "alwaysShow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlwaysShowUndefined: Self = StObject.set(x, "alwaysShow", js.undefined)
    
    @scala.inline
    def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    @scala.inline
    def setHideFloorBar(value: Boolean): Self = StObject.set(x, "hideFloorBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideFloorBarUndefined: Self = StObject.set(x, "hideFloorBar", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
