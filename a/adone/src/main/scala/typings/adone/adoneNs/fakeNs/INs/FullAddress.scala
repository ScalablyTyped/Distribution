package typings.adone.adoneNs.fakeNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FullAddress extends js.Object {
  var city: String
  var county: String
  var geo: Geo
  var state: String
  var streetA: String
  var streetB: String
  var streetC: String
  var streetD: String
  var zipcode: String
}

object FullAddress {
  @scala.inline
  def apply(
    city: String,
    county: String,
    geo: Geo,
    state: String,
    streetA: String,
    streetB: String,
    streetC: String,
    streetD: String,
    zipcode: String
  ): FullAddress = {
    val __obj = js.Dynamic.literal(city = city, county = county, geo = geo, state = state, streetA = streetA, streetB = streetB, streetC = streetC, streetD = streetD, zipcode = zipcode)
  
    __obj.asInstanceOf[FullAddress]
  }
}

