package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class XModifyBroadcasterMutableBuilder[Self <: XModifyBroadcaster] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddModifyListener(value: XModifyListener => Unit): Self = StObject.set(x, "addModifyListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveModifyListener(value: XModifyListener => Unit): Self = StObject.set(x, "removeModifyListener", js.Any.fromFunction1(value))
  }
}
