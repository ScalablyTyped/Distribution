package typings.androiduix.global.androidui

import typings.androiduix.android.content.res.ColorStateList
import typings.androiduix.android.content.res.Resources
import typings.androiduix.android.graphics.drawable.Drawable
import typings.androiduix.android.view.View
import typings.androiduix.android.view.ViewGroup.LayoutParams
import typings.androiduix.androidui.attr.AttrBinder.ClassBinderValue
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object attr {
  
  @JSGlobal("androidui.attr.AttrBinder")
  @js.native
  class AttrBinder protected ()
    extends typings.androiduix.androidui.attr.AttrBinder {
    def this(host: View) = this()
    def this(host: LayoutParams) = this()
  }
  object AttrBinder {
    
    @JSGlobal("androidui.attr.AttrBinder.ClassBinderMap")
    @js.native
    class ClassBinderMap ()
      extends typings.androiduix.androidui.attr.AttrBinder.ClassBinderMap {
      def this(copyBinderMap: Map[String, ClassBinderValue]) = this()
    }
  }
  
  @JSGlobal("androidui.attr.AttrValueParser")
  @js.native
  class AttrValueParser ()
    extends typings.androiduix.androidui.attr.AttrValueParser
  object AttrValueParser {
    
    /* static member */
    @JSGlobal("androidui.attr.AttrValueParser.parseBoolean")
    @js.native
    def parseBoolean(r: Resources, value: String, defValue: Boolean): Boolean = js.native
    
    /* static member */
    @JSGlobal("androidui.attr.AttrValueParser.parseColor")
    @js.native
    def parseColor(r: Resources, value: String, defValue: Double): Double = js.native
    
    /* static member */
    @JSGlobal("androidui.attr.AttrValueParser.parseColorStateList")
    @js.native
    def parseColorStateList(r: Resources, value: String): ColorStateList = js.native
    
    /* static member */
    @JSGlobal("androidui.attr.AttrValueParser.parseDimension")
    @js.native
    def parseDimension(r: Resources, value: String, defValue: Double): Double = js.native
    @JSGlobal("androidui.attr.AttrValueParser.parseDimension")
    @js.native
    def parseDimension(r: Resources, value: String, defValue: Double, baseValue: Double): Double = js.native
    
    /* static member */
    @JSGlobal("androidui.attr.AttrValueParser.parseDimensionPixelOffset")
    @js.native
    def parseDimensionPixelOffset(r: Resources, value: String, defValue: Double): Double = js.native
    @JSGlobal("androidui.attr.AttrValueParser.parseDimensionPixelOffset")
    @js.native
    def parseDimensionPixelOffset(r: Resources, value: String, defValue: Double, baseValue: Double): Double = js.native
    
    /* static member */
    @JSGlobal("androidui.attr.AttrValueParser.parseDimensionPixelSize")
    @js.native
    def parseDimensionPixelSize(r: Resources, value: String, defValue: Double): Double = js.native
    @JSGlobal("androidui.attr.AttrValueParser.parseDimensionPixelSize")
    @js.native
    def parseDimensionPixelSize(r: Resources, value: String, defValue: Double, baseValue: Double): Double = js.native
    
    /* static member */
    @JSGlobal("androidui.attr.AttrValueParser.parseDrawable")
    @js.native
    def parseDrawable(r: Resources, value: String): Drawable = js.native
    
    /* static member */
    @JSGlobal("androidui.attr.AttrValueParser.parseFloat")
    @js.native
    def parseFloat(r: Resources, value: String, defValue: Double): Double = js.native
    
    /* static member */
    @JSGlobal("androidui.attr.AttrValueParser.parseInt")
    @js.native
    def parseInt(r: Resources, value: String, defValue: Double): Double = js.native
    
    /* static member */
    @JSGlobal("androidui.attr.AttrValueParser.parseString")
    @js.native
    def parseString(r: Resources, value: String): String = js.native
    @JSGlobal("androidui.attr.AttrValueParser.parseString")
    @js.native
    def parseString(r: Resources, value: String, defValue: String): String = js.native
    
    /* static member */
    @JSGlobal("androidui.attr.AttrValueParser.parseTextArray")
    @js.native
    def parseTextArray(r: Resources, value: String): js.Array[String] = js.native
  }
  
  @JSGlobal("androidui.attr.StateAttr")
  @js.native
  class StateAttr protected ()
    extends typings.androiduix.androidui.attr.StateAttr {
    def this(state: js.Array[Double]) = this()
  }
  
  @JSGlobal("androidui.attr.StateAttrList")
  @js.native
  class StateAttrList protected ()
    extends typings.androiduix.androidui.attr.StateAttrList {
    def this(view: View) = this()
  }
  object StateAttrList {
    
    /* static member */
    @JSGlobal("androidui.attr.StateAttrList.getViewStateValue")
    @js.native
    def getViewStateValue(attrName: String): Double = js.native
  }
}
