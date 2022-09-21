package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RelationshipQueryConstructor
  extends StObject
     with /**
  * This class defines parameters for executing queries for related records from a layer.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RelationshipQuery.html)
  */
Instantiable0[RelationshipQuery]
     with Instantiable1[/* properties */ RelationshipQueryProperties, RelationshipQuery] {
  
  def fromJSON(json: Any): RelationshipQuery = js.native
}
