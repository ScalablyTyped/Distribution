package typings.ansiAlign

import typings.ansiAlign.mod.Align
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ansiAlignStrings {
  
  @js.native
  sealed trait center
    extends StObject
       with Align
  inline def center: center = "center".asInstanceOf[center]
  
  @js.native
  sealed trait left
    extends StObject
       with Align
  inline def left: left = "left".asInstanceOf[left]
  
  @js.native
  sealed trait right
    extends StObject
       with Align
  inline def right: right = "right".asInstanceOf[right]
}
