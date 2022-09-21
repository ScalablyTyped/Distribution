package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CodedValueDomainConstructor
  extends StObject
     with /**
  * Information about the coded values belonging to the domain.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-CodedValueDomain.html)
  */
Instantiable0[CodedValueDomain]
     with Instantiable1[/* properties */ CodedValueDomainProperties, CodedValueDomain] {
  
  def fromJSON(json: Any): CodedValueDomain = js.native
}
