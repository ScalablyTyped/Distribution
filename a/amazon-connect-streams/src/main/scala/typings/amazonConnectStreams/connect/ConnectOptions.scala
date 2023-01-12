package typings.amazonConnectStreams.connect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectOptions
  extends StObject
     with SuccessFailOptions {
  
  /** The queue ARN to associate the contact with. */
  val queueARN: js.UndefOr[String] = js.undefined
}
object ConnectOptions {
  
  inline def apply(): ConnectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConnectOptions] (val x: Self) extends AnyVal {
    
    inline def setQueueARN(value: String): Self = StObject.set(x, "queueARN", value.asInstanceOf[js.Any])
    
    inline def setQueueARNUndefined: Self = StObject.set(x, "queueARN", js.undefined)
  }
}
