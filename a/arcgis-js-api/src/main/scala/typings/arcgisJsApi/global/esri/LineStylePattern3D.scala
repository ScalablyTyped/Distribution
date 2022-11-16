package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.LineStylePattern3DProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.LineStylePattern3D")
@js.native
/**
  * Renders lines with predefined style patterns.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-patterns-LineStylePattern3D.html)
  */
open class LineStylePattern3D ()
  extends StObject
     with typings.arcgisJsApi.esri.LineStylePattern3D {
  def this(properties: LineStylePattern3DProperties) = this()
  
  /**
    * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object LineStylePattern3D {
  
  @JSGlobal("__esri.LineStylePattern3D")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.LineStylePattern3D = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.LineStylePattern3D]
}
