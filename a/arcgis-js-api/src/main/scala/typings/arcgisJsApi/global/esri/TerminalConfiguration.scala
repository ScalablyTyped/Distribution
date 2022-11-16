package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.TerminalConfigurationProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.TerminalConfiguration")
@js.native
/**
  * A device feature can be assigned a terminal configuration which could have one or more terminals.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-TerminalConfiguration.html)
  */
open class TerminalConfiguration ()
  extends StObject
     with typings.arcgisJsApi.esri.TerminalConfiguration {
  def this(properties: TerminalConfigurationProperties) = this()
  
  /**
    * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object TerminalConfiguration {
  
  @JSGlobal("__esri.TerminalConfiguration")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.TerminalConfiguration = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.TerminalConfiguration]
}
