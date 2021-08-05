package typings.activexLibreoffice.com_.sun.star.sheet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * controls how a data pilot field's results are shown in relation to a selected reference result.
  * @see com.sun.star.sheet.DataPilotField
  */
trait DataPilotFieldReference extends StObject {
  
  /** contains the reference field */
  var ReferenceField: String
  
  /** contains the name of the reference item, when the {@link DataPilotFieldReference.ReferenceItemType} is NAMED otherwise is empty */
  var ReferenceItemName: String
  
  /**
    * selects between a named reference item and using the previous or next item for each item from the reference field.
    * @see com.sun.star.sheet.DataPilotFieldReferenceItemType
    */
  var ReferenceItemType: Double
  
  /**
    * contains the type of the reference.
    * @see com.sun.star.sheet.DataPilotFieldReferenceType
    */
  var ReferenceType: Double
}
object DataPilotFieldReference {
  
  inline def apply(
    ReferenceField: String,
    ReferenceItemName: String,
    ReferenceItemType: Double,
    ReferenceType: Double
  ): DataPilotFieldReference = {
    val __obj = js.Dynamic.literal(ReferenceField = ReferenceField.asInstanceOf[js.Any], ReferenceItemName = ReferenceItemName.asInstanceOf[js.Any], ReferenceItemType = ReferenceItemType.asInstanceOf[js.Any], ReferenceType = ReferenceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataPilotFieldReference]
  }
  
  extension [Self <: DataPilotFieldReference](x: Self) {
    
    inline def setReferenceField(value: String): Self = StObject.set(x, "ReferenceField", value.asInstanceOf[js.Any])
    
    inline def setReferenceItemName(value: String): Self = StObject.set(x, "ReferenceItemName", value.asInstanceOf[js.Any])
    
    inline def setReferenceItemType(value: Double): Self = StObject.set(x, "ReferenceItemType", value.asInstanceOf[js.Any])
    
    inline def setReferenceType(value: Double): Self = StObject.set(x, "ReferenceType", value.asInstanceOf[js.Any])
  }
}
