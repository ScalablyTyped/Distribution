package typings.angularCompiler.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "JitEvaluator")
@js.native
open class JitEvaluator () extends StObject {
  
  /**
    * Evaluate a piece of JIT generated code.
    * @param sourceUrl The URL of this generated code.
    * @param ctx A context object that contains an AST of the code to be evaluated.
    * @param vars A map containing the names and values of variables that the evaluated code might
    * reference.
    * @param createSourceMap If true then create a source-map for the generated code and include it
    * inline as a source-map comment.
    * @returns The result of evaluating the code.
    */
  def evaluateCode(
    sourceUrl: String,
    ctx: EmitterVisitorContext,
    vars: StringDictionary[Any],
    createSourceMap: Boolean
  ): Any = js.native
  
  /**
    *
    * @param sourceUrl The URL of the generated code.
    * @param statements An array of Angular statement AST nodes to be evaluated.
    * @param refResolver Resolves `o.ExternalReference`s into values.
    * @param createSourceMaps If true then create a source-map for the generated code and include it
    * inline as a source-map comment.
    * @returns A map of all the variables in the generated code.
    */
  def evaluateStatements(
    sourceUrl: String,
    statements: js.Array[Statement],
    refResolver: ExternalReferenceResolver,
    createSourceMaps: Boolean
  ): StringDictionary[Any] = js.native
  
  /**
    * Execute a JIT generated function by calling it.
    *
    * This method can be overridden in tests to capture the functions that are generated
    * by this `JitEvaluator` class.
    *
    * @param fn A function to execute.
    * @param args The arguments to pass to the function being executed.
    * @returns The return value of the executed function.
    */
  def executeFunction(fn: js.Function, args: js.Array[Any]): Any = js.native
}
