package typings.amapJsSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultType extends StObject {
  
  var defaultType: js.UndefOr[Double] = js.undefined
  
  var showRoad: js.UndefOr[Boolean] = js.undefined
  
  var showTraffic: js.UndefOr[Boolean] = js.undefined
}
object DefaultType {
  
  @scala.inline
  def apply(): DefaultType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultType]
  }
  
  @scala.inline
  implicit class DefaultTypeMutableBuilder[Self <: DefaultType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultType(value: Double): Self = StObject.set(x, "defaultType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultTypeUndefined: Self = StObject.set(x, "defaultType", js.undefined)
    
    @scala.inline
    def setShowRoad(value: Boolean): Self = StObject.set(x, "showRoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowRoadUndefined: Self = StObject.set(x, "showRoad", js.undefined)
    
    @scala.inline
    def setShowTraffic(value: Boolean): Self = StObject.set(x, "showTraffic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowTrafficUndefined: Self = StObject.set(x, "showTraffic", js.undefined)
  }
}
