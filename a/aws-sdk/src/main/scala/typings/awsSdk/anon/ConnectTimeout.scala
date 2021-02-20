package typings.awsSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectTimeout extends StObject {
  
  /**
    * Connection timeout in milliseconds.
    */
  var connectTimeout: js.UndefOr[Double] = js.native
  
  /**
    * Timeout in milliseconds.
    */
  var timeout: js.UndefOr[Double] = js.native
}
object ConnectTimeout {
  
  @scala.inline
  def apply(): ConnectTimeout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectTimeout]
  }
  
  @scala.inline
  implicit class ConnectTimeoutMutableBuilder[Self <: ConnectTimeout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectTimeout(value: Double): Self = StObject.set(x, "connectTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectTimeoutUndefined: Self = StObject.set(x, "connectTimeout", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
