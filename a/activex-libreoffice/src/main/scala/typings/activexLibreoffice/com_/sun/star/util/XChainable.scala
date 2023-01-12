package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** enables the object to be a member of a chain. */
trait XChainable
  extends StObject
     with XInterface {
  
  /** @returns the previous object in this chain or NULL, if this is the first object of this chain. */
  val Predecessor: XChainable
  
  /** @returns the next object in this chain or NULL, if this is the last object in this chain. */
  var Successor: XChainable
  
  /** @returns the previous object in this chain or NULL, if this is the first object of this chain. */
  def getPredecessor(): XChainable
  
  /** @returns the next object in this chain or NULL, if this is the last object in this chain. */
  def getSuccessor(): XChainable
  
  /** checks if the specified object can be linked to this. */
  def isChainable(xChainable: XChainable): Boolean
  
  /**
    * connects the specified object to this object as the successor in a chain.
    *
    * This implies that this object will become the predecessor of **xChainable** .
    */
  def setSuccessor(xChainable: XChainable): Unit
}
object XChainable {
  
  inline def apply(
    Predecessor: XChainable,
    Successor: XChainable,
    acquire: () => Unit,
    getPredecessor: () => XChainable,
    getSuccessor: () => XChainable,
    isChainable: XChainable => Boolean,
    queryInterface: `type` => Any,
    release: () => Unit,
    setSuccessor: XChainable => Unit
  ): XChainable = {
    val __obj = js.Dynamic.literal(Predecessor = Predecessor.asInstanceOf[js.Any], Successor = Successor.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getPredecessor = js.Any.fromFunction0(getPredecessor), getSuccessor = js.Any.fromFunction0(getSuccessor), isChainable = js.Any.fromFunction1(isChainable), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setSuccessor = js.Any.fromFunction1(setSuccessor))
    __obj.asInstanceOf[XChainable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XChainable] (val x: Self) extends AnyVal {
    
    inline def setGetPredecessor(value: () => XChainable): Self = StObject.set(x, "getPredecessor", js.Any.fromFunction0(value))
    
    inline def setGetSuccessor(value: () => XChainable): Self = StObject.set(x, "getSuccessor", js.Any.fromFunction0(value))
    
    inline def setIsChainable(value: XChainable => Boolean): Self = StObject.set(x, "isChainable", js.Any.fromFunction1(value))
    
    inline def setPredecessor(value: XChainable): Self = StObject.set(x, "Predecessor", value.asInstanceOf[js.Any])
    
    inline def setSetSuccessor(value: XChainable => Unit): Self = StObject.set(x, "setSuccessor", js.Any.fromFunction1(value))
    
    inline def setSuccessor(value: XChainable): Self = StObject.set(x, "Successor", value.asInstanceOf[js.Any])
  }
}
