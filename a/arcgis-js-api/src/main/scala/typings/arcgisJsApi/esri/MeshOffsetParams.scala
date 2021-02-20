package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MeshOffsetParams extends Object {
  
  /**
    * Whether to georeference relative to the globe or the projected coordinate system (PCS).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#offset)
    */
  var geographic: js.UndefOr[Boolean] = js.native
}
object MeshOffsetParams {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): MeshOffsetParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[MeshOffsetParams]
  }
  
  @scala.inline
  implicit class MeshOffsetParamsMutableBuilder[Self <: MeshOffsetParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGeographic(value: Boolean): Self = StObject.set(x, "geographic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeographicUndefined: Self = StObject.set(x, "geographic", js.undefined)
  }
}
