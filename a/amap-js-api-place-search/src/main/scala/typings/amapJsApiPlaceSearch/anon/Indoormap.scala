package typings.amapJsApiPlaceSearch.anon

import typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Indoormap extends StObject {
  
  var indoor_map: `false`
}
object Indoormap {
  
  @scala.inline
  def apply(): Indoormap = {
    val __obj = js.Dynamic.literal(indoor_map = false)
    __obj.asInstanceOf[Indoormap]
  }
  
  @scala.inline
  implicit class IndoormapMutableBuilder[Self <: Indoormap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndoor_map(value: `false`): Self = StObject.set(x, "indoor_map", value.asInstanceOf[js.Any])
  }
}
