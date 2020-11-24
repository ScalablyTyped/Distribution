package typings.activexLibreoffice.com_.sun.star.sheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * controls how a data pilot field's results are shown in relation to a selected reference result.
  * @see com.sun.star.sheet.DataPilotField
  */
@js.native
trait DataPilotFieldReference extends js.Object {
  
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
  implicit class DataPilotFieldReferenceOps[Self <: DataPilotFieldReference] (val x: Self) extends AnyVal {
    
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
    def setReferenceField(value: String): Self = this.set("ReferenceField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceItemName(value: String): Self = this.set("ReferenceItemName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceItemType(value: Double): Self = this.set("ReferenceItemType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceType(value: Double): Self = this.set("ReferenceType", value.asInstanceOf[js.Any])
  }
}
