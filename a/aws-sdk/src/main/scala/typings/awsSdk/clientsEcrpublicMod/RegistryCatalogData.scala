package typings.awsSdk.clientsEcrpublicMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegistryCatalogData extends StObject {
  
  /**
    * The display name for a public registry. This appears on the Amazon ECR Public Gallery.  Only accounts that have the verified account badge can have a registry display name. 
    */
  var displayName: js.UndefOr[RegistryDisplayName] = js.undefined
}
object RegistryCatalogData {
  
  inline def apply(): RegistryCatalogData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegistryCatalogData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RegistryCatalogData] (val x: Self) extends AnyVal {
    
    inline def setDisplayName(value: RegistryDisplayName): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
  }
}
