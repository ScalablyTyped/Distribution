package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcessDetails extends StObject {
  
  /**
    * The effective user ID of the user that executed the process.
    */
  var Euid: js.UndefOr[Integer] = js.undefined
  
  /**
    * The absolute path of the process executable file.
    */
  var ExecutablePath: js.UndefOr[String] = js.undefined
  
  /**
    * The SHA256 hash of the process executable.
    */
  var ExecutableSha256: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the process's lineage.
    */
  var Lineage: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.Lineage] = js.undefined
  
  /**
    * The name of the process.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the child process.
    */
  var NamespacePid: js.UndefOr[Integer] = js.undefined
  
  /**
    * The unique ID of the parent process. This ID is assigned to the parent process by GuardDuty.
    */
  var ParentUuid: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the process.
    */
  var Pid: js.UndefOr[Integer] = js.undefined
  
  /**
    * The present working directory of the process.
    */
  var Pwd: js.UndefOr[String] = js.undefined
  
  /**
    * The time when the process started. This is in UTC format.
    */
  var StartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The user that executed the process.
    */
  var User: js.UndefOr[String] = js.undefined
  
  /**
    * The unique ID of the user that executed the process.
    */
  var UserId: js.UndefOr[Integer] = js.undefined
  
  /**
    * The unique ID assigned to the process by GuardDuty.
    */
  var Uuid: js.UndefOr[String] = js.undefined
}
object ProcessDetails {
  
  inline def apply(): ProcessDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProcessDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProcessDetails] (val x: Self) extends AnyVal {
    
    inline def setEuid(value: Integer): Self = StObject.set(x, "Euid", value.asInstanceOf[js.Any])
    
    inline def setEuidUndefined: Self = StObject.set(x, "Euid", js.undefined)
    
    inline def setExecutablePath(value: String): Self = StObject.set(x, "ExecutablePath", value.asInstanceOf[js.Any])
    
    inline def setExecutablePathUndefined: Self = StObject.set(x, "ExecutablePath", js.undefined)
    
    inline def setExecutableSha256(value: String): Self = StObject.set(x, "ExecutableSha256", value.asInstanceOf[js.Any])
    
    inline def setExecutableSha256Undefined: Self = StObject.set(x, "ExecutableSha256", js.undefined)
    
    inline def setLineage(value: Lineage): Self = StObject.set(x, "Lineage", value.asInstanceOf[js.Any])
    
    inline def setLineageUndefined: Self = StObject.set(x, "Lineage", js.undefined)
    
    inline def setLineageVarargs(value: LineageObject*): Self = StObject.set(x, "Lineage", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setNamespacePid(value: Integer): Self = StObject.set(x, "NamespacePid", value.asInstanceOf[js.Any])
    
    inline def setNamespacePidUndefined: Self = StObject.set(x, "NamespacePid", js.undefined)
    
    inline def setParentUuid(value: String): Self = StObject.set(x, "ParentUuid", value.asInstanceOf[js.Any])
    
    inline def setParentUuidUndefined: Self = StObject.set(x, "ParentUuid", js.undefined)
    
    inline def setPid(value: Integer): Self = StObject.set(x, "Pid", value.asInstanceOf[js.Any])
    
    inline def setPidUndefined: Self = StObject.set(x, "Pid", js.undefined)
    
    inline def setPwd(value: String): Self = StObject.set(x, "Pwd", value.asInstanceOf[js.Any])
    
    inline def setPwdUndefined: Self = StObject.set(x, "Pwd", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    inline def setUser(value: String): Self = StObject.set(x, "User", value.asInstanceOf[js.Any])
    
    inline def setUserId(value: Integer): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "UserId", js.undefined)
    
    inline def setUserUndefined: Self = StObject.set(x, "User", js.undefined)
    
    inline def setUuid(value: String): Self = StObject.set(x, "Uuid", value.asInstanceOf[js.Any])
    
    inline def setUuidUndefined: Self = StObject.set(x, "Uuid", js.undefined)
  }
}
