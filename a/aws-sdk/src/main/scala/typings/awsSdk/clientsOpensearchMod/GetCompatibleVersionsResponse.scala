package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCompatibleVersionsResponse extends StObject {
  
  /**
    * A map of OpenSearch or Elasticsearch versions and the versions you can upgrade them to.
    */
  var CompatibleVersions: js.UndefOr[CompatibleVersionsList] = js.undefined
}
object GetCompatibleVersionsResponse {
  
  inline def apply(): GetCompatibleVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCompatibleVersionsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetCompatibleVersionsResponse] (val x: Self) extends AnyVal {
    
    inline def setCompatibleVersions(value: CompatibleVersionsList): Self = StObject.set(x, "CompatibleVersions", value.asInstanceOf[js.Any])
    
    inline def setCompatibleVersionsUndefined: Self = StObject.set(x, "CompatibleVersions", js.undefined)
    
    inline def setCompatibleVersionsVarargs(value: CompatibleVersionsMap*): Self = StObject.set(x, "CompatibleVersions", js.Array(value*))
  }
}
