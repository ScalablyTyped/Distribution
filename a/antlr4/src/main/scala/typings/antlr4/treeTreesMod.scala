package typings.antlr4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object treeTreesMod {
  
  object default {
    
    @JSImport("antlr4/tree/Trees", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def descendants(t: typings.antlr4.treeParseTreeMod.default): js.Array[typings.antlr4.treeParseTreeMod.default] = ^.asInstanceOf[js.Dynamic].applyDynamic("descendants")(t.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.antlr4.treeParseTreeMod.default]]
    
    inline def findAllNodes(t: typings.antlr4.treeParseTreeMod.default, index: Double, findTokens: Boolean): js.Array[typings.antlr4.treeParseTreeMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("findAllNodes")(t.asInstanceOf[js.Any], index.asInstanceOf[js.Any], findTokens.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.antlr4.treeParseTreeMod.default]]
    
    inline def findAllRuleNodes(t: typings.antlr4.treeParseTreeMod.default, ruleIndex: Double): js.Array[typings.antlr4.treeParseTreeMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("findAllRuleNodes")(t.asInstanceOf[js.Any], ruleIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.antlr4.treeParseTreeMod.default]]
    
    inline def findAllTokenNodes(t: typings.antlr4.treeParseTreeMod.default, ttype: Double): js.Array[typings.antlr4.treeParseTreeMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("findAllTokenNodes")(t.asInstanceOf[js.Any], ttype.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.antlr4.treeParseTreeMod.default]]
    
    /**
      * @return a list of all ancestors of this node. The first node of
      * list is the root and the last is the parent of this node.
      */
    inline def getAncestors(t: typings.antlr4.treeTreeMod.default): js.Array[typings.antlr4.treeTreeMod.default] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAncestors")(t.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.antlr4.treeTreeMod.default]]
    
    /**
      * @return ordered list of all children of this node
      */
    inline def getChildren(t: typings.antlr4.treeTreeMod.default): js.Array[typings.antlr4.treeTreeMod.default] = ^.asInstanceOf[js.Dynamic].applyDynamic("getChildren")(t.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.antlr4.treeTreeMod.default]]
    
    inline def getNodeText(t: typings.antlr4.treeTreeMod.default): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getNodeText")(t.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def getNodeText(t: typings.antlr4.treeTreeMod.default, ruleNames: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getNodeText")(t.asInstanceOf[js.Any], ruleNames.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def getNodeText(
      t: typings.antlr4.treeTreeMod.default,
      ruleNames: js.Array[String],
      recog: typings.antlr4.parserMod.default
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getNodeText")(t.asInstanceOf[js.Any], ruleNames.asInstanceOf[js.Any], recog.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def getNodeText(t: typings.antlr4.treeTreeMod.default, ruleNames: Unit, recog: typings.antlr4.parserMod.default): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getNodeText")(t.asInstanceOf[js.Any], ruleNames.asInstanceOf[js.Any], recog.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /**
      * Print out a whole tree in LISP form.
      *
      * {@link getNodeText} is used on the node payloads to
      * get the text for the nodes.
      *
      * Detect parse trees and extract data appropriately.
      */
    inline def toStringTree(t: typings.antlr4.treeTreeMod.default): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toStringTree")(t.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def toStringTree(t: typings.antlr4.treeTreeMod.default, ruleNames: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toStringTree")(t.asInstanceOf[js.Any], ruleNames.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def toStringTree(
      t: typings.antlr4.treeTreeMod.default,
      ruleNames: js.Array[String],
      recog: typings.antlr4.parserMod.default
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toStringTree")(t.asInstanceOf[js.Any], ruleNames.asInstanceOf[js.Any], recog.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def toStringTree(t: typings.antlr4.treeTreeMod.default, ruleNames: Unit, recog: typings.antlr4.parserMod.default): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toStringTree")(t.asInstanceOf[js.Any], ruleNames.asInstanceOf[js.Any], recog.asInstanceOf[js.Any])).asInstanceOf[String]
  }
}
