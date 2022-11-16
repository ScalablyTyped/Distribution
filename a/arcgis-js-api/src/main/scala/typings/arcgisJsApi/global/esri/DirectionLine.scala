package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.DirectionLineProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.DirectionLine")
@js.native
/**
  * The DirectionLine represents polylines associated with individual direction items.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DirectionLine.html)
  */
open class DirectionLine ()
  extends StObject
     with typings.arcgisJsApi.esri.DirectionLine {
  def this(properties: DirectionLineProperties) = this()
  
  /**
    * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object DirectionLine {
  
  @JSGlobal("__esri.DirectionLine")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a [DirectionLine](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DirectionLine.html) from the parsed [Graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DirectionLine.html#fromGraphic)
    */
  inline def fromGraphic(): typings.arcgisJsApi.esri.DirectionLine = ^.asInstanceOf[js.Dynamic].applyDynamic("fromGraphic")().asInstanceOf[typings.arcgisJsApi.esri.DirectionLine]
  inline def fromGraphic(graphic: typings.arcgisJsApi.esri.Graphic): typings.arcgisJsApi.esri.DirectionLine = ^.asInstanceOf[js.Dynamic].applyDynamic("fromGraphic")(graphic.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.DirectionLine]
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.DirectionLine = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.DirectionLine]
}
