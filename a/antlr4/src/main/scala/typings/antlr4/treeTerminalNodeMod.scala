package typings.antlr4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object treeTerminalNodeMod {
  
  @JSImport("antlr4/tree/TerminalNode", JSImport.Default)
  @js.native
  open class default protected () extends TerminalNode {
    def this(symbol: typings.antlr4.tokenMod.default) = this()
  }
  
  @js.native
  trait TerminalNode
    extends typings.antlr4.treeParseTreeMod.default {
    
    def accept[T /* <: typings.antlr4.treeParseTreeVisitorMod.default */](visitor: T): T = js.native
    
    def getChild(i: Double): Null = js.native
    
    def getChildCount(): Double = js.native
    
    def getParent(): typings.antlr4.treeParseTreeMod.default = js.native
    
    def getPayload(): typings.antlr4.tokenMod.default = js.native
    
    def getSourceInterval(): typings.antlr4.miscIntervalMod.default = js.native
    
    def getSymbol(): typings.antlr4.tokenMod.default = js.native
    
    def getText(): String = js.native
    
    var parentCtx: typings.antlr4.treeParseTreeMod.default = js.native
    
    var symbol: typings.antlr4.tokenMod.default = js.native
  }
}
