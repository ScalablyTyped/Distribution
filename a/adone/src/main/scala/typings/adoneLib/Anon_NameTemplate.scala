package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NameTemplate extends js.Object {
  var name: java.lang.String
  var template: java.lang.String
}

object Anon_NameTemplate {
  @scala.inline
  def apply(name: java.lang.String, template: java.lang.String): Anon_NameTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("template")(template)
    __obj.asInstanceOf[Anon_NameTemplate]
  }
}

