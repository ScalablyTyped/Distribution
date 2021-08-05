package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait utils extends StObject {
  
  /**
    * Formats a UNIX timestamp to a basic date string.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-support-utils.html#formatDateLabel)
    */
  def formatDateLabel(value: Double): String
  
  /**
    * Computes and returns standard deviation values based on the given average and standard deviation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-support-utils.html#getDeviationValues)
    */
  def getDeviationValues(standardDeviation: Double, average: Double, count: Double): js.Array[Double]
}
object utils {
  
  inline def apply(
    formatDateLabel: Double => String,
    getDeviationValues: (Double, Double, Double) => js.Array[Double]
  ): utils = {
    val __obj = js.Dynamic.literal(formatDateLabel = js.Any.fromFunction1(formatDateLabel), getDeviationValues = js.Any.fromFunction3(getDeviationValues))
    __obj.asInstanceOf[utils]
  }
  
  extension [Self <: utils](x: Self) {
    
    inline def setFormatDateLabel(value: Double => String): Self = StObject.set(x, "formatDateLabel", js.Any.fromFunction1(value))
    
    inline def setGetDeviationValues(value: (Double, Double, Double) => js.Array[Double]): Self = StObject.set(x, "getDeviationValues", js.Any.fromFunction3(value))
  }
}
