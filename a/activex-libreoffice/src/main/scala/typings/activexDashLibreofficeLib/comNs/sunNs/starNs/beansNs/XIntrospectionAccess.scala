package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs

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
trait XIntrospectionAccess
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
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
  val SuppliedMethodConcepts: scala.Double
  /**
    * returns information about which property concepts described in the {@link PropertyConcept} constants group are supported by this {@link
    * XIntrospectionAccess} implementation.
    *
    * The minimum supported concepts should be:
    *
    * {@link PropertyConcept.PROPERTYSET} ,{@link PropertyConcept.ATTRIBUTES} and{@link PropertyConcept.METHODS} .
    * @returns zero or more constants of the {@link PropertyConcept} constants group.combined by an arithmetical or-operation.
    */
  val SuppliedPropertyConcepts: scala.Double
  /**
    * returns the listener types supported by the introspected object.
    *
    * If the introspected object has the methods `addFooListener( XFooListener xFoo )` and `removeFooListener( XFooListener xFoo )` the type of XFooListener
    * will be one of the elements in the returned sequence.
    * @returns a sequence of the types of listener interfaces which are supported by the introspected object.
    */
  val SupportedListeners: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.`type`]
  /**
    * returns information about a method if a method with the demanded name exists and if it accords to one of the demanded MethodConcepts. The information
    * is provided as {@link com.sun.star.reflection.XIdlMethod} .
    * @param aName the name of the method.
    * @param nMethodConcepts zero or more constants of the {@link MethodConcept} constants group combined by an arithmetical or-operation.
    * @returns A {@link com.sun.star.reflection.XIdlMethod} providing information about and access to the demanded method if a corresponding method exists.
    * @throws NoSuchElementException when a method with the demanded name doesn't exist or if it accords to a wrong {@link MethodConcept} .
    */
  def getMethod(aName: java.lang.String, nMethodConcepts: scala.Double): activexDashLibreofficeLib.comNs.sunNs.starNs.reflectionNs.XIdlMethod
  /**
    * returns a sequence of methods of the introspected object.
    * @param nMethodConcepts zero or more constants of the {@link MethodConcept} constants group combined by an arithmetical or-operation.
    * @returns all methods of the introspected object which accord to the demanded MethodConcepts.
    */
  def getMethods(nMethodConcepts: scala.Double): activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.reflectionNs.XIdlMethod]
  /**
    * returns a sequence of properties of the introspected object
    * @param nPropertyConcepts zero or more constants of the {@link PropertyConcept} constants group combined by an arithmetical or-operation.
    * @returns all properties of the introspected object which accord to the demanded PropertyConcepts.
    */
  def getProperties(nPropertyConcepts: scala.Double): activexDashInteropLib.SafeArray[Property]
  /**
    * returns information about a property if a property with the demanded name exists and if it accords to one of the demanded PropertyConcepts. The
    * information is provided as {@link Property} struct.
    * @param aName the name of the property.
    * @param nPropertyConcepts zero or more constants of the {@link PropertyConcept} constants group combined by an arithmetical or-operation.
    * @returns A {@link Property} struct providing information about the demanded property, if a corresponding property exists.
    * @throws NoSuchElementException when a property with the demanded name doesn't exist or if it accords to a wrong {@link PropertyConcept} .
    */
  def getProperty(aName: java.lang.String, nPropertyConcepts: scala.Double): Property
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
  def getSuppliedMethodConcepts(): scala.Double
  /**
    * returns information about which property concepts described in the {@link PropertyConcept} constants group are supported by this {@link
    * XIntrospectionAccess} implementation.
    *
    * The minimum supported concepts should be:
    *
    * {@link PropertyConcept.PROPERTYSET} ,{@link PropertyConcept.ATTRIBUTES} and{@link PropertyConcept.METHODS} .
    * @returns zero or more constants of the {@link PropertyConcept} constants group.combined by an arithmetical or-operation.
    */
  def getSuppliedPropertyConcepts(): scala.Double
  /**
    * returns the listener types supported by the introspected object.
    *
    * If the introspected object has the methods `addFooListener( XFooListener xFoo )` and `removeFooListener( XFooListener xFoo )` the type of XFooListener
    * will be one of the elements in the returned sequence.
    * @returns a sequence of the types of listener interfaces which are supported by the introspected object.
    */
  def getSupportedListeners(): activexDashInteropLib.SafeArray[activexDashLibreofficeLib.`type`]
  /**
    * allows to ask if a method with the demanded name exists and if it accords to one of the demanded {@link MethodConcept} .
    * @param aName the name of the method.
    * @param nMethodConcepts zero or more constants of the {@link MethodConcept} constants group combined by an arithmetical or-operation.
    * @returns `TRUE` if the method exists and accords to one of the demanded MethodConcepts, otherwise `FALSE` is returned.
    */
  def hasMethod(aName: java.lang.String, nMethodConcepts: scala.Double): scala.Boolean
  /**
    * allows to ask if a property with the demanded name exists and if it accords to one of the demanded {@link PropertyConcept} .
    * @param aName the name of the property.
    * @param nPropertyConcepts zero or more constants of the {@link PropertyConcept} constants group combined by an arithmetical or-operation.
    * @returns `TRUE` if the property exists and accords to one of the demanded PropertyConcepts, otherwise `FALSE` is returned.
    */
  def hasProperty(aName: java.lang.String, nPropertyConcepts: scala.Double): scala.Boolean
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
  def queryAdapter(aInterfaceType: activexDashLibreofficeLib.`type`): activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
}

object XIntrospectionAccess {
  @scala.inline
  def apply(
    SuppliedMethodConcepts: scala.Double,
    SuppliedPropertyConcepts: scala.Double,
    SupportedListeners: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.`type`],
    acquire: js.Function0[scala.Unit],
    getMethod: js.Function2[
      java.lang.String, 
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.reflectionNs.XIdlMethod
    ],
    getMethods: js.Function1[
      scala.Double, 
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.reflectionNs.XIdlMethod]
    ],
    getProperties: js.Function1[scala.Double, activexDashInteropLib.SafeArray[Property]],
    getProperty: js.Function2[java.lang.String, scala.Double, Property],
    getSuppliedMethodConcepts: js.Function0[scala.Double],
    getSuppliedPropertyConcepts: js.Function0[scala.Double],
    getSupportedListeners: js.Function0[activexDashInteropLib.SafeArray[activexDashLibreofficeLib.`type`]],
    hasMethod: js.Function2[java.lang.String, scala.Double, scala.Boolean],
    hasProperty: js.Function2[java.lang.String, scala.Double, scala.Boolean],
    queryAdapter: js.Function1[
      activexDashLibreofficeLib.`type`, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XIntrospectionAccess = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("SuppliedMethodConcepts")(SuppliedMethodConcepts)
    __obj.updateDynamic("SuppliedPropertyConcepts")(SuppliedPropertyConcepts)
    __obj.updateDynamic("SupportedListeners")(SupportedListeners)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getMethod")(getMethod)
    __obj.updateDynamic("getMethods")(getMethods)
    __obj.updateDynamic("getProperties")(getProperties)
    __obj.updateDynamic("getProperty")(getProperty)
    __obj.updateDynamic("getSuppliedMethodConcepts")(getSuppliedMethodConcepts)
    __obj.updateDynamic("getSuppliedPropertyConcepts")(getSuppliedPropertyConcepts)
    __obj.updateDynamic("getSupportedListeners")(getSupportedListeners)
    __obj.updateDynamic("hasMethod")(hasMethod)
    __obj.updateDynamic("hasProperty")(hasProperty)
    __obj.updateDynamic("queryAdapter")(queryAdapter)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XIntrospectionAccess]
  }
}

