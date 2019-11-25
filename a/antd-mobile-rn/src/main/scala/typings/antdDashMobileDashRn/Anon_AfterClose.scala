package typings.antdDashMobileDashRn

import org.scalablytyped.runtime.StringDictionary
import typings.reactDashNative.reactDashNativeMod.RegisteredStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AfterClose extends js.Object {
  var closable: Boolean
  var disabled: Boolean
  var selected: Boolean
  var small: Boolean
  var styles: StringDictionary[RegisteredStyle[_]]
  def afterClose(): Unit
  def onChange(): Unit
  def onClose(): Unit
  def onLongPress(): Unit
}

object Anon_AfterClose {
  @scala.inline
  def apply(
    afterClose: () => Unit,
    closable: Boolean,
    disabled: Boolean,
    onChange: () => Unit,
    onClose: () => Unit,
    onLongPress: () => Unit,
    selected: Boolean,
    small: Boolean,
    styles: StringDictionary[RegisteredStyle[_]]
  ): Anon_AfterClose = {
    val __obj = js.Dynamic.literal(afterClose = js.Any.fromFunction0(afterClose), closable = closable.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], onChange = js.Any.fromFunction0(onChange), onClose = js.Any.fromFunction0(onClose), onLongPress = js.Any.fromFunction0(onLongPress), selected = selected.asInstanceOf[js.Any], small = small.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AfterClose]
  }
}

