package typings.awsSdk.accessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AclGrantee extends StObject {
  
  /**
    * The value specified is the canonical user ID of an Amazon Web Services account.
    */
  var id: js.UndefOr[AclCanonicalId] = js.undefined
  
  /**
    * Used for granting permissions to a predefined group.
    */
  var uri: js.UndefOr[AclUri] = js.undefined
}
object AclGrantee {
  
  inline def apply(): AclGrantee = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AclGrantee]
  }
  
  extension [Self <: AclGrantee](x: Self) {
    
    inline def setId(value: AclCanonicalId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setUri(value: AclUri): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
