package typings.a11yDialog

import typings.a11yDialog.mod.A11yDialog.EventType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object a11yDialogStrings {
  
  @js.native
  sealed trait create
    extends StObject
       with EventType
  inline def create: create = "create".asInstanceOf[create]
  
  @js.native
  sealed trait destroy
    extends StObject
       with EventType
  inline def destroy: destroy = "destroy".asInstanceOf[destroy]
  
  @js.native
  sealed trait hide
    extends StObject
       with EventType
  inline def hide: hide = "hide".asInstanceOf[hide]
  
  @js.native
  sealed trait show
    extends StObject
       with EventType
  inline def show: show = "show".asInstanceOf[show]
}
