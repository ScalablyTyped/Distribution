package typings
package awsDashLambdaLib.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncryptionKey extends js.Object {
  var id: java.lang.String
  var `type`: java.lang.String
}

object EncryptionKey {
  @scala.inline
  def apply(id: java.lang.String, `type`: java.lang.String): EncryptionKey = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[EncryptionKey]
  }
}

