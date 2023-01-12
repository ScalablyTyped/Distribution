package typings.awsSdk.clientsCodeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDomainResult extends StObject {
  
  var domain: js.UndefOr[DomainDescription] = js.undefined
}
object DescribeDomainResult {
  
  inline def apply(): DescribeDomainResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDomainResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeDomainResult] (val x: Self) extends AnyVal {
    
    inline def setDomain(value: DomainDescription): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
  }
}
