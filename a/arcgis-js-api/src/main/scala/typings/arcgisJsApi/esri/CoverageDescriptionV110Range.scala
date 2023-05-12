package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoverageDescriptionV110Range extends StObject {
  
  /**
    * Range abstract.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV110)
    */
  var `abstract`: js.UndefOr[String] = js.undefined
  
  /**
    * Provides additional information on compound valued range.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV110)
    */
  var axis: CoverageDescriptionV110RangeAxis
  
  /**
    * Range definition.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV110)
    */
  var definition: String
  
  /**
    * Range description.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV110)
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Range identifier.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV110)
    */
  var identifier: String
  
  /**
    * Null values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV110)
    */
  var nullValues: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * Interpolations supported by the range.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV110)
    */
  var supportedInterpolations: js.Array[String]
  
  /**
    * Range title.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV110)
    */
  var title: js.UndefOr[String] = js.undefined
}
object CoverageDescriptionV110Range {
  
  inline def apply(
    axis: CoverageDescriptionV110RangeAxis,
    definition: String,
    identifier: String,
    supportedInterpolations: js.Array[String]
  ): CoverageDescriptionV110Range = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], definition = definition.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], supportedInterpolations = supportedInterpolations.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverageDescriptionV110Range]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CoverageDescriptionV110Range] (val x: Self) extends AnyVal {
    
    inline def setAbstract(value: String): Self = StObject.set(x, "abstract", value.asInstanceOf[js.Any])
    
    inline def setAbstractUndefined: Self = StObject.set(x, "abstract", js.undefined)
    
    inline def setAxis(value: CoverageDescriptionV110RangeAxis): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    inline def setDefinition(value: String): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setNullValues(value: js.Array[Double]): Self = StObject.set(x, "nullValues", value.asInstanceOf[js.Any])
    
    inline def setNullValuesUndefined: Self = StObject.set(x, "nullValues", js.undefined)
    
    inline def setNullValuesVarargs(value: Double*): Self = StObject.set(x, "nullValues", js.Array(value*))
    
    inline def setSupportedInterpolations(value: js.Array[String]): Self = StObject.set(x, "supportedInterpolations", value.asInstanceOf[js.Any])
    
    inline def setSupportedInterpolationsVarargs(value: String*): Self = StObject.set(x, "supportedInterpolations", js.Array(value*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
