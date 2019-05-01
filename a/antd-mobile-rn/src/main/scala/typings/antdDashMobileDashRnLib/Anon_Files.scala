package typings
package antdDashMobileDashRnLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Files extends js.Object {
  var files: js.Array[scala.Nothing]
  var selectable: scala.Boolean
  var styles: org.scalablytyped.runtime.StringDictionary[reactDashNativeLib.reactDashNativeMod.RegisteredStyle[_]]
  def onChange(): scala.Unit
  def onFail(): scala.Unit
}

object Anon_Files {
  @scala.inline
  def apply(
    files: js.Array[scala.Nothing],
    onChange: () => scala.Unit,
    onFail: () => scala.Unit,
    selectable: scala.Boolean,
    styles: org.scalablytyped.runtime.StringDictionary[reactDashNativeLib.reactDashNativeMod.RegisteredStyle[_]]
  ): Anon_Files = {
    val __obj = js.Dynamic.literal(files = files, onChange = js.Any.fromFunction0(onChange), onFail = js.Any.fromFunction0(onFail), selectable = selectable, styles = styles)
  
    __obj.asInstanceOf[Anon_Files]
  }
}

