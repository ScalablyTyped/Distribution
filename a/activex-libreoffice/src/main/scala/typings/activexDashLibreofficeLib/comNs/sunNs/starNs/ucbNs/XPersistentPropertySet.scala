package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A persistent property set, which can be saved in and restored from a {@link XPropertySetRegistry} .
  * @author Kai Sommerfeld
  * @version 1.0
  */
trait XPersistentPropertySet
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet {
  /**
    * returns the key used to address the set in the property set registry.
    * @returns The key.
    */
  val Key: java.lang.String
  /**
    * returns the registry used to store the property set.
    * @returns The registry.
    */
  val Registry: XPropertySetRegistry
  /**
    * returns the key used to address the set in the property set registry.
    * @returns The key.
    */
  def getKey(): java.lang.String
  /**
    * returns the registry used to store the property set.
    * @returns The registry.
    */
  def getRegistry(): XPropertySetRegistry
}

