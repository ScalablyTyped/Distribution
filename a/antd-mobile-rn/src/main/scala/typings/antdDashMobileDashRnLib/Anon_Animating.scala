package typings
package antdDashMobileDashRnLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Animating extends js.Object {
  var animating: scala.Boolean
  var color: java.lang.String
  var size: java.lang.String
  var styles: org.scalablytyped.runtime.StringDictionary[reactDashNativeLib.RegisteredStyle[_]]
  var toast: scala.Boolean
}

object Anon_Animating {
  @scala.inline
  def apply(
    animating: scala.Boolean,
    color: java.lang.String,
    size: java.lang.String,
    styles: org.scalablytyped.runtime.StringDictionary[reactDashNativeLib.RegisteredStyle[_]],
    toast: scala.Boolean
  ): Anon_Animating = {
    val __obj = js.Dynamic.literal(animating = animating, color = color, size = size, styles = styles, toast = toast)
  
    __obj.asInstanceOf[Anon_Animating]
  }
}

