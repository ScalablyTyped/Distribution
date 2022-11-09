package typings.awsSdk.clientsFmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Resource extends StObject {
  
  /**
    * The Amazon Web Services account ID that the associated resource belongs to.
    */
  var AccountId: js.UndefOr[AWSAccountId] = js.undefined
  
  /**
    * The resource's universal resource indicator (URI).
    */
  var URI: Identifier
}
object Resource {
  
  inline def apply(URI: Identifier): Resource = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  
  extension [Self <: Resource](x: Self) {
    
    inline def setAccountId(value: AWSAccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    inline def setURI(value: Identifier): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
  }
}
