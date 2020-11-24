package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides utility functions for generating [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expressions intended for use in an [age renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createAgeRenderer).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-support-ageUtils.html)
  */
@js.native
trait ageUtils extends js.Object {
  
  /**
    * Returns an [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression for visualizing the age of a feature based on a given start time and end time.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-support-ageUtils.html#getAgeExpressions)
    */
  def getAgeExpressions(params: ageUtilsGetAgeExpressionsParams): AgeExpressionsResult = js.native
}
object ageUtils {
  
  @scala.inline
  def apply(getAgeExpressions: ageUtilsGetAgeExpressionsParams => AgeExpressionsResult): ageUtils = {
    val __obj = js.Dynamic.literal(getAgeExpressions = js.Any.fromFunction1(getAgeExpressions))
    __obj.asInstanceOf[ageUtils]
  }
  
  @scala.inline
  implicit class ageUtilsOps[Self <: ageUtils] (val x: Self) extends AnyVal {
    
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
    def setGetAgeExpressions(value: ageUtilsGetAgeExpressionsParams => AgeExpressionsResult): Self = this.set("getAgeExpressions", js.Any.fromFunction1(value))
  }
}
