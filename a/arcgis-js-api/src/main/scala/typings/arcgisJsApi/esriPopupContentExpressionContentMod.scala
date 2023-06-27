package typings.arcgisJsApi

import typings.arcgisJsApi.esri.ExpressionContent
import typings.arcgisJsApi.esri.ExpressionContentProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriPopupContentExpressionContentMod {
  
  @JSImport("esri/popup/content/ExpressionContent", JSImport.Namespace)
  @js.native
  /**
  		 * An ExpressionContent element allows you to define a popup content element with an [Arcade](https://developers.arcgis.com/javascript/latest/arcade/) expression.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-ExpressionContent.html)
  		 */
  open class ^ ()
    extends StObject
       with ExpressionContent {
    def this(properties: ExpressionContentProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/popup/content/ExpressionContent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): ExpressionContent = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[ExpressionContent]
}
