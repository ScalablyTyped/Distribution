package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.reflectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reflects a struct type, supporting polymorphic struct types.
  *
  * This type supersedes {@link XCompoundTypeDescription} , which only supports plain struct types.
  *
  * This type is used to reflect all of the following:
  *
  * Polymorphic struct type templates, like `Struct<T, U>` . For these, {@link com.sun.star.reflection.XStructTypeDescription.getTypeParameters()} returns
  * a non-empty sequence, while {@link com.sun.star.reflection.XStructTypeDescription.getTypeArguments()} returns an empty sequence.
  *
  * Instantiated polymorphic struct types, like `Struct<long, hyper>` . For these, {@link
  * com.sun.star.reflection.XStructTypeDescription.getTypeParameters()} returns an empty sequence, while {@link
  * com.sun.star.reflection.XStructTypeDescription.getTypeArguments()} returns a non-empty sequence.
  *
  * Plain struct types. For these, both {@link com.sun.star.reflection.XStructTypeDescription.getTypeParameters()} and {@link
  * com.sun.star.reflection.XStructTypeDescription.getTypeArguments()} return an empty sequence.
  * @since OOo 2.0
  */
trait XStructTypeDescription extends XCompoundTypeDescription {
  /**
    * Returns the type arguments of an instantiated polymorphic struct type.
    * @returns a sequence of all type arguments, in the correct order; for a plain struct type, or a polymorphic struct type template, an empty sequence is returned
    */
  val TypeArguments: stdLib.SafeArray[XTypeDescription]
  /**
    * Returns the type parameters of a polymorphic struct type template.
    * @returns a sequence of the names of all type parameters, in the correct order; for a plain struct type, or an instantiated polymorphic struct type, an emp
    */
  val TypeParameters: stdLib.SafeArray[java.lang.String]
  /**
    * Returns the type arguments of an instantiated polymorphic struct type.
    * @returns a sequence of all type arguments, in the correct order; for a plain struct type, or a polymorphic struct type template, an empty sequence is returned
    */
  def getTypeArguments(): stdLib.SafeArray[XTypeDescription]
  /**
    * Returns the type parameters of a polymorphic struct type template.
    * @returns a sequence of the names of all type parameters, in the correct order; for a plain struct type, or an instantiated polymorphic struct type, an emp
    */
  def getTypeParameters(): stdLib.SafeArray[java.lang.String]
}

object XStructTypeDescription {
  @scala.inline
  def apply(
    BaseType: XTypeDescription,
    MemberNames: stdLib.SafeArray[java.lang.String],
    MemberTypes: stdLib.SafeArray[XTypeDescription],
    Name: java.lang.String,
    TypeArguments: stdLib.SafeArray[XTypeDescription],
    TypeClass: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass,
    TypeParameters: stdLib.SafeArray[java.lang.String],
    acquire: () => scala.Unit,
    getBaseType: () => XTypeDescription,
    getMemberNames: () => stdLib.SafeArray[java.lang.String],
    getMemberTypes: () => stdLib.SafeArray[XTypeDescription],
    getName: () => java.lang.String,
    getTypeArguments: () => stdLib.SafeArray[XTypeDescription],
    getTypeClass: () => activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass,
    getTypeParameters: () => stdLib.SafeArray[java.lang.String],
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XStructTypeDescription = {
    val __obj = js.Dynamic.literal(BaseType = BaseType, MemberNames = MemberNames, MemberTypes = MemberTypes, Name = Name, TypeArguments = TypeArguments, TypeClass = TypeClass, TypeParameters = TypeParameters, acquire = js.Any.fromFunction0(acquire), getBaseType = js.Any.fromFunction0(getBaseType), getMemberNames = js.Any.fromFunction0(getMemberNames), getMemberTypes = js.Any.fromFunction0(getMemberTypes), getName = js.Any.fromFunction0(getName), getTypeArguments = js.Any.fromFunction0(getTypeArguments), getTypeClass = js.Any.fromFunction0(getTypeClass), getTypeParameters = js.Any.fromFunction0(getTypeParameters), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XStructTypeDescription]
  }
}

