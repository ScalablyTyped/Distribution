package typings.awsSdk.clientsSesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetIdentityDkimAttributesResponse extends StObject {
  
  /**
    * The DKIM attributes for an email address or a domain.
    */
  var DkimAttributes: typings.awsSdk.clientsSesMod.DkimAttributes
}
object GetIdentityDkimAttributesResponse {
  
  inline def apply(DkimAttributes: DkimAttributes): GetIdentityDkimAttributesResponse = {
    val __obj = js.Dynamic.literal(DkimAttributes = DkimAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIdentityDkimAttributesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetIdentityDkimAttributesResponse] (val x: Self) extends AnyVal {
    
    inline def setDkimAttributes(value: DkimAttributes): Self = StObject.set(x, "DkimAttributes", value.asInstanceOf[js.Any])
  }
}
