package typings.appdmg.appdmgMod

import typings.appdmg.appdmgStrings.file
import typings.appdmg.appdmgStrings.link
import typings.appdmg.appdmgStrings.position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpecificationContents extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var path: String
  var `type`: link | file | position
  var x: Double
  var y: Double
}

object SpecificationContents {
  @scala.inline
  def apply(path: String, `type`: link | file | position, x: Double, y: Double, name: String = null): SpecificationContents = {
    val __obj = js.Dynamic.literal(path = path, x = x, y = y)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[SpecificationContents]
  }
}

