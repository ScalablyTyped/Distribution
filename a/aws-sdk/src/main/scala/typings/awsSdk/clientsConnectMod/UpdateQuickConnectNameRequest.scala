package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateQuickConnectNameRequest extends StObject {
  
  /**
    * The description of the quick connect.
    */
  var Description: js.UndefOr[UpdateQuickConnectDescription] = js.undefined
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instance ID in the Amazon Resource Name (ARN) of the instance.
    */
  var InstanceId: typings.awsSdk.clientsConnectMod.InstanceId
  
  /**
    * The name of the quick connect.
    */
  var Name: js.UndefOr[QuickConnectName] = js.undefined
  
  /**
    * The identifier for the quick connect.
    */
  var QuickConnectId: typings.awsSdk.clientsConnectMod.QuickConnectId
}
object UpdateQuickConnectNameRequest {
  
  inline def apply(InstanceId: InstanceId, QuickConnectId: QuickConnectId): UpdateQuickConnectNameRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], QuickConnectId = QuickConnectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateQuickConnectNameRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateQuickConnectNameRequest] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: UpdateQuickConnectDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setName(value: QuickConnectName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setQuickConnectId(value: QuickConnectId): Self = StObject.set(x, "QuickConnectId", value.asInstanceOf[js.Any])
  }
}
