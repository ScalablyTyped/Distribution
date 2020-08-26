package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelationshipSchemeForPointColorsForClassBreaks extends Object {
  /**
    * The fill colors of the point symbols used for each bin in the relationship visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-relationship.html#RelationshipSchemeForPoint)
    */
  var colors: js.Array[js.Array[Color_]] = js.native
  /**
    * The number of breaks (rows/columns) for each variable in the relationship visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-relationship.html#RelationshipSchemeForPoint)
    */
  var numClasses: Double = js.native
}

object RelationshipSchemeForPointColorsForClassBreaks {
  @scala.inline
  def apply(
    colors: js.Array[js.Array[Color_]],
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    numClasses: Double,
    propertyIsEnumerable: PropertyKey => Boolean
  ): RelationshipSchemeForPointColorsForClassBreaks = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), numClasses = numClasses.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[RelationshipSchemeForPointColorsForClassBreaks]
  }
  @scala.inline
  implicit class RelationshipSchemeForPointColorsForClassBreaksOps[Self <: RelationshipSchemeForPointColorsForClassBreaks] (val x: Self) extends AnyVal {
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
    def setColorsVarargs(value: js.Array[Color_]*): Self = this.set("colors", js.Array(value :_*))
    @scala.inline
    def setColors(value: js.Array[js.Array[Color_]]): Self = this.set("colors", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumClasses(value: Double): Self = this.set("numClasses", value.asInstanceOf[js.Any])
  }
  
}

