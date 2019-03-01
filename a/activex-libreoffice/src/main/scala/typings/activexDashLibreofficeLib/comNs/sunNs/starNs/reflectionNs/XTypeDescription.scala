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

object XTypeDescription {
  @scala.inline
  def apply(
    Name: java.lang.String,
    TypeClass: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass,
    acquire: js.Function0[scala.Unit],
    getName: js.Function0[java.lang.String],
    getTypeClass: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XTypeDescription = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("TypeClass")(TypeClass)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getName")(getName)
    __obj.updateDynamic("getTypeClass")(getTypeClass)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XTypeDescription]
  }
}

