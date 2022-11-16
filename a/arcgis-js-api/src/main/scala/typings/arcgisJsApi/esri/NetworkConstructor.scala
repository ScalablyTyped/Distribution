package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkConstructor
  extends StObject
     with Instantiable0[Network]
     with Instantiable1[/* properties */ NetworkProperties, Network] {
  
  def fromJSON(json: Any): Network = js.native
  
  /**
    * Creates a new network instance from an ArcGIS Online or ArcGIS Enterprise [portal item](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-Network.html#fromPortalItem)
    */
  def fromPortalItem(params: NetworkFromPortalItemParams): js.Promise[UtilityNetwork] = js.native
}
