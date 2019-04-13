package typings
package awsDashSdkLib.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Origins extends js.Object {
  /**
    * A complex type that contains origins or origin groups for this distribution.
    */
  var Items: OriginList
  /**
    * The number of origins or origin groups for this distribution.
    */
  var Quantity: integer
}

object Origins {
  @scala.inline
  def apply(Items: OriginList, Quantity: integer): Origins = {
    val __obj = js.Dynamic.literal(Items = Items, Quantity = Quantity)
  
    __obj.asInstanceOf[Origins]
  }
}

