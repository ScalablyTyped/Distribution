package typings.activexLibreoffice.com_.sun.star.xml.crypto.sax

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface of Encryption Result Broadcaster.
  *
  * This interface is used to manipulate encryption result listener.
  */
@js.native
trait XEncryptionResultBroadcaster extends XInterface {
  /**
    * Adds a new encryption result listener.
    *
    * When the encryption is finished, the result information will be sent to this listener.
    * @param listener the listener to be added
    */
  def addEncryptionResultListener(listener: XEncryptionResultListener): Unit = js.native
  /**
    * Removes an encryption result listener.
    *
    * After a listener is removed, no result information will be sent to it.
    * @param listener the listener to be removed
    */
  def removeEncryptionResultListener(listener: XEncryptionResultListener): Unit = js.native
}

object XEncryptionResultBroadcaster {
  @scala.inline
  def apply(
    acquire: () => Unit,
    addEncryptionResultListener: XEncryptionResultListener => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEncryptionResultListener: XEncryptionResultListener => Unit
  ): XEncryptionResultBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addEncryptionResultListener = js.Any.fromFunction1(addEncryptionResultListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEncryptionResultListener = js.Any.fromFunction1(removeEncryptionResultListener))
    __obj.asInstanceOf[XEncryptionResultBroadcaster]
  }
  @scala.inline
  implicit class XEncryptionResultBroadcasterOps[Self <: XEncryptionResultBroadcaster] (val x: Self) extends AnyVal {
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
    def setAddEncryptionResultListener(value: XEncryptionResultListener => Unit): Self = this.set("addEncryptionResultListener", js.Any.fromFunction1(value))
    @scala.inline
    def setRemoveEncryptionResultListener(value: XEncryptionResultListener => Unit): Self = this.set("removeEncryptionResultListener", js.Any.fromFunction1(value))
  }
  
}

