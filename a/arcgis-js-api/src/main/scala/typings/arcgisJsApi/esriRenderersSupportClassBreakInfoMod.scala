package typings.arcgisJsApi

import typings.arcgisJsApi.esri.ClassBreakInfo
import typings.arcgisJsApi.esri.ClassBreakInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriRenderersSupportClassBreakInfoMod {
  
  @JSImport("esri/renderers/support/ClassBreakInfo", JSImport.Namespace)
  @js.native
  /**
  		 * Defines a class break for a [ClassBreaksRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-ClassBreakInfo.html)
  		 */
  open class ^ ()
    extends StObject
       with ClassBreakInfo {
    def this(properties: ClassBreakInfoProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/renderers/support/ClassBreakInfo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): ClassBreakInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[ClassBreakInfo]
}
