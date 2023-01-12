package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDomainResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the domain.
    */
  var DomainArn: js.UndefOr[typings.awsSdk.clientsSagemakerMod.DomainArn] = js.undefined
}
object UpdateDomainResponse {
  
  inline def apply(): UpdateDomainResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDomainResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateDomainResponse] (val x: Self) extends AnyVal {
    
    inline def setDomainArn(value: DomainArn): Self = StObject.set(x, "DomainArn", value.asInstanceOf[js.Any])
    
    inline def setDomainArnUndefined: Self = StObject.set(x, "DomainArn", js.undefined)
  }
}
