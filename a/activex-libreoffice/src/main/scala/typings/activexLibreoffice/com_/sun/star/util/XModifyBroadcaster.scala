package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * broadcasts each modification made on the date data of the object which supports this interface.
  *
  * The modified object must post the modification events immediately after the modification is performed.
  */
@js.native
trait XModifyBroadcaster extends XInterface {
  /** adds the specified listener to receive events "modified." */
  def addModifyListener(aListener: XModifyListener): Unit = js.native
  /** removes the specified listener. */
  def removeModifyListener(aListener: XModifyListener): Unit = js.native
}

object XModifyBroadcaster {
  @scala.inline
  def apply(
    acquire: () => Unit,
    addModifyListener: XModifyListener => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeModifyListener: XModifyListener => Unit
  ): XModifyBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addModifyListener = js.Any.fromFunction1(addModifyListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeModifyListener = js.Any.fromFunction1(removeModifyListener))
    __obj.asInstanceOf[XModifyBroadcaster]
  }
  @scala.inline
  implicit class XModifyBroadcasterOps[Self <: XModifyBroadcaster] (val x: Self) extends AnyVal {
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
    def setAddModifyListener(value: XModifyListener => Unit): Self = this.set("addModifyListener", js.Any.fromFunction1(value))
    @scala.inline
    def setRemoveModifyListener(value: XModifyListener => Unit): Self = this.set("removeModifyListener", js.Any.fromFunction1(value))
  }
  
}

