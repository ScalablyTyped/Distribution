package typings.arcgisJsApi

import typings.arcgisJsApi.esri.AttachmentQuery
import typings.arcgisJsApi.esri.AttachmentQueryProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriRestSupportAttachmentQueryMod {
  
  @JSImport("esri/rest/support/AttachmentQuery", JSImport.Namespace)
  @js.native
  /**
  		 * This class defines parameters for executing queries for feature attachments from a [feature layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-AttachmentQuery.html)
  		 */
  open class ^ ()
    extends StObject
       with AttachmentQuery {
    def this(properties: AttachmentQueryProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/rest/support/AttachmentQuery", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): AttachmentQuery = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[AttachmentQuery]
}
