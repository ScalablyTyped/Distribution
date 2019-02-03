package typings
package atAngularCompilerLib.srcRender3ViewTemplateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/render3/view/template", "BindingScope")
@js.native
class BindingScope protected ()
  extends atAngularCompilerLib.srcCompilerUnderscoreUtilExpressionUnderscoreConverterMod.LocalResolver {
  var bindingLevel: scala.Double = js.native
  /** Keeps a map from local variables to their BindingData. */
  var map: js.Any = js.native
  var parent: js.Any = js.native
  var referenceNameIndex: js.Any = js.native
  var restoreViewVariable: js.Any = js.native
  def freshReferenceName(): java.lang.String = js.native
  def generateSharedContextVar(retrievalLevel: scala.Double): scala.Unit = js.native
  def get(name: java.lang.String): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression | scala.Null = js.native
  def getComponentProperty(name: java.lang.String): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression = js.native
  /* CompleteClass */
  override def getLocal(name: java.lang.String): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression | scala.Null = js.native
  def getSharedContextName(retrievalLevel: scala.Double): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ReadVarExpr | scala.Null = js.native
  def isListenerScope(): scala.Boolean | scala.Null = js.native
  def maybeGenerateSharedContextVar(value: BindingData): scala.Unit = js.native
  def maybeRestoreView(retrievalLevel: scala.Double, localRefLookup: scala.Boolean): scala.Unit = js.native
  def nestedScope(level: scala.Double): BindingScope = js.native
  def restoreViewStatement(): js.Array[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Statement] = js.native
  /**
    * Create a local variable for later reference.
    *
    * @param retrievalLevel The level from which this value can be retrieved
    * @param name Name of the variable.
    * @param lhs AST representing the left hand side of the `let lhs = rhs;`.
    * @param priority The sorting priority of this var
    * @param declareLocalCallback The callback to invoke when declaring this local var
    * @param localRef Whether or not this is a local ref
    */
  def set(
    retrievalLevel: scala.Double,
    name: java.lang.String,
    lhs: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ReadVarExpr
  ): BindingScope = js.native
  def set(
    retrievalLevel: scala.Double,
    name: java.lang.String,
    lhs: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ReadVarExpr,
    priority: scala.Double
  ): BindingScope = js.native
  def set(
    retrievalLevel: scala.Double,
    name: java.lang.String,
    lhs: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ReadVarExpr,
    priority: scala.Double,
    declareLocalCallback: DeclareLocalVarCallback
  ): BindingScope = js.native
  def set(
    retrievalLevel: scala.Double,
    name: java.lang.String,
    lhs: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ReadVarExpr,
    priority: scala.Double,
    declareLocalCallback: DeclareLocalVarCallback,
    localRef: atAngularCompilerLib.atAngularCompilerLibNumbers.`true`
  ): BindingScope = js.native
  def variableDeclarations(): js.Array[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Statement] = js.native
  def viewSnapshotStatements(): js.Array[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Statement] = js.native
}

/* static members */
@JSImport("@angular/compiler/src/render3/view/template", "BindingScope")
@js.native
object BindingScope extends js.Object {
  val ROOT_SCOPE: atAngularCompilerLib.srcRender3ViewTemplateMod.BindingScope = js.native
  var _ROOT_SCOPE: js.Any = js.native
}

