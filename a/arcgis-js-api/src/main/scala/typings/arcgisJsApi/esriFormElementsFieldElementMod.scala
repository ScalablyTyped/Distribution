package typings.arcgisJsApi

import typings.arcgisJsApi.esri.FieldElement
import typings.arcgisJsApi.esri.FieldElementProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriFormElementsFieldElementMod {
  
  @JSImport("esri/form/elements/FieldElement", JSImport.Namespace)
  @js.native
  /**
  		 * A `FieldElement` form element defines how a feature layer's [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html) participates in the [FeatureForm](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-FieldElement.html)
  		 */
  open class ^ ()
    extends StObject
       with FieldElement {
    def this(properties: FieldElementProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/form/elements/FieldElement", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): FieldElement = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[FieldElement]
}
