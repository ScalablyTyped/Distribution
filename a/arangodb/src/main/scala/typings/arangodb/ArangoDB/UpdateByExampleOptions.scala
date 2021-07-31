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
  
  @scala.inline
  def apply(): UpdateByExampleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateByExampleOptions]
  }
  
  @scala.inline
  implicit class UpdateByExampleOptionsMutableBuilder[Self <: UpdateByExampleOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeepNull(value: Boolean): Self = StObject.set(x, "keepNull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepNullUndefined: Self = StObject.set(x, "keepNull", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setMergeObjects(value: Boolean): Self = StObject.set(x, "mergeObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergeObjectsUndefined: Self = StObject.set(x, "mergeObjects", js.undefined)
    
    @scala.inline
    def setWaitForSync(value: Boolean): Self = StObject.set(x, "waitForSync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaitForSyncUndefined: Self = StObject.set(x, "waitForSync", js.undefined)
  }
}
