package typings.a11yDialog

import typings.a11yDialog.mod.A11yDialog.EventType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object a11yDialogStrings {
  
  @scala.inline
  def create: create = "create".asInstanceOf[create]
  
  @scala.inline
  def destroy: destroy = "destroy".asInstanceOf[destroy]
  
  @scala.inline
  def hide: hide = "hide".asInstanceOf[hide]
  
  @scala.inline
  def show: show = "show".asInstanceOf[show]
  
  @js.native
  sealed trait create extends EventType
  
  @js.native
  sealed trait destroy extends EventType
  
  @js.native
  sealed trait hide extends EventType
  
  @js.native
  sealed trait show extends EventType
}
