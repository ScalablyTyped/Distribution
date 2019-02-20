package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.reflectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reflects a module.
  *
  * The type class of this type is com::sun::star::uno::TypeClass::MODULE.
  * @since OOo 1.1.2
  */
trait XModuleTypeDescription extends XTypeDescription {
  /**
    * Returns the type descriptions for the members of this module.
    * @returns a sequence containing type descriptions.
    */
  val Members: activexDashInteropLib.SafeArray[XTypeDescription]
  /**
    * Returns the type descriptions for the members of this module.
    * @returns a sequence containing type descriptions.
    */
  def getMembers(): activexDashInteropLib.SafeArray[XTypeDescription]
}

