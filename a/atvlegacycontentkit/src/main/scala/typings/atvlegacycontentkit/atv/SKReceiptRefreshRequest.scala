package typings.atvlegacycontentkit.atv

import typings.atvlegacycontentkit.SKError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A request to refresh the receipt, which represents the user's transactions with your app.
  *
  * See https://developer.apple.com/documentation/storekit/skreceiptrefreshrequest for more information.
  */
trait SKReceiptRefreshRequest extends StObject {
  
  /**
    * Cancels a previously started request.
    */
  def cancel(): Unit
  
  /**
    * Tells the delegate that the request failed to execute.
    */
  var onRequestDidFailWithError: js.UndefOr[js.Function1[/* error */ SKError, Unit]] = js.undefined
  
  /**
    * Tells the delegate that the request has completed.
    */
  var onRequestDidFinish: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Sends the request to the Apple App Store.
    */
  def start(): Unit
}
object SKReceiptRefreshRequest {
  
  inline def apply(cancel: () => Unit, start: () => Unit): SKReceiptRefreshRequest = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), start = js.Any.fromFunction0(start))
    __obj.asInstanceOf[SKReceiptRefreshRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SKReceiptRefreshRequest] (val x: Self) extends AnyVal {
    
    inline def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
    
    inline def setOnRequestDidFailWithError(value: /* error */ SKError => Unit): Self = StObject.set(x, "onRequestDidFailWithError", js.Any.fromFunction1(value))
    
    inline def setOnRequestDidFailWithErrorUndefined: Self = StObject.set(x, "onRequestDidFailWithError", js.undefined)
    
    inline def setOnRequestDidFinish(value: () => Unit): Self = StObject.set(x, "onRequestDidFinish", js.Any.fromFunction0(value))
    
    inline def setOnRequestDidFinishUndefined: Self = StObject.set(x, "onRequestDidFinish", js.undefined)
    
    inline def setStart(value: () => Unit): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
  }
}
