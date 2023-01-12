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
  
  inline def apply(): DefaultType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefaultType] (val x: Self) extends AnyVal {
    
    inline def setDefaultType(value: Double): Self = StObject.set(x, "defaultType", value.asInstanceOf[js.Any])
    
    inline def setDefaultTypeUndefined: Self = StObject.set(x, "defaultType", js.undefined)
    
    inline def setShowRoad(value: Boolean): Self = StObject.set(x, "showRoad", value.asInstanceOf[js.Any])
    
    inline def setShowRoadUndefined: Self = StObject.set(x, "showRoad", js.undefined)
    
    inline def setShowTraffic(value: Boolean): Self = StObject.set(x, "showTraffic", value.asInstanceOf[js.Any])
    
    inline def setShowTrafficUndefined: Self = StObject.set(x, "showTraffic", js.undefined)
  }
}
