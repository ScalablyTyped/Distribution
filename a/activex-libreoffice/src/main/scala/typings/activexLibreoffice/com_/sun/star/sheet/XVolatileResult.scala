package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides methods to handle a volatile function result.
  * @see com.sun.star.sheet.VolatileResult
  * @see com.sun.star.sheet.ResultEvent
  */
@js.native
trait XVolatileResult extends XInterface {
  
  /** adds a listener to be notified when a new value is available. */
  def addResultListener(aListener: XResultListener): Unit = js.native
  
  /** removes the specified listener. */
  def removeResultListener(aListener: XResultListener): Unit = js.native
}
object XVolatileResult {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    addResultListener: XResultListener => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeResultListener: XResultListener => Unit
  ): XVolatileResult = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addResultListener = js.Any.fromFunction1(addResultListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeResultListener = js.Any.fromFunction1(removeResultListener))
    __obj.asInstanceOf[XVolatileResult]
  }
  
  @scala.inline
  implicit class XVolatileResultMutableBuilder[Self <: XVolatileResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddResultListener(value: XResultListener => Unit): Self = StObject.set(x, "addResultListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveResultListener(value: XResultListener => Unit): Self = StObject.set(x, "removeResultListener", js.Any.fromFunction1(value))
  }
}
