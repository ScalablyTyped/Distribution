package typings.antvDataSet

import typings.antvDataSet.viewMod.View
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object centroidMod {
  
  trait Options extends StObject {
    
    var as: js.UndefOr[js.Tuple2[String, String]] = js.undefined
    
    var field: String
    
    var geoDataView: View | String
  }
  object Options {
    
    inline def apply(field: String, geoDataView: View | String): Options = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], geoDataView = geoDataView.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAs(value: js.Tuple2[String, String]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      inline def setGeoDataView(value: View | String): Self = StObject.set(x, "geoDataView", value.asInstanceOf[js.Any])
    }
  }
}
