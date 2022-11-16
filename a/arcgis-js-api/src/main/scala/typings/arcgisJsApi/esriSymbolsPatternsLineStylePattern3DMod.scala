package typings.arcgisJsApi

import typings.arcgisJsApi.esri.LineStylePattern3D
import typings.arcgisJsApi.esri.LineStylePattern3DProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriSymbolsPatternsLineStylePattern3DMod {
  
  @JSImport("esri/symbols/patterns/LineStylePattern3D", JSImport.Namespace)
  @js.native
  /**
    * Renders lines with predefined style patterns.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-patterns-LineStylePattern3D.html)
    */
  open class ^ ()
    extends StObject
       with LineStylePattern3D {
    def this(properties: LineStylePattern3DProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/symbols/patterns/LineStylePattern3D", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): LineStylePattern3D = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[LineStylePattern3D]
}
