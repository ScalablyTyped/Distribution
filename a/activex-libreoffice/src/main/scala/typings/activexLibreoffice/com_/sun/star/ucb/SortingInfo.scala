package typings.activexLibreoffice.com_.sun.star.ucb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** contains a sorting info. */
trait SortingInfo extends StObject {
  
  /** contains a flag indicating the sort mode (ascending or descending). */
  var Ascending: Boolean
  
  /** specifies the name of a property to use for sorting ( e.g. "Title" ). */
  var PropertyName: String
}
object SortingInfo {
  
  @scala.inline
  def apply(Ascending: Boolean, PropertyName: String): SortingInfo = {
    val __obj = js.Dynamic.literal(Ascending = Ascending.asInstanceOf[js.Any], PropertyName = PropertyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortingInfo]
  }
  
  @scala.inline
  implicit class SortingInfoMutableBuilder[Self <: SortingInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAscending(value: Boolean): Self = StObject.set(x, "Ascending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyName(value: String): Self = StObject.set(x, "PropertyName", value.asInstanceOf[js.Any])
  }
}
