package typings
package aureliaDashBindingLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Raw extends js.Object {
  /**
    * The raw (unescaped) string parts of the template.
    * These are only retrieved and stored for tagged templates.
    */
  var raw: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Anon_Raw {
  @scala.inline
  def apply(raw: js.Array[java.lang.String] = null): Anon_Raw = {
    val __obj = js.Dynamic.literal()
    if (raw != null) __obj.updateDynamic("raw")(raw)
    __obj.asInstanceOf[Anon_Raw]
  }
}

