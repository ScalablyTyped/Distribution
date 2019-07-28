package typings.activexDashLibreoffice.comNs.sunNs.starNs.reflectionNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.TypeClass
import typings.std.SafeArray
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
  val Constants: SafeArray[XConstantTypeDescription]
  /**
    * Returns the contstants defined for this constants group.
    * @returns a sequence containing constants descriptions.
    */
  def getConstants(): SafeArray[XConstantTypeDescription]
}

object XConstantsTypeDescription {
  @scala.inline
  def apply(
    Constants: SafeArray[XConstantTypeDescription],
    Name: String,
    TypeClass: TypeClass,
    acquire: () => Unit,
    getConstants: () => SafeArray[XConstantTypeDescription],
    getName: () => String,
    getTypeClass: () => TypeClass,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XConstantsTypeDescription = {
    val __obj = js.Dynamic.literal(Constants = Constants, Name = Name, TypeClass = TypeClass, acquire = js.Any.fromFunction0(acquire), getConstants = js.Any.fromFunction0(getConstants), getName = js.Any.fromFunction0(getName), getTypeClass = js.Any.fromFunction0(getTypeClass), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XConstantsTypeDescription]
  }
}

