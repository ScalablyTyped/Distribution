package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnprocessedDataSourcesResult extends StObject {
  
  var MalwareProtection: js.UndefOr[MalwareProtectionConfigurationResult] = js.undefined
}
object UnprocessedDataSourcesResult {
  
  inline def apply(): UnprocessedDataSourcesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnprocessedDataSourcesResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UnprocessedDataSourcesResult] (val x: Self) extends AnyVal {
    
    inline def setMalwareProtection(value: MalwareProtectionConfigurationResult): Self = StObject.set(x, "MalwareProtection", value.asInstanceOf[js.Any])
    
    inline def setMalwareProtectionUndefined: Self = StObject.set(x, "MalwareProtection", js.undefined)
  }
}
