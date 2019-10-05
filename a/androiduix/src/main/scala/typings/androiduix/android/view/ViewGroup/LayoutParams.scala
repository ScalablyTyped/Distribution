package typings.androiduix.android.view.ViewGroup

import typings.androiduix.android.content.Context
import typings.androiduix.android.content.res.TypedArray
import typings.androiduix.androidui.attr.AttrBinder
import typings.androiduix.androidui.attr.AttrBinder.ClassBinderMap
import typings.androiduix.java.lang.JavaObject
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.view.ViewGroup.LayoutParams")
@js.native
class LayoutParams protected () extends JavaObject {
  def this(args: js.Any*) = this()
  def this(src: LayoutParams) = this()
  def this(context: Context, attrs: HTMLElement) = this()
  def this(width: Double, height: Double) = this()
  var _attrBinder: js.Any = js.native
  var height: Double = js.native
  var width: Double = js.native
  /* protected */ def createClassAttrBinder(): ClassBinderMap = js.native
  def getAttrBinder(): AttrBinder = js.native
  /* private */ def initBindAttr(): js.Any = js.native
  /* protected */ def setBaseAttributes(a: TypedArray, widthAttr: String, heightAttr: String): Unit = js.native
}

/* static members */
@JSGlobal("android.view.ViewGroup.LayoutParams")
@js.native
object LayoutParams extends js.Object {
  var ClassAttrBinderClazzMap: js.Any = js.native
  var FILL_PARENT: Double = js.native
  var MATCH_PARENT: Double = js.native
  var WRAP_CONTENT: Double = js.native
}

