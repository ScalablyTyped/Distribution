package typings
package atAngularCompilerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key extends js.Object {
  var key: java.lang.String
  var quoted: scala.Boolean
}

object Anon_Key {
  @scala.inline
  def apply(key: java.lang.String, quoted: scala.Boolean): Anon_Key = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("quoted")(quoted)
    __obj.asInstanceOf[Anon_Key]
  }
}

