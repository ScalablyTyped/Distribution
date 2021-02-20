package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PlacementRandomlyAlongLineRandomization extends StObject
@JSGlobal("__esri.CIM.PlacementRandomlyAlongLineRandomization")
@js.native
object PlacementRandomlyAlongLineRandomization extends StObject {
  
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
