package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineOfSightTargetProperties extends StObject {
  
  /**
    * A [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) representing the location of the target.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LineOfSight-LineOfSightTarget.html#location)
    */
  var location: js.UndefOr[PointProperties] = js.native
}
object LineOfSightTargetProperties {
  
  @scala.inline
  def apply(): LineOfSightTargetProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineOfSightTargetProperties]
  }
  
  @scala.inline
  implicit class LineOfSightTargetPropertiesMutableBuilder[Self <: LineOfSightTargetProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocation(value: PointProperties): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
  }
}
