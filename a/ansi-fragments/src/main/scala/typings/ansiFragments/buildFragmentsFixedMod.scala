package typings.ansiFragments

import typings.ansiFragments.buildFragmentsIfragmentMod.IFragment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildFragmentsFixedMod {
  
  @JSImport("ansi-fragments/build/fragments/Fixed", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ansi-fragments/build/fragments/Fixed", "Fixed")
  @js.native
  open class Fixed_ protected ()
    extends StObject
       with IFragment {
    def this(width: Double, bias: Bias, children: js.Array[String | IFragment]) = this()
    
    /* private */ val bias: Any = js.native
    
    /* CompleteClass */
    override def build(): String = js.native
    
    /* private */ val children: Any = js.native
    
    /* private */ val width: Any = js.native
  }
  
  inline def fixed(value: Double, bias: Bias, children: (String | IFragment)*): Fixed_ = (^.asInstanceOf[js.Dynamic].applyDynamic("fixed")((scala.List(value.asInstanceOf[js.Any], bias.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Fixed_]
  
  /* Rewritten from type alias, can be one of: 
    - typings.ansiFragments.ansiFragmentsStrings.start
    - typings.ansiFragments.ansiFragmentsStrings.end
  */
  trait Bias extends StObject
  object Bias {
    
    inline def end: typings.ansiFragments.ansiFragmentsStrings.end = "end".asInstanceOf[typings.ansiFragments.ansiFragmentsStrings.end]
    
    inline def start: typings.ansiFragments.ansiFragmentsStrings.start = "start".asInstanceOf[typings.ansiFragments.ansiFragmentsStrings.start]
  }
}
