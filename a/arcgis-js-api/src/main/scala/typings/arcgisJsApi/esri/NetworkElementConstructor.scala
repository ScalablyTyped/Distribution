package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkElementConstructor
  extends StObject
     with /**
  * The network element is a representation of how the network topology defines its graph.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-NetworkElement.html)
  */
Instantiable0[NetworkElement]
     with Instantiable1[/* properties */ NetworkElementProperties, NetworkElement] {
  
  def fromJSON(json: Any): NetworkElement = js.native
}
