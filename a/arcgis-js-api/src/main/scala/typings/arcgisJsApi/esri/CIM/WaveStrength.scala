package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WaveStrength extends StObject
@JSGlobal("__esri.CIM.WaveStrength")
@js.native
object WaveStrength extends StObject {
  
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
