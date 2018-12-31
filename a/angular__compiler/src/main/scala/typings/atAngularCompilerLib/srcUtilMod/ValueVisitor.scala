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

