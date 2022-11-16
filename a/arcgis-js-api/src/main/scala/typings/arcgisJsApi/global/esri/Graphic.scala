package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.GraphicProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.Graphic")
@js.native
/**
  * A Graphic is a vector representation of real world geographic phenomena.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html)
  */
open class Graphic ()
  extends StObject
     with typings.arcgisJsApi.esri.Graphic {
  def this(properties: GraphicProperties) = this()
  
  /**
    * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object Graphic {
  
  @JSGlobal("__esri.Graphic")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.Graphic = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.Graphic]
}
