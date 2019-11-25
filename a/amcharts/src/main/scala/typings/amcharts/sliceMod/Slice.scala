package typings.amcharts.sliceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Slice extends js.Object {
  /**
    * Opacity of a slice.
    */
  var alpha: Double
  /**
    * Color of a slice.
    */
  var color: String
  /**
    * Original object from data provider.
    */
  var dataContext: js.Object
  /**
    * Slice description.
    */
  var description: String
  /**
    * Specifies whether the slice is hidden
    */
  var hidden: Boolean
  /**
    * Percent value of a slice.
    */
  var percents: Double
  /**
    * Specifies whether the slice is pulled or not.
    */
  var pulled: Boolean
  /**
    * Slice title
    */
  var title: String
  /**
    * Url of a slice
    */
  var url: String
  /**
    * Value of a slice
    */
  var value: Double
  /**
    * specifies whether this slice has a legend entry
    */
  var visibleInLegend: Boolean
}

object Slice {
  @scala.inline
  def apply(
    alpha: Double,
    color: String,
    dataContext: js.Object,
    description: String,
    hidden: Boolean,
    percents: Double,
    pulled: Boolean,
    title: String,
    url: String,
    value: Double,
    visibleInLegend: Boolean
  ): Slice = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], dataContext = dataContext.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], percents = percents.asInstanceOf[js.Any], pulled = pulled.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], visibleInLegend = visibleInLegend.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Slice]
  }
}

