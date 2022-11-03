package typings.antlr4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object miscIntervalMod {
  
  @JSImport("antlr4/misc/Interval", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Interval {
    def this(start: Double, stop: Double) = this()
  }
  /* static members */
  object default {
    
    @JSImport("antlr4/misc/Interval", "default.INVALID_INTERVAL")
    @js.native
    val INVALID_INTERVAL: Interval = js.native
  }
  
  @js.native
  trait Interval extends StObject {
    
    def contains(item: Double): Boolean = js.native
    
    def length: Double = js.native
    
    val start: Double = js.native
    
    val stop: Double = js.native
  }
}
