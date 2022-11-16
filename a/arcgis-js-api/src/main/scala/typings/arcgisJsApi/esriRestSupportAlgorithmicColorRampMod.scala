package typings.arcgisJsApi

import typings.arcgisJsApi.esri.AlgorithmicColorRamp
import typings.arcgisJsApi.esri.AlgorithmicColorRampProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriRestSupportAlgorithmicColorRampMod {
  
  @JSImport("esri/rest/support/AlgorithmicColorRamp", JSImport.Namespace)
  @js.native
  /**
    * Creates a color ramp for use in a raster renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-AlgorithmicColorRamp.html)
    */
  open class ^ ()
    extends StObject
       with AlgorithmicColorRamp {
    def this(properties: AlgorithmicColorRampProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/rest/support/AlgorithmicColorRamp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): AlgorithmicColorRamp = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[AlgorithmicColorRamp]
}
