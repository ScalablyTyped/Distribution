package typings.amapJsApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Name extends StObject {
  
  var id: Double
  
  var name: String
  
  var position: js.Tuple2[Double | String, Double | String]
  
  var rank: js.UndefOr[Double] = js.undefined
  
  var txt: js.UndefOr[String] = js.undefined
  
  var zooms: js.Tuple2[Double, Double]
}
object Name {
  
  inline def apply(
    id: Double,
    name: String,
    position: js.Tuple2[Double | String, Double | String],
    zooms: js.Tuple2[Double, Double]
  ): Name = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], zooms = zooms.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
  
  extension [Self <: Name](x: Self) {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: js.Tuple2[Double | String, Double | String]): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setRank(value: Double): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
    
    inline def setRankUndefined: Self = StObject.set(x, "rank", js.undefined)
    
    inline def setTxt(value: String): Self = StObject.set(x, "txt", value.asInstanceOf[js.Any])
    
    inline def setTxtUndefined: Self = StObject.set(x, "txt", js.undefined)
    
    inline def setZooms(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "zooms", value.asInstanceOf[js.Any])
  }
}
