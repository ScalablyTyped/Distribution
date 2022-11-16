package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.NetworkUrlProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.NetworkUrl")
@js.native
/**
  * An input type for Route, Closest Facility, and Service Area solvers.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-NetworkUrl.html)
  */
open class NetworkUrl ()
  extends StObject
     with typings.arcgisJsApi.esri.NetworkUrl {
  def this(properties: NetworkUrlProperties) = this()
  
  /**
    * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object NetworkUrl {
  
  @JSGlobal("__esri.NetworkUrl")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.NetworkUrl = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.NetworkUrl]
}
