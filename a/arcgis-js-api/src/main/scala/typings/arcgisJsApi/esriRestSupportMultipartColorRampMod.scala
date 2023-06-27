package typings.arcgisJsApi

import typings.arcgisJsApi.esri.MultipartColorRamp
import typings.arcgisJsApi.esri.MultipartColorRampProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriRestSupportMultipartColorRampMod {
  
  @JSImport("esri/rest/support/MultipartColorRamp", JSImport.Namespace)
  @js.native
  /**
  		 * Creates a multipart color ramp to combine multiple continuous color ramps for use in raster renderers.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-MultipartColorRamp.html)
  		 */
  open class ^ ()
    extends StObject
       with MultipartColorRamp {
    def this(properties: MultipartColorRampProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/rest/support/MultipartColorRamp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): MultipartColorRamp = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[MultipartColorRamp]
}
