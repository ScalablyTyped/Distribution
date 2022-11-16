package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.StylePattern3DProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.StylePattern3D")
@js.native
/**
  * Renders polygons with predefined style pattern fills.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-patterns-StylePattern3D.html)
  */
open class StylePattern3D ()
  extends StObject
     with typings.arcgisJsApi.esri.StylePattern3D {
  def this(properties: StylePattern3DProperties) = this()
  
  /**
    * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object StylePattern3D {
  
  @JSGlobal("__esri.StylePattern3D")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.StylePattern3D = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.StylePattern3D]
}
