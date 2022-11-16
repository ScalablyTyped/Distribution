package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.HeightModelInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.HeightModelInfo")
@js.native
/**
  * The height model info defines the characteristics of a vertical coordinate system.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-HeightModelInfo.html)
  */
open class HeightModelInfo ()
  extends StObject
     with typings.arcgisJsApi.esri.HeightModelInfo {
  def this(properties: HeightModelInfoProperties) = this()
  
  /**
    * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object HeightModelInfo {
  
  @JSGlobal("__esri.HeightModelInfo")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.HeightModelInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.HeightModelInfo]
}
