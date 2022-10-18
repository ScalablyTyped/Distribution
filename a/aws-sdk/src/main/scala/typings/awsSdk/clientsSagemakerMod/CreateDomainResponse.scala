package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDomainResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the created domain.
    */
  var DomainArn: js.UndefOr[typings.awsSdk.clientsSagemakerMod.DomainArn] = js.undefined
  
  /**
    * The URL to the created domain.
    */
  var Url: js.UndefOr[String1024] = js.undefined
}
object CreateDomainResponse {
  
  inline def apply(): CreateDomainResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDomainResponse]
  }
  
  extension [Self <: CreateDomainResponse](x: Self) {
    
    inline def setDomainArn(value: DomainArn): Self = StObject.set(x, "DomainArn", value.asInstanceOf[js.Any])
    
    inline def setDomainArnUndefined: Self = StObject.set(x, "DomainArn", js.undefined)
    
    inline def setUrl(value: String1024): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "Url", js.undefined)
  }
}
