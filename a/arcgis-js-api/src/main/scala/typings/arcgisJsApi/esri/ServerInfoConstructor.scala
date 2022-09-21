package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerInfoConstructor
  extends StObject
     with /**
  * This class contains information about an ArcGIS Server and its token endpoint.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-ServerInfo.html)
  */
Instantiable0[ServerInfo]
     with Instantiable1[/* properties */ ServerInfoProperties, ServerInfo] {
  
  def fromJSON(json: Any): ServerInfo = js.native
}
