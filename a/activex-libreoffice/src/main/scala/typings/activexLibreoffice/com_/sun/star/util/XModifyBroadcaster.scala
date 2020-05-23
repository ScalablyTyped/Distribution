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
trait XModifyBroadcaster extends XInterface {
  /** adds the specified listener to receive events "modified." */
  def addModifyListener(aListener: XModifyListener): Unit
  /** removes the specified listener. */
  def removeModifyListener(aListener: XModifyListener): Unit
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
}

