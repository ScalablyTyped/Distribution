package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`nautical-miles`
import typings.arcgisJsApi.arcgisJsApiStrings.feet_
import typings.arcgisJsApi.arcgisJsApiStrings.kilometers_
import typings.arcgisJsApi.arcgisJsApiStrings.meters_
import typings.arcgisJsApi.arcgisJsApiStrings.miles_
import typings.arcgisJsApi.arcgisJsApiStrings.yards
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeneralizeParametersProperties extends StObject {
  
  /**
    * The maximum deviation unit.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-GeneralizeParameters.html#deviationUnit)
    */
  var deviationUnit: js.UndefOr[feet_ | kilometers_ | meters_ | miles_ | `nautical-miles` | yards] = js.undefined
  
  /**
    * The array of input geometries to generalize.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-GeneralizeParameters.html#geometries)
    */
  var geometries: js.UndefOr[js.Array[GeometryProperties]] = js.undefined
  
  /**
    * The maximum deviation for constructing a generalized geometry based on the input geometries.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-GeneralizeParameters.html#maxDeviation)
    */
  var maxDeviation: js.UndefOr[Double] = js.undefined
}
object GeneralizeParametersProperties {
  
  @scala.inline
  def apply(): GeneralizeParametersProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeneralizeParametersProperties]
  }
  
  @scala.inline
  implicit class GeneralizeParametersPropertiesMutableBuilder[Self <: GeneralizeParametersProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviationUnit(value: feet_ | kilometers_ | meters_ | miles_ | `nautical-miles` | yards): Self = StObject.set(x, "deviationUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviationUnitUndefined: Self = StObject.set(x, "deviationUnit", js.undefined)
    
    @scala.inline
    def setGeometries(value: js.Array[GeometryProperties]): Self = StObject.set(x, "geometries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeometriesUndefined: Self = StObject.set(x, "geometries", js.undefined)
    
    @scala.inline
    def setGeometriesVarargs(value: GeometryProperties*): Self = StObject.set(x, "geometries", js.Array(value :_*))
    
    @scala.inline
    def setMaxDeviation(value: Double): Self = StObject.set(x, "maxDeviation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDeviationUndefined: Self = StObject.set(x, "maxDeviation", js.undefined)
  }
}
