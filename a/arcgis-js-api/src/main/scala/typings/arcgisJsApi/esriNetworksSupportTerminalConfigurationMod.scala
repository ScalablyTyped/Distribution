package typings.arcgisJsApi

import typings.arcgisJsApi.esri.TerminalConfiguration
import typings.arcgisJsApi.esri.TerminalConfigurationProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriNetworksSupportTerminalConfigurationMod {
  
  @JSImport("esri/networks/support/TerminalConfiguration", JSImport.Namespace)
  @js.native
  /**
    * A device feature can be assigned a terminal configuration which could have one or more terminals.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-TerminalConfiguration.html)
    */
  open class ^ ()
    extends StObject
       with TerminalConfiguration {
    def this(properties: TerminalConfigurationProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/networks/support/TerminalConfiguration", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): TerminalConfiguration = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[TerminalConfiguration]
}
