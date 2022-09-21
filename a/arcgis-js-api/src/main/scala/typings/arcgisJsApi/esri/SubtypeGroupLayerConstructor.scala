package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubtypeGroupLayerConstructor
  extends StObject
     with /**
  * The SubtypeGroupLayer is a single layer that automatically creates a [SubtypeSublayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SubtypeSublayer.html) for each subtype in its corresponding [feature service](https://enterprise.arcgis.com/en/server/latest/publish-services/windows/what-is-a-feature-service-.htm).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SubtypeGroupLayer.html)
  */
Instantiable0[SubtypeGroupLayer]
     with Instantiable1[/* properties */ SubtypeGroupLayerProperties, SubtypeGroupLayer] {
  
  def fromJSON(json: Any): SubtypeGroupLayer = js.native
}
