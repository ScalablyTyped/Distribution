package typings
package atomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Metadata extends js.Object {
  var metadata: js.Object
  var text: java.lang.String
}

object Anon_Metadata {
  @scala.inline
  def apply(metadata: js.Object, text: java.lang.String): Anon_Metadata = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("metadata")(metadata)
    __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Anon_Metadata]
  }
}

