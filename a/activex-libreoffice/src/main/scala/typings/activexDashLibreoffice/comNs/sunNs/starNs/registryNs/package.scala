package typings.activexDashLibreoffice.comNs.sunNs.starNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object registryNs {
  import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.Exception

  /**
    * is thrown when an application tries to register a new component (implementation) using the {@link
    * XImplementationRegistration.registerImplementation()} method, but the component cannot be registered. The reason for this exception could be: ; ; the
    * component cannot be found or cannot be loaded (missing path or classpath)the component doesn't provide the necessary specifactions (exported
    * registration functions for a C++ component (shared library) or a named registration class with the appropriate methods for a Java component (normally
    * a jar file)).;
    */
  type CannotRegisterImplementationException = Exception
  /**
    * implicitly supports a local registry and a read-only system registry for global information. In the context of this service, the functions `open` ,
    * `close` , and `destroy` from {@link XSimpleRegistry} are not supported and throw an exception if they are used.
    *
    * Functions of {@link XSimpleRegistry} : **getURL**: returns the name of the local registry.
    *
    * **isValid**: checks if the local registry is valid. If the interface is not `NULL` the local registry should always be valid.
    *
    * **isReadOnly**: checks if the local registry has write protection.
    *
    * **mergeKey**: merges all information from the specified registry in the local registry.
    *
    * **getRootKey**: returns a virtual rootkey of both registries.
    *
    *
    *
    * Functions of {@link XRegistryKey} : **openKey**: returns a virtual key which is specified in the local or the system registry.
    *
    * **deleteKey**: deletes the key only if it is present in the local registry.
    *
    * **setLongValue, setAsciiValue, setStringValue, setBinaryValue**: sets the value at the specified key in the local registry.
    *
    * **getLongValue, getAsciiValue, getStringValue, getBinaryValue**: returns the value at the specified key in the local registry, or if the value is not
    * present in the local registry, it will return the value of the system registry.
    *
    * **openKeys**: returns a sequence of all subkeys in both registries.
    *
    * **getKeyNames**: returns a sequence with the names of all subkeys in both registries.
    *
    * **Note: all write functions only work on the local registry.**:
    *
    *
    *
    * How to find the registries: **search for the system registry:  **: The system registry will always be searched in the same directory as the
    * executable. The name of the system registry is "applicat.rdb". If the system registry was not found, then the environment variable STAR_REGISTRY will
    * be checked. If this variable was set, it must contain a full path to a valid system registry.
    *
    * **Search for the user registry using the following rules:  **: {{ordered list here, see documentation}}
    *
    * **Guarantees:**
    *
    * -thread safe
    */
  type DefaultRegistry = XSimpleRegistry
  /**
    * is the implementation of the interface {@link XImplementationRegistration} . This service can be used to install or uninstall components
    * (implementations). Further, it is possible to check if all runtime dependencies (needed services) are available to use a specified component.
    *
    * Guarantees: -thread safe
    */
  type ImplementationRegistration = XImplementationRegistration
  /** signals that the registry is invalid or an operation on the registry failed. */
  type InvalidRegistryException = Exception
  /** signals that the value of the key is invalid or does not have the appropriate key type. */
  type InvalidValueException = Exception
  /** is thrown if entries of two registries are contradictory in the context of {@link XSimpleRegistry.mergeKey()} e() method. */
  type MergeConflictException = Exception
  /**
    * makes it possible to create, open, or close a registry. Further, it is possible to merge a registry under a specified key in the open registry.
    *
    * Guarantees: -thread safe
    */
  type SimpleRegistry = XSimpleRegistry
}
