package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.FenceGeotriggerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.FenceGeotrigger")
@js.native
/**
		 * A condition which monitors the dynamic elements of the geotrigger feed for enter/exit against the fences defined by the Fence Parameters.
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-geotriggersInfo-FenceGeotrigger.html)
		 */
open class FenceGeotrigger ()
  extends StObject
     with typings.arcgisJsApi.esri.FenceGeotrigger {
  def this(properties: FenceGeotriggerProperties) = this()
  
  /**
  		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
  		 */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object FenceGeotrigger {
  
  @JSGlobal("__esri.FenceGeotrigger")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.FenceGeotrigger = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.FenceGeotrigger]
}
