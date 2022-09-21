package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Various utils for tying Smart Mapping renderers to the Smart Mapping slider widgets.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-support-utils.html)
  */
trait supportUtils extends StObject {
  
  /**
    * Formats a UNIX timestamp to a basic date string.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-support-utils.html#formatDateLabel)
    */
  def formatDateLabel(value: Double): String
  
  /**
    * Formats a numeric value for display as a label based on the current locale.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-support-utils.html#formatNumberLabel)
    */
  def formatNumberLabel(value: Double): String
  
  /**
    * Computes and returns standard deviation values based on the given average and standard deviation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-support-utils.html#getDeviationValues)
    */
  def getDeviationValues(standardDeviation: Double, average: Double, count: Double): js.Array[Double]
}
object supportUtils {
  
  inline def apply(
    formatDateLabel: Double => String,
    formatNumberLabel: Double => String,
    getDeviationValues: (Double, Double, Double) => js.Array[Double]
  ): supportUtils = {
    val __obj = js.Dynamic.literal(formatDateLabel = js.Any.fromFunction1(formatDateLabel), formatNumberLabel = js.Any.fromFunction1(formatNumberLabel), getDeviationValues = js.Any.fromFunction3(getDeviationValues))
    __obj.asInstanceOf[supportUtils]
  }
  
  extension [Self <: supportUtils](x: Self) {
    
    inline def setFormatDateLabel(value: Double => String): Self = StObject.set(x, "formatDateLabel", js.Any.fromFunction1(value))
    
    inline def setFormatNumberLabel(value: Double => String): Self = StObject.set(x, "formatNumberLabel", js.Any.fromFunction1(value))
    
    inline def setGetDeviationValues(value: (Double, Double, Double) => js.Array[Double]): Self = StObject.set(x, "getDeviationValues", js.Any.fromFunction3(value))
  }
}
