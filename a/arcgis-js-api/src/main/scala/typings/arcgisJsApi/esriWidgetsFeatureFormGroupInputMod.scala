package typings.arcgisJsApi

import typings.arcgisJsApi.esri.GroupInput
import typings.arcgisJsApi.esri.GroupInputProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsFeatureFormGroupInputMod {
  
  @JSImport("esri/widgets/FeatureForm/GroupInput", JSImport.Namespace)
  @js.native
  /**
  		 * This is a read-only support class that represents a group of field inputs.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-GroupInput.html)
  		 */
  open class ^ ()
    extends StObject
       with GroupInput {
    def this(properties: GroupInputProperties) = this()
    
    /**
    		 * The input's description.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-InputBase.html#description)
    		 */
    /* CompleteClass */
    override val description: String = js.native
  }
}
