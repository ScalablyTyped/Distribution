package typings.arangodb.ArangoDB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsertOptions extends StObject {
  
  var returnNew: js.UndefOr[Boolean] = js.undefined
  
  var silent: js.UndefOr[Boolean] = js.undefined
  
  var waitForSync: js.UndefOr[Boolean] = js.undefined
}
object InsertOptions {
  
  inline def apply(): InsertOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsertOptions]
  }
  
  extension [Self <: InsertOptions](x: Self) {
    
    inline def setReturnNew(value: Boolean): Self = StObject.set(x, "returnNew", value.asInstanceOf[js.Any])
    
    inline def setReturnNewUndefined: Self = StObject.set(x, "returnNew", js.undefined)
    
    inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    
    inline def setWaitForSync(value: Boolean): Self = StObject.set(x, "waitForSync", value.asInstanceOf[js.Any])
    
    inline def setWaitForSyncUndefined: Self = StObject.set(x, "waitForSync", js.undefined)
  }
}
