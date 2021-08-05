package typings.ava.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommitDiscardOptions extends StObject {
  
  /**
  	 * Whether the logs should be included in those of the parent test.
  	 */
  var retainLogs: js.UndefOr[Boolean] = js.undefined
}
object CommitDiscardOptions {
  
  inline def apply(): CommitDiscardOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommitDiscardOptions]
  }
  
  extension [Self <: CommitDiscardOptions](x: Self) {
    
    inline def setRetainLogs(value: Boolean): Self = StObject.set(x, "retainLogs", value.asInstanceOf[js.Any])
    
    inline def setRetainLogsUndefined: Self = StObject.set(x, "retainLogs", js.undefined)
  }
}
