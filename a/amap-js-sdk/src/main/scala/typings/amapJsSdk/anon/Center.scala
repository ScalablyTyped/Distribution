package typings.amapJsSdk.anon

import typings.amapJsSdk.AMap.LngLat
import typings.amapJsSdk.amapJsSdkStrings.EPSG3395
import typings.amapJsSdk.amapJsSdkStrings.EPSG3857
import typings.amapJsSdk.amapJsSdkStrings.EPSG4326
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Center extends StObject {
  
  var center: js.UndefOr[LngLat] = js.native
  
  var crs: js.UndefOr[EPSG3857 | EPSG3395 | EPSG4326] = js.native
  
  var rotation: js.UndefOr[Double] = js.native
  
  var zoom: js.UndefOr[Double] = js.native
}
object Center {
  
  @scala.inline
  def apply(): Center = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Center]
  }
  
  @scala.inline
  implicit class CenterMutableBuilder[Self <: Center] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCenter(value: LngLat): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    @scala.inline
    def setCrs(value: EPSG3857 | EPSG3395 | EPSG4326): Self = StObject.set(x, "crs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrsUndefined: Self = StObject.set(x, "crs", js.undefined)
    
    @scala.inline
    def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    @scala.inline
    def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
