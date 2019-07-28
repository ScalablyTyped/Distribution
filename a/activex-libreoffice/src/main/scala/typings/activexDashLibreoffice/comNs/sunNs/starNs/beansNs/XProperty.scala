package typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Is implemented by objects that also are a property of some other object.
  *
  * Provides access to traits of this object that would otherwise only be available from a containing {@link XPropertySet} via its {@link
  * XPropertySetInfo} .
  */
trait XProperty extends XInterface {
  /** @returns the specification of this object as {@link Property} . */
  val AsProperty: Property
  /** @returns the specification of this object as {@link Property} . */
  def getAsProperty(): Property
}

object XProperty {
  @scala.inline
  def apply(
    AsProperty: Property,
    acquire: () => Unit,
    getAsProperty: () => Property,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XProperty = {
    val __obj = js.Dynamic.literal(AsProperty = AsProperty, acquire = js.Any.fromFunction0(acquire), getAsProperty = js.Any.fromFunction0(getAsProperty), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XProperty]
  }
}

