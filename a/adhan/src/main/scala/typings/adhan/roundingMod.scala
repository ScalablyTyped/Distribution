package typings.adhan

import typings.adhan.adhanStrings.nearest
import typings.adhan.adhanStrings.none
import typings.adhan.adhanStrings.up
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object roundingMod {
  
  object Rounding {
    
    @JSImport("adhan/lib/types/Rounding", "Rounding.Nearest")
    @js.native
    val Nearest: nearest = js.native
    
    @JSImport("adhan/lib/types/Rounding", "Rounding.None")
    @js.native
    val None: none = js.native
    
    @JSImport("adhan/lib/types/Rounding", "Rounding.Up")
    @js.native
    val Up: up = js.native
  }
}
