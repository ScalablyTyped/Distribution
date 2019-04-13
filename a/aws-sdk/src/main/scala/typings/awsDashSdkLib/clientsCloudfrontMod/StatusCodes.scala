package typings
package awsDashSdkLib.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatusCodes extends js.Object {
  /**
    * The items (status codes) for an origin group.
    */
  var Items: StatusCodeList
  /**
    * The number of status codes.
    */
  var Quantity: integer
}

object StatusCodes {
  @scala.inline
  def apply(Items: StatusCodeList, Quantity: integer): StatusCodes = {
    val __obj = js.Dynamic.literal(Items = Items, Quantity = Quantity)
  
    __obj.asInstanceOf[StatusCodes]
  }
}

