package typings.activexLibreoffice.com_.sun.star.logging

import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This service allows to log the events in a ring of specified size.
  * @since OOo 3.2
  */
@js.native
trait SimpleLogRing extends XSimpleLogRing {
  
  /** creates a ring of default size - 256 messages */
  def create(): Unit = js.native
  
  /**
    * creates a ring of specified size
    * @param nSize the number of messages in a ring
    */
  def createWithSize(nSize: Double): Unit = js.native
}
object SimpleLogRing {
  
  @scala.inline
  def apply(
    CollectedLog: SafeArray[String],
    create: () => Unit,
    createWithSize: Double => Unit,
    getCollectedLog: () => SafeArray[String],
    logString: String => Unit
  ): SimpleLogRing = {
    val __obj = js.Dynamic.literal(CollectedLog = CollectedLog.asInstanceOf[js.Any], create = js.Any.fromFunction0(create), createWithSize = js.Any.fromFunction1(createWithSize), getCollectedLog = js.Any.fromFunction0(getCollectedLog), logString = js.Any.fromFunction1(logString))
    __obj.asInstanceOf[SimpleLogRing]
  }
  
  @scala.inline
  implicit class SimpleLogRingOps[Self <: SimpleLogRing] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreate(value: () => Unit): Self = this.set("create", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreateWithSize(value: Double => Unit): Self = this.set("createWithSize", js.Any.fromFunction1(value))
  }
}
