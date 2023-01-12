package typings.activexWia.WIA

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Filter object represents a unit of modification on an ImageFile. To use a Filter, add it to the Filters collection, then set the filter's
  * properties and finally use the Apply method of the ImageProcess object to filter an ImageFile.
  */
trait Filter extends StObject {
  
  /** Returns a Description of what the filter does */
  val Description: String
  
  /** Returns the FilterID for this Filter */
  val FilterID: String
  
  /** Returns the Filter Name */
  val Name: String
  
  def Properties(Index: String): Property
  /** Returns the specified item in the collection either by position or name. */
  /** A collection of all properties for this filter */
  def Properties(Index: Double): Property
  /** A collection of all properties for this filter */
  @JSName("Properties")
  val Properties_Original: Properties
  
  /* private */ @JSName("WIA.Filter_typekey")
  var WIADotFilter_typekey: Filter
}
object Filter {
  
  inline def apply(
    Description: String,
    FilterID: String,
    Name: String,
    Properties: Properties,
    WIADotFilter_typekey: Filter
  ): Filter = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], FilterID = FilterID.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Properties = Properties.asInstanceOf[js.Any])
    __obj.updateDynamic("WIA.Filter_typekey")(WIADotFilter_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Filter] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setFilterID(value: String): Self = StObject.set(x, "FilterID", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: Properties): Self = StObject.set(x, "Properties", value.asInstanceOf[js.Any])
    
    inline def setWIADotFilter_typekey(value: Filter): Self = StObject.set(x, "WIA.Filter_typekey", value.asInstanceOf[js.Any])
  }
}
