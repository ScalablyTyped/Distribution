package typings.arcgisJsApi

import typings.arcgisJsApi.esri.SwitchInput
import typings.arcgisJsApi.esri.SwitchInputProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriFormElementsInputsSwitchInputMod {
  
  @JSImport("esri/form/elements/inputs/SwitchInput", JSImport.Namespace)
  @js.native
  /**
  		 * The `SwitchInput` class defines the desired user interface for a binary switch or toggle.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-inputs-SwitchInput.html)
  		 */
  open class ^ ()
    extends StObject
       with SwitchInput {
    def this(properties: SwitchInputProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/form/elements/inputs/SwitchInput", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): SwitchInput = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[SwitchInput]
}
