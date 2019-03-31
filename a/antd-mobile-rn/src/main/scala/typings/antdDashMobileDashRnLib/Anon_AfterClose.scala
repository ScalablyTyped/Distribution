package typings
package antdDashMobileDashRnLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AfterClose extends js.Object {
  var closable: scala.Boolean
  var disabled: scala.Boolean
  var selected: scala.Boolean
  var small: scala.Boolean
  var styles: org.scalablytyped.runtime.StringDictionary[reactDashNativeLib.RegisteredStyle[_]]
  def afterClose(): scala.Unit
  def onChange(): scala.Unit
  def onClose(): scala.Unit
  def onLongPress(): scala.Unit
}

object Anon_AfterClose {
  @scala.inline
  def apply(
    afterClose: () => scala.Unit,
    closable: scala.Boolean,
    disabled: scala.Boolean,
    onChange: () => scala.Unit,
    onClose: () => scala.Unit,
    onLongPress: () => scala.Unit,
    selected: scala.Boolean,
    small: scala.Boolean,
    styles: org.scalablytyped.runtime.StringDictionary[reactDashNativeLib.RegisteredStyle[_]]
  ): Anon_AfterClose = {
    val __obj = js.Dynamic.literal(afterClose = js.Any.fromFunction0(afterClose), closable = closable, disabled = disabled, onChange = js.Any.fromFunction0(onChange), onClose = js.Any.fromFunction0(onClose), onLongPress = js.Any.fromFunction0(onLongPress), selected = selected, small = small, styles = styles)
  
    __obj.asInstanceOf[Anon_AfterClose]
  }
}

