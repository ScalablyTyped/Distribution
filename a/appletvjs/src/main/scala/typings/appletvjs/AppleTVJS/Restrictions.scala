package typings.appletvjs.AppleTVJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Restrictions extends js.Object {
  
  /** A boolean value that indicates if explicit media is allowed. */
  var allowsExplicit: Boolean = js.native
  
  /** The maximum movie ranking allowed. */
  var maxMovieRank: Double = js.native
  
  /** The maximum movie rating allowed for the specified country. */
  def maxMovieRatingForCountry(countryCode: String): String = js.native
  
  /** The maximum television show ranking allowed. */
  var maxTVShowRank: Double = js.native
  
  /** Sets the maximum television show rating allowed for the specified country. */
  def maxTVShowRatingForCountry(countryCode: String): String = js.native
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
    val __obj = js.Dynamic.literal(allowsExplicit = allowsExplicit.asInstanceOf[js.Any], maxMovieRank = maxMovieRank.asInstanceOf[js.Any], maxMovieRatingForCountry = js.Any.fromFunction1(maxMovieRatingForCountry), maxTVShowRank = maxTVShowRank.asInstanceOf[js.Any], maxTVShowRatingForCountry = js.Any.fromFunction1(maxTVShowRatingForCountry))
    __obj.asInstanceOf[Restrictions]
  }
  
  @scala.inline
  implicit class RestrictionsOps[Self <: Restrictions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllowsExplicit(value: Boolean): Self = this.set("allowsExplicit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxMovieRank(value: Double): Self = this.set("maxMovieRank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxMovieRatingForCountry(value: String => String): Self = this.set("maxMovieRatingForCountry", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMaxTVShowRank(value: Double): Self = this.set("maxTVShowRank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxTVShowRatingForCountry(value: String => String): Self = this.set("maxTVShowRatingForCountry", js.Any.fromFunction1(value))
  }
}
