package typings.arcgisJsApi

import typings.arcgisJsApi.esri.ColorRamp
import typings.arcgisJsApi.esri.ColorRampProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriRestSupportColorRampMod {
  
  @JSImport("esri/rest/support/ColorRamp", JSImport.Namespace)
  @js.native
  /**
  		 * A ColorRamp object is used to specify a range of colors that are applied to a group of symbols or pixels.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ColorRamp.html)
  		 */
  open class ^ ()
    extends StObject
       with ColorRamp {
    def this(properties: ColorRampProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/rest/support/ColorRamp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): ColorRamp = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[ColorRamp]
}
