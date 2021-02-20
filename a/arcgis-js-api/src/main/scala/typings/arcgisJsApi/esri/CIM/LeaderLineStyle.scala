package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LeaderLineStyle extends StObject
@JSGlobal("__esri.CIM.LeaderLineStyle")
@js.native
object LeaderLineStyle extends StObject {
  
  /**
    * The line callout leader is a single line originating from the closest corner of the text box with the gap applied. If the callout has an accent bar it is connected to the closest point at the either top or bottom of the accent bar.
    */
  @js.native
  sealed trait Base extends LeaderLineStyle
  
  /**
    * The line callout leader is curved (counter-clockwise) from the anchor point to the closest corner of the text box with the gap applied. If the callout has an accent bar it is connected to the closest point at the either top or bottom of the accent bar.
    */
  @js.native
  sealed trait CircularCCW extends LeaderLineStyle
  
  /**
    * The line callout leader is curved (clockwise) from the anchor point to the closest corner of the text box with the gap applied. If the callout has an accent bar it is connected to the closest point at the either top or bottom of the accent bar.
    */
  @js.native
  sealed trait CircularCW extends LeaderLineStyle
  
  /**
    * The line callout leader is a 4-point line originating from the midpoint of the left or right side of the text box with the gap applied or the midpoint of the accent bar if the callout has one.
    */
  @js.native
  sealed trait FourPoint extends LeaderLineStyle
  
  /**
    * The line callout leader is a single line originating from the midpoint of the left or right side of the text box with the gap applied or from the midpoint of the accent bar if the callout has one.
    */
  @js.native
  sealed trait MidPoint extends LeaderLineStyle
  
  /**
    * The line callout leader is a 3-point line originating from the midpoint of the left or right side of the text box with the gap applied or the midpoint of the accent bar if the callout has one.
    */
  @js.native
  sealed trait ThreePoint extends LeaderLineStyle
  
  /**
    * The line callout draws a line that connects to the closest of the four corners of the text with the gap applied. If the callout has an accent bar it is connected to the closest point at either the top or bottom of the accent bar. Additionally, either and underline or an "overline" is drawn along the closest side (bottom or top) of the text.
    */
  @js.native
  sealed trait Underline extends LeaderLineStyle
}
