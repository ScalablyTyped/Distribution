package typings.atAngularCompiler.srcRender3ViewTemplateMod

import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.ReadVarExpr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is used when one refers to variable such as: 'let abc = nextContext(2).$implicit`.
  * - key to the map is the string literal `"abc"`.
  * - value `retrievalLevel` is the level from which this value can be retrieved, which is 2 levels
  * up in example.
  * - value `lhs` is the left hand side which is an AST representing `abc`.
  * - value `declareLocalCallback` is a callback that is invoked when declaring the local.
  * - value `declare` is true if this value needs to be declared.
  * - value `localRef` is true if we are storing a local reference
  * - value `priority` dictates the sorting priority of this var declaration compared
  * to other var declarations on the same retrieval level. For example, if there is a
  * context variable and a local ref accessing the same parent view, the context var
  * declaration should always come before the local ref declaration.
  */
trait BindingData extends js.Object {
  var declare: Boolean
  var declareLocalCallback: js.UndefOr[DeclareLocalVarCallback] = js.undefined
  var lhs: ReadVarExpr
  var localRef: Boolean
  var priority: Double
  var retrievalLevel: Double
}

object BindingData {
  @scala.inline
  def apply(
    declare: Boolean,
    lhs: ReadVarExpr,
    localRef: Boolean,
    priority: Double,
    retrievalLevel: Double,
    declareLocalCallback: DeclareLocalVarCallback = null
  ): BindingData = {
    val __obj = js.Dynamic.literal(declare = declare, lhs = lhs, localRef = localRef, priority = priority, retrievalLevel = retrievalLevel)
    if (declareLocalCallback != null) __obj.updateDynamic("declareLocalCallback")(declareLocalCallback)
    __obj.asInstanceOf[BindingData]
  }
}

