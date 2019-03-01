package typings
package appdmgLib.appdmgMod.appdmgNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpecificationContents extends js.Object {
  var name: js.UndefOr[java.lang.String] = js.undefined
  var path: java.lang.String
  var `type`: appdmgLib.appdmgLibStrings.link | appdmgLib.appdmgLibStrings.file | appdmgLib.appdmgLibStrings.position
  var x: scala.Double
  var y: scala.Double
}

object SpecificationContents {
  @scala.inline
  def apply(
    path: java.lang.String,
    `type`: appdmgLib.appdmgLibStrings.link | appdmgLib.appdmgLibStrings.file | appdmgLib.appdmgLibStrings.position,
    x: scala.Double,
    y: scala.Double,
    name: java.lang.String = null
  ): SpecificationContents = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[SpecificationContents]
  }
}

