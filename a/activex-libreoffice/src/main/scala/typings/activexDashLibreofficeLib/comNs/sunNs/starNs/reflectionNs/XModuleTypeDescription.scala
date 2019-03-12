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
  val Members: stdLib.SafeArray[XTypeDescription]
  /**
    * Returns the type descriptions for the members of this module.
    * @returns a sequence containing type descriptions.
    */
  def getMembers(): stdLib.SafeArray[XTypeDescription]
}

object XModuleTypeDescription {
  @scala.inline
  def apply(
    Members: stdLib.SafeArray[XTypeDescription],
    Name: java.lang.String,
    TypeClass: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass,
    acquire: () => scala.Unit,
    getMembers: () => stdLib.SafeArray[XTypeDescription],
    getName: () => java.lang.String,
    getTypeClass: () => activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XModuleTypeDescription = {
    val __obj = js.Dynamic.literal(Members = Members, Name = Name, TypeClass = TypeClass, acquire = js.Any.fromFunction0(acquire), getMembers = js.Any.fromFunction0(getMembers), getName = js.Any.fromFunction0(getName), getTypeClass = js.Any.fromFunction0(getTypeClass), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XModuleTypeDescription]
  }
}

