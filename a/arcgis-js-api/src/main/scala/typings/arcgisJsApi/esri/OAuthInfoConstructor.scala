package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OAuthInfoConstructor
  extends StObject
     with /**
  * This class contains information about an OAuth 2.0 configuration.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-OAuthInfo.html)
  */
Instantiable0[OAuthInfo]
     with Instantiable1[/* properties */ OAuthInfoProperties, OAuthInfo] {
  
  def fromJSON(json: Any): OAuthInfo = js.native
}
