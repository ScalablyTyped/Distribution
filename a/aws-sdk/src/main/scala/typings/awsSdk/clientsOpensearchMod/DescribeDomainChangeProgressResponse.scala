package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDomainChangeProgressResponse extends StObject {
  
  /**
    * Container for information about the stages of a configuration change happening on a domain.
    */
  var ChangeProgressStatus: js.UndefOr[ChangeProgressStatusDetails] = js.undefined
}
object DescribeDomainChangeProgressResponse {
  
  inline def apply(): DescribeDomainChangeProgressResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDomainChangeProgressResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeDomainChangeProgressResponse] (val x: Self) extends AnyVal {
    
    inline def setChangeProgressStatus(value: ChangeProgressStatusDetails): Self = StObject.set(x, "ChangeProgressStatus", value.asInstanceOf[js.Any])
    
    inline def setChangeProgressStatusUndefined: Self = StObject.set(x, "ChangeProgressStatus", js.undefined)
  }
}
