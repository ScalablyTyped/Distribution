package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.registryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows access to a registry (a persistent data source). The data is stored in a hierarchical key structure beginning with a root key. Each key can
  * store a value and can have multiple subkeys.
  * @see XRegistryKey
  */
trait XSimpleRegistry
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * @returns the root key of the registry.
    * @throws InvalidRegistryException if no registry is open
    */
  val RootKey: XRegistryKey
  /** returns the URL of the current data source of the registry. */
  val URL: java.lang.String
  /**
    * disconnects the registry from the data-source.
    * @throws InvalidRegistryException if the registry is not open.
    */
  def close(): scala.Unit
  /**
    * destroys the registry and the data source.
    * @throws InvalidRegistryException if the registry is not open.
    */
  def destroy(): scala.Unit
  /**
    * @returns the root key of the registry.
    * @throws InvalidRegistryException if no registry is open
    */
  def getRootKey(): XRegistryKey
  /** returns the URL of the current data source of the registry. */
  def getURL(): java.lang.String
  /**
    * checks if the registry is readonly.
    * @throws InvalidRegistryException if the registry is not open.
    */
  def isReadOnly(): scala.Boolean
  /** checks if the registry points to a valid data-source. */
  def isValid(): scala.Boolean
  /**
    * DEPRECATED: this method lacks a registry key (better than a URL).
    *
    * merges a registry under the specified key.
    *
    * If the key does not exist it will be created. Existing keys will be overridden from keys of registry specified by **aUrl** .
    * @throws InvalidRegistryException if the registry is not open.
    * @throws MergeConflictException if any differences occur during merging
    */
  def mergeKey(aKeyName: java.lang.String, aUrl: java.lang.String): scala.Unit
  /**
    * connects the registry to a persistent data source represented by an URL.
    *
    * If a local registry is already open, this function will close the currently open registry.
    * @param rURL specifies the complete URL to access the data source.
    * @param bReadOnly specifies if the data source should be opened for read only.
    * @param bCreate specifies if the data source should be created if it does not already exist.
    * @throws InvalidRegistryException if the registry does not exist.
    */
  def open(rURL: java.lang.String, bReadOnly: scala.Boolean, bCreate: scala.Boolean): scala.Unit
}

object XSimpleRegistry {
  @scala.inline
  def apply(
    RootKey: XRegistryKey,
    URL: java.lang.String,
    acquire: js.Function0[scala.Unit],
    close: js.Function0[scala.Unit],
    destroy: js.Function0[scala.Unit],
    getRootKey: js.Function0[XRegistryKey],
    getURL: js.Function0[java.lang.String],
    isReadOnly: js.Function0[scala.Boolean],
    isValid: js.Function0[scala.Boolean],
    mergeKey: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    open: js.Function3[java.lang.String, scala.Boolean, scala.Boolean, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XSimpleRegistry = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("RootKey")(RootKey)
    __obj.updateDynamic("URL")(URL)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("close")(close)
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("getRootKey")(getRootKey)
    __obj.updateDynamic("getURL")(getURL)
    __obj.updateDynamic("isReadOnly")(isReadOnly)
    __obj.updateDynamic("isValid")(isValid)
    __obj.updateDynamic("mergeKey")(mergeKey)
    __obj.updateDynamic("open")(open)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XSimpleRegistry]
  }
}

