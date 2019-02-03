package typings
package androiduixLib.androidNs.viewNs.ViewGroupNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.view.ViewGroup.LayoutParams")
@js.native
class LayoutParams protected ()
  extends androiduixLib.javaNs.langNs.JavaObject {
  def this(args: js.Any*) = this()
  def this(src: LayoutParams) = this()
  def this(context: androiduixLib.androidNs.contentNs.Context, attrs: stdLib.HTMLElement) = this()
  def this(width: scala.Double, height: scala.Double) = this()
  var _attrBinder: js.Any = js.native
  var height: scala.Double = js.native
  var width: scala.Double = js.native
  /* protected */ def createClassAttrBinder(): androiduixLib.androiduiNs.attrNs.AttrBinderNs.ClassBinderMap = js.native
  def getAttrBinder(): androiduixLib.androiduiNs.attrNs.AttrBinder = js.native
  /* private */ def initBindAttr(): js.Any = js.native
  /* protected */ def setBaseAttributes(
    a: androiduixLib.androidNs.contentNs.resNs.TypedArray,
    widthAttr: java.lang.String,
    heightAttr: java.lang.String
  ): scala.Unit = js.native
}

/* static members */
@JSGlobal("android.view.ViewGroup.LayoutParams")
@js.native
object LayoutParams extends js.Object {
  var ClassAttrBinderClazzMap: js.Any = js.native
  var FILL_PARENT: scala.Double = js.native
  var MATCH_PARENT: scala.Double = js.native
  var WRAP_CONTENT: scala.Double = js.native
}

