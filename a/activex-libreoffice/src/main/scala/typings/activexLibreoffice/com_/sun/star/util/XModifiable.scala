package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes the modify state of the object accessible.
  *
  * Additionally, it makes it possible to register listener objects, which get notification whenever the status or content of the object changes.
  */
trait XModifiable
  extends StObject
     with XModifyBroadcaster {
  
  /** @returns `TRUE` if the object is modified.  The modification is always in relation to a certain state (i.e., the initial, loaded, or last stored version). */
  def isModified(): Boolean
  
  /** sets the status of the **modified** -flag from outside of the object. */
  def setModified(bModified: Boolean): Unit
}
object XModifiable {
  
  inline def apply(
    acquire: () => Unit,
    addModifyListener: XModifyListener => Unit,
    isModified: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeModifyListener: XModifyListener => Unit,
    setModified: Boolean => Unit
  ): XModifiable = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addModifyListener = js.Any.fromFunction1(addModifyListener), isModified = js.Any.fromFunction0(isModified), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeModifyListener = js.Any.fromFunction1(removeModifyListener), setModified = js.Any.fromFunction1(setModified))
    __obj.asInstanceOf[XModifiable]
  }
  
  extension [Self <: XModifiable](x: Self) {
    
    inline def setIsModified(value: () => Boolean): Self = StObject.set(x, "isModified", js.Any.fromFunction0(value))
    
    inline def setSetModified(value: Boolean => Unit): Self = StObject.set(x, "setModified", js.Any.fromFunction1(value))
  }
}
