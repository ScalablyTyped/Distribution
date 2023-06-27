package typings.arcgisJsApi

import typings.arcgisJsApi.esri.FormTemplate
import typings.arcgisJsApi.esri.FormTemplateProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriFormFormTemplateMod {
  
  @JSImport("esri/form/FormTemplate", JSImport.Namespace)
  @js.native
  /**
  		 * A FormTemplate formats and defines the content of a [FeatureForm](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html) for a specific [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html) or [Graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-FormTemplate.html)
  		 */
  open class ^ ()
    extends StObject
       with FormTemplate {
    def this(properties: FormTemplateProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/form/FormTemplate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): FormTemplate = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[FormTemplate]
}
