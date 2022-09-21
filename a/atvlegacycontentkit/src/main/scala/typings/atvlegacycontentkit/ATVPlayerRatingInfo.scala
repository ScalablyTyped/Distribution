package typings.atvlegacycontentkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about the content rating of the item.
  *
  * The formats for these are dependant on the country, so may vary. This is written from a New Zealand perspective and their rating systems.
  *
  * Again, this class is very dependant on TV+ specific stuff, so isn't likely to be useful elsewhere.
  */
// tslint:disable-next-line:strict-export-declare-modifiers
trait ATVPlayerRatingInfo extends StObject {
  
  /**
    * The URL for retrieving an image for the particular rating. This is generally localised to the particular location (e.g. NZ ones will be coloured circles, but the US ones will be the
    * standard TV/MPAA icons).
    *
    * This is obtained from the com.apple.hls.rating-image in the session data of the HLS file.
    */
  var ratingImageURL: js.UndefOr[String] = js.undefined
  
  /**
    * The tag for this particular rating. Basically just seems to be an internal code (e.g. NZ_TV_M for the NZ TV rating of M).
    *
    * This is obtained from the com.apple.hls.rating-tag in the session data of the HLS file.
    */
  var ratingTag: js.UndefOr[String] = js.undefined
  
  /**
    * Whether a rating overlay should be shown.
    *
    * This is likely obtained from the com.apple.hls.display-ratings-overlay in the session data of the HLS file.
    */
  var shouldShowRatingOverlay: js.UndefOr[Boolean] = js.undefined
}
object ATVPlayerRatingInfo {
  
  inline def apply(): ATVPlayerRatingInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ATVPlayerRatingInfo]
  }
  
  extension [Self <: ATVPlayerRatingInfo](x: Self) {
    
    inline def setRatingImageURL(value: String): Self = StObject.set(x, "ratingImageURL", value.asInstanceOf[js.Any])
    
    inline def setRatingImageURLUndefined: Self = StObject.set(x, "ratingImageURL", js.undefined)
    
    inline def setRatingTag(value: String): Self = StObject.set(x, "ratingTag", value.asInstanceOf[js.Any])
    
    inline def setRatingTagUndefined: Self = StObject.set(x, "ratingTag", js.undefined)
    
    inline def setShouldShowRatingOverlay(value: Boolean): Self = StObject.set(x, "shouldShowRatingOverlay", value.asInstanceOf[js.Any])
    
    inline def setShouldShowRatingOverlayUndefined: Self = StObject.set(x, "shouldShowRatingOverlay", js.undefined)
  }
}
