package typings.appleMapkitJsBrowser.mapkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object that fetches points of interest within a specified region.
  */
@js.native
trait PointsOfInterestSearch extends StObject {
  
  /**
    * The maximum distance to use from the center of the region for fetching points of interest.
    */
  val MaxRadius: Double = js.native
  
  /**
    * Cancels a search request using its request ID.
    *
    * @param id The integer ID returned by a call to Search.search
    * @return true if the server canceled the pending search request.
    */
  def cancel(id: Double): Boolean = js.native
  
  /**
    * The center point of the request represented as latitude and longitude.
    */
  var center: Coordinate = js.native
  
  /**
    * The language ID to use when fetching points of interest.
    */
  var language: String = js.native
  
  /**
    * A filter that lists points of interest categories to include or exclude.
    */
  var pointOfInterestFilter: PointOfInterestFilter = js.native
  
  /**
    * The distance provided in meters, or the longest distance derived from the center point to the region’s bounding box.
    */
  var radius: Double = js.native
  
  /**
    * The region that bounds the area in which to fetch points of interest.
    */
  var region: CoordinateRegion = js.native
  
  def search(callback: PointsOfInterestSearchCallback): Double = js.native
  def search(callback: PointsOfInterestSearchCallback, options: PointsOfInterestSearchOptions): Double = js.native
  /**
    * Fetches points of interest.
    *
    * @param query A String or a SearchAutocompleteResult.
    * @param callback A callback function or delegate object.
    * @param options A PointsOfInterestSearchOptions object.
    * @returns a request ID (integer) that can be passed to cancel to abort a
    * pending request.
    */
  def search(callback: PointsOfInterestSearchDelegate): Double = js.native
  def search(callback: PointsOfInterestSearchDelegate, options: PointsOfInterestSearchOptions): Double = js.native
}
