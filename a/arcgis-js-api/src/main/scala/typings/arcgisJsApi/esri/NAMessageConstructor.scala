package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NAMessageConstructor
  extends StObject
     with /**
  * Represents a message generated during the execution of a network analyst task.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-NAMessage.html)
  */
Instantiable0[NAMessage]
     with Instantiable1[/* properties */ NAMessageProperties, NAMessage] {
  
  def fromJSON(json: Any): NAMessage = js.native
}
