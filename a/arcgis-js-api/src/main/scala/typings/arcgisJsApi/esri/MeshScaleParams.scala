package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeshScaleParams
  extends StObject
     with Object {
  
  /**
    * Whether to georeference relative to the globe or the projected coordinate system (PCS).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#scale)
    */
  var geographic: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The origin point for scaling.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#scale)
    */
  var origin: js.UndefOr[Point] = js.undefined
}
object MeshScaleParams {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): MeshScaleParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[MeshScaleParams]
  }
  
  @scala.inline
  implicit class MeshScaleParamsMutableBuilder[Self <: MeshScaleParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGeographic(value: Boolean): Self = StObject.set(x, "geographic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeographicUndefined: Self = StObject.set(x, "geographic", js.undefined)
    
    @scala.inline
    def setOrigin(value: Point): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
  }
}
