package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Obj extends js.Object {
  def parse(str: java.lang.String): js.Any
  def stringify(obj: js.Any): java.lang.String
}

object Anon_Obj {
  @scala.inline
  def apply(parse: js.Function1[java.lang.String, js.Any], stringify: js.Function1[js.Any, java.lang.String]): Anon_Obj = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("parse")(parse)
    __obj.updateDynamic("stringify")(stringify)
    __obj.asInstanceOf[Anon_Obj]
  }
}

