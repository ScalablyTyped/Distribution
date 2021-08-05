package typings.arangodb.ArangoDB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateByExampleOptions extends StObject {
  
  var keepNull: js.UndefOr[Boolean] = js.undefined
  
  var limit: js.UndefOr[Double] = js.undefined
  
  var mergeObjects: js.UndefOr[Boolean] = js.undefined
  
  var waitForSync: js.UndefOr[Boolean] = js.undefined
}
object UpdateByExampleOptions {
  
  inline def apply(): UpdateByExampleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateByExampleOptions]
  }
  
  extension [Self <: UpdateByExampleOptions](x: Self) {
    
    inline def setKeepNull(value: Boolean): Self = StObject.set(x, "keepNull", value.asInstanceOf[js.Any])
    
    inline def setKeepNullUndefined: Self = StObject.set(x, "keepNull", js.undefined)
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setMergeObjects(value: Boolean): Self = StObject.set(x, "mergeObjects", value.asInstanceOf[js.Any])
    
    inline def setMergeObjectsUndefined: Self = StObject.set(x, "mergeObjects", js.undefined)
    
    inline def setWaitForSync(value: Boolean): Self = StObject.set(x, "waitForSync", value.asInstanceOf[js.Any])
    
    inline def setWaitForSyncUndefined: Self = StObject.set(x, "waitForSync", js.undefined)
  }
}
