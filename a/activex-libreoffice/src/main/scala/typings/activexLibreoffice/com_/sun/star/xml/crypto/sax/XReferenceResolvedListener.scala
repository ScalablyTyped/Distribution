package typings.activexLibreoffice.com_.sun.star.xml.crypto.sax

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface of Reference Resolved Listener.
  *
  * This interface is used to receive the collection completion notification for a element collector.
  */
trait XReferenceResolvedListener
  extends StObject
     with XInterface {
  
  /**
    * Notifies an element has been collected by an element collector.
    * @param referenceId the id of the element collector
    */
  def referenceResolved(referenceId: Double): Unit
}
object XReferenceResolvedListener {
  
  inline def apply(
    acquire: () => Unit,
    queryInterface: `type` => Any,
    referenceResolved: Double => Unit,
    release: () => Unit
  ): XReferenceResolvedListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), referenceResolved = js.Any.fromFunction1(referenceResolved), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XReferenceResolvedListener]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XReferenceResolvedListener] (val x: Self) extends AnyVal {
    
    inline def setReferenceResolved(value: Double => Unit): Self = StObject.set(x, "referenceResolved", js.Any.fromFunction1(value))
  }
}
