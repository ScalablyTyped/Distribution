package typings
package antdDashMobileDashRnLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ButtonClick extends js.Object {
  var buttonType: java.lang.String
  var styles: org.scalablytyped.runtime.StringDictionary[reactDashNativeLib.RegisteredStyle[_]]
  def buttonClick(): scala.Unit
}

object Anon_ButtonClick {
  @scala.inline
  def apply(
    buttonClick: () => scala.Unit,
    buttonType: java.lang.String,
    styles: org.scalablytyped.runtime.StringDictionary[reactDashNativeLib.RegisteredStyle[_]]
  ): Anon_ButtonClick = {
    val __obj = js.Dynamic.literal(buttonClick = js.Any.fromFunction0(buttonClick), buttonType = buttonType, styles = styles)
  
    __obj.asInstanceOf[Anon_ButtonClick]
  }
}

