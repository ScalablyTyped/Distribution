package typings
package awsDashSdkLib.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientCertificates extends js.Object {
  /**
    * The current page of elements from this collection.
    */
  var items: js.UndefOr[ListOfClientCertificate] = js.undefined
  var position: js.UndefOr[String] = js.undefined
}

object ClientCertificates {
  @scala.inline
  def apply(items: ListOfClientCertificate = null, position: String = null): ClientCertificates = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[ClientCertificates]
  }
}

