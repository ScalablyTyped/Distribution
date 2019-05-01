package typings
package antdDashMobileDashRnLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cascade extends js.Object {
  var cascade: scala.Boolean
  var cols: scala.Double
  var pickerPrefixCls: java.lang.String
  var popupPrefixCls: java.lang.String
  var prefixCls: java.lang.String
  var styles: org.scalablytyped.runtime.StringDictionary[reactDashNativeLib.reactDashNativeMod.RegisteredStyle[_]]
  var title: java.lang.String
  var triggerType: java.lang.String
  def format(values: js.Array[java.lang.String]): java.lang.String
}

object Anon_Cascade {
  @scala.inline
  def apply(
    cascade: scala.Boolean,
    cols: scala.Double,
    format: js.Array[java.lang.String] => java.lang.String,
    pickerPrefixCls: java.lang.String,
    popupPrefixCls: java.lang.String,
    prefixCls: java.lang.String,
    styles: org.scalablytyped.runtime.StringDictionary[reactDashNativeLib.reactDashNativeMod.RegisteredStyle[_]],
    title: java.lang.String,
    triggerType: java.lang.String
  ): Anon_Cascade = {
    val __obj = js.Dynamic.literal(cascade = cascade, cols = cols, format = js.Any.fromFunction1(format), pickerPrefixCls = pickerPrefixCls, popupPrefixCls = popupPrefixCls, prefixCls = prefixCls, styles = styles, title = title, triggerType = triggerType)
  
    __obj.asInstanceOf[Anon_Cascade]
  }
}

