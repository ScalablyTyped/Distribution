package typings.antlr4

import typings.antlr4.antlr4Ints.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextRuleContextMod {
  
  @JSImport("antlr4/context/RuleContext", JSImport.Default)
  @js.native
  open class default () extends RuleContext {
    def this(parent: RuleContext) = this()
    def this(parent: Unit, invokingState: Double) = this()
    def this(parent: RuleContext, invokingState: Double) = this()
  }
  
  @js.native
  trait RuleContext
    extends typings.antlr4.treeRuleNodeMod.default {
    
    def accept(visitor: typings.antlr4.treeParseTreeVisitorMod.default): Unit = js.native
    
    def depth(): Double = js.native
    
    /**
      * For rule associated with this parse tree internal node, return
      * the outer alternative number used to match the input. Default
      * implementation does not compute nor store this alt num. Create
      * a subclass of ParserRuleContext with backing field and set
      * option contextSuperClass.
      * to set it.
      */
    def getAltNumber(): `0` = js.native
    
    def getChild(i: Double): RuleContext | Null = js.native
    
    def getChildCount(): Double = js.native
    
    def getPayload(): RuleContext = js.native
    
    def getSourceInterval(): typings.antlr4.miscIntervalMod.default = js.native
    
    /**
      * Return the combined text of all child nodes. This method only considers
      * tokens which have been added to the parse tree.
      *
      * Since tokens on hidden channels (e.g. whitespace or comments) are not
      * added to the parse trees, they will not appear in the output of this
      * method.
      */
    def getText(): String = js.native
    
    /**
      * What state invoked the rule associated with this context?
      * The "return address" is the followState of invokingState
      * If parent is null, this should be -1.
      */
    val invokingState: Double = js.native
    
    /**
      * A context is empty if there is no invoking state; meaning nobody call
      * current context.
      */
    def isEmpty(): Boolean = js.native
    
    val parentCtx: RuleContext = js.native
    
    /**
      * Set the outer alternative number for this context node. Default
      * implementation does nothing to avoid backing field overhead for
      * trees that don't need it.  Create
      * a subclass of ParserRuleContext with backing field and set
      * option contextSuperClass.
      */
    def setAltNumber(altNumber: Double): Unit = js.native
    
    def toString(ruleNames: js.Array[String], stop: RuleContext): String = js.native
    
    /**
      * Print out a whole tree, not just a node, in LISP format
      * (root child1 .. childN). Print just a node if this is a leaf.
      */
    def toStringTree(ruleNames: js.Array[String], recog: typings.antlr4.parserMod.default): String = js.native
  }
}
