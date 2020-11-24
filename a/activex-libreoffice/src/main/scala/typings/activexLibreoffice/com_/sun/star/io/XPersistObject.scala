package typings.activexLibreoffice.com_.sun.star.io

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows to make UNO objects persistent
  *
  * Every UNO object, that wants to be serializable, should implement this interface. The object stores stores itself, when the write method is called.
  *
  * The object needs to be created before it deserializes itself again (by using the read method). Therefore it must be creatable by name via a factory,
  * which is in general the global service manager. The create and read mechanism is implemented by the {@link com.sun.star.io.ObjectInputStream} .
  *
  * The serialization format (the series of strings, integers, objects) must be specified at the specification of the concrete service.
  *
  * The interface does not support any special versioning mechanism.
  * @see com.sun.star.io.XObjectOutputStream
  * @see com.sun.star.io.XObjectInputStream
  */
@js.native
trait XPersistObject extends XInterface {
  
  /**
    * gives the service name of the object
    *
    * This name is used to create such an object by a factory during deserialization.
    * @returns the service name that specifies the behavior and the persistent data format of this implementation.
    * @see com.sun.star.lang.XMultiComponentFactory.getAvailableServiceNames()
    */
  val ServiceName: String = js.native
  
  /**
    * gives the service name of the object
    *
    * This name is used to create such an object by a factory during deserialization.
    * @returns the service name that specifies the behavior and the persistent data format of this implementation.
    * @see com.sun.star.lang.XMultiComponentFactory.getAvailableServiceNames()
    */
  def getServiceName(): String = js.native
  
  /**
    * reads all the persistent data of the object from the stream.
    *
    * In case other XPersistObjects are read from the stream, the implementation uses a factory to create these objects (in general the global service
    * manager).
    *
    * The implementation must read the data in the order documented at the service specification.
    * @param InStream the stream, the data shall be read from.
    */
  def read(InStream: XObjectInputStream): Unit = js.native
  
  /**
    * writes all the persistent data of the object to the stream.
    *
    * The implementation must write the data in the order documented in the service specification.
    * @param OutStream the stream, the data shall be written to. The stream supports simple types and other {@link XPersistObject} implementations.
    */
  def write(OutStream: XObjectOutputStream): Unit = js.native
}
object XPersistObject {
  
  @scala.inline
  def apply(
    ServiceName: String,
    acquire: () => Unit,
    getServiceName: () => String,
    queryInterface: `type` => js.Any,
    read: XObjectInputStream => Unit,
    release: () => Unit,
    write: XObjectOutputStream => Unit
  ): XPersistObject = {
    val __obj = js.Dynamic.literal(ServiceName = ServiceName.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getServiceName = js.Any.fromFunction0(getServiceName), queryInterface = js.Any.fromFunction1(queryInterface), read = js.Any.fromFunction1(read), release = js.Any.fromFunction0(release), write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[XPersistObject]
  }
  
  @scala.inline
  implicit class XPersistObjectOps[Self <: XPersistObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setServiceName(value: String): Self = this.set("ServiceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetServiceName(value: () => String): Self = this.set("getServiceName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRead(value: XObjectInputStream => Unit): Self = this.set("read", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWrite(value: XObjectOutputStream => Unit): Self = this.set("write", js.Any.fromFunction1(value))
  }
}
