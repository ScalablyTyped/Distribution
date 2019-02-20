package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Is implemented by objects that also are a property of some other object.
  *
  * Provides access to traits of this object that would otherwise only be available from a containing {@link XPropertySet} via its {@link
  * XPropertySetInfo} .
  */
trait XProperty
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** @returns the specification of this object as {@link Property} . */
  val AsProperty: Property
  /** @returns the specification of this object as {@link Property} . */
  def getAsProperty(): Property
}

