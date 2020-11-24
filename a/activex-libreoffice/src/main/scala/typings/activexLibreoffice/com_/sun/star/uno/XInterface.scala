package typings.activexLibreoffice.com_.sun.star.uno

import typings.activexLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * base interface of all UNO interfaces
  *
  * It provides lifetime control by reference counting and the possibility of querying for other interfaces of the same logical object.
  *
  * "Logical Object" in this case means that the interfaces actually can be supported by internal (e.g. aggregated) physical objects.
  *
  * Deriving from this interface is mandatory for all UNO interfaces.
  *
  * Each language binding (Java, C++, StarBasic, Python, ... ) may provide a different mapping of this interface, please look into the language dependent
  * documentation.
  *
  * The UNO object does not export the state of the reference count ( {@link acquire()} and {@link release()} do not have return values). In general, also
  * the UNO object itself should not make any assumption on the concrete value of the reference count (except on the transition from one to zero ).
  */
@js.native
trait XInterface extends js.Object {
  
  /**
    * increases the reference counter by one.
    *
    * When you have called {@link acquire()} on the UNO object, it is often said, that you have a reference or a hard reference to the object.
    *
    * It is only allowed to invoke a method on an UNO object, when you keep a hard reference to it.
    *
    * Every call to acquire must be followed by a corresponding call to release some time later, which may eventually lead to the destruction of the object.
    */
  def acquire(): Unit = js.native
  
  /**
    * queries for a new interface to an existing UNO object.
    *
    * The {@link queryInterface()} method is the entry point to obtain other interfaces which are exported by the object. The caller asks the implementation
    * of the object, if it supports the interface specified by the type argument. The call may either return with a interface reference of the requested
    * type or with a void any.
    *
    * There are certain specifications, a {@link queryInterface()} implementation must not violate.
    *
    * 1) If queryInterface on a specific object has once returned a valid interface reference for a given type, it must return a valid reference for any
    * successive queryInterface calls on this object for the same type.
    *
    * 2) If queryInterface on a specific object has once returned a null reference for a given type, it must always return a null reference for the same
    * type.
    *
    * 3) If queryInterface on a reference A returns reference B, queryInterface on B for Type A must return interface reference A or calls made on the
    * returned reference must be equivalent to calls made on reference A.
    *
    * 4) If queryInterface on a reference A returns reference B, queryInterface on A and B for {@link XInterface} must return the same interface reference
    * (object identity).
    *
    * The reason for the strong specification is, that a Uno Runtime Environment (URE) may choose to cache {@link queryInterface()} calls.
    *
    * As mentioned above, certain language bindings may map this function differently also with different specifications, please visit the language
    * dependent specification for it. The current C++ binding sticks to the specification state
    *
    * The rules mentioned above are basically identical to the rules of QueryInterface in MS COM.
    * @param aType a UNO interface type, for which an object reference shall be obtained.
    * @returns an interface reference in case the requested interface is supported by the object, a void any otherwise.
    */
  def queryInterface(aType: `type`): js.Any = js.native
  
  /**
    * decreases the reference counter by one.
    *
    * When the reference counter reaches 0, the object gets deleted.
    *
    * Calling {@link release()} on the object is often called releasing or clearing the reference to an object.
    */
  def release(): Unit = js.native
}
object XInterface {
  
  @scala.inline
  def apply(acquire: () => Unit, queryInterface: `type` => js.Any, release: () => Unit): XInterface = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XInterface]
  }
  
  @scala.inline
  implicit class XInterfaceOps[Self <: XInterface] (val x: Self) extends AnyVal {
    
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
    def setAcquire(value: () => Unit): Self = this.set("acquire", js.Any.fromFunction0(value))
    
    @scala.inline
    def setQueryInterface(value: `type` => js.Any): Self = this.set("queryInterface", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRelease(value: () => Unit): Self = this.set("release", js.Any.fromFunction0(value))
  }
}
