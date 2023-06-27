package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.AttachmentInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.AttachmentInfo")
@js.native
/**
		 * The `AttachmentInfo` class returns information about attachments associated with a feature.
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-query-support-AttachmentInfo.html)
		 */
open class AttachmentInfo ()
  extends StObject
     with typings.arcgisJsApi.esri.AttachmentInfo {
  def this(properties: AttachmentInfoProperties) = this()
  
  /**
  		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
  		 */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object AttachmentInfo {
  
  @JSGlobal("__esri.AttachmentInfo")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.AttachmentInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.AttachmentInfo]
}
