package typings.antlr4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorDiagnosticErrorListenerMod {
  
  @JSImport("antlr4/error/DiagnosticErrorListener", JSImport.Default)
  @js.native
  open class default protected () extends DiagnosticErrorListener {
    def this(exactOnly: Boolean) = this()
  }
  
  @js.native
  trait DiagnosticErrorListener
    extends typings.antlr4.errorErrorListenerMod.default {
    
    val exactOnly: Boolean = js.native
    
    /**
      * Computes the set of conflicting or ambiguous alternatives from a
      * configuration set, if that information was not already provided by the
      * parser.
      *
      * @param reportedAlts The set of conflicting or ambiguous alternatives, as
      * reported by the parser.
      * @param configs The conflicting or ambiguous configuration set.
      * @return `reportedAlts` if it is not `null`, otherwise
      * returns the set of alternatives represented in `configs`.
      */
    def getConflictingAlts(
      reportedAlts: typings.antlr4.miscBitSetMod.default,
      configs: typings.antlr4.atnAtnconfigsetMod.default
    ): typings.antlr4.miscBitSetMod.default = js.native
    
    def getDecisionDescription(recognizer: typings.antlr4.parserMod.default, dfa: typings.antlr4.dfaDfaMod.default): String = js.native
  }
}
