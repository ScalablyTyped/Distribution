package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait utils extends js.Object {
  /**
    * Formats a UNIX timestamp to a basic date string. This function is only intended for convenience in formatting thumb values in slider widgets and does not include additional formatting options.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-support-utils.html#formatDateLabel)
    *
    * @param value The UNIX timestamp to convert to a formatted date string.
    *
    */
  def formatDateLabel(value: Double): String
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
  def getDeviationValues(standardDeviation: Double, average: Double, count: Double): js.Array[Double]
}

@JSGlobal("__esri.utils")
@js.native
object utils extends TopLevel[utils]

