package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassificationScopeSummary extends StObject {
  
  /**
    * The unique identifier for the classification scope.
    */
  var id: js.UndefOr[ClassificationScopeId] = js.undefined
  
  /**
    * The name of the classification scope: automated-sensitive-data-discovery.
    */
  var name: js.UndefOr[ClassificationScopeName] = js.undefined
}
object ClassificationScopeSummary {
  
  inline def apply(): ClassificationScopeSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassificationScopeSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClassificationScopeSummary] (val x: Self) extends AnyVal {
    
    inline def setId(value: ClassificationScopeId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: ClassificationScopeName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
