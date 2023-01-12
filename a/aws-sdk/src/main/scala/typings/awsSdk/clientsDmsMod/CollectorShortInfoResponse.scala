package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollectorShortInfoResponse extends StObject {
  
  /**
    * The name of the Fleet Advisor collector.
    */
  var CollectorName: js.UndefOr[String] = js.undefined
  
  /**
    * The reference ID of the Fleet Advisor collector.
    */
  var CollectorReferencedId: js.UndefOr[String] = js.undefined
}
object CollectorShortInfoResponse {
  
  inline def apply(): CollectorShortInfoResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectorShortInfoResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CollectorShortInfoResponse] (val x: Self) extends AnyVal {
    
    inline def setCollectorName(value: String): Self = StObject.set(x, "CollectorName", value.asInstanceOf[js.Any])
    
    inline def setCollectorNameUndefined: Self = StObject.set(x, "CollectorName", js.undefined)
    
    inline def setCollectorReferencedId(value: String): Self = StObject.set(x, "CollectorReferencedId", value.asInstanceOf[js.Any])
    
    inline def setCollectorReferencedIdUndefined: Self = StObject.set(x, "CollectorReferencedId", js.undefined)
  }
}
