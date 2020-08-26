package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait utils extends js.Object {
  /**
    * Formats a UNIX timestamp to a basic date string. This function is only intended for convenience in formatting thumb values in slider widgets and does not include additional formatting options.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-support-utils.html#formatDateLabel)
    *
    * @param value The UNIX timestamp to convert to a formatted date string.
    *
    */
  def formatDateLabel(value: Double): String = js.native
  /**
    * Computes and returns standard deviation values based on the given average and standard deviation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-support-utils.html#getDeviationValues)
    *
    * @param standardDeviation The standard deviation from the given `average`.
    * @param average The average of the dataset from which to compute standard deviation values.
    * @param count The number of standard deviations from the mean to compute.
    *
    */
  def getDeviationValues(standardDeviation: Double, average: Double, count: Double): js.Array[Double] = js.native
}

object utils {
  @scala.inline
  def apply(
    formatDateLabel: Double => String,
    getDeviationValues: (Double, Double, Double) => js.Array[Double]
  ): utils = {
    val __obj = js.Dynamic.literal(formatDateLabel = js.Any.fromFunction1(formatDateLabel), getDeviationValues = js.Any.fromFunction3(getDeviationValues))
    __obj.asInstanceOf[utils]
  }
  @scala.inline
  implicit class utilsOps[Self <: utils] (val x: Self) extends AnyVal {
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
    def setFormatDateLabel(value: Double => String): Self = this.set("formatDateLabel", js.Any.fromFunction1(value))
    @scala.inline
    def setGetDeviationValues(value: (Double, Double, Double) => js.Array[Double]): Self = this.set("getDeviationValues", js.Any.fromFunction3(value))
  }
  
}

