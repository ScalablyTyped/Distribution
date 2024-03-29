package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.DirectionPointProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.DirectionPoint")
@js.native
/**
		 * The DirectionPoint represents direction items as points with various display information.
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DirectionPoint.html)
		 */
open class DirectionPoint ()
  extends StObject
     with typings.arcgisJsApi.esri.DirectionPoint {
  def this(properties: DirectionPointProperties) = this()
  
  /**
  		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
  		 */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object DirectionPoint {
  
  @JSGlobal("__esri.DirectionPoint")
  @js.native
  val ^ : js.Any = js.native
  
  /**
  		 * Creates a [DirectionPoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DirectionPoint.html) from the parsed [Graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DirectionPoint.html#fromGraphic)
  		 */
  inline def fromGraphic(): typings.arcgisJsApi.esri.DirectionPoint = ^.asInstanceOf[js.Dynamic].applyDynamic("fromGraphic")().asInstanceOf[typings.arcgisJsApi.esri.DirectionPoint]
  inline def fromGraphic(graphic: typings.arcgisJsApi.esri.Graphic): typings.arcgisJsApi.esri.DirectionPoint = ^.asInstanceOf[js.Dynamic].applyDynamic("fromGraphic")(graphic.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.DirectionPoint]
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.DirectionPoint = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.DirectionPoint]
}
