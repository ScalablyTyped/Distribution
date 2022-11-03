package typings.antlr4

import typings.antlr4.tokenMod.TokenSourceTuple
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonTokenFactoryMod {
  
  @JSImport("antlr4/CommonTokenFactory", JSImport.Default)
  @js.native
  open class default protected () extends CommonTokenFactory {
    def this(copyText: Boolean) = this()
  }
  /* static members */
  object default {
    
    /**
      * The default {@link CommonTokenFactory} instance.
      *
      * This token factory does not explicitly copy token
      * text when constructing tokens.
      */
    @JSImport("antlr4/CommonTokenFactory", "default.DEFAULT")
    @js.native
    val DEFAULT: CommonTokenFactory = js.native
  }
  
  @JSImport("antlr4/CommonTokenFactory", "TokenFactory")
  @js.native
  open class TokenFactory () extends StObject
  
  @js.native
  trait CommonTokenFactory extends TokenFactory {
    
    def create(
      source: Unit,
      `type`: Double,
      text: String,
      channel: Double,
      start: Double,
      stop: Double,
      line: Double,
      column: Double
    ): typings.antlr4.commonTokenMod.default = js.native
    def create(
      source: Unit,
      `type`: Double,
      text: Null,
      channel: Double,
      start: Double,
      stop: Double,
      line: Double,
      column: Double
    ): typings.antlr4.commonTokenMod.default = js.native
    def create(
      source: Unit,
      `type`: Unit,
      text: String,
      channel: Double,
      start: Double,
      stop: Double,
      line: Double,
      column: Double
    ): typings.antlr4.commonTokenMod.default = js.native
    def create(
      source: Unit,
      `type`: Unit,
      text: Null,
      channel: Double,
      start: Double,
      stop: Double,
      line: Double,
      column: Double
    ): typings.antlr4.commonTokenMod.default = js.native
    def create(
      source: TokenSourceTuple,
      `type`: Double,
      text: String,
      channel: Double,
      start: Double,
      stop: Double,
      line: Double,
      column: Double
    ): typings.antlr4.commonTokenMod.default = js.native
    def create(
      source: TokenSourceTuple,
      `type`: Double,
      text: Null,
      channel: Double,
      start: Double,
      stop: Double,
      line: Double,
      column: Double
    ): typings.antlr4.commonTokenMod.default = js.native
    def create(
      source: TokenSourceTuple,
      `type`: Unit,
      text: String,
      channel: Double,
      start: Double,
      stop: Double,
      line: Double,
      column: Double
    ): typings.antlr4.commonTokenMod.default = js.native
    def create(
      source: TokenSourceTuple,
      `type`: Unit,
      text: Null,
      channel: Double,
      start: Double,
      stop: Double,
      line: Double,
      column: Double
    ): typings.antlr4.commonTokenMod.default = js.native
    
    def createThin(`type`: Double, text: String): typings.antlr4.commonTokenMod.default = js.native
  }
}
