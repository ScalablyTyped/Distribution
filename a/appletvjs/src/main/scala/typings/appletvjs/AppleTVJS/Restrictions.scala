package typings.appletvjs.AppleTVJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Restrictions extends js.Object {
  /** A boolean value that indicates if explicit media is allowed. */
  var allowsExplicit: Boolean
  /** The maximum movie ranking allowed. */
  var maxMovieRank: Double
  /** The maximum television show ranking allowed. */
  var maxTVShowRank: Double
  /** The maximum movie rating allowed for the specified country. */
  def maxMovieRatingForCountry(countryCode: String): String
  /** Sets the maximum television show rating allowed for the specified country. */
  def maxTVShowRatingForCountry(countryCode: String): String
}

object Restrictions {
  @scala.inline
  def apply(
    allowsExplicit: Boolean,
    maxMovieRank: Double,
    maxMovieRatingForCountry: String => String,
    maxTVShowRank: Double,
    maxTVShowRatingForCountry: String => String
  ): Restrictions = {
    val __obj = js.Dynamic.literal(allowsExplicit = allowsExplicit, maxMovieRank = maxMovieRank, maxMovieRatingForCountry = js.Any.fromFunction1(maxMovieRatingForCountry), maxTVShowRank = maxTVShowRank, maxTVShowRatingForCountry = js.Any.fromFunction1(maxTVShowRatingForCountry))
  
    __obj.asInstanceOf[Restrictions]
  }
}

