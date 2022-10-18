package typings.atlaskitMotion

import typings.atlaskitMotion.distTypesEnteringTypesMod.Direction
import typings.atlaskitMotion.distTypesEnteringTypesMod.Distance
import typings.atlaskitMotion.distTypesEnteringTypesMod.Fade
import typings.atlaskitMotion.distTypesEnteringTypesMod.Transition
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
