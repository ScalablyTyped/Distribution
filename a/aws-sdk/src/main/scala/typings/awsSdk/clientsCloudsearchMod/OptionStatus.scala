package typings.awsSdk.clientsCloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionStatus extends StObject {
  
  /**
    * A timestamp for when this option was created.
    */
  var CreationDate: js.Date
  
  /**
    * Indicates that the option will be deleted once processing is complete.
    */
  var PendingDeletion: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The state of processing a change to an option. Possible values: RequiresIndexDocuments: the option's latest value will not be deployed until IndexDocuments has been called and indexing is complete. Processing: the option's latest value is in the process of being activated.  Active: the option's latest value is completely deployed. FailedToValidate: the option value is not compatible with the domain's data and cannot be used to index the data. You must either modify the option value or update or remove the incompatible documents. 
    */
  var State: OptionState
  
  /**
    * A timestamp for when this option was last updated.
    */
  var UpdateDate: js.Date
  
  /**
    * A unique integer that indicates when this option was last updated.
    */
  var UpdateVersion: js.UndefOr[UIntValue] = js.undefined
}
object OptionStatus {
  
  inline def apply(CreationDate: js.Date, State: OptionState, UpdateDate: js.Date): OptionStatus = {
    val __obj = js.Dynamic.literal(CreationDate = CreationDate.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any], UpdateDate = UpdateDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionStatus]
  }
  
  extension [Self <: OptionStatus](x: Self) {
    
    inline def setCreationDate(value: js.Date): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    inline def setPendingDeletion(value: Boolean): Self = StObject.set(x, "PendingDeletion", value.asInstanceOf[js.Any])
    
    inline def setPendingDeletionUndefined: Self = StObject.set(x, "PendingDeletion", js.undefined)
    
    inline def setState(value: OptionState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setUpdateDate(value: js.Date): Self = StObject.set(x, "UpdateDate", value.asInstanceOf[js.Any])
    
    inline def setUpdateVersion(value: UIntValue): Self = StObject.set(x, "UpdateVersion", value.asInstanceOf[js.Any])
    
    inline def setUpdateVersionUndefined: Self = StObject.set(x, "UpdateVersion", js.undefined)
  }
}
