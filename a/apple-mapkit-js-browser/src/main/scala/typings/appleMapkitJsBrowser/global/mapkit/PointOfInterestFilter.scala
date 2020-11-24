package typings.appleMapkitJsBrowser.global.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A filter used to determine the points of interest to include or exclude on a map or local search.
  */
@JSGlobal("mapkit.PointOfInterestFilter")
@js.native
class PointOfInterestFilter ()
  extends typings.appleMapkitJsBrowser.mapkit.PointOfInterestFilter
/* static members */
@JSGlobal("mapkit.PointOfInterestFilter")
@js.native
object PointOfInterestFilter extends js.Object {
  
  /**
    * Creates a point of interest filter that excludes categories from a list that you provide.
    */
  def excluding(categoryList: js.Array[typings.appleMapkitJsBrowser.mapkit.PointOfInterestCategory]): typings.appleMapkitJsBrowser.mapkit.PointOfInterestFilter = js.native
  
  /**
    * A filter that excludes all point of interest categories.
    */
  val filterExcludingAllCategories: typings.appleMapkitJsBrowser.mapkit.PointOfInterestFilter = js.native
  
  /**
    * A filter that includes all point of interest categories.
    */
  val filterIncludingAllCategories: typings.appleMapkitJsBrowser.mapkit.PointOfInterestFilter = js.native
  
  /**
    * Creates a point of interest filter that includes categories from a list that you provide.
    */
  def including(categoryList: js.Array[typings.appleMapkitJsBrowser.mapkit.PointOfInterestCategory]): typings.appleMapkitJsBrowser.mapkit.PointOfInterestFilter = js.native
}
