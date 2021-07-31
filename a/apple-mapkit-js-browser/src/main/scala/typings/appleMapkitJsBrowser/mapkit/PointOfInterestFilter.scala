package typings.appleMapkitJsBrowser.mapkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A filter used to determine the points of interest to include or exclude on a map or local search.
  */
trait PointOfInterestFilter extends StObject {
  
  /**
    * Returns a Boolean value that indicates whether the filter excludes the provided point of interest category.
    */
  def excludesCategory(category: PointOfInterestCategory): Boolean
  
  /**
    * Returns a Boolean value that indicates whether the filter includes the provided point of interest category.
    */
  def includesCategory(category: PointOfInterestCategory): Boolean
}
object PointOfInterestFilter {
  
  @scala.inline
  def apply(
    excludesCategory: PointOfInterestCategory => Boolean,
    includesCategory: PointOfInterestCategory => Boolean
  ): PointOfInterestFilter = {
    val __obj = js.Dynamic.literal(excludesCategory = js.Any.fromFunction1(excludesCategory), includesCategory = js.Any.fromFunction1(includesCategory))
    __obj.asInstanceOf[PointOfInterestFilter]
  }
  
  @scala.inline
  implicit class PointOfInterestFilterMutableBuilder[Self <: PointOfInterestFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExcludesCategory(value: PointOfInterestCategory => Boolean): Self = StObject.set(x, "excludesCategory", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIncludesCategory(value: PointOfInterestCategory => Boolean): Self = StObject.set(x, "includesCategory", js.Any.fromFunction1(value))
  }
}
