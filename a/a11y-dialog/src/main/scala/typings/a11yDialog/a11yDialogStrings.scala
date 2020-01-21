package typings.a11yDialog

import typings.a11yDialog.mod.DialogEvents
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object a11yDialogStrings {
  @js.native
  sealed trait create extends DialogEvents
  
  @js.native
  sealed trait destroy extends DialogEvents
  
  @js.native
  sealed trait hide extends DialogEvents
  
  @js.native
  sealed trait show extends DialogEvents
  
  @scala.inline
  def create: create = "create".asInstanceOf[create]
  @scala.inline
  def destroy: destroy = "destroy".asInstanceOf[destroy]
  @scala.inline
  def hide: hide = "hide".asInstanceOf[hide]
  @scala.inline
  def show: show = "show".asInstanceOf[show]
}

