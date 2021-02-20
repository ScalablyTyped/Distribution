package typings.ava.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommitDiscardOptions extends StObject {
  
  /**
  	 * Whether the logs should be included in those of the parent test.
  	 */
  var retainLogs: js.UndefOr[Boolean] = js.native
}
object CommitDiscardOptions {
  
  @scala.inline
  def apply(): CommitDiscardOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommitDiscardOptions]
  }
  
  @scala.inline
  implicit class CommitDiscardOptionsMutableBuilder[Self <: CommitDiscardOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRetainLogs(value: Boolean): Self = StObject.set(x, "retainLogs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetainLogsUndefined: Self = StObject.set(x, "retainLogs", js.undefined)
  }
}
