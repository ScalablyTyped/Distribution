package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TerminalConfigurationConstructor
  extends StObject
     with /**
  * A device feature can be assigned a terminal configuration which could have one or more terminals.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-TerminalConfiguration.html)
  */
Instantiable0[TerminalConfiguration]
     with Instantiable1[/* properties */ TerminalConfigurationProperties, TerminalConfiguration] {
  
  def fromJSON(json: Any): TerminalConfiguration = js.native
}
