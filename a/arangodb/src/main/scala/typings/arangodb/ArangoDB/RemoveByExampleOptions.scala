package typings.arangodb.ArangoDB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveByExampleOptions extends StObject {
  
  var limit: js.UndefOr[Double] = js.undefined
  
  var waitForSync: js.UndefOr[Boolean] = js.undefined
}
object RemoveByExampleOptions {
  
  inline def apply(): RemoveByExampleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveByExampleOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RemoveByExampleOptions] (val x: Self) extends AnyVal {
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setWaitForSync(value: Boolean): Self = StObject.set(x, "waitForSync", value.asInstanceOf[js.Any])
    
    inline def setWaitForSyncUndefined: Self = StObject.set(x, "waitForSync", js.undefined)
  }
}
