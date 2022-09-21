package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PortalItemConstructor
  extends StObject
     with /**
  * An item (a unit of content) in the Portal.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html)
  */
Instantiable0[PortalItem]
     with Instantiable1[/* properties */ PortalItemProperties, PortalItem] {
  
  def fromJSON(json: Any): PortalItem = js.native
}
