package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** is supported by objects with data that can be flushed to a data source. */
@js.native
trait XFlushable extends XInterface {
  
  /** adds the specified listener to receive event "flushed." */
  def addFlushListener(l: XFlushListener): Unit = js.native
  
  /** flushes the data of the object to the connected data source. */
  def flush(): Unit = js.native
  
  /** removes the specified listener. */
  def removeFlushListener(l: XFlushListener): Unit = js.native
}
object XFlushable {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    addFlushListener: XFlushListener => Unit,
    flush: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeFlushListener: XFlushListener => Unit
  ): XFlushable = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addFlushListener = js.Any.fromFunction1(addFlushListener), flush = js.Any.fromFunction0(flush), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeFlushListener = js.Any.fromFunction1(removeFlushListener))
    __obj.asInstanceOf[XFlushable]
  }
  
  @scala.inline
  implicit class XFlushableMutableBuilder[Self <: XFlushable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddFlushListener(value: XFlushListener => Unit): Self = StObject.set(x, "addFlushListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFlush(value: () => Unit): Self = StObject.set(x, "flush", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveFlushListener(value: XFlushListener => Unit): Self = StObject.set(x, "removeFlushListener", js.Any.fromFunction1(value))
  }
}
