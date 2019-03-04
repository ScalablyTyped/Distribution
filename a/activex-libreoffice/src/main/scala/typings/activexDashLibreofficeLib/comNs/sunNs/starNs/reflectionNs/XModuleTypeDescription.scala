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

object XModuleTypeDescription {
  @scala.inline
  def apply(
    Members: activexDashInteropLib.SafeArray[XTypeDescription],
    Name: java.lang.String,
    TypeClass: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass,
    acquire: js.Function0[scala.Unit],
    getMembers: js.Function0[activexDashInteropLib.SafeArray[XTypeDescription]],
    getName: js.Function0[java.lang.String],
    getTypeClass: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XModuleTypeDescription = {
    val __obj = js.Dynamic.literal(Members = Members, Name = Name, TypeClass = TypeClass, acquire = acquire, getMembers = getMembers, getName = getName, getTypeClass = getTypeClass, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XModuleTypeDescription]
  }
}

