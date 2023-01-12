package typings.activexLibreoffice.com_.sun.star.task

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Use this interface to abort a command asynchronously. For example, have a look at {@link com.sun.star.deployment.XPackageManager} . */
trait XAbortChannel extends StObject {
  
  /** sends an abort notification to all commands associated with this channel. */
  def sendAbort(): Unit
}
object XAbortChannel {
  
  inline def apply(sendAbort: () => Unit): XAbortChannel = {
    val __obj = js.Dynamic.literal(sendAbort = js.Any.fromFunction0(sendAbort))
    __obj.asInstanceOf[XAbortChannel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XAbortChannel] (val x: Self) extends AnyVal {
    
    inline def setSendAbort(value: () => Unit): Self = StObject.set(x, "sendAbort", js.Any.fromFunction0(value))
  }
}
