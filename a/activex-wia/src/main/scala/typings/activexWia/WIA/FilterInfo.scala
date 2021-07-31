package typings.activexWia.WIA

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The FilterInfo object is a container that describes a Filter object without requiring a Filter to be Added to the process chain. See the FilterInfos
  * property on the ImageProcess object for details on accessing FilterInfo objects.
  */
trait FilterInfo extends StObject {
  
  /** Returns a technical Description of what the filter does and how to use it in a filter chain */
  val Description: String
  
  /** Returns the FilterID for this filter */
  val FilterID: String
  
  /** Returns the FilterInfo Name */
  val Name: String
  
  @JSName("WIA.FilterInfo_typekey")
  var WIADotFilterInfo_typekey: FilterInfo
}
object FilterInfo {
  
  @scala.inline
  def apply(Description: String, FilterID: String, Name: String, WIADotFilterInfo_typekey: FilterInfo): FilterInfo = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], FilterID = FilterID.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.updateDynamic("WIA.FilterInfo_typekey")(WIADotFilterInfo_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterInfo]
  }
  
  @scala.inline
  implicit class FilterInfoMutableBuilder[Self <: FilterInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterID(value: String): Self = StObject.set(x, "FilterID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWIADotFilterInfo_typekey(value: FilterInfo): Self = StObject.set(x, "WIA.FilterInfo_typekey", value.asInstanceOf[js.Any])
  }
}
