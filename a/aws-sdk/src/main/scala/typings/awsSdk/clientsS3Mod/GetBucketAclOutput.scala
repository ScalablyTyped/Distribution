package typings.awsSdk.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBucketAclOutput extends StObject {
  
  /**
    * A list of grants.
    */
  var Grants: js.UndefOr[typings.awsSdk.clientsS3Mod.Grants] = js.undefined
  
  /**
    * Container for the bucket owner's display name and ID.
    */
  var Owner: js.UndefOr[typings.awsSdk.clientsS3Mod.Owner] = js.undefined
}
object GetBucketAclOutput {
  
  inline def apply(): GetBucketAclOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBucketAclOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetBucketAclOutput] (val x: Self) extends AnyVal {
    
    inline def setGrants(value: Grants): Self = StObject.set(x, "Grants", value.asInstanceOf[js.Any])
    
    inline def setGrantsUndefined: Self = StObject.set(x, "Grants", js.undefined)
    
    inline def setGrantsVarargs(value: Grant*): Self = StObject.set(x, "Grants", js.Array(value*))
    
    inline def setOwner(value: Owner): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "Owner", js.undefined)
  }
}
