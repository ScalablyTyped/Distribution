package typings.activexLibreoffice.com_.sun.star.io

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to connect data sinks and sources.
  *
  * The predecessor-member is the element in the connection that is nearer to the source of the data. The successor-member is the element that is further
  * away from the source of the data. (Note that this classification does not depend on whether the class implements {@link XInputStream} or {@link
  * XOutputStream} ; it only depends on the direction of data flow.)
  *
  * This interface allows generic services to navigate between arbitrary elements of a connection.
  */
trait XConnectable
  extends StObject
     with XInterface {
  
  /** @returns the predecessor of this object. */
  var Predecessor: XConnectable
  
  /** @returns the successor of this object. */
  var Successor: XConnectable
  
  /** @returns the predecessor of this object. */
  def getPredecessor(): XConnectable
  
  /** @returns the successor of this object. */
  def getSuccessor(): XConnectable
  
  /** sets the source of the data flow for this object. */
  def setPredecessor(aPredecessor: XConnectable): Unit
  
  /** sets the sink of the data flow for this object. */
  def setSuccessor(aSuccessor: XConnectable): Unit
}
object XConnectable {
  
  inline def apply(
    Predecessor: XConnectable,
    Successor: XConnectable,
    acquire: () => Unit,
    getPredecessor: () => XConnectable,
    getSuccessor: () => XConnectable,
    queryInterface: `type` => Any,
    release: () => Unit,
    setPredecessor: XConnectable => Unit,
    setSuccessor: XConnectable => Unit
  ): XConnectable = {
    val __obj = js.Dynamic.literal(Predecessor = Predecessor.asInstanceOf[js.Any], Successor = Successor.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getPredecessor = js.Any.fromFunction0(getPredecessor), getSuccessor = js.Any.fromFunction0(getSuccessor), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setPredecessor = js.Any.fromFunction1(setPredecessor), setSuccessor = js.Any.fromFunction1(setSuccessor))
    __obj.asInstanceOf[XConnectable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XConnectable] (val x: Self) extends AnyVal {
    
    inline def setGetPredecessor(value: () => XConnectable): Self = StObject.set(x, "getPredecessor", js.Any.fromFunction0(value))
    
    inline def setGetSuccessor(value: () => XConnectable): Self = StObject.set(x, "getSuccessor", js.Any.fromFunction0(value))
    
    inline def setPredecessor(value: XConnectable): Self = StObject.set(x, "Predecessor", value.asInstanceOf[js.Any])
    
    inline def setSetPredecessor(value: XConnectable => Unit): Self = StObject.set(x, "setPredecessor", js.Any.fromFunction1(value))
    
    inline def setSetSuccessor(value: XConnectable => Unit): Self = StObject.set(x, "setSuccessor", js.Any.fromFunction1(value))
    
    inline def setSuccessor(value: XConnectable): Self = StObject.set(x, "Successor", value.asInstanceOf[js.Any])
  }
}
