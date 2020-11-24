package typings.appleMapkitJsBrowser.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A filter used to determine the points of interest to include or exclude on a map or local search.
  */
@js.native
trait PointOfInterestFilter extends js.Object {
  
  /**
    * Returns a Boolean value that indicates whether the filter excludes the provided point of interest category.
    */
  def excludesCategory(category: PointOfInterestCategory): Boolean = js.native
  
  /**
    * Returns a Boolean value that indicates whether the filter includes the provided point of interest category.
    */
  def includesCategory(category: PointOfInterestCategory): Boolean = js.native
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
  implicit class PointOfInterestFilterOps[Self <: PointOfInterestFilter] (val x: Self) extends AnyVal {
    
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
    def setExcludesCategory(value: PointOfInterestCategory => Boolean): Self = this.set("excludesCategory", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIncludesCategory(value: PointOfInterestCategory => Boolean): Self = this.set("includesCategory", js.Any.fromFunction1(value))
  }
}
