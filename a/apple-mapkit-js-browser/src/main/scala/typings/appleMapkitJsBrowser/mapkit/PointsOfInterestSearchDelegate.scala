package typings.appleMapkitJsBrowser.mapkit

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object or callback function that MapKit JS calls when fetching points of interest.
  */
@js.native
trait PointsOfInterestSearchDelegate extends js.Object {
  
  /**
    * Tells the delegate that the search completed.
    */
  var searchDidComplete: js.UndefOr[js.Function1[/* data */ PointsOfInterestSearchResponse, Unit]] = js.native
  
  /**
    * Tells the delegate that the search failed due to an error.
    */
  var searchDidError: js.UndefOr[js.Function1[/* error */ Error, Unit]] = js.native
}
object PointsOfInterestSearchDelegate {
  
  @scala.inline
  def apply(): PointsOfInterestSearchDelegate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointsOfInterestSearchDelegate]
  }
  
  @scala.inline
  implicit class PointsOfInterestSearchDelegateOps[Self <: PointsOfInterestSearchDelegate] (val x: Self) extends AnyVal {
    
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
    def setSearchDidComplete(value: /* data */ PointsOfInterestSearchResponse => Unit): Self = this.set("searchDidComplete", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSearchDidComplete: Self = this.set("searchDidComplete", js.undefined)
    
    @scala.inline
    def setSearchDidError(value: /* error */ Error => Unit): Self = this.set("searchDidError", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSearchDidError: Self = this.set("searchDidError", js.undefined)
  }
}
