package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait utils extends js.Object {
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
  def getDeviationValues(standardDeviation: scala.Double, average: scala.Double, count: scala.Double): js.Array[scala.Double]
}

object utils {
  @scala.inline
  def apply(getDeviationValues: (scala.Double, scala.Double, scala.Double) => js.Array[scala.Double]): utils = {
    val __obj = js.Dynamic.literal(getDeviationValues = js.Any.fromFunction3(getDeviationValues))
  
    __obj.asInstanceOf[utils]
  }
}

