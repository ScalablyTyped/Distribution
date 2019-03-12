package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.reflectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reflects the " published " status of a UNOIDL entity.
  *
  * This interface is intended to be supported by objects that also support {@link com.sun.star.reflection.XTypeDescription} . (This interface could have
  * been made an optional sub-interface of {@link com.sun.star.reflection.XTypeDescription} , but is instead kept independent for reasons of backwards
  * compatibility.)
  *
  * For the various kinds of UNOIDL entities that are represented by objects supporting {@link com.sun.star.reflection.XTypeDescription} and its subtypes,
  * this optional interface should be supported as follows:
  *
  * Enum types ( {@link com.sun.star.reflection.XEnumTypeDescription} ), plain struct types ( {@link com.sun.star.reflection.XStructTypeDescription} ),
  * polymorphic struct type templates ( {@link com.sun.star.reflection.XStructTypeDescription} ), exception types ( {@link
  * com.sun.star.reflection.XCompoundTypeDescription} ), interface types ( {@link com.sun.star.reflection.XInterfaceTypeDescription2} ), typedefs ( {@link
  * com.sun.star.reflection.XIndirectTypeDescription} ), individual constants ( {@link com.sun.star.reflection.XConstantTypeDescription} ), constant
  * groups ( {@link com.sun.star.reflection.XConstantsTypeDescription} ), single-interface  -  based services ( {@link
  * com.sun.star.reflection.XServiceTypeDescription2} ), accumulation-based services ( {@link com.sun.star.reflection.XServiceTypeDescription2} ),
  * interface-based singletons ( {@link com.sun.star.reflection.XSingletonTypeDescription2} ), and service-based singletons ( {@link
  * com.sun.star.reflection.XSingletonTypeDescription2} ) support the notion of being published. Therefore, for an object that represents any such entity,
  * {@link com.sun.star.reflection.XPublished} should be supported.
  *
  * Sequence types ( {@link com.sun.star.reflection.XIndirectTypeDescription} ), type parameters of polymorphic struct type templates ( {@link
  * com.sun.star.reflection.XTypeDescription} ), instantiated polymorphic struct types ( {@link com.sun.star.reflection.XStructTypeDescription} ),
  * attributes of interface types ( {@link com.sun.star.reflection.XInterfaceAttributeTypeDescription2} ), methods of interface types ( {@link
  * com.sun.star.reflection.XInterfaceMethodTypeDescription} ), properties of accumulation-based services ( {@link
  * com.sun.star.reflection.XPropertyTypeDescription} ), deprecated com::sun::star::reflection::XArrayTypeDescriptions, and deprecated
  * com::sun::star::reflection::XUnionTypeDescriptions do not support the notion of being published. Therefore, for an object that represents any such
  * entity, {@link com.sun.star.reflection.XPublished} should not be supported.
  * @since OOo 2.0
  */
trait XPublished extends js.Object {
  /**
    * Returns the " published " status of a UNOIDL entity.
    * @returns `TRUE` if the UNOIDL entity represented by this object is published
    */
  def isPublished(): scala.Boolean
}

object XPublished {
  @scala.inline
  def apply(isPublished: () => scala.Boolean): XPublished = {
    val __obj = js.Dynamic.literal(isPublished = js.Any.fromFunction0(isPublished))
  
    __obj.asInstanceOf[XPublished]
  }
}

