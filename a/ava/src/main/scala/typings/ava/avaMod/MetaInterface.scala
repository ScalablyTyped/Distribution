package typings.ava.avaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetaInterface extends js.Object {
  /** Path to the test file being executed. */
  var file: String
}

object MetaInterface {
  @scala.inline
  def apply(file: String): MetaInterface = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MetaInterface]
  }
}

