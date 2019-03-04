package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.providerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This interface is used to help transform Scripting Framework storage locations to Scripting Framework script URIs and vice versa. */
trait XScriptURIHelper
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Obtain the root storage URI for this {@link ScriptURIHelper} . The resulting string can be used to access the storage for this using the Universal
    * Content Broker
    * @returns a URI to the storage as a `string`
    */
  val RootStorageURI: java.lang.String
  /**
    * Obtain the root storage URI for this {@link ScriptURIHelper} . The resulting string can be used to access the storage for this using the Universal
    * Content Broker
    * @returns a URI to the storage as a `string`
    */
  def getRootStorageURI(): java.lang.String
  /**
    * Obtain the Scripting Framework script URI for a specific UCB URI
    * @returns the URI as a `string`
    * @throws com::sun::star::lang::IllegalArgumentException if the storageURI is not a valid
    */
  def getScriptURI(storageURI: java.lang.String): java.lang.String
  /**
    * Obtain the storage URI for a specific Scripting Framework script URI.
    * @returns a URI to the storage as a `string`
    * @throws com::sun::star::lang::IllegalArgumentException if the storageURI is not a valid
    */
  def getStorageURI(scriptURI: java.lang.String): java.lang.String
}

object XScriptURIHelper {
  @scala.inline
  def apply(
    RootStorageURI: java.lang.String,
    acquire: js.Function0[scala.Unit],
    getRootStorageURI: js.Function0[java.lang.String],
    getScriptURI: js.Function1[java.lang.String, java.lang.String],
    getStorageURI: js.Function1[java.lang.String, java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XScriptURIHelper = {
    val __obj = js.Dynamic.literal(RootStorageURI = RootStorageURI, acquire = acquire, getRootStorageURI = getRootStorageURI, getScriptURI = getScriptURI, getStorageURI = getStorageURI, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XScriptURIHelper]
  }
}

