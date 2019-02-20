package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies a set of properties.
  *
  * There are three kinds of properties: bound propertiesconstrained propertiesfree properties
  *
  * The specification only describes the properties, it does not contain any values.
  */
trait XPropertySetInfo
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** @returns a sequence with all property descriptors which are specified within this {@link XPropertySetInfo} . */
  val Properties: activexDashInteropLib.SafeArray[Property]
  /** @returns a sequence with all property descriptors which are specified within this {@link XPropertySetInfo} . */
  def getProperties(): activexDashInteropLib.SafeArray[Property]
  /**
    * @param aName specifies the name of the property.
    * @returns the property with the specified name from the object.
    * @throws UnknownPropertyException if the property does not exist.
    */
  def getPropertyByName(aName: java.lang.String): Property
  /**
    * @param Name specifies the name of the property.
    * @returns `TRUE` if a property with the specified name exist; otherwise `FALSE` is returned.
    */
  def hasPropertyByName(Name: java.lang.String): scala.Boolean
}

