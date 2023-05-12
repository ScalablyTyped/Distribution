package typings.anchorJs

import typings.anchorJs.mod.anchorjs.Placement
import typings.anchorJs.mod.anchorjs.Visibility
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anchorJsStrings {
  
  @js.native
  sealed trait always
    extends StObject
       with Visibility
  inline def always: always = "always".asInstanceOf[always]
  
  @js.native
  sealed trait hover
    extends StObject
       with Visibility
  inline def hover: hover = "hover".asInstanceOf[hover]
  
  @js.native
  sealed trait left
    extends StObject
       with Placement
  inline def left: left = "left".asInstanceOf[left]
  
  @js.native
  sealed trait right
    extends StObject
       with Placement
  inline def right: right = "right".asInstanceOf[right]
}
