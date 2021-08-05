package typings.activexLibreoffice.com_.sun.star.form

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.XImageProducer
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides the access to an image producer.
  * @see com.sun.star.awt.XImageProducer
  */
trait XImageProducerSupplier
  extends StObject
     with XInterface {
  
  /**
    * accesses the image producer.
    * @returns the image producer.
    */
  val ImageProducer: XImageProducer
  
  /**
    * accesses the image producer.
    * @returns the image producer.
    */
  def getImageProducer(): XImageProducer
}
object XImageProducerSupplier {
  
  inline def apply(
    ImageProducer: XImageProducer,
    acquire: () => Unit,
    getImageProducer: () => XImageProducer,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XImageProducerSupplier = {
    val __obj = js.Dynamic.literal(ImageProducer = ImageProducer.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getImageProducer = js.Any.fromFunction0(getImageProducer), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XImageProducerSupplier]
  }
  
  extension [Self <: XImageProducerSupplier](x: Self) {
    
    inline def setGetImageProducer(value: () => XImageProducer): Self = StObject.set(x, "getImageProducer", js.Any.fromFunction0(value))
    
    inline def setImageProducer(value: XImageProducer): Self = StObject.set(x, "ImageProducer", value.asInstanceOf[js.Any])
  }
}
