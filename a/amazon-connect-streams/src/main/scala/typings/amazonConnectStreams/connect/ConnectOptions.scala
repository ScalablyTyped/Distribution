package typings.amazonConnectStreams.connect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectOptions extends SuccessFailOptions {
  
  /** The queue ARN to associate the contact with. */
  val queueARN: js.UndefOr[String] = js.native
}
object ConnectOptions {
  
  @scala.inline
  def apply(): ConnectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectOptions]
  }
  
  @scala.inline
  implicit class ConnectOptionsMutableBuilder[Self <: ConnectOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQueueARN(value: String): Self = StObject.set(x, "queueARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueueARNUndefined: Self = StObject.set(x, "queueARN", js.undefined)
  }
}
