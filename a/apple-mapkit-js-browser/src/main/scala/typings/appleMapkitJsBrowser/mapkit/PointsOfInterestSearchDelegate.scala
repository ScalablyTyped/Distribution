package typings.appleMapkitJsBrowser.mapkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object or callback function that MapKit JS calls when fetching points of interest.
  */
trait PointsOfInterestSearchDelegate extends StObject {
  
  /**
    * Tells the delegate that the search completed.
    */
  var searchDidComplete: js.UndefOr[js.Function1[/* data */ PointsOfInterestSearchResponse, Unit]] = js.undefined
  
  /**
    * Tells the delegate that the search failed due to an error.
    */
  var searchDidError: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.undefined
}
object PointsOfInterestSearchDelegate {
  
  inline def apply(): PointsOfInterestSearchDelegate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointsOfInterestSearchDelegate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PointsOfInterestSearchDelegate] (val x: Self) extends AnyVal {
    
    inline def setSearchDidComplete(value: /* data */ PointsOfInterestSearchResponse => Unit): Self = StObject.set(x, "searchDidComplete", js.Any.fromFunction1(value))
    
    inline def setSearchDidCompleteUndefined: Self = StObject.set(x, "searchDidComplete", js.undefined)
    
    inline def setSearchDidError(value: /* error */ js.Error => Unit): Self = StObject.set(x, "searchDidError", js.Any.fromFunction1(value))
    
    inline def setSearchDidErrorUndefined: Self = StObject.set(x, "searchDidError", js.undefined)
  }
}
