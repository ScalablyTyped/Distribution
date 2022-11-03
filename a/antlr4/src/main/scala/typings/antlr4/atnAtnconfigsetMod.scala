package typings.antlr4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object atnAtnconfigsetMod {
  
  @JSImport("antlr4/atn/ATNConfigSet", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with ATNConfigSet {
    def this(fullCtx: Boolean) = this()
  }
  
  @js.native
  trait ATNConfigSet extends StObject {
    
    /**
      * Adding a new config means merging contexts with existing configs for
      * `(s, i, pi, _)`, where `s` is the {@link ATNConfig.state}, `i` is
      * the {@link ATNConfig.alt}, and `pi` is the {@link ATNConfig.semanticContext}.
      * We use `(s,i,pi)` as key.
      *
      * This method updates {@link dipsIntoOuterContext} and
      * {@link hasSemanticContext} when necessary.
      */
    def add(config: typings.antlr4.atnAtnconfigMod.default): Boolean = js.native
    def add(
      config: typings.antlr4.atnAtnconfigMod.default,
      mergeCache: typings.antlr4.utilsDoubleDictMod.default
    ): Boolean = js.native
    
    def addAll(coll: js.Array[typings.antlr4.atnAtnconfigMod.default]): Boolean = js.native
    
    var cachedHashCode: Double = js.native
    
    def clear(): Unit = js.native
    
    /**
      * The reason that we need this is because we don't want the hash map to use
      * the standard hash code and equals. We need all configurations with the
      * same `(s,i,_,semctx)` to be equal. Unfortunately, this key effectively
      * doubles the number of objects associated with ATNConfigs. The other solution
      * is to use a hash table that lets us specify the equals/hashcode operation.
      * All configs but hashed by (s, i, _, pi) not including context. Wiped out
      * when we go readonly as this set becomes a DFA state
      */
    var configLookup: typings.antlr4.miscHashSetMod.default = js.native
    
    var configs: js.Array[typings.antlr4.atnAtnconfigMod.default] = js.native
    
    var conflictingAlts: typings.antlr4.miscBitSetMod.default = js.native
    
    def contains(item: Any): Boolean = js.native
    
    def containsFast(item: Any): Boolean = js.native
    
    var dipsIntoOuterContext: Boolean = js.native
    
    def equals(other: ATNConfigSet): Boolean = js.native
    
    /**
      * Indicates that this configuration set is part of a full context
      * LL prediction. It will be used to determine how to merge $. With SLL
      * it's a wildcard whereas it is not for LL context merge
      */
    val fullCtx: Boolean = js.native
    
    def getPredicates(): js.Array[typings.antlr4.atnSemanticContextMod.default] = js.native
    
    def getStates(): typings.antlr4.miscHashSetMod.default = js.native
    
    /**
      * Used in parser and lexer. In lexer, it indicates we hit a pred
      * while computing a closure operation. Don't make a DFA state from this
      */
    var hasSemanticContext: Boolean = js.native
    
    def isEmpty(): Boolean = js.native
    
    def items: js.Array[typings.antlr4.atnAtnconfigMod.default] = js.native
    
    def length: Double = js.native
    
    def optimizeConfigs(interpreter: typings.antlr4.atnAtnsimulatorMod.default): Unit = js.native
    
    /**
      * Indicates that the set of configurations is read-only. Do not
      * allow any code to manipulate the set; DFA states will point at
      * the sets and they must not change. This does not protect the other
      * fields; in particular, conflictingAlts is set after
      * we've made this readonly
      */
    var readOnly: Boolean = js.native
    
    def setReadonly(readOnly: Boolean): Unit = js.native
    
    var uniqueAlt: Double = js.native
    
    def updateHashCode(hash: typings.antlr4.miscHashCodeMod.default): Unit = js.native
  }
}
