package typings.ansiFragments

import typings.ansiFragments.ifragmentMod.IFragment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fixedMod {
  
  @JSImport("ansi-fragments/build/fragments/Fixed", "Fixed")
  @js.native
  class Fixed_ protected () extends IFragment {
    def this(width: Double, bias: Bias, children: js.Array[String | IFragment]) = this()
    
    val bias: js.Any = js.native
    
    val children: js.Any = js.native
    
    val width: js.Any = js.native
  }
  
  @JSImport("ansi-fragments/build/fragments/Fixed", "fixed")
  @js.native
  def fixed(value: Double, bias: Bias, children: (String | IFragment)*): Fixed_ = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.ansiFragments.ansiFragmentsStrings.start
    - typings.ansiFragments.ansiFragmentsStrings.end
  */
  trait Bias extends StObject
  object Bias {
    
    @scala.inline
    def end: typings.ansiFragments.ansiFragmentsStrings.end = "end".asInstanceOf[typings.ansiFragments.ansiFragmentsStrings.end]
    
    @scala.inline
    def start: typings.ansiFragments.ansiFragmentsStrings.start = "start".asInstanceOf[typings.ansiFragments.ansiFragmentsStrings.start]
  }
}
