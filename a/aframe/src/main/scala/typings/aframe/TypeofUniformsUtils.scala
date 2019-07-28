package typings.aframe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofUniformsUtils extends js.Object {
  def clone(uniforms_src: js.Any): js.Any
  def merge(uniforms: js.Array[_]): js.Any
}

object TypeofUniformsUtils {
  @scala.inline
  def apply(clone: js.Any => js.Any, merge: js.Array[_] => js.Any): TypeofUniformsUtils = {
    val __obj = js.Dynamic.literal(clone = js.Any.fromFunction1(clone), merge = js.Any.fromFunction1(merge))
  
    __obj.asInstanceOf[TypeofUniformsUtils]
  }
}

