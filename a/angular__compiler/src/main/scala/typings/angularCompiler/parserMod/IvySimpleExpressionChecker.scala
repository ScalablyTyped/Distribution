package typings.angularCompiler.parserMod

import typings.angularCompiler.astMod.RecursiveAstVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class implements SimpleExpressionChecker used in View Engine and performs more strict checks
  * to make sure host bindings do not contain pipes. In View Engine, having pipes in host bindings is
  * not supported as well, but in some cases (like `!(value | async)`) the error is not triggered at
  * compile time. In order to preserve View Engine behavior, more strict checks are introduced for
  * Ivy mode only.
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.angularCompiler.astMod.AstVisitor because Already inherited
- typings.angularCompiler.parserMod.SimpleExpressionChecker because var conflicts: visit, visitASTWithSource. Inlined errors */ @js.native
trait IvySimpleExpressionChecker extends RecursiveAstVisitor {
  var errors: js.Array[String] = js.native
  def visitPipe(): Unit = js.native
}

