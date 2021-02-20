package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultipointProperties extends GeometryProperties {
  
  /**
    * An array of points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Multipoint.html#points)
    */
  var points: js.UndefOr[js.Array[js.Array[Double]]] = js.native
}
object MultipointProperties {
  
  @scala.inline
  def apply(): MultipointProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultipointProperties]
  }
  
  @scala.inline
  implicit class MultipointPropertiesMutableBuilder[Self <: MultipointProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPoints(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
    
    @scala.inline
    def setPointsVarargs(value: js.Array[Double]*): Self = StObject.set(x, "points", js.Array(value :_*))
  }
}
