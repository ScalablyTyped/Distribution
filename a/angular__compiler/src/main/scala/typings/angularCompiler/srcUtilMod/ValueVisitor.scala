package typings.angularCompiler.srcUtilMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueVisitor extends js.Object {
  def visitArray(arr: js.Array[_], context: js.Any): js.Any
  def visitOther(value: js.Any, context: js.Any): js.Any
  def visitPrimitive(value: js.Any, context: js.Any): js.Any
  def visitStringMap(map: StringDictionary[js.Any], context: js.Any): js.Any
}

object ValueVisitor {
  @scala.inline
  def apply(
    visitArray: (js.Array[_], js.Any) => js.Any,
    visitOther: (js.Any, js.Any) => js.Any,
    visitPrimitive: (js.Any, js.Any) => js.Any,
    visitStringMap: (StringDictionary[js.Any], js.Any) => js.Any
  ): ValueVisitor = {
    val __obj = js.Dynamic.literal(visitArray = js.Any.fromFunction2(visitArray), visitOther = js.Any.fromFunction2(visitOther), visitPrimitive = js.Any.fromFunction2(visitPrimitive), visitStringMap = js.Any.fromFunction2(visitStringMap))
  
    __obj.asInstanceOf[ValueVisitor]
  }
}

