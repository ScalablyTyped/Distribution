package typings.amapJsSdk.AMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cross extends StObject {
  
  var direction: String = js.native
  
  var distance: Double = js.native
  
  var first_id: String = js.native
  
  var first_name: String = js.native
  
  var location: LngLat = js.native
  
  var second_id: String = js.native
  
  var second_name: String = js.native
}
object Cross {
  
  @scala.inline
  def apply(
    direction: String,
    distance: Double,
    first_id: String,
    first_name: String,
    location: LngLat,
    second_id: String,
    second_name: String
  ): Cross = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], first_id = first_id.asInstanceOf[js.Any], first_name = first_name.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], second_id = second_id.asInstanceOf[js.Any], second_name = second_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cross]
  }
  
  @scala.inline
  implicit class CrossMutableBuilder[Self <: Cross] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirst_id(value: String): Self = StObject.set(x, "first_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirst_name(value: String): Self = StObject.set(x, "first_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: LngLat): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecond_id(value: String): Self = StObject.set(x, "second_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecond_name(value: String): Self = StObject.set(x, "second_name", value.asInstanceOf[js.Any])
  }
}
