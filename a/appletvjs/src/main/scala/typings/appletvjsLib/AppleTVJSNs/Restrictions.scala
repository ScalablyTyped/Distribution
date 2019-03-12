package typings
package appletvjsLib.AppleTVJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Restrictions extends js.Object {
  /** A boolean value that indicates if explicit media is allowed. */
  var allowsExplicit: scala.Boolean
  /** The maximum movie ranking allowed. */
  var maxMovieRank: scala.Double
  /** The maximum television show ranking allowed. */
  var maxTVShowRank: scala.Double
  /** The maximum movie rating allowed for the specified country. */
  def maxMovieRatingForCountry(countryCode: java.lang.String): java.lang.String
  /** Sets the maximum television show rating allowed for the specified country. */
  def maxTVShowRatingForCountry(countryCode: java.lang.String): java.lang.String
}

object Restrictions {
  @scala.inline
  def apply(
    allowsExplicit: scala.Boolean,
    maxMovieRank: scala.Double,
    maxMovieRatingForCountry: java.lang.String => java.lang.String,
    maxTVShowRank: scala.Double,
    maxTVShowRatingForCountry: java.lang.String => java.lang.String
  ): Restrictions = {
    val __obj = js.Dynamic.literal(allowsExplicit = allowsExplicit, maxMovieRank = maxMovieRank, maxMovieRatingForCountry = js.Any.fromFunction1(maxMovieRatingForCountry), maxTVShowRank = maxTVShowRank, maxTVShowRatingForCountry = js.Any.fromFunction1(maxTVShowRatingForCountry))
  
    __obj.asInstanceOf[Restrictions]
  }
}

