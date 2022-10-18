package typings.awsSdk.clientsDirectoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateNumberOfDomainControllersRequest extends StObject {
  
  /**
    * The number of domain controllers desired in the directory.
    */
  var DesiredNumber: DesiredNumberOfDomainControllers
  
  /**
    * Identifier of the directory to which the domain controllers will be added or removed.
    */
  var DirectoryId: typings.awsSdk.clientsDirectoryserviceMod.DirectoryId
}
object UpdateNumberOfDomainControllersRequest {
  
  inline def apply(DesiredNumber: DesiredNumberOfDomainControllers, DirectoryId: DirectoryId): UpdateNumberOfDomainControllersRequest = {
    val __obj = js.Dynamic.literal(DesiredNumber = DesiredNumber.asInstanceOf[js.Any], DirectoryId = DirectoryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateNumberOfDomainControllersRequest]
  }
  
  extension [Self <: UpdateNumberOfDomainControllersRequest](x: Self) {
    
    inline def setDesiredNumber(value: DesiredNumberOfDomainControllers): Self = StObject.set(x, "DesiredNumber", value.asInstanceOf[js.Any])
    
    inline def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
  }
}
