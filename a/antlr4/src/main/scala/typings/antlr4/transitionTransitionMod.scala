package typings.antlr4

import typings.antlr4.anon.ActionTransition
import typings.antlr4.antlr4Ints.`10`
import typings.antlr4.antlr4Ints.`1`
import typings.antlr4.antlr4Ints.`2`
import typings.antlr4.antlr4Ints.`3`
import typings.antlr4.antlr4Ints.`4`
import typings.antlr4.antlr4Ints.`5`
import typings.antlr4.antlr4Ints.`6`
import typings.antlr4.antlr4Ints.`7`
import typings.antlr4.antlr4Ints.`8`
import typings.antlr4.antlr4Ints.`9`
import typings.antlr4.antlr4Strings.INVALID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transitionTransitionMod {
  
  @JSImport("antlr4/transition/Transition", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Transition {
    def this(target: typings.antlr4.stateAtnstateMod.default) = this()
    
    /* CompleteClass */
    override val target: typings.antlr4.stateAtnstateMod.default = js.native
  }
  /* static members */
  object default {
    
    @JSImport("antlr4/transition/Transition", "default.ACTION")
    @js.native
    val ACTION: `6` = js.native
    
    @JSImport("antlr4/transition/Transition", "default.ATOM")
    @js.native
    val ATOM: `5` = js.native
    
    @JSImport("antlr4/transition/Transition", "default.EPSILON")
    @js.native
    val EPSILON: `1` = js.native
    
    @JSImport("antlr4/transition/Transition", "default.NOT_SET")
    @js.native
    val NOT_SET: `8` = js.native
    
    @JSImport("antlr4/transition/Transition", "default.PRECEDENCE")
    @js.native
    val PRECEDENCE: `10` = js.native
    
    @JSImport("antlr4/transition/Transition", "default.PREDICATE")
    @js.native
    val PREDICATE: `4` = js.native
    
    @JSImport("antlr4/transition/Transition", "default.RANGE")
    @js.native
    val RANGE: `2` = js.native
    
    @JSImport("antlr4/transition/Transition", "default.RULE")
    @js.native
    val RULE: `3` = js.native
    
    @JSImport("antlr4/transition/Transition", "default.SET")
    @js.native
    val SET: `7` = js.native
    
    @JSImport("antlr4/transition/Transition", "default.WILDCARD")
    @js.native
    val WILDCARD: `9` = js.native
    
    @JSImport("antlr4/transition/Transition", "default.serializationNames")
    @js.native
    val serializationNames: js.Tuple11[
        INVALID, 
        typings.antlr4.antlr4Strings.EPSILON, 
        typings.antlr4.antlr4Strings.RANGE, 
        typings.antlr4.antlr4Strings.RULE, 
        typings.antlr4.antlr4Strings.PREDICATE, 
        typings.antlr4.antlr4Strings.ATOM, 
        typings.antlr4.antlr4Strings.ACTION, 
        typings.antlr4.antlr4Strings.SET, 
        typings.antlr4.antlr4Strings.NOT_SET, 
        typings.antlr4.antlr4Strings.WILDCARD, 
        typings.antlr4.antlr4Strings.PRECEDENCE
      ] = js.native
    
    @JSImport("antlr4/transition/Transition", "default.serializationTypes")
    @js.native
    val serializationTypes: ActionTransition = js.native
  }
  
  trait Transition extends StObject {
    
    val target: typings.antlr4.stateAtnstateMod.default
  }
  object Transition {
    
    inline def apply(target: typings.antlr4.stateAtnstateMod.default): Transition = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[Transition]
    }
    
    extension [Self <: Transition](x: Self) {
      
      inline def setTarget(value: typings.antlr4.stateAtnstateMod.default): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
