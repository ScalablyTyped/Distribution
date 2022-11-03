package typings.antlr4

import typings.antlr4.antlr4Ints.`-1`
import typings.antlr4.antlr4Ints.`-2`
import typings.antlr4.antlr4Ints.`0`
import typings.antlr4.antlr4Ints.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tokenMod {
  
  @JSImport("antlr4/Token", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Token
  /* static members */
  object default {
    
    @JSImport("antlr4/Token", "default.DEFAULT_CHANNEL")
    @js.native
    val DEFAULT_CHANNEL: `0` = js.native
    
    @JSImport("antlr4/Token", "default.EOF")
    @js.native
    val EOF: `-1` = js.native
    
    @JSImport("antlr4/Token", "default.EPSILON")
    @js.native
    val EPSILON: `-2` = js.native
    
    @JSImport("antlr4/Token", "default.HIDDEN_CHANNEL")
    @js.native
    val HIDDEN_CHANNEL: `1` = js.native
    
    @JSImport("antlr4/Token", "default.INVALID_TYPE")
    @js.native
    val INVALID_TYPE: `0` = js.native
    
    @JSImport("antlr4/Token", "default.MIN_USER_TOKEN_TYPE")
    @js.native
    val MIN_USER_TOKEN_TYPE: `1` = js.native
  }
  
  @js.native
  trait Token extends StObject {
    
    /**
      * The parser ignores everything not on DEFAULT_CHANNEL
      */
    var channel: Double = js.native
    
    /**
      * beginning of the line at which it occurs, 0..n-1
      */
    var column: Double = js.native
    
    def getInputStream(): typings.antlr4.inputStreamMod.default = js.native
    
    def getTokenSource(): TokenSourceTuple = js.native
    
    /**
      * line=1..n of the 1st character
      */
    var line: Double = js.native
    
    var source: TokenSourceTuple = js.native
    
    /**
      * -1 if not implemented.
      */
    var start: Double = js.native
    
    /**
      * -1 if not implemented.
      */
    var stop: Double = js.native
    
    def text: String = js.native
    def text_=(text: String): Unit = js.native
    
    /**
      * from 0..n-1 of the token object in the input stream
      */
    var tokenIndex: Double = js.native
    
    var `type`: Double = js.native
  }
  
  type TokenSourceTuple = js.Tuple2[
    Null | typings.antlr4.lexerMod.default, 
    Null | typings.antlr4.inputStreamMod.default
  ]
}
