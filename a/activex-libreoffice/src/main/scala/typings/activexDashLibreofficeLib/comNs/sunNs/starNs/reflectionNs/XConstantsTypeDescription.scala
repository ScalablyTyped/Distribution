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

