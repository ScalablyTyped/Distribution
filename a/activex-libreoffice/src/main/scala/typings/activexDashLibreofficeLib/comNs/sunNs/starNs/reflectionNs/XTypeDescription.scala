package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.reflectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reflects a UNOIDL entity.
  * @see XPublished
  * @see XIndirectTypeDescription
  * @see XEnumTypeDescription
  * @see XStructTypeDescription
  * @see XCompoundTypeDescription
  * @see XInterfaceTypeDescription2
  * @see XInterfaceAttributeTypeDescription2
  * @see XInterfaceMethodTypeDescription
  * @see XConstantTypeDescription
  * @see XConstantsTypeDescription
  * @see XServiceTypeDescription2
  * @see XPropertyTypeDescription2
  * @see XSingletonTypeDescription2
  */
trait XTypeDescription
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Returns the fully qualified name of the UNOIDL entity.
    * @returns fully qualified name of the entity
    */
  val Name: java.lang.String
  /**
    * Returns the type class of the reflected UNOIDL entity.
    * @returns type class of the entity
    */
  val TypeClass: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass
  /**
    * Returns the fully qualified name of the UNOIDL entity.
    * @returns fully qualified name of the entity
    */
  def getName(): java.lang.String
  /**
    * Returns the type class of the reflected UNOIDL entity.
    * @returns type class of the entity
    */
  def getTypeClass(): activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass
}

