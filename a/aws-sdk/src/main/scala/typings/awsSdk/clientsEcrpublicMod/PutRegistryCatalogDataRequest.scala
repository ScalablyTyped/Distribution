package typings.awsSdk.clientsEcrpublicMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutRegistryCatalogDataRequest extends StObject {
  
  /**
    * The display name for a public registry. The display name is shown as the repository author in the Amazon ECR Public Gallery.  The registry display name is only publicly visible in the Amazon ECR Public Gallery for verified accounts. 
    */
  var displayName: js.UndefOr[RegistryDisplayName] = js.undefined
}
object PutRegistryCatalogDataRequest {
  
  inline def apply(): PutRegistryCatalogDataRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutRegistryCatalogDataRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutRegistryCatalogDataRequest] (val x: Self) extends AnyVal {
    
    inline def setDisplayName(value: RegistryDisplayName): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
  }
}
