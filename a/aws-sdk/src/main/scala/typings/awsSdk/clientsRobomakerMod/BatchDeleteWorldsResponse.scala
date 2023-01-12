package typings.awsSdk.clientsRobomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDeleteWorldsResponse extends StObject {
  
  /**
    * A list of unprocessed worlds associated with the call. These worlds were not deleted.
    */
  var unprocessedWorlds: js.UndefOr[Arns] = js.undefined
}
object BatchDeleteWorldsResponse {
  
  inline def apply(): BatchDeleteWorldsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDeleteWorldsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchDeleteWorldsResponse] (val x: Self) extends AnyVal {
    
    inline def setUnprocessedWorlds(value: Arns): Self = StObject.set(x, "unprocessedWorlds", value.asInstanceOf[js.Any])
    
    inline def setUnprocessedWorldsUndefined: Self = StObject.set(x, "unprocessedWorlds", js.undefined)
    
    inline def setUnprocessedWorldsVarargs(value: Arn*): Self = StObject.set(x, "unprocessedWorlds", js.Array(value*))
  }
}
