package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is used to query, register and deregister user interface element factories.
  *
  * A user interface element factory is registered for a set of three properties. **Type** a string that identifies a type of a user interface
  * element.**Name** a string that identifies a single user interface element within a type class.**Module** a string that identifies a single module of
  * OpenOffice. A combination of these three property values can uniquely identify every user interface element within OpenOffice.
  *
  * Currently the following user interface element types are defined: **menubar****popupmenu****toolbar****statusbar****floater**
  * @since OOo 2.0
  */
trait XUIElementFactoryRegistration
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * function to retrieve a list of all registered user interface element factories
    * @returns a sequence of sequence of property values which describe every registered user interface element factory. ;  The following properties are defined
    */
  val RegisteredFactories: activexDashInteropLib.SafeArray[
    activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ]
  /**
    * function to remove a previously defined user interface element factory.
    * @param aType a string that identifies a type of a user interface element. Currently the following types are supported: **menubar****toolbar****statusbar**
    * @param aName an optional name of a single user interface element. This name must be unique within a user interface element type class. This value can re
    * @param ModuleIdentifier an optional module name that can be used to deregister a factory only for a single module. This value can remain empty if not a
    */
  def deregisterFactory(aType: java.lang.String, aName: java.lang.String, ModuleIdentifier: java.lang.String): scala.Unit
  /**
    * function to retrieve a previously registered user interface element factory.
    * @param ResourceURL a resource URL which identifies a user interface element. A resource URL uses the following syntax: "private:resource/$type/$name". I
    * @param ModuleIdentifier an optional module identifier. This value can remain empty, if a generic factory is requested. The module identifier can be retr
    * @returns a reference to a registered user interface element factory if a factory has been found. An empty reference when no factory has been found. **The
    */
  def getFactory(ResourceURL: java.lang.String, ModuleIdentifier: java.lang.String): XUIElementFactory
  /**
    * function to retrieve a list of all registered user interface element factories
    * @returns a sequence of sequence of property values which describe every registered user interface element factory. ;  The following properties are defined
    */
  def getRegisteredFactories(): activexDashInteropLib.SafeArray[
    activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ]
  /**
    * function to register a user interface element factory.
    * @param aType a string that identifies a type of a user interface element. Currently the following types are supported: **menubar****toolbar****statusbar**
    * @param aName an optional name of a single user interface element. This name must be unique within a user interface element type class. This value can re
    * @param aModuleIdentifier an optional module identifier that can be used to register a factory only for a single module. This value can remain empty if n
    * @param aFactoryImplementationName a UNO implementation name that can be used by an implementation to create a factory instance.
    */
  def registerFactory(
    aType: java.lang.String,
    aName: java.lang.String,
    aModuleIdentifier: java.lang.String,
    aFactoryImplementationName: java.lang.String
  ): scala.Unit
}

object XUIElementFactoryRegistration {
  @scala.inline
  def apply(
    RegisteredFactories: activexDashInteropLib.SafeArray[
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
    ],
    acquire: js.Function0[scala.Unit],
    deregisterFactory: js.Function3[java.lang.String, java.lang.String, java.lang.String, scala.Unit],
    getFactory: js.Function2[java.lang.String, java.lang.String, XUIElementFactory],
    getRegisteredFactories: js.Function0[
      activexDashInteropLib.SafeArray[
        activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
      ]
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    registerFactory: js.Function4[java.lang.String, java.lang.String, java.lang.String, java.lang.String, scala.Unit],
    release: js.Function0[scala.Unit]
  ): XUIElementFactoryRegistration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("RegisteredFactories")(RegisteredFactories)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("deregisterFactory")(deregisterFactory)
    __obj.updateDynamic("getFactory")(getFactory)
    __obj.updateDynamic("getRegisteredFactories")(getRegisteredFactories)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("registerFactory")(registerFactory)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XUIElementFactoryRegistration]
  }
}

