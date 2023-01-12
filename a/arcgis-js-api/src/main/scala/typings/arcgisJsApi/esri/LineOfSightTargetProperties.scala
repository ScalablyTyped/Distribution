package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineOfSightTargetProperties extends StObject {
  
  /**
    * A [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) representing the location of the target.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LineOfSight-LineOfSightTarget.html#location)
    */
  var location: js.UndefOr[PointProperties] = js.undefined
}
object LineOfSightTargetProperties {
  
  inline def apply(): LineOfSightTargetProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineOfSightTargetProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LineOfSightTargetProperties] (val x: Self) extends AnyVal {
    
    inline def setLocation(value: PointProperties): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
  }
}
