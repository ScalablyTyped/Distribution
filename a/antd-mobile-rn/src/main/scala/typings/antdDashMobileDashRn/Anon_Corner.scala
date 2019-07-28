package typings.antdDashMobileDashRn

import org.scalablytyped.runtime.StringDictionary
import typings.reactDashNative.reactDashNativeMod.RegisteredStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Corner extends js.Object {
  var corner: Boolean
  var dot: Boolean
  var overflowCount: Double
  var size: String
  var styles: StringDictionary[RegisteredStyle[_]]
}

object Anon_Corner {
  @scala.inline
  def apply(
    corner: Boolean,
    dot: Boolean,
    overflowCount: Double,
    size: String,
    styles: StringDictionary[RegisteredStyle[_]]
  ): Anon_Corner = {
    val __obj = js.Dynamic.literal(corner = corner, dot = dot, overflowCount = overflowCount, size = size, styles = styles)
  
    __obj.asInstanceOf[Anon_Corner]
  }
}

