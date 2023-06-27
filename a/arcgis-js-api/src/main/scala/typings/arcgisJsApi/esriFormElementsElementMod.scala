package typings.arcgisJsApi

import typings.arcgisJsApi.esri.Element
import typings.arcgisJsApi.esri.ElementProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriFormElementsElementMod {
  
  @JSImport("esri/form/elements/Element", JSImport.Namespace)
  @js.native
  /**
  		 * Form elements define what should display within the [FormTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-FormTemplate.html) elements.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-Element.html)
  		 */
  open class ^ ()
    extends StObject
       with Element {
    def this(properties: ElementProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/form/elements/Element", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[Element]
}
