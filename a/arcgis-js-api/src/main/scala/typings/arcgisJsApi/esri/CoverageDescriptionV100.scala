package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`1Dot0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoverageDescriptionV100 extends StObject {
  
  /**
    * Coverage description.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV100)
    */
  var description: String
  
  /**
    * Describes the spatial and temporal domain of a coverage.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV100)
    */
  var domainSet: CoverageDescriptionV100DomainSet
  
  /**
    * Coverage label.
    *
    * [Read more...](global.html)
    */
  var label: String
  
  /**
    * Spatial extent of the coverage.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV100)
    */
  var lonLatEnvelope: Extent
  
  /**
    * Coverage name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV100)
    */
  var name: String
  
  /**
    * Defines the properties (categories, measures, or values) assigned to each location in the domain.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV100)
    */
  var rangeSet: CoverageDescriptionV100RangeSet
  
  /**
    * Coordinate reference systems supported by a coverage.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV100)
    */
  var supportedCRSs: CoverageDescriptionV100SupportedCRSs
  
  /**
    * Formats supported by a coverage.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV100)
    */
  var supportedFormats: js.Array[String]
  
  /**
    * Interpolations supported by a coverage.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV100)
    */
  var supportedInterpolations: js.Array[String]
  
  /**
    * Coverage version.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV100)
    */
  var version: `1Dot0`
}
object CoverageDescriptionV100 {
  
  inline def apply(
    description: String,
    domainSet: CoverageDescriptionV100DomainSet,
    label: String,
    lonLatEnvelope: Extent,
    name: String,
    rangeSet: CoverageDescriptionV100RangeSet,
    supportedCRSs: CoverageDescriptionV100SupportedCRSs,
    supportedFormats: js.Array[String],
    supportedInterpolations: js.Array[String]
  ): CoverageDescriptionV100 = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], domainSet = domainSet.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], lonLatEnvelope = lonLatEnvelope.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], rangeSet = rangeSet.asInstanceOf[js.Any], supportedCRSs = supportedCRSs.asInstanceOf[js.Any], supportedFormats = supportedFormats.asInstanceOf[js.Any], supportedInterpolations = supportedInterpolations.asInstanceOf[js.Any], version = "1.0")
    __obj.asInstanceOf[CoverageDescriptionV100]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CoverageDescriptionV100] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDomainSet(value: CoverageDescriptionV100DomainSet): Self = StObject.set(x, "domainSet", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLonLatEnvelope(value: Extent): Self = StObject.set(x, "lonLatEnvelope", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRangeSet(value: CoverageDescriptionV100RangeSet): Self = StObject.set(x, "rangeSet", value.asInstanceOf[js.Any])
    
    inline def setSupportedCRSs(value: CoverageDescriptionV100SupportedCRSs): Self = StObject.set(x, "supportedCRSs", value.asInstanceOf[js.Any])
    
    inline def setSupportedFormats(value: js.Array[String]): Self = StObject.set(x, "supportedFormats", value.asInstanceOf[js.Any])
    
    inline def setSupportedFormatsVarargs(value: String*): Self = StObject.set(x, "supportedFormats", js.Array(value*))
    
    inline def setSupportedInterpolations(value: js.Array[String]): Self = StObject.set(x, "supportedInterpolations", value.asInstanceOf[js.Any])
    
    inline def setSupportedInterpolationsVarargs(value: String*): Self = StObject.set(x, "supportedInterpolations", js.Array(value*))
    
    inline def setVersion(value: `1Dot0`): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
