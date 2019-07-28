package typings.androiduix.androiduiNs.attrNs.AttrBinderNs

import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("androidui.attr.AttrBinder.ClassBinderMap")
@js.native
class ClassBinderMap () extends js.Object {
  def this(copyBinderMap: Map[String, ClassBinderValue]) = this()
  var binderMap: Map[String, ClassBinderValue] = js.native
  /* private */ def callGetter(attrName: js.Any, host: js.Any): js.Any = js.native
  /* private */ def callSetter(attrName: js.Any, host: js.Any, attrValue: js.Any, attrBinder: js.Any): js.Any = js.native
  def get(key: String): ClassBinderValue = js.native
  def set(key: String): ClassBinderMap = js.native
  def set(key: String, value: ClassBinderValue): ClassBinderMap = js.native
}

