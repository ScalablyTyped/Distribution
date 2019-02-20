package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.registryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * supports a shared view on two different registries. The registry files will be opened in two different modes, registry1 will be opened with read/write
  * rights and registry2 will be opened read-only. In the context of this service, the functions `open` , `close` , and `destroy` from {@link
  * XSimpleRegistry} are not supported and throw an exception if they are used.
  *
  * Functions of {@link XSimpleRegistry} : **getURL**: returns the name of registry1.;
  *
  * **isValid**: checks if registry1 is valid. If the interface is not `NULL` then registry1 should always be valid.;
  *
  * **isReadOnly**: checks if registry1 has write protection.
  *
  * **mergeKey**: merges all information from the specified registry in registry1.;
  *
  * **getRootKey**: returns a virtual rootkey of both registries.
  *
  *
  *
  * Functions of {@link XRegistryKey} : **openKey**: returns a virtual key which is specified in registy1 or registry2.;
  *
  * **deleteKey**: deletes the key only if it is present in registry1.;
  *
  * **setLongValue, setAsciiValue, setStringValue, setBinaryValue**: sets the value at the specified key in registry1.;
  *
  * **getLongValue, getAsciiValue, getStringValue, getBinaryValue**: returns the value at the specified key in registry1, or if the value is not present
  * in registry1, it will return the value of registry2.;
  *
  * **openKeys**: returns a sequence of all subkeys in both registries.;
  *
  * **getKeyNames**: returns a sequence with the names of all subkeys in both registries.;
  *
  * **Note: all write functions only work on registry1.**:
  *
  *
  *
  * How to initialize the registries: ;  Use a sequence of {@link XSimpleRegistry} with two elements. The first element must be the registry which is
  * opened with read/write rights and the second element must be the read-only one. ;  Two different ways are possible: ; use {@link
  * com.sun.star.lang.XMultiServiceFactory.createInstanceWithArguments()} to create an instance of this service where the value of the any parameter must
  * be the sequence with the two open registries.use the initialize function of the {@link com.sun.star.lang.XInitialization} interface where the value of
  * the any parameter must be the sequence with the two open registries.;
  *
  * Guarantees: -thread safe
  */
trait NestedRegistry
  extends XSimpleRegistry
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XInitialization

