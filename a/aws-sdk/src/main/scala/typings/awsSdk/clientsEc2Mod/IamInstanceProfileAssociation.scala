package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IamInstanceProfileAssociation extends StObject {
  
  /**
    * The ID of the association.
    */
  var AssociationId: js.UndefOr[String] = js.undefined
  
  /**
    * The IAM instance profile.
    */
  var IamInstanceProfile: js.UndefOr[typings.awsSdk.clientsEc2Mod.IamInstanceProfile] = js.undefined
  
  /**
    * The ID of the instance.
    */
  var InstanceId: js.UndefOr[String] = js.undefined
  
  /**
    * The state of the association.
    */
  var State: js.UndefOr[IamInstanceProfileAssociationState] = js.undefined
  
  /**
    * The time the IAM instance profile was associated with the instance.
    */
  var Timestamp: js.UndefOr[js.Date] = js.undefined
}
object IamInstanceProfileAssociation {
  
  inline def apply(): IamInstanceProfileAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IamInstanceProfileAssociation]
  }
  
  extension [Self <: IamInstanceProfileAssociation](x: Self) {
    
    inline def setAssociationId(value: String): Self = StObject.set(x, "AssociationId", value.asInstanceOf[js.Any])
    
    inline def setAssociationIdUndefined: Self = StObject.set(x, "AssociationId", js.undefined)
    
    inline def setIamInstanceProfile(value: IamInstanceProfile): Self = StObject.set(x, "IamInstanceProfile", value.asInstanceOf[js.Any])
    
    inline def setIamInstanceProfileUndefined: Self = StObject.set(x, "IamInstanceProfile", js.undefined)
    
    inline def setInstanceId(value: String): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    inline def setState(value: IamInstanceProfileAssociationState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setTimestamp(value: js.Date): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "Timestamp", js.undefined)
  }
}
