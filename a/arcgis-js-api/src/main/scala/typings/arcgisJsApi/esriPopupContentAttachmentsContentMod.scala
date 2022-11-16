package typings.arcgisJsApi

import typings.arcgisJsApi.esri.AttachmentsContent
import typings.arcgisJsApi.esri.AttachmentsContentProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriPopupContentAttachmentsContentMod {
  
  @JSImport("esri/popup/content/AttachmentsContent", JSImport.Namespace)
  @js.native
  /**
    * An `AttachmentsContent` popup element represents an attachment element associated with a feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-AttachmentsContent.html)
    */
  open class ^ ()
    extends StObject
       with AttachmentsContent {
    def this(properties: AttachmentsContentProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/popup/content/AttachmentsContent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): AttachmentsContent = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[AttachmentsContent]
}
