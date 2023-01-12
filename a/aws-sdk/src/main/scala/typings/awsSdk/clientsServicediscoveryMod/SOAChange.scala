package typings.awsSdk.clientsServicediscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SOAChange extends StObject {
  
  /**
    * The updated time to live (TTL) for purposes of negative caching.
    */
  var TTL: RecordTTL
}
object SOAChange {
  
  inline def apply(TTL: RecordTTL): SOAChange = {
    val __obj = js.Dynamic.literal(TTL = TTL.asInstanceOf[js.Any])
    __obj.asInstanceOf[SOAChange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SOAChange] (val x: Self) extends AnyVal {
    
    inline def setTTL(value: RecordTTL): Self = StObject.set(x, "TTL", value.asInstanceOf[js.Any])
  }
}
