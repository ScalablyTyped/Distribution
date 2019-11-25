package typings.antdDashMobileDashRn

import org.scalablytyped.runtime.StringDictionary
import typings.reactDashNative.reactDashNativeMod.RegisteredStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Files extends js.Object {
  var files: js.Array[scala.Nothing]
  var selectable: Boolean
  var styles: StringDictionary[RegisteredStyle[_]]
  def onChange(): Unit
  def onFail(): Unit
}

object Anon_Files {
  @scala.inline
  def apply(
    files: js.Array[scala.Nothing],
    onChange: () => Unit,
    onFail: () => Unit,
    selectable: Boolean,
    styles: StringDictionary[RegisteredStyle[_]]
  ): Anon_Files = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], onChange = js.Any.fromFunction0(onChange), onFail = js.Any.fromFunction0(onFail), selectable = selectable.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Files]
  }
}

