package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexingFilter extends StObject {
  
  /**
    * The shadow names that you select to index. The default maximum number of shadow names for indexing is 10. To increase the limit, see Amazon Web Services IoT Device Management Quotas in the Amazon Web Services General Reference. 
    */
  var namedShadowNames: js.UndefOr[NamedShadowNamesFilter] = js.undefined
}
object IndexingFilter {
  
  inline def apply(): IndexingFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndexingFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndexingFilter] (val x: Self) extends AnyVal {
    
    inline def setNamedShadowNames(value: NamedShadowNamesFilter): Self = StObject.set(x, "namedShadowNames", value.asInstanceOf[js.Any])
    
    inline def setNamedShadowNamesUndefined: Self = StObject.set(x, "namedShadowNames", js.undefined)
    
    inline def setNamedShadowNamesVarargs(value: ShadowName*): Self = StObject.set(x, "namedShadowNames", js.Array(value*))
  }
}
