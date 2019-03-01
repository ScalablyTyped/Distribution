package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.reflectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reflects a constants group.
  *
  * The type class of this type is com::sun::star::uno::TypeClass::CONSTANTS.
  * @since OOo 1.1.2
  */
trait XConstantsTypeDescription extends XTypeDescription {
  /**
    * Returns the contstants defined for this constants group.
    * @returns a sequence containing constants descriptions.
    */
  val Constants: activexDashInteropLib.SafeArray[XConstantTypeDescription]
  /**
    * Returns the contstants defined for this constants group.
    * @returns a sequence containing constants descriptions.
    */
  def getConstants(): activexDashInteropLib.SafeArray[XConstantTypeDescription]
}

object XConstantsTypeDescription {
  @scala.inline
  def apply(
    Constants: activexDashInteropLib.SafeArray[XConstantTypeDescription],
    Name: java.lang.String,
    TypeClass: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass,
    acquire: js.Function0[scala.Unit],
    getConstants: js.Function0[activexDashInteropLib.SafeArray[XConstantTypeDescription]],
    getName: js.Function0[java.lang.String],
    getTypeClass: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XConstantsTypeDescription = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Constants")(Constants)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("TypeClass")(TypeClass)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getConstants")(getConstants)
    __obj.updateDynamic("getName")(getName)
    __obj.updateDynamic("getTypeClass")(getTypeClass)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XConstantsTypeDescription]
  }
}

