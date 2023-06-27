package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.AttachmentsContentProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.AttachmentsContent")
@js.native
/**
		 * An `AttachmentsContent` popup element represents an attachment element associated with a feature.
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-AttachmentsContent.html)
		 */
open class AttachmentsContent ()
  extends StObject
     with typings.arcgisJsApi.esri.AttachmentsContent {
  def this(properties: AttachmentsContentProperties) = this()
  
  /**
  		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
  		 */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object AttachmentsContent {
  
  @JSGlobal("__esri.AttachmentsContent")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.AttachmentsContent = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.AttachmentsContent]
}
