package typings.antdDashMobileDashRn

import org.scalablytyped.runtime.StringDictionary
import typings.reactDashNative.reactDashNativeMod.RegisteredStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cascade extends js.Object {
  var cascade: Boolean
  var cols: Double
  var pickerPrefixCls: String
  var popupPrefixCls: String
  var prefixCls: String
  var styles: StringDictionary[RegisteredStyle[_]]
  var title: String
  var triggerType: String
  def format(values: js.Array[String]): String
}

object Anon_Cascade {
  @scala.inline
  def apply(
    cascade: Boolean,
    cols: Double,
    format: js.Array[String] => String,
    pickerPrefixCls: String,
    popupPrefixCls: String,
    prefixCls: String,
    styles: StringDictionary[RegisteredStyle[_]],
    title: String,
    triggerType: String
  ): Anon_Cascade = {
    val __obj = js.Dynamic.literal(cascade = cascade, cols = cols, format = js.Any.fromFunction1(format), pickerPrefixCls = pickerPrefixCls, popupPrefixCls = popupPrefixCls, prefixCls = prefixCls, styles = styles, title = title, triggerType = triggerType)
  
    __obj.asInstanceOf[Anon_Cascade]
  }
}

