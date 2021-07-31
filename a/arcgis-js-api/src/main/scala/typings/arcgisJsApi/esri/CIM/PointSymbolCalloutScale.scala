package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PointSymbolCalloutScale extends StObject
@JSGlobal("__esri.CIM.PointSymbolCalloutScale")
@js.native
object PointSymbolCalloutScale extends StObject {
  
  /**
    * Non-uniform scaling.
    */
  @js.native
  sealed trait DifNonuniform
    extends StObject
       with PointSymbolCalloutScale
  
  /**
    * Uniform scaling.
    */
  @js.native
  sealed trait DifUniform
    extends StObject
       with PointSymbolCalloutScale
  
  /**
    * No scaling.
    */
  @js.native
  sealed trait None
    extends StObject
       with PointSymbolCalloutScale
  
  /**
    * Non-uniform scaling.
    */
  @js.native
  sealed trait PropNonuniform
    extends StObject
       with PointSymbolCalloutScale
  
  /**
    * Uniform scaling.
    */
  @js.native
  sealed trait PropUniform
    extends StObject
       with PointSymbolCalloutScale
}
