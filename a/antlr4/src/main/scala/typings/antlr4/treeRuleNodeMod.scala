package typings.antlr4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object treeRuleNodeMod {
  
  @JSImport("antlr4/tree/RuleNode", JSImport.Default)
  @js.native
  open class default () extends RuleNode
  
  @js.native
  trait RuleNode
    extends typings.antlr4.treeParseTreeMod.default {
    
    /**
      * Not implemented, throws error.
      */
    def getRuleContext(): typings.antlr4.contextRuleContextMod.default = js.native
  }
}
