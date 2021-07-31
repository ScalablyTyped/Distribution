package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureTypeProperties extends StObject {
  
  /**
    * Domains associated with the feature type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureType.html#domains)
    */
  var domains: js.UndefOr[js.Any] = js.undefined
  
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
  
  @scala.inline
  def apply(): FeatureTypeProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureTypeProperties]
  }
  
  @scala.inline
  implicit class FeatureTypePropertiesMutableBuilder[Self <: FeatureTypeProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomains(value: js.Any): Self = StObject.set(x, "domains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainsUndefined: Self = StObject.set(x, "domains", js.undefined)
    
    @scala.inline
    def setId(value: Double | String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setTemplates(value: js.Array[FeatureTemplateProperties]): Self = StObject.set(x, "templates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplatesUndefined: Self = StObject.set(x, "templates", js.undefined)
    
    @scala.inline
    def setTemplatesVarargs(value: FeatureTemplateProperties*): Self = StObject.set(x, "templates", js.Array(value :_*))
  }
}
