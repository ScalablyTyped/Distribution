package typings.antlr4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object treeParseTreeWalkerMod {
  
  @JSImport("antlr4/tree/ParseTreeWalker", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with ParseTreeWalker {
    
    /**
      * Enters a grammar rule by first triggering the generic event {@link ParseTreeListener.enterEveryRule}
      * then by triggering the event specific to the given parse tree node.
      *
      * @param listener The listener responding to the trigger events
      * @param r The grammar rule containing the rule context
      */
    /* CompleteClass */
    override def enterRule(
      listener: typings.antlr4.treeParseTreeListenerMod.default,
      r: typings.antlr4.treeRuleNodeMod.default
    ): Unit = js.native
    
    /**
      * Exits a grammar rule by first triggering the event specific to the given parse tree node
      * then by triggering the generic event {@link ParseTreeListener.exitEveryRule}
      *
      * @param listener The listener responding to the trigger events
      * @param r The grammar rule containing the rule context
      */
    /* CompleteClass */
    override def exitRule(
      listener: typings.antlr4.treeParseTreeListenerMod.default,
      r: typings.antlr4.treeRuleNodeMod.default
    ): Unit = js.native
    
    /**
      * Performs a walk on the given parse tree starting at the root and going down recursively
      * with depth-first search. On each node, {@link ParseTreeWalker.enterRule} is called before
      * recursively walking down into child nodes, then {@link ParseTreeWalker.exitRule} is
      * called after the recursive call to wind up.
      *
      * @param listener The listener used by the walker to process grammar rules
      * @param t The parse tree to be walked on
      */
    /* CompleteClass */
    override def walk(
      listener: typings.antlr4.treeParseTreeListenerMod.default,
      t: typings.antlr4.treeParseTreeMod.default
    ): Unit = js.native
  }
  /* static members */
  object default {
    
    @JSImport("antlr4/tree/ParseTreeWalker", "default.DEFAULT")
    @js.native
    val DEFAULT: ParseTreeWalker = js.native
  }
  
  trait ParseTreeWalker extends StObject {
    
    /**
      * Enters a grammar rule by first triggering the generic event {@link ParseTreeListener.enterEveryRule}
      * then by triggering the event specific to the given parse tree node.
      *
      * @param listener The listener responding to the trigger events
      * @param r The grammar rule containing the rule context
      */
    def enterRule(
      listener: typings.antlr4.treeParseTreeListenerMod.default,
      r: typings.antlr4.treeRuleNodeMod.default
    ): Unit
    
    /**
      * Exits a grammar rule by first triggering the event specific to the given parse tree node
      * then by triggering the generic event {@link ParseTreeListener.exitEveryRule}
      *
      * @param listener The listener responding to the trigger events
      * @param r The grammar rule containing the rule context
      */
    def exitRule(
      listener: typings.antlr4.treeParseTreeListenerMod.default,
      r: typings.antlr4.treeRuleNodeMod.default
    ): Unit
    
    /**
      * Performs a walk on the given parse tree starting at the root and going down recursively
      * with depth-first search. On each node, {@link ParseTreeWalker.enterRule} is called before
      * recursively walking down into child nodes, then {@link ParseTreeWalker.exitRule} is
      * called after the recursive call to wind up.
      *
      * @param listener The listener used by the walker to process grammar rules
      * @param t The parse tree to be walked on
      */
    def walk(
      listener: typings.antlr4.treeParseTreeListenerMod.default,
      t: typings.antlr4.treeParseTreeMod.default
    ): Unit
  }
  object ParseTreeWalker {
    
    inline def apply(
      enterRule: (typings.antlr4.treeParseTreeListenerMod.default, typings.antlr4.treeRuleNodeMod.default) => Unit,
      exitRule: (typings.antlr4.treeParseTreeListenerMod.default, typings.antlr4.treeRuleNodeMod.default) => Unit,
      walk: (typings.antlr4.treeParseTreeListenerMod.default, typings.antlr4.treeParseTreeMod.default) => Unit
    ): ParseTreeWalker = {
      val __obj = js.Dynamic.literal(enterRule = js.Any.fromFunction2(enterRule), exitRule = js.Any.fromFunction2(exitRule), walk = js.Any.fromFunction2(walk))
      __obj.asInstanceOf[ParseTreeWalker]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ParseTreeWalker] (val x: Self) extends AnyVal {
      
      inline def setEnterRule(
        value: (typings.antlr4.treeParseTreeListenerMod.default, typings.antlr4.treeRuleNodeMod.default) => Unit
      ): Self = StObject.set(x, "enterRule", js.Any.fromFunction2(value))
      
      inline def setExitRule(
        value: (typings.antlr4.treeParseTreeListenerMod.default, typings.antlr4.treeRuleNodeMod.default) => Unit
      ): Self = StObject.set(x, "exitRule", js.Any.fromFunction2(value))
      
      inline def setWalk(
        value: (typings.antlr4.treeParseTreeListenerMod.default, typings.antlr4.treeParseTreeMod.default) => Unit
      ): Self = StObject.set(x, "walk", js.Any.fromFunction2(value))
    }
  }
}
