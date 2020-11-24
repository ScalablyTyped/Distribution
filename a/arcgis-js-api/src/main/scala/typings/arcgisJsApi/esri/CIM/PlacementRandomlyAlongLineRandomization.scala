package typings.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PlacementRandomlyAlongLineRandomization extends js.Object
@JSGlobal("__esri.CIM.PlacementRandomlyAlongLineRandomization")
@js.native
object PlacementRandomlyAlongLineRandomization extends js.Object {
  
  /**
    * A high amount of randomness is applied
    */
  @js.native
  sealed trait High extends PlacementRandomlyAlongLineRandomization
  
  /**
    * A low amount of randomness is applied
    */
  @js.native
  sealed trait Low extends PlacementRandomlyAlongLineRandomization
  
  /**
    * A medium amount of randomness is applied
    */
  @js.native
  sealed trait Medium extends PlacementRandomlyAlongLineRandomization
}
