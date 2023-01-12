package typings.activexLibreoffice.com_.sun.star.sdbcx

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides the creation of a descriptor for a definition object. */
trait XDataDescriptorFactory
  extends StObject
     with XInterface {
  
  /**
    * returns a descriptor of a definition object.
    * @returns the descriptor for that kind of objects
    */
  def createDataDescriptor(): XPropertySet
}
object XDataDescriptorFactory {
  
  inline def apply(
    acquire: () => Unit,
    createDataDescriptor: () => XPropertySet,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XDataDescriptorFactory = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createDataDescriptor = js.Any.fromFunction0(createDataDescriptor), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDataDescriptorFactory]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XDataDescriptorFactory] (val x: Self) extends AnyVal {
    
    inline def setCreateDataDescriptor(value: () => XPropertySet): Self = StObject.set(x, "createDataDescriptor", js.Any.fromFunction0(value))
  }
}
