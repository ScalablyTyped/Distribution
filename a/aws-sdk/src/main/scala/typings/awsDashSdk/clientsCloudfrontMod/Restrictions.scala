package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Restrictions extends js.Object {
  /**
    * A complex type that controls the countries in which your content is distributed. CloudFront determines the location of your users using MaxMind GeoIP databases.
    */
  var GeoRestriction: typings.awsDashSdk.clientsCloudfrontMod.GeoRestriction
}

object Restrictions {
  @scala.inline
  def apply(GeoRestriction: GeoRestriction): Restrictions = {
    val __obj = js.Dynamic.literal(GeoRestriction = GeoRestriction)
  
    __obj.asInstanceOf[Restrictions]
  }
}

