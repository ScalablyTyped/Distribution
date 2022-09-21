package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthoringInfoConstructor
  extends StObject
     with /**
  * Authoring information related to generating renderers and visual variables with the Smart Mapping methods.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html)
  */
Instantiable0[AuthoringInfo]
     with Instantiable1[/* properties */ AuthoringInfoProperties, AuthoringInfo] {
  
  def fromJSON(json: Any): AuthoringInfo = js.native
}
