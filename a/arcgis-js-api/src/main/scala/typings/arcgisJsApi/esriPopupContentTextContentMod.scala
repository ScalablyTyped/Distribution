package typings.arcgisJsApi

import typings.arcgisJsApi.esri.TextContent
import typings.arcgisJsApi.esri.TextContentProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriPopupContentTextContentMod {
  
  @JSImport("esri/popup/content/TextContent", JSImport.Namespace)
  @js.native
  /**
  		 * A `TextContent` popup element is used to define descriptive text as an element within a [PopupTemplate's](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) content.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-TextContent.html)
  		 */
  open class ^ ()
    extends StObject
       with TextContent {
    def this(properties: TextContentProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/popup/content/TextContent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): TextContent = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[TextContent]
}
