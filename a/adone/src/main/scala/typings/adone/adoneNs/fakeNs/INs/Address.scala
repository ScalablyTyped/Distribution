package typings.adone.adoneNs.fakeNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Address extends js.Object {
  var city: String
  var geo: Geo
  var state: String
  var street: String
  var suite: String
  var zipcode: String
}

object Address {
  @scala.inline
  def apply(city: String, geo: Geo, state: String, street: String, suite: String, zipcode: String): Address = {
    val __obj = js.Dynamic.literal(city = city, geo = geo, state = state, street = street, suite = suite, zipcode = zipcode)
  
    __obj.asInstanceOf[Address]
  }
}

