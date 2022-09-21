package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomainConstructor
  extends StObject
     with /**
  * Domains define constraints on a [layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html) [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Domain.html)
  */
Instantiable0[Domain]
     with Instantiable1[/* properties */ DomainProperties, Domain] {
  
  def fromJSON(json: Any): Domain = js.native
}
