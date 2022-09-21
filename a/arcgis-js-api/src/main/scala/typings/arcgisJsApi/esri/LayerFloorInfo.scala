package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LayerFloorInfo
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * The field name derived from a floor-aware layer and used to filter features by floor level.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LayerFloorInfo.html#floorField)
    */
  var floorField: String = js.native
}
