package typings
package avaLib.avaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetaInterface extends js.Object {
  /** Path to the test file being executed. */
  var file: java.lang.String
}

object MetaInterface {
  @scala.inline
  def apply(file: java.lang.String): MetaInterface = {
    val __obj = js.Dynamic.literal(file = file)
  
    __obj.asInstanceOf[MetaInterface]
  }
}

