package typings.androiduix.global.androidui

import typings.androiduix.android.content.res.ColorStateList
import typings.androiduix.android.content.res.Resources
import typings.androiduix.android.graphics.drawable.Drawable
import typings.androiduix.android.view.View
import typings.androiduix.android.view.ViewGroup.LayoutParams
import typings.androiduix.androidui.attr.AttrBinder.ClassBinderValue
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("androidui.attr")
@js.native
object attr extends js.Object {
  @js.native
  class AttrBinder protected ()
    extends typings.androiduix.androidui.attr.AttrBinder {
    def this(host: View) = this()
    def this(host: LayoutParams) = this()
  }
  
  @js.native
  class AttrValueParser ()
    extends typings.androiduix.androidui.attr.AttrValueParser
  
  @js.native
  class StateAttr protected ()
    extends typings.androiduix.androidui.attr.StateAttr {
    def this(state: js.Array[Double]) = this()
  }
  
  @js.native
  class StateAttrList protected ()
    extends typings.androiduix.androidui.attr.StateAttrList {
    def this(view: View) = this()
  }
  
  @js.native
  object AttrBinder extends js.Object {
    @js.native
    class ClassBinderMap ()
      extends typings.androiduix.androidui.attr.AttrBinder.ClassBinderMap {
      def this(copyBinderMap: Map[String, ClassBinderValue]) = this()
    }
    
  }
  
  /* static members */
  @js.native
  object AttrValueParser extends js.Object {
    def parseBoolean(r: Resources, value: String, defValue: Boolean): Boolean = js.native
    def parseColor(r: Resources, value: String, defValue: Double): Double = js.native
    def parseColorStateList(r: Resources, value: String): ColorStateList = js.native
    def parseDimension(r: Resources, value: String, defValue: Double): Double = js.native
    def parseDimension(r: Resources, value: String, defValue: Double, baseValue: Double): Double = js.native
    def parseDimensionPixelOffset(r: Resources, value: String, defValue: Double): Double = js.native
    def parseDimensionPixelOffset(r: Resources, value: String, defValue: Double, baseValue: Double): Double = js.native
    def parseDimensionPixelSize(r: Resources, value: String, defValue: Double): Double = js.native
    def parseDimensionPixelSize(r: Resources, value: String, defValue: Double, baseValue: Double): Double = js.native
    def parseDrawable(r: Resources, value: String): Drawable = js.native
    def parseFloat(r: Resources, value: String, defValue: Double): Double = js.native
    def parseInt(r: Resources, value: String, defValue: Double): Double = js.native
    def parseString(r: Resources, value: String): String = js.native
    def parseString(r: Resources, value: String, defValue: String): String = js.native
    def parseTextArray(r: Resources, value: String): js.Array[String] = js.native
  }
  
  /* static members */
  @js.native
  object StateAttrList extends js.Object {
    def getViewStateValue(attrName: String): Double = js.native
  }
  
}

