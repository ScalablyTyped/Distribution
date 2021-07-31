package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TileInfoCreateOptions
  extends StObject
     with Object {
  
  /**
    * An array of scale values to use for the TileInfo.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileInfo.html#create)
    */
  var scales: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * The size of each tile in pixels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileInfo.html#create)
    */
  var size: js.UndefOr[Double] = js.undefined
  
  /**
    * The spatial reference for the new TileInfo instance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileInfo.html#create)
    */
  var spatialReference: js.UndefOr[SpatialReference] = js.undefined
}
object TileInfoCreateOptions {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): TileInfoCreateOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[TileInfoCreateOptions]
  }
  
  @scala.inline
  implicit class TileInfoCreateOptionsMutableBuilder[Self <: TileInfoCreateOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScales(value: js.Array[Double]): Self = StObject.set(x, "scales", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScalesUndefined: Self = StObject.set(x, "scales", js.undefined)
    
    @scala.inline
    def setScalesVarargs(value: Double*): Self = StObject.set(x, "scales", js.Array(value :_*))
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setSpatialReference(value: SpatialReference): Self = StObject.set(x, "spatialReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpatialReferenceUndefined: Self = StObject.set(x, "spatialReference", js.undefined)
  }
}
