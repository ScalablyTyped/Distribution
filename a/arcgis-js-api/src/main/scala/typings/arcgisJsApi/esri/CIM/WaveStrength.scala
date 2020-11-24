package typings.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WaveStrength extends js.Object
@JSGlobal("__esri.CIM.WaveStrength")
@js.native
object WaveStrength extends js.Object {
  
  /**
    * Calm glassy water with no waves.
    */
  @js.native
  sealed trait Calm extends WaveStrength
  
  /**
    * Moderately wavy water.
    */
  @js.native
  sealed trait Moderate extends WaveStrength
  
  /**
    * Rippled water.
    */
  @js.native
  sealed trait Rippled extends WaveStrength
  
  /**
    * Slightly wavy water.
    */
  @js.native
  sealed trait Slight extends WaveStrength
}
