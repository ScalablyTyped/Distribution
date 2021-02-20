package typings.amapJsApiPlaceSearch.anon

import typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Indoormap extends StObject {
  
  var indoor_map: `false` = js.native
}
object Indoormap {
  
  @scala.inline
  def apply(indoor_map: `false`): Indoormap = {
    val __obj = js.Dynamic.literal(indoor_map = indoor_map.asInstanceOf[js.Any])
    __obj.asInstanceOf[Indoormap]
  }
  
  @scala.inline
  implicit class IndoormapMutableBuilder[Self <: Indoormap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndoor_map(value: `false`): Self = StObject.set(x, "indoor_map", value.asInstanceOf[js.Any])
  }
}
