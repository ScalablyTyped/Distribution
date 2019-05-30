package typings
package atAngularCompilerLib.srcOutputOutputUnderscoreJitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/output_jit", "JitEvaluator")
@js.native
class JitEvaluator () extends js.Object {
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
    sourceUrl: java.lang.String,
    ctx: atAngularCompilerLib.srcOutputAbstractUnderscoreEmitterMod.EmitterVisitorContext,
    vars: org.scalablytyped.runtime.StringDictionary[js.Any],
    createSourceMap: scala.Boolean
  ): js.Any = js.native
  /**
    *
    * @param sourceUrl The URL of the generated code.
    * @param statements An array of Angular statement AST nodes to be evaluated.
    * @param reflector A helper used when converting the statements to executable code.
    * @param createSourceMaps If true then create a source-map for the generated code and include it
    * inline as a source-map comment.
    * @returns A map of all the variables in the generated code.
    */
  def evaluateStatements(
    sourceUrl: java.lang.String,
    statements: js.Array[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Statement],
    reflector: atAngularCompilerLib.srcCompileUnderscoreReflectorMod.CompileReflector,
    createSourceMaps: scala.Boolean
  ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
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
  def executeFunction(fn: js.Function, args: js.Array[_]): js.Any = js.native
}

