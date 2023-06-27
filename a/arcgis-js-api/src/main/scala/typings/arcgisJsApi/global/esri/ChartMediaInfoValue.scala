package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.ChartMediaInfoValueProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.ChartMediaInfoValue")
@js.native
/**
		 * The `ChartMediaInfoValue` class contains information for popups regarding how charts should be constructed.
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-support-ChartMediaInfoValue.html)
		 */
open class ChartMediaInfoValue ()
  extends StObject
     with typings.arcgisJsApi.esri.ChartMediaInfoValue {
  def this(properties: ChartMediaInfoValueProperties) = this()
  
  /**
  		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
  		 */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object ChartMediaInfoValue {
  
  @JSGlobal("__esri.ChartMediaInfoValue")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.ChartMediaInfoValue = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.ChartMediaInfoValue]
}
