package typings.amapJsApiScale

import typings.amapJsApiScale.AMap.Scale.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object amapJsApiScaleStrings {
  @js.native
  sealed trait LB extends Position
  
  @js.native
  sealed trait LT extends Position
  
  @js.native
  sealed trait RB extends Position
  
  @js.native
  sealed trait RT extends Position
  
  @js.native
  sealed trait hide extends js.Object
  
  @js.native
  sealed trait show extends js.Object
  
  @scala.inline
  def LB: LB = "LB".asInstanceOf[LB]
  @scala.inline
  def LT: LT = "LT".asInstanceOf[LT]
  @scala.inline
  def RB: RB = "RB".asInstanceOf[RB]
  @scala.inline
  def RT: RT = "RT".asInstanceOf[RT]
  @scala.inline
  def hide: hide = "hide".asInstanceOf[hide]
  @scala.inline
  def show: show = "show".asInstanceOf[show]
}

