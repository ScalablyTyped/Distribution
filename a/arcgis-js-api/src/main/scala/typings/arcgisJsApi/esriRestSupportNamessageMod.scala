package typings.arcgisJsApi

import typings.arcgisJsApi.esri.NAMessage
import typings.arcgisJsApi.esri.NAMessageProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriRestSupportNamessageMod {
  
  @JSImport("esri/rest/support/NAMessage", JSImport.Namespace)
  @js.native
  /**
  		 * Represents a message generated during the execution of a network analyst task.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-NAMessage.html)
  		 */
  open class ^ ()
    extends StObject
       with NAMessage {
    def this(properties: NAMessageProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/rest/support/NAMessage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): NAMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[NAMessage]
}
