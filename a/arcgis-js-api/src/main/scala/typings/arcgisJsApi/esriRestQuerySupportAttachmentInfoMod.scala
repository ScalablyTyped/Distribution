package typings.arcgisJsApi

import typings.arcgisJsApi.esri.AttachmentInfo
import typings.arcgisJsApi.esri.AttachmentInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriRestQuerySupportAttachmentInfoMod {
  
  @JSImport("esri/rest/query/support/AttachmentInfo", JSImport.Namespace)
  @js.native
  /**
  		 * The `AttachmentInfo` class returns information about attachments associated with a feature.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-query-support-AttachmentInfo.html)
  		 */
  open class ^ ()
    extends StObject
       with AttachmentInfo {
    def this(properties: AttachmentInfoProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/rest/query/support/AttachmentInfo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): AttachmentInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[AttachmentInfo]
}
