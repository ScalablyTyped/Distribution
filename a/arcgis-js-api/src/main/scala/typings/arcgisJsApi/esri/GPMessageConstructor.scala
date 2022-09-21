package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GPMessageConstructor
  extends StObject
     with /**
  * Represents a message generated during the execution of a module:esri/rest/Geoprocessor method.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-GPMessage.html)
  */
Instantiable0[GPMessage]
     with Instantiable1[/* properties */ GPMessageProperties, GPMessage] {
  
  def fromJSON(json: Any): GPMessage = js.native
}
