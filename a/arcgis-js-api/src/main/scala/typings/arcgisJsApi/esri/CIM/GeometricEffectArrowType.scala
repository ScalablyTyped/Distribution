package typings.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GeometricEffectArrowType extends js.Object
@JSGlobal("__esri.CIM.GeometricEffectArrowType")
@js.native
object GeometricEffectArrowType extends js.Object {
  
  /**
    * A block arrow.
    */
  @js.native
  sealed trait Block extends GeometricEffectArrowType
  
  /**
    * A crossed arrow.
    */
  @js.native
  sealed trait Crossed extends GeometricEffectArrowType
  
  /**
    * An open ended arrow.
    */
  @js.native
  sealed trait OpenEnded extends GeometricEffectArrowType
}
