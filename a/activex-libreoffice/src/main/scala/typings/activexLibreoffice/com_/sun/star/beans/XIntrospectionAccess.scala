package typings.activexLibreoffice.com_.sun.star.beans

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.reflection.XIdlMethod
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents the result of an introspection operation done by the inspect method of {@link XIntrospection} .
  *
  * This interface gives information about an object's properties and methods as detected in the introspection process. It's not possible to access
  * properties or call methods directly using this interface but it provides access to other interfaces to do so. See {@link
  * com.sun.star.beans.XIntrospectionAccess.queryAdapter()}
  *
  * The {@link XExactName} interface has to be supported in order to implement inaccurate name access for all objects which implement the {@link
  * com.sun.star.container.XNameAccess} interface or {@link XPropertySet} .
  *
  * The {@link XMaterialHolder} interface has to be supported to give access to the inspected object.
  * @@see XPropertySet
  * @@see com::sun::star::beans::XExactName
  */
trait XIntrospectionAccess extends XInterface {
  /**
    * returns information about which method concepts described in the {@link MethodConcept} constants group are supported by this {@link
    * XIntrospectionAccess} implementation.
    *
    * The minimum supported concepts should be:
    *
    * {@link MethodConcept.PROPERTY} ,{@link MethodConcept.LISTENER} ,{@link MethodConcept.ENUMERATION} ,{@link MethodConcept.NAMECONTAINER}{@link
    * MethodConcept.INDEXCONTAINER} ;
    * @returns zero or more constants of the {@link MethodConcept} constants group combined by an arithmetical or-operation.
    */
  val SuppliedMethodConcepts: Double
  /**
    * returns information about which property concepts described in the {@link PropertyConcept} constants group are supported by this {@link
    * XIntrospectionAccess} implementation.
    *
    * The minimum supported concepts should be:
    *
    * {@link PropertyConcept.PROPERTYSET} ,{@link PropertyConcept.ATTRIBUTES} and{@link PropertyConcept.METHODS} .
    * @returns zero or more constants of the {@link PropertyConcept} constants group.combined by an arithmetical or-operation.
    */
  val SuppliedPropertyConcepts: Double
  /**
    * returns the listener types supported by the introspected object.
    *
    * If the introspected object has the methods `addFooListener( XFooListener xFoo )` and `removeFooListener( XFooListener xFoo )` the type of XFooListener
    * will be one of the elements in the returned sequence.
    * @returns a sequence of the types of listener interfaces which are supported by the introspected object.
    */
  val SupportedListeners: SafeArray[`type`]
  /**
    * returns information about a method if a method with the demanded name exists and if it accords to one of the demanded MethodConcepts. The information
    * is provided as {@link com.sun.star.reflection.XIdlMethod} .
    * @param aName the name of the method.
    * @param nMethodConcepts zero or more constants of the {@link MethodConcept} constants group combined by an arithmetical or-operation.
    * @returns A {@link com.sun.star.reflection.XIdlMethod} providing information about and access to the demanded method if a corresponding method exists.
    * @throws NoSuchElementException when a method with the demanded name doesn't exist or if it accords to a wrong {@link MethodConcept} .
    */
  def getMethod(aName: String, nMethodConcepts: Double): XIdlMethod
  /**
    * returns a sequence of methods of the introspected object.
    * @param nMethodConcepts zero or more constants of the {@link MethodConcept} constants group combined by an arithmetical or-operation.
    * @returns all methods of the introspected object which accord to the demanded MethodConcepts.
    */
  def getMethods(nMethodConcepts: Double): SafeArray[XIdlMethod]
  /**
    * returns a sequence of properties of the introspected object
    * @param nPropertyConcepts zero or more constants of the {@link PropertyConcept} constants group combined by an arithmetical or-operation.
    * @returns all properties of the introspected object which accord to the demanded PropertyConcepts.
    */
  def getProperties(nPropertyConcepts: Double): SafeArray[Property]
  /**
    * returns information about a property if a property with the demanded name exists and if it accords to one of the demanded PropertyConcepts. The
    * information is provided as {@link Property} struct.
    * @param aName the name of the property.
    * @param nPropertyConcepts zero or more constants of the {@link PropertyConcept} constants group combined by an arithmetical or-operation.
    * @returns A {@link Property} struct providing information about the demanded property, if a corresponding property exists.
    * @throws NoSuchElementException when a property with the demanded name doesn't exist or if it accords to a wrong {@link PropertyConcept} .
    */
  def getProperty(aName: String, nPropertyConcepts: Double): Property
  /**
    * returns information about which method concepts described in the {@link MethodConcept} constants group are supported by this {@link
    * XIntrospectionAccess} implementation.
    *
    * The minimum supported concepts should be:
    *
    * {@link MethodConcept.PROPERTY} ,{@link MethodConcept.LISTENER} ,{@link MethodConcept.ENUMERATION} ,{@link MethodConcept.NAMECONTAINER}{@link
    * MethodConcept.INDEXCONTAINER} ;
    * @returns zero or more constants of the {@link MethodConcept} constants group combined by an arithmetical or-operation.
    */
  def getSuppliedMethodConcepts(): Double
  /**
    * returns information about which property concepts described in the {@link PropertyConcept} constants group are supported by this {@link
    * XIntrospectionAccess} implementation.
    *
    * The minimum supported concepts should be:
    *
    * {@link PropertyConcept.PROPERTYSET} ,{@link PropertyConcept.ATTRIBUTES} and{@link PropertyConcept.METHODS} .
    * @returns zero or more constants of the {@link PropertyConcept} constants group.combined by an arithmetical or-operation.
    */
  def getSuppliedPropertyConcepts(): Double
  /**
    * returns the listener types supported by the introspected object.
    *
    * If the introspected object has the methods `addFooListener( XFooListener xFoo )` and `removeFooListener( XFooListener xFoo )` the type of XFooListener
    * will be one of the elements in the returned sequence.
    * @returns a sequence of the types of listener interfaces which are supported by the introspected object.
    */
  def getSupportedListeners(): SafeArray[`type`]
  /**
    * allows to ask if a method with the demanded name exists and if it accords to one of the demanded {@link MethodConcept} .
    * @param aName the name of the method.
    * @param nMethodConcepts zero or more constants of the {@link MethodConcept} constants group combined by an arithmetical or-operation.
    * @returns `TRUE` if the method exists and accords to one of the demanded MethodConcepts, otherwise `FALSE` is returned.
    */
  def hasMethod(aName: String, nMethodConcepts: Double): Boolean
  /**
    * allows to ask if a property with the demanded name exists and if it accords to one of the demanded {@link PropertyConcept} .
    * @param aName the name of the property.
    * @param nPropertyConcepts zero or more constants of the {@link PropertyConcept} constants group combined by an arithmetical or-operation.
    * @returns `TRUE` if the property exists and accords to one of the demanded PropertyConcepts, otherwise `FALSE` is returned.
    */
  def hasProperty(aName: String, nPropertyConcepts: Double): Boolean
  /**
    * creates an adapter that implements an interface with the specified type.
    *
    * To access properties, query for the {@link XPropertySet} interface. If the {@link XPropertySet} can be queried, the {@link XFastPropertySet} interface
    * must be supported too.
    *
    * If the introspected object implements a name container, the introspection should return the {@link com.sun.star.container.XNameAccess} and {@link
    * com.sun.star.container.XNameContainer} interfaces.
    *
    * If the introspected object implements an index container, the introspection should return the {@link com.sun.star.container.XIndexAccess} and {@link
    * com.sun.star.container.XIndexContainer} interfaces.
    *
    * If the introspected object implements an enumeration container, the introspection should return the {@link com.sun.star.container.XEnumerationAccess}
    * interface.
    *
    * If the introspected object implements the {@link com.sun.star.reflection.XIdlArray} interface, the introspection should return this.
    *
    * To implement inaccurate name access, at all objects, which implement the {@link com.sun.star.container.XNameAccess} or {@link XPropertySet} interface,
    * the {@link XExactName} interface has to be supported.
    * @see com.sun.star.beans.XExactName
    */
  def queryAdapter(aInterfaceType: `type`): XInterface
}

object XIntrospectionAccess {
  @scala.inline
  def apply(
    SuppliedMethodConcepts: Double,
    SuppliedPropertyConcepts: Double,
    SupportedListeners: SafeArray[`type`],
    acquire: () => Unit,
    getMethod: (String, Double) => XIdlMethod,
    getMethods: Double => SafeArray[XIdlMethod],
    getProperties: Double => SafeArray[Property],
    getProperty: (String, Double) => Property,
    getSuppliedMethodConcepts: () => Double,
    getSuppliedPropertyConcepts: () => Double,
    getSupportedListeners: () => SafeArray[`type`],
    hasMethod: (String, Double) => Boolean,
    hasProperty: (String, Double) => Boolean,
    queryAdapter: `type` => XInterface,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XIntrospectionAccess = {
    val __obj = js.Dynamic.literal(SuppliedMethodConcepts = SuppliedMethodConcepts.asInstanceOf[js.Any], SuppliedPropertyConcepts = SuppliedPropertyConcepts.asInstanceOf[js.Any], SupportedListeners = SupportedListeners.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getMethod = js.Any.fromFunction2(getMethod), getMethods = js.Any.fromFunction1(getMethods), getProperties = js.Any.fromFunction1(getProperties), getProperty = js.Any.fromFunction2(getProperty), getSuppliedMethodConcepts = js.Any.fromFunction0(getSuppliedMethodConcepts), getSuppliedPropertyConcepts = js.Any.fromFunction0(getSuppliedPropertyConcepts), getSupportedListeners = js.Any.fromFunction0(getSupportedListeners), hasMethod = js.Any.fromFunction2(hasMethod), hasProperty = js.Any.fromFunction2(hasProperty), queryAdapter = js.Any.fromFunction1(queryAdapter), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XIntrospectionAccess]
  }
}

