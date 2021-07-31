package typings.ansiFragments

import typings.ansiFragments.ifragmentMod.IFragment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object padMod {
  
  @JSImport("ansi-fragments/build/fragments/Pad", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ansi-fragments/build/fragments/Pad", "Pad")
  @js.native
  class Pad_ protected ()
    extends StObject
       with IFragment {
    def this(count: Double) = this()
    def this(count: Double, separator: String) = this()
    
    /* CompleteClass */
    override def build(): String = js.native
    
    val count: js.Any = js.native
    
    val separator: js.Any = js.native
  }
  
  @scala.inline
  def pad(count: Double): Pad_ = ^.asInstanceOf[js.Dynamic].applyDynamic("pad")(count.asInstanceOf[js.Any]).asInstanceOf[Pad_]
  @scala.inline
  def pad(count: Double, separator: String): Pad_ = (^.asInstanceOf[js.Dynamic].applyDynamic("pad")(count.asInstanceOf[js.Any], separator.asInstanceOf[js.Any])).asInstanceOf[Pad_]
}
