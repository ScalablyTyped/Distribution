package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildingPhase extends js.Object {
  /**
    * List of all the values which are allowed for the filter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BuildingExplorer-BuildingPhase.html#allowedValues)
    */
  val allowedValues: js.Array[Double] = js.native
  /**
    * Whether the filter is enabled. If false, the filter's expression won't be used to filter a [BuildingSceneLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BuildingExplorer-BuildingPhase.html#enabled)
    *
    * @default false
    */
  val enabled: Boolean = js.native
  /**
    * Whether the next value can be selected.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BuildingExplorer-BuildingPhase.html#hasNext)
    */
  val hasNext: Boolean = js.native
  /**
    * Whether the previous value can be selected.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BuildingExplorer-BuildingPhase.html#hasPrevious)
    */
  val hasPrevious: Boolean = js.native
  /**
    * The maximum value allowed for the filter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BuildingExplorer-BuildingPhase.html#max)
    */
  val max: Double = js.native
  /**
    * The minimum value allowed for the filter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BuildingExplorer-BuildingPhase.html#min)
    */
  val min: Double = js.native
  /**
    * The value which is currently set on the filter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BuildingExplorer-BuildingPhase.html#value)
    */
  val value: Double = js.native
  /**
    * Removes the filter by setting [enabled](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BuildingExplorer-BuildingPhase.html#enabled) to `false`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BuildingExplorer-BuildingPhase.html#clear)
    *
    *
    */
  def clear(): Unit = js.native
  /**
    * If the field that is used for filtering has a coded value domain, the label for the value can be used to be displayed in a tooltip or in the widget UI. This method returns the label corresponding to a certain value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BuildingExplorer-BuildingPhase.html#getValueLabel)
    *
    * @param value A filter value.
    *
    */
  def getValueLabel(value: Double): String | js.Any = js.native
  /**
    * Selects the next value, if available. If [enabled](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BuildingExplorer-BuildingPhase.html#enabled) is `false`, the first allowed value is selected.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BuildingExplorer-BuildingPhase.html#next)
    *
    *
    */
  def next(): Unit = js.native
  /**
    * Selects the previous value, if available. If [enabled](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BuildingExplorer-BuildingPhase.html#enabled) is `false`, the last allowed value is selected.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BuildingExplorer-BuildingPhase.html#previous)
    *
    *
    */
  def previous(): Unit = js.native
  /**
    * Selects the specified value for the filter. In case the filter is disabled, this method also enables it by setting [enabled](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BuildingExplorer-BuildingPhase.html#enabled) to `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BuildingExplorer-BuildingPhase.html#select)
    *
    * @param value The value which is to be selected.
    *
    */
  def select(value: Double): Unit = js.native
}

object BuildingPhase {
  @scala.inline
  def apply(
    allowedValues: js.Array[Double],
    clear: () => Unit,
    enabled: Boolean,
    getValueLabel: Double => String | js.Any,
    hasNext: Boolean,
    hasPrevious: Boolean,
    max: Double,
    min: Double,
    next: () => Unit,
    previous: () => Unit,
    select: Double => Unit,
    value: Double
  ): BuildingPhase = {
    val __obj = js.Dynamic.literal(allowedValues = allowedValues.asInstanceOf[js.Any], clear = js.Any.fromFunction0(clear), enabled = enabled.asInstanceOf[js.Any], getValueLabel = js.Any.fromFunction1(getValueLabel), hasNext = hasNext.asInstanceOf[js.Any], hasPrevious = hasPrevious.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], next = js.Any.fromFunction0(next), previous = js.Any.fromFunction0(previous), select = js.Any.fromFunction1(select), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildingPhase]
  }
  @scala.inline
  implicit class BuildingPhaseOps[Self <: BuildingPhase] (val x: Self) extends AnyVal {
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
    def setAllowedValuesVarargs(value: Double*): Self = this.set("allowedValues", js.Array(value :_*))
    @scala.inline
    def setAllowedValues(value: js.Array[Double]): Self = this.set("allowedValues", value.asInstanceOf[js.Any])
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetValueLabel(value: Double => String | js.Any): Self = this.set("getValueLabel", js.Any.fromFunction1(value))
    @scala.inline
    def setHasNext(value: Boolean): Self = this.set("hasNext", value.asInstanceOf[js.Any])
    @scala.inline
    def setHasPrevious(value: Boolean): Self = this.set("hasPrevious", value.asInstanceOf[js.Any])
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def setNext(value: () => Unit): Self = this.set("next", js.Any.fromFunction0(value))
    @scala.inline
    def setPrevious(value: () => Unit): Self = this.set("previous", js.Any.fromFunction0(value))
    @scala.inline
    def setSelect(value: Double => Unit): Self = this.set("select", js.Any.fromFunction1(value))
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

