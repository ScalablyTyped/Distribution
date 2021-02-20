package typings.activexLibreoffice.com_.sun.star.sheet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * controls how a data pilot field's results are shown in relation to a selected reference result.
  * @see com.sun.star.sheet.DataPilotField
  */
@js.native
trait DataPilotFieldReference extends StObject {
  
  /** contains the reference field */
  var ReferenceField: String = js.native
  
  /** contains the name of the reference item, when the {@link DataPilotFieldReference.ReferenceItemType} is NAMED otherwise is empty */
  var ReferenceItemName: String = js.native
  
  /**
    * selects between a named reference item and using the previous or next item for each item from the reference field.
    * @see com.sun.star.sheet.DataPilotFieldReferenceItemType
    */
  var ReferenceItemType: Double = js.native
  
  /**
    * contains the type of the reference.
    * @see com.sun.star.sheet.DataPilotFieldReferenceType
    */
  var ReferenceType: Double = js.native
}
object DataPilotFieldReference {
  
  @scala.inline
  def apply(
    ReferenceField: String,
    ReferenceItemName: String,
    ReferenceItemType: Double,
    ReferenceType: Double
  ): DataPilotFieldReference = {
    val __obj = js.Dynamic.literal(ReferenceField = ReferenceField.asInstanceOf[js.Any], ReferenceItemName = ReferenceItemName.asInstanceOf[js.Any], ReferenceItemType = ReferenceItemType.asInstanceOf[js.Any], ReferenceType = ReferenceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataPilotFieldReference]
  }
  
  @scala.inline
  implicit class DataPilotFieldReferenceMutableBuilder[Self <: DataPilotFieldReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReferenceField(value: String): Self = StObject.set(x, "ReferenceField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceItemName(value: String): Self = StObject.set(x, "ReferenceItemName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceItemType(value: Double): Self = StObject.set(x, "ReferenceItemType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceType(value: Double): Self = StObject.set(x, "ReferenceType", value.asInstanceOf[js.Any])
  }
}
