package typings.anchorJs

import typings.anchorJs.mod.anchorjs.AnchorPlacement
import typings.anchorJs.mod.anchorjs.AnchorVisibility
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anchorJsStrings {
  
  @js.native
  sealed trait always
    extends StObject
       with AnchorVisibility
  inline def always: always = "always".asInstanceOf[always]
  
  @js.native
  sealed trait hover
    extends StObject
       with AnchorVisibility
  inline def hover: hover = "hover".asInstanceOf[hover]
  
  @js.native
  sealed trait left
    extends StObject
       with AnchorPlacement
  inline def left: left = "left".asInstanceOf[left]
  
  @js.native
  sealed trait right
    extends StObject
       with AnchorPlacement
  inline def right: right = "right".asInstanceOf[right]
  
  @js.native
  sealed trait touch
    extends StObject
       with AnchorVisibility
  inline def touch: touch = "touch".asInstanceOf[touch]
}
