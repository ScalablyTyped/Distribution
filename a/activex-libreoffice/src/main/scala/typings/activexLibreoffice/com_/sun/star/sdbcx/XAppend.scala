package typings.activexLibreoffice.com_.sun.star.sdbcx

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** is used for creating and appending new objects to a specific container. */
@js.native
trait XAppend extends XInterface {
  
  /**
    * creates a new object using the given descriptor and appends it to the related container. ** Note: ** The descriptor will not be changed and can be
    * used again to append another object.
    * @param descriptor the descriptor which should be serve to append a new object
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def appendByDescriptor(descriptor: XPropertySet): Unit = js.native
}
object XAppend {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    appendByDescriptor: XPropertySet => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XAppend = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), appendByDescriptor = js.Any.fromFunction1(appendByDescriptor), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XAppend]
  }
  
  @scala.inline
  implicit class XAppendMutableBuilder[Self <: XAppend] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppendByDescriptor(value: XPropertySet => Unit): Self = StObject.set(x, "appendByDescriptor", js.Any.fromFunction1(value))
  }
}
