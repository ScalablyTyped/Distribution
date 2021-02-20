package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GeometricEffectArrowType extends StObject
@JSGlobal("__esri.CIM.GeometricEffectArrowType")
@js.native
object GeometricEffectArrowType extends StObject {
  
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
