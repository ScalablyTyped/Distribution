package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Relationship extends StObject {
  
  /**
    * The ARN of the resource.
    */
  var From: js.UndefOr[ConstrainedString] = js.undefined
  
  /**
    * The ARN of the resource.
    */
  var To: js.UndefOr[ConstrainedString] = js.undefined
}
object Relationship {
  
  inline def apply(): Relationship = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Relationship]
  }
  
  extension [Self <: Relationship](x: Self) {
    
    inline def setFrom(value: ConstrainedString): Self = StObject.set(x, "From", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "From", js.undefined)
    
    inline def setTo(value: ConstrainedString): Self = StObject.set(x, "To", value.asInstanceOf[js.Any])
    
    inline def setToUndefined: Self = StObject.set(x, "To", js.undefined)
  }
}
