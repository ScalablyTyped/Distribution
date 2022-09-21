package typings.atlaskitMotion

import typings.atlaskitMotion.typesMod.Direction
import typings.atlaskitMotion.typesMod.Distance
import typings.atlaskitMotion.typesMod.Fade
import typings.atlaskitMotion.typesMod.Transition
import typings.atlaskitMotion.utilsCurvesMod.AnimationCurve
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object atlaskitMotionStrings {
  
  @js.native
  sealed trait bottom
    extends StObject
       with Direction
  inline def bottom: bottom = "bottom".asInstanceOf[bottom]
  
  @js.native
  sealed trait constant
    extends StObject
       with Distance
  inline def constant: constant = "constant".asInstanceOf[constant]
  
  @js.native
  sealed trait `cubic-bezierLeftparenthesis0Dot15Comma1Comma0Dot3Comma1Rightparenthesis`
    extends StObject
       with AnimationCurve
  inline def `cubic-bezierLeftparenthesis0Dot15Comma1Comma0Dot3Comma1Rightparenthesis`: `cubic-bezierLeftparenthesis0Dot15Comma1Comma0Dot3Comma1Rightparenthesis` = "cubic-bezier(0.15,1,0.3,1)".asInstanceOf[`cubic-bezierLeftparenthesis0Dot15Comma1Comma0Dot3Comma1Rightparenthesis`]
  
  @js.native
  sealed trait `cubic-bezierLeftparenthesis0Dot2Comma0Comma0Comma1Rightparenthesis`
    extends StObject
       with AnimationCurve
  inline def `cubic-bezierLeftparenthesis0Dot2Comma0Comma0Comma1Rightparenthesis`: `cubic-bezierLeftparenthesis0Dot2Comma0Comma0Comma1Rightparenthesis` = "cubic-bezier(0.2,0,0,1)".asInstanceOf[`cubic-bezierLeftparenthesis0Dot2Comma0Comma0Comma1Rightparenthesis`]
  
  @js.native
  sealed trait `cubic-bezierLeftparenthesis0Dot8Comma0Comma0Comma0Dot8Rightparenthesis`
    extends StObject
       with AnimationCurve
  inline def `cubic-bezierLeftparenthesis0Dot8Comma0Comma0Comma0Dot8Rightparenthesis`: `cubic-bezierLeftparenthesis0Dot8Comma0Comma0Comma0Dot8Rightparenthesis` = "cubic-bezier(0.8,0,0,0.8)".asInstanceOf[`cubic-bezierLeftparenthesis0Dot8Comma0Comma0Comma0Dot8Rightparenthesis`]
  
  @js.native
  sealed trait entering
    extends StObject
       with Transition
  inline def entering: entering = "entering".asInstanceOf[entering]
  
  @js.native
  sealed trait exiting
    extends StObject
       with Transition
  inline def exiting: exiting = "exiting".asInstanceOf[exiting]
  
  @js.native
  sealed trait in
    extends StObject
       with Fade
  inline def in: in = "in".asInstanceOf[in]
  
  @js.native
  sealed trait inout
    extends StObject
       with Fade
  inline def inout: inout = "inout".asInstanceOf[inout]
  
  @js.native
  sealed trait left
    extends StObject
       with Direction
  inline def left: left = "left".asInstanceOf[left]
  
  @js.native
  sealed trait `next-effect` extends StObject
  inline def `next-effect`: `next-effect` = "next-effect".asInstanceOf[`next-effect`]
  
  @js.native
  sealed trait none
    extends StObject
       with Fade
  inline def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait out
    extends StObject
       with Fade
  inline def out: out = "out".asInstanceOf[out]
  
  @js.native
  sealed trait proportional
    extends StObject
       with Distance
  inline def proportional: proportional = "proportional".asInstanceOf[proportional]
  
  @js.native
  sealed trait responsive extends StObject
  inline def responsive: responsive = "responsive".asInstanceOf[responsive]
  
  @js.native
  sealed trait right
    extends StObject
       with Direction
  inline def right: right = "right".asInstanceOf[right]
  
  @js.native
  sealed trait top
    extends StObject
       with Direction
  inline def top: top = "top".asInstanceOf[top]
  
  @js.native
  sealed trait unmount extends StObject
  inline def unmount: unmount = "unmount".asInstanceOf[unmount]
}
