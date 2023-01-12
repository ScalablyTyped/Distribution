package typings.activexLibreoffice.com_.sun.star.xml.crypto.sax

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface of Signature Collector.
  *
  * This interface is used to control collecting a signature.
  */
trait XReferenceCollector
  extends StObject
     with XInterface {
  
  /**
    * Sets the reference count of the signature.
    * @param count the reference count of the signature
    */
  def setReferenceCount(count: Double): Unit
  
  /**
    * Set the keeper id of the element collector of the referenced element.
    * @param id the keeper id of the element collector, which is collecting a referenced element
    */
  def setReferenceId(id: Double): Unit
}
object XReferenceCollector {
  
  inline def apply(
    acquire: () => Unit,
    queryInterface: `type` => Any,
    release: () => Unit,
    setReferenceCount: Double => Unit,
    setReferenceId: Double => Unit
  ): XReferenceCollector = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setReferenceCount = js.Any.fromFunction1(setReferenceCount), setReferenceId = js.Any.fromFunction1(setReferenceId))
    __obj.asInstanceOf[XReferenceCollector]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XReferenceCollector] (val x: Self) extends AnyVal {
    
    inline def setSetReferenceCount(value: Double => Unit): Self = StObject.set(x, "setReferenceCount", js.Any.fromFunction1(value))
    
    inline def setSetReferenceId(value: Double => Unit): Self = StObject.set(x, "setReferenceId", js.Any.fromFunction1(value))
  }
}
