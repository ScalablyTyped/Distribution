package typings.arangodb.ArangoDB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveByExampleOptions extends StObject {
  
  var limit: js.UndefOr[Double] = js.undefined
  
  var waitForSync: js.UndefOr[Boolean] = js.undefined
}
object RemoveByExampleOptions {
  
  @scala.inline
  def apply(): RemoveByExampleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveByExampleOptions]
  }
  
  @scala.inline
  implicit class RemoveByExampleOptionsMutableBuilder[Self <: RemoveByExampleOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setWaitForSync(value: Boolean): Self = StObject.set(x, "waitForSync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaitForSyncUndefined: Self = StObject.set(x, "waitForSync", js.undefined)
  }
}
