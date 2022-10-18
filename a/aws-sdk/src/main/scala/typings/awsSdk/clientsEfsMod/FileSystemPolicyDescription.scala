package typings.awsSdk.clientsEfsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileSystemPolicyDescription extends StObject {
  
  /**
    * Specifies the EFS file system to which the FileSystemPolicy applies.
    */
  var FileSystemId: js.UndefOr[typings.awsSdk.clientsEfsMod.FileSystemId] = js.undefined
  
  /**
    * The JSON formatted FileSystemPolicy for the EFS file system.
    */
  var Policy: js.UndefOr[typings.awsSdk.clientsEfsMod.Policy] = js.undefined
}
object FileSystemPolicyDescription {
  
  inline def apply(): FileSystemPolicyDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileSystemPolicyDescription]
  }
  
  extension [Self <: FileSystemPolicyDescription](x: Self) {
    
    inline def setFileSystemId(value: FileSystemId): Self = StObject.set(x, "FileSystemId", value.asInstanceOf[js.Any])
    
    inline def setFileSystemIdUndefined: Self = StObject.set(x, "FileSystemId", js.undefined)
    
    inline def setPolicy(value: Policy): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "Policy", js.undefined)
  }
}
