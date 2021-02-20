package typings.ansiFragments

import typings.ansiFragments.ifragmentMod.IFragment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object padMod {
  
  @JSImport("ansi-fragments/build/fragments/Pad", "Pad")
  @js.native
  class Pad_ protected () extends IFragment {
    def this(count: Double) = this()
    def this(count: Double, separator: String) = this()
    
    val count: js.Any = js.native
    
    val separator: js.Any = js.native
  }
  
  @JSImport("ansi-fragments/build/fragments/Pad", "pad")
  @js.native
  def pad(count: Double): Pad_ = js.native
  @JSImport("ansi-fragments/build/fragments/Pad", "pad")
  @js.native
  def pad(count: Double, separator: String): Pad_ = js.native
}
