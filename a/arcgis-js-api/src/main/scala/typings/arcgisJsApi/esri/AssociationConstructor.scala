package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociationConstructor
  extends StObject
     with /**
  * The utility network associations model connectivity, containment and structure relations between assets.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-Association.html)
  */
Instantiable0[Association]
     with Instantiable1[/* properties */ AssociationProperties, Association] {
  
  def fromJSON(json: Any): Association = js.native
}
