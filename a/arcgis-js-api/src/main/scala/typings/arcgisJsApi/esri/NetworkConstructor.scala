package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkConstructor
  extends StObject
     with /**
  * Class defining high level properties that describes utility networks and trace networks.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-Network.html)
  */
Instantiable0[Network]
     with Instantiable1[/* properties */ NetworkProperties, Network] {
  
  def fromJSON(json: Any): Network = js.native
}
