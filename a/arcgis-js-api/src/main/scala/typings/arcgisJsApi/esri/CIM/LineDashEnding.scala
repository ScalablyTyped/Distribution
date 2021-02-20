package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LineDashEnding extends StObject
@JSGlobal("__esri.CIM.LineDashEnding")
@js.native
object LineDashEnding extends StObject {
  
  /**
    * Custom - the pattern is fit to the length of the feature by adjusting the gaps slightly.
    */
  @js.native
  sealed trait Custom extends LineDashEnding
  
  /**
    * Full Gap - a space equal to the gap value will be placed on either side of control points.
    */
  @js.native
  sealed trait FullGap extends LineDashEnding
  
  /**
    * Full Pattern - a full dash will be placed on either side of control points.
    */
  @js.native
  sealed trait FullPattern extends LineDashEnding
  
  /**
    * Half Gap - a space equal to the half the gap value will be placed on either side of control points.
    */
  @js.native
  sealed trait HalfGap extends LineDashEnding
  
  /**
    * Half Pattern - a half dash will be placed on either side of control points.
    */
  @js.native
  sealed trait HalfPattern extends LineDashEnding
  
  /**
    * No Constraint - no constraint is applied to how the dash is placed.
    */
  @js.native
  sealed trait NoConstraint extends LineDashEnding
}
