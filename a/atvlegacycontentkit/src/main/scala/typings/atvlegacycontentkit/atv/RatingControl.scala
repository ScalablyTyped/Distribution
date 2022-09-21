package typings.atvlegacycontentkit.atv

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A dialog that allows the user to rate a media item.
  */
trait RatingControl extends StObject {
  
  /**
    * Whether the user has set the rating previously or not. Basically this changes the stars from white (false) to gold (true) initially. They are always set to gold when the user adjusts
    * them.
    */
  var hasUserSetRating: Boolean
  
  /**
    * Called when the user exists the dialog without selecting a rating.
    */
  var onCancel: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Called when the user selects a rating. Selected rating is a number between 0 and 1.
    */
  var onRate: js.UndefOr[js.Function1[/* selectedRating */ Double, Unit]] = js.undefined
  
  /**
    * The rating to have initially. Must be between 0 and 1.
    */
  var rating: Double
  
  /**
    * Shows the dialog.
    */
  def show(): Unit
  
  /**
    * The title of the media item.
    */
  var title: String
}
object RatingControl {
  
  inline def apply(hasUserSetRating: Boolean, rating: Double, show: () => Unit, title: String): RatingControl = {
    val __obj = js.Dynamic.literal(hasUserSetRating = hasUserSetRating.asInstanceOf[js.Any], rating = rating.asInstanceOf[js.Any], show = js.Any.fromFunction0(show), title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[RatingControl]
  }
  
  extension [Self <: RatingControl](x: Self) {
    
    inline def setHasUserSetRating(value: Boolean): Self = StObject.set(x, "hasUserSetRating", value.asInstanceOf[js.Any])
    
    inline def setOnCancel(value: () => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction0(value))
    
    inline def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
    
    inline def setOnRate(value: /* selectedRating */ Double => Unit): Self = StObject.set(x, "onRate", js.Any.fromFunction1(value))
    
    inline def setOnRateUndefined: Self = StObject.set(x, "onRate", js.undefined)
    
    inline def setRating(value: Double): Self = StObject.set(x, "rating", value.asInstanceOf[js.Any])
    
    inline def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
