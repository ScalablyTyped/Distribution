package typings.activexDashLibreoffice.comNs.sunNs.starNs.reflectionNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.TypeClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Reflects a typedef or sequence type. The type class of this description is TypeClass_TYPEDEF or TypeClass_SEQUENCE. */
trait XIndirectTypeDescription extends XTypeDescription {
  /**
    * Returns the typedefed type, if the type is a typedef, or the element type, if the type is a sequence.
    * @returns referenced type
    */
  val ReferencedType: XTypeDescription
  /**
    * Returns the typedefed type, if the type is a typedef, or the element type, if the type is a sequence.
    * @returns referenced type
    */
  def getReferencedType(): XTypeDescription
}

object XIndirectTypeDescription {
  @scala.inline
  def apply(
    Name: String,
    ReferencedType: XTypeDescription,
    TypeClass: TypeClass,
    acquire: () => Unit,
    getName: () => String,
    getReferencedType: () => XTypeDescription,
    getTypeClass: () => TypeClass,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XIndirectTypeDescription = {
    val __obj = js.Dynamic.literal(Name = Name, ReferencedType = ReferencedType, TypeClass = TypeClass, acquire = js.Any.fromFunction0(acquire), getName = js.Any.fromFunction0(getName), getReferencedType = js.Any.fromFunction0(getReferencedType), getTypeClass = js.Any.fromFunction0(getTypeClass), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XIndirectTypeDescription]
  }
}

