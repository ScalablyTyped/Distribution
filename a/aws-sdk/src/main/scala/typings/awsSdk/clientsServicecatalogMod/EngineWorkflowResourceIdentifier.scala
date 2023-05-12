package typings.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EngineWorkflowResourceIdentifier extends StObject {
  
  /**
    *  The unique key-value pair for a tag that identifies provisioned product resources. 
    */
  var UniqueTag: js.UndefOr[UniqueTagResourceIdentifier] = js.undefined
}
object EngineWorkflowResourceIdentifier {
  
  inline def apply(): EngineWorkflowResourceIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EngineWorkflowResourceIdentifier]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EngineWorkflowResourceIdentifier] (val x: Self) extends AnyVal {
    
    inline def setUniqueTag(value: UniqueTagResourceIdentifier): Self = StObject.set(x, "UniqueTag", value.asInstanceOf[js.Any])
    
    inline def setUniqueTagUndefined: Self = StObject.set(x, "UniqueTag", js.undefined)
  }
}
