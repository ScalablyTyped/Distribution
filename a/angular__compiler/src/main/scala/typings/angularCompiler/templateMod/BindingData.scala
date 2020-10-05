package typings.angularCompiler.templateMod

import typings.angularCompiler.outputAstMod.Expression
import typings.angularCompiler.outputAstMod.Statement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@js.native
trait BindingData extends js.Object {
  var declare: Boolean = js.native
  var declareLocalCallback: js.UndefOr[DeclareLocalVarCallback] = js.native
  var lhs: Expression = js.native
  var localRef: Boolean = js.native
  var priority: Double = js.native
  var retrievalLevel: Double = js.native
}

object BindingData {
  @scala.inline
  def apply(declare: Boolean, lhs: Expression, localRef: Boolean, priority: Double, retrievalLevel: Double): BindingData = {
    val __obj = js.Dynamic.literal(declare = declare.asInstanceOf[js.Any], lhs = lhs.asInstanceOf[js.Any], localRef = localRef.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], retrievalLevel = retrievalLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[BindingData]
  }
  @scala.inline
  implicit class BindingDataOps[Self <: BindingData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDeclare(value: Boolean): Self = this.set("declare", value.asInstanceOf[js.Any])
    @scala.inline
    def setLhs(value: Expression): Self = this.set("lhs", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocalRef(value: Boolean): Self = this.set("localRef", value.asInstanceOf[js.Any])
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    @scala.inline
    def setRetrievalLevel(value: Double): Self = this.set("retrievalLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeclareLocalCallback(value: (/* scope */ BindingScope, /* relativeLevel */ Double) => js.Array[Statement]): Self = this.set("declareLocalCallback", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDeclareLocalCallback: Self = this.set("declareLocalCallback", js.undefined)
  }
  
}

