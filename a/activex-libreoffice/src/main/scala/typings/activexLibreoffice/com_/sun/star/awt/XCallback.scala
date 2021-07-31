package typings.activexLibreoffice.com_.sun.star.awt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies an interface which can be used to call back an implementation */
trait XCallback extends StObject {
  
  /**
    * notifies the callback implementation
    * @param aData private data which was provided when the callback was requested.
    */
  def notify(aData: js.Any): Unit
}
object XCallback {
  
  @scala.inline
  def apply(notify_ : js.Any => Unit): XCallback = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("notify")(js.Any.fromFunction1(notify_))
    __obj.asInstanceOf[XCallback]
  }
  
  @scala.inline
  implicit class XCallbackMutableBuilder[Self <: XCallback] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNotify_(value: js.Any => Unit): Self = StObject.set(x, "notify", js.Any.fromFunction1(value))
  }
}
