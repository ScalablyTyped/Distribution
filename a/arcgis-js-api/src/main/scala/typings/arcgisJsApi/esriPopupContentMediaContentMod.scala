package typings.arcgisJsApi

import typings.arcgisJsApi.esri.MediaContent
import typings.arcgisJsApi.esri.MediaContentProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriPopupContentMediaContentMod {
  
  @JSImport("esri/popup/content/MediaContent", JSImport.Namespace)
  @js.native
  /**
    * A `MediaContent` popup element contains an individual or array of chart and/or image media elements to display within a popup's content.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-MediaContent.html)
    */
  open class ^ ()
    extends StObject
       with MediaContent {
    def this(properties: MediaContentProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/popup/content/MediaContent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): MediaContent = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[MediaContent]
}
