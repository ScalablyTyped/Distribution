package typings.anchorDashJs

import typings.anchorDashJs.anchorDashJsMod.anchorjsNs.AnchorPlacement
import typings.anchorDashJs.anchorDashJsMod.anchorjsNs.AnchorVisibility
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object anchorDashJsStrings {
  @js.native
  sealed trait always extends AnchorVisibility
  
  @js.native
  sealed trait hover extends AnchorVisibility
  
  @js.native
  sealed trait left extends AnchorPlacement
  
  @js.native
  sealed trait right extends AnchorPlacement
  
  @js.native
  sealed trait touch extends AnchorVisibility
  
  @scala.inline
  def always: always = "always".asInstanceOf[always]
  @scala.inline
  def hover: hover = "hover".asInstanceOf[hover]
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  @scala.inline
  def touch: touch = "touch".asInstanceOf[touch]
}

