package typings.awsSdk.clientsRamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplacePermissionAssociationsWork extends StObject {
  
  /**
    * The date and time when this asynchronous background task was created.
    */
  var creationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the managed permission that this background task is replacing.
    */
  var fromPermissionArn: js.UndefOr[String] = js.undefined
  
  /**
    * The version of the managed permission that this background task is replacing.
    */
  var fromPermissionVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The unique identifier for the background task associated with one ReplacePermissionAssociations request.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The date and time when the status of this background task was last updated.
    */
  var lastUpdatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Specifies the current status of the background tasks for the specified ID. The output is one of the following strings:    IN_PROGRESS     COMPLETED     FAILED   
    */
  var status: js.UndefOr[ReplacePermissionAssociationsWorkStatus] = js.undefined
  
  /**
    * Specifies the reason for a FAILED status. This field is present only when there status is FAILED.
    */
  var statusMessage: js.UndefOr[String] = js.undefined
  
  /**
    * The ARN of the managed permission that this background task is associating with the resource shares in place of the managed permission and version specified in fromPermissionArn and fromPermissionVersion.
    */
  var toPermissionArn: js.UndefOr[String] = js.undefined
  
  /**
    * The version of the managed permission that this background task is associating with the resource shares. This is always the version that is currently the default for this managed permission.
    */
  var toPermissionVersion: js.UndefOr[String] = js.undefined
}
object ReplacePermissionAssociationsWork {
  
  inline def apply(): ReplacePermissionAssociationsWork = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplacePermissionAssociationsWork]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReplacePermissionAssociationsWork] (val x: Self) extends AnyVal {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setFromPermissionArn(value: String): Self = StObject.set(x, "fromPermissionArn", value.asInstanceOf[js.Any])
    
    inline def setFromPermissionArnUndefined: Self = StObject.set(x, "fromPermissionArn", js.undefined)
    
    inline def setFromPermissionVersion(value: String): Self = StObject.set(x, "fromPermissionVersion", value.asInstanceOf[js.Any])
    
    inline def setFromPermissionVersionUndefined: Self = StObject.set(x, "fromPermissionVersion", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLastUpdatedTime(value: js.Date): Self = StObject.set(x, "lastUpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimeUndefined: Self = StObject.set(x, "lastUpdatedTime", js.undefined)
    
    inline def setStatus(value: ReplacePermissionAssociationsWorkStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setToPermissionArn(value: String): Self = StObject.set(x, "toPermissionArn", value.asInstanceOf[js.Any])
    
    inline def setToPermissionArnUndefined: Self = StObject.set(x, "toPermissionArn", js.undefined)
    
    inline def setToPermissionVersion(value: String): Self = StObject.set(x, "toPermissionVersion", value.asInstanceOf[js.Any])
    
    inline def setToPermissionVersionUndefined: Self = StObject.set(x, "toPermissionVersion", js.undefined)
  }
}
