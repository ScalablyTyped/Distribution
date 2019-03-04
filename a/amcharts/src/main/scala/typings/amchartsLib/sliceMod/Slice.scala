package typings
package amchartsLib.sliceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Slice extends js.Object {
  /**
    * Opacity of a slice.
    */
  var alpha: scala.Double
  /**
    * Color of a slice.
    */
  var color: java.lang.String
  /**
    * Original object from data provider.
    */
  var dataContext: js.Object
  /**
    * Slice description.
    */
  var description: java.lang.String
  /**
    * Specifies whether the slice is hidden
    */
  var hidden: scala.Boolean
  /**
    * Percent value of a slice.
    */
  var percents: scala.Double
  /**
    * Specifies whether the slice is pulled or not.
    */
  var pulled: scala.Boolean
  /**
    * Slice title
    */
  var title: java.lang.String
  /**
    * Url of a slice
    */
  var url: java.lang.String
  /**
    * Value of a slice
    */
  var value: scala.Double
  /**
    * specifies whether this slice has a legend entry
    */
  var visibleInLegend: scala.Boolean
}

object Slice {
  @scala.inline
  def apply(
    alpha: scala.Double,
    color: java.lang.String,
    dataContext: js.Object,
    description: java.lang.String,
    hidden: scala.Boolean,
    percents: scala.Double,
    pulled: scala.Boolean,
    title: java.lang.String,
    url: java.lang.String,
    value: scala.Double,
    visibleInLegend: scala.Boolean
  ): Slice = {
    val __obj = js.Dynamic.literal(alpha = alpha, color = color, dataContext = dataContext, description = description, hidden = hidden, percents = percents, pulled = pulled, title = title, url = url, value = value, visibleInLegend = visibleInLegend)
  
    __obj.asInstanceOf[Slice]
  }
}

