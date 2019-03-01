package typings
package atAngularCompilerLib.srcUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueVisitor extends js.Object {
  def visitArray(arr: js.Array[_], context: js.Any): js.Any
  def visitOther(value: js.Any, context: js.Any): js.Any
  def visitPrimitive(value: js.Any, context: js.Any): js.Any
  def visitStringMap(map: org.scalablytyped.runtime.StringDictionary[js.Any], context: js.Any): js.Any
}

object ValueVisitor {
  @scala.inline
  def apply(
    visitArray: js.Function2[js.Array[_], js.Any, js.Any],
    visitOther: js.Function2[js.Any, js.Any, js.Any],
    visitPrimitive: js.Function2[js.Any, js.Any, js.Any],
    visitStringMap: js.Function2[org.scalablytyped.runtime.StringDictionary[js.Any], js.Any, js.Any]
  ): ValueVisitor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("visitArray")(visitArray)
    __obj.updateDynamic("visitOther")(visitOther)
    __obj.updateDynamic("visitPrimitive")(visitPrimitive)
    __obj.updateDynamic("visitStringMap")(visitStringMap)
    __obj.asInstanceOf[ValueVisitor]
  }
}

