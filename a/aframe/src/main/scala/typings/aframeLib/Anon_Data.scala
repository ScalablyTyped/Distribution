package typings
package aframeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  def parse(value: java.lang.String): js.Object
  def stringify(data: js.Object): java.lang.String
}

object Anon_Data {
  @scala.inline
  def apply(
    parse: js.Function1[java.lang.String, js.Object],
    stringify: js.Function1[js.Object, java.lang.String]
  ): Anon_Data = {
    val __obj = js.Dynamic.literal(parse = parse, stringify = stringify)
  
    __obj.asInstanceOf[Anon_Data]
  }
}

