package typings.awsSdk.auditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeLog extends StObject {
  
  /**
    *  The action that was performed. 
    */
  var action: js.UndefOr[ActionEnum] = js.undefined
  
  /**
    *  The time when the action was performed and the changelog record was created. 
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The IAM user or role that performed the action. 
    */
  var createdBy: js.UndefOr[IamArn] = js.undefined
  
  /**
    *  The name of the object that changed. This could be the name of an assessment, control, or control set.
    */
  var objectName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  The object that was changed, such as an assessment, control, or control set. 
    */
  var objectType: js.UndefOr[ObjectTypeEnum] = js.undefined
}
object ChangeLog {
  
  inline def apply(): ChangeLog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChangeLog]
  }
  
  extension [Self <: ChangeLog](x: Self) {
    
    inline def setAction(value: ActionEnum): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setCreatedBy(value: IamArn): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedByUndefined: Self = StObject.set(x, "createdBy", js.undefined)
    
    inline def setObjectName(value: NonEmptyString): Self = StObject.set(x, "objectName", value.asInstanceOf[js.Any])
    
    inline def setObjectNameUndefined: Self = StObject.set(x, "objectName", js.undefined)
    
    inline def setObjectType(value: ObjectTypeEnum): Self = StObject.set(x, "objectType", value.asInstanceOf[js.Any])
    
    inline def setObjectTypeUndefined: Self = StObject.set(x, "objectType", js.undefined)
  }
}
