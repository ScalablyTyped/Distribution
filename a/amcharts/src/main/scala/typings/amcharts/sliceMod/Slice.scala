package typings.amcharts.sliceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Slice extends js.Object {
  /**
    * Opacity of a slice.
    */
  var alpha: Double = js.native
  /**
    * Color of a slice.
    */
  var color: String = js.native
  /**
    * Original object from data provider.
    */
  var dataContext: js.Object = js.native
  /**
    * Slice description.
    */
  var description: String = js.native
  /**
    * Specifies whether the slice is hidden
    */
  var hidden: Boolean = js.native
  /**
    * Percent value of a slice.
    */
  var percents: Double = js.native
  /**
    * Specifies whether the slice is pulled or not.
    */
  var pulled: Boolean = js.native
  /**
    * Slice title
    */
  var title: String = js.native
  /**
    * Url of a slice
    */
  var url: String = js.native
  /**
    * Value of a slice
    */
  var value: Double = js.native
  /**
    * specifies whether this slice has a legend entry
    */
  var visibleInLegend: Boolean = js.native
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
  @scala.inline
  implicit class SliceOps[Self <: Slice] (val x: Self) extends AnyVal {
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
    def setAlpha(value: Double): Self = this.set("alpha", value.asInstanceOf[js.Any])
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataContext(value: js.Object): Self = this.set("dataContext", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def setPercents(value: Double): Self = this.set("percents", value.asInstanceOf[js.Any])
    @scala.inline
    def setPulled(value: Boolean): Self = this.set("pulled", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisibleInLegend(value: Boolean): Self = this.set("visibleInLegend", value.asInstanceOf[js.Any])
  }
  
}

