package typings.ansiDashColors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ansiDashColorsStrings {
  @js.native
  sealed trait bg extends js.Object
  
  @js.native
  sealed trait bgBright extends js.Object
  
  @js.native
  sealed trait bright extends js.Object
  
  @js.native
  sealed trait color extends js.Object
  
  @js.native
  sealed trait modifier extends js.Object
  
  @scala.inline
  def bg: bg = "bg".asInstanceOf[bg]
  @scala.inline
  def bgBright: bgBright = "bgBright".asInstanceOf[bgBright]
  @scala.inline
  def bright: bright = "bright".asInstanceOf[bright]
  @scala.inline
  def color: color = "color".asInstanceOf[color]
  @scala.inline
  def modifier: modifier = "modifier".asInstanceOf[modifier]
}

