package typings
package actionsDashOnDashGoogleLib.transactionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomerInfoOptions extends js.Object {
  var customerInfoProperties: js.Array[java.lang.String]
}

object CustomerInfoOptions {
  @scala.inline
  def apply(customerInfoProperties: js.Array[java.lang.String]): CustomerInfoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("customerInfoProperties")(customerInfoProperties)
    __obj.asInstanceOf[CustomerInfoOptions]
  }
}

