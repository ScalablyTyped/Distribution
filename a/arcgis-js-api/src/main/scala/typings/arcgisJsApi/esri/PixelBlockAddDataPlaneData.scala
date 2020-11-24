package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PixelBlockAddDataPlaneData extends Object {
  
  /**
    * A two dimensional array representing the pixels to add.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PixelBlock.html#addData)
    */
  var pixels: js.Array[js.Array[Double]] = js.native
  
  /**
    * An array of objects containing numeric statistical properties.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PixelBlock.html#addData)
    */
  var statistics: js.Array[_] = js.native
}
object PixelBlockAddDataPlaneData {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    pixels: js.Array[js.Array[Double]],
    propertyIsEnumerable: PropertyKey => Boolean,
    statistics: js.Array[_]
  ): PixelBlockAddDataPlaneData = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), pixels = pixels.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), statistics = statistics.asInstanceOf[js.Any])
    __obj.asInstanceOf[PixelBlockAddDataPlaneData]
  }
  
  @scala.inline
  implicit class PixelBlockAddDataPlaneDataOps[Self <: PixelBlockAddDataPlaneData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPixelsVarargs(value: js.Array[Double]*): Self = this.set("pixels", js.Array(value :_*))
    
    @scala.inline
    def setPixels(value: js.Array[js.Array[Double]]): Self = this.set("pixels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatisticsVarargs(value: js.Any*): Self = this.set("statistics", js.Array(value :_*))
    
    @scala.inline
    def setStatistics(value: js.Array[_]): Self = this.set("statistics", value.asInstanceOf[js.Any])
  }
}
