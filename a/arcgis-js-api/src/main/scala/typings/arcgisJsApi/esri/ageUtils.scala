package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides utility functions for generating [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expressions intended for use in an [age renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createAgeRenderer).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-support-ageUtils.html)
  */
trait ageUtils extends StObject {
  
  /**
    * Returns an [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression for visualizing the age of a feature based on a given start time and end time.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-support-ageUtils.html#getAgeExpressions)
    */
  def getAgeExpressions(params: ageUtilsGetAgeExpressionsParams): AgeExpressionsResult
}
object ageUtils {
  
  @scala.inline
  def apply(getAgeExpressions: ageUtilsGetAgeExpressionsParams => AgeExpressionsResult): ageUtils = {
    val __obj = js.Dynamic.literal(getAgeExpressions = js.Any.fromFunction1(getAgeExpressions))
    __obj.asInstanceOf[ageUtils]
  }
  
  @scala.inline
  implicit class ageUtilsMutableBuilder[Self <: ageUtils] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetAgeExpressions(value: ageUtilsGetAgeExpressionsParams => AgeExpressionsResult): Self = StObject.set(x, "getAgeExpressions", js.Any.fromFunction1(value))
  }
}
