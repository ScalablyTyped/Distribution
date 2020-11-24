package typings.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PointSymbolCalloutScale extends js.Object
@JSGlobal("__esri.CIM.PointSymbolCalloutScale")
@js.native
object PointSymbolCalloutScale extends js.Object {
  
  /**
    * Non-uniform scaling.
    */
  @js.native
  sealed trait DifNonuniform extends PointSymbolCalloutScale
  
  /**
    * Uniform scaling.
    */
  @js.native
  sealed trait DifUniform extends PointSymbolCalloutScale
  
  /**
    * No scaling.
    */
  @js.native
  sealed trait None extends PointSymbolCalloutScale
  
  /**
    * Non-uniform scaling.
    */
  @js.native
  sealed trait PropNonuniform extends PointSymbolCalloutScale
  
  /**
    * Uniform scaling.
    */
  @js.native
  sealed trait PropUniform extends PointSymbolCalloutScale
}
