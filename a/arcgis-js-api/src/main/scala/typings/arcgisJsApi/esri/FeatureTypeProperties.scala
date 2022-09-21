package typings.arcgisJsApi.esri

import typings.arcgisJsApi.HashMap
import typings.arcgisJsApi.anon.CodedValueDomainPropertie
import typings.arcgisJsApi.anon.RangeDomainPropertiestype
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureTypeProperties extends StObject {
  
  /**
    * Domains associated with the feature type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureType.html#domains)
    */
  var domains: js.UndefOr[
    HashMap[
      CodedValueDomainPropertie | RangeDomainPropertiestype | typings.arcgisJsApi.anon.InheritedDomainProperties
    ]
  ] = js.undefined
  
  /**
    * The feature type identifier.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureType.html#id)
    */
  var id: js.UndefOr[Double | String] = js.undefined
  
  /**
    * The feature type name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureType.html#name)
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Array of [feature templates](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureTemplate.html) associated with the feature type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureType.html#templates)
    */
  var templates: js.UndefOr[js.Array[FeatureTemplateProperties]] = js.undefined
}
object FeatureTypeProperties {
  
  inline def apply(): FeatureTypeProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureTypeProperties]
  }
  
  extension [Self <: FeatureTypeProperties](x: Self) {
    
    inline def setDomains(
      value: HashMap[
          CodedValueDomainPropertie | RangeDomainPropertiestype | typings.arcgisJsApi.anon.InheritedDomainProperties
        ]
    ): Self = StObject.set(x, "domains", value.asInstanceOf[js.Any])
    
    inline def setDomainsUndefined: Self = StObject.set(x, "domains", js.undefined)
    
    inline def setId(value: Double | String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTemplates(value: js.Array[FeatureTemplateProperties]): Self = StObject.set(x, "templates", value.asInstanceOf[js.Any])
    
    inline def setTemplatesUndefined: Self = StObject.set(x, "templates", js.undefined)
    
    inline def setTemplatesVarargs(value: FeatureTemplateProperties*): Self = StObject.set(x, "templates", js.Array(value*))
  }
}
