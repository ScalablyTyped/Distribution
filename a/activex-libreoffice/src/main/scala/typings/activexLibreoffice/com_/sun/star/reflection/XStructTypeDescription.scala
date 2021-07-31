package typings.activexLibreoffice.com_.sun.star.reflection

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.TypeClass
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait XStructTypeDescription
  extends StObject
     with XCompoundTypeDescription {
  
  /**
    * Returns the type arguments of an instantiated polymorphic struct type.
    * @returns a sequence of all type arguments, in the correct order; for a plain struct type, or a polymorphic struct type template, an empty sequence is returned
    */
  val TypeArguments: SafeArray[XTypeDescription]
  
  /**
    * Returns the type parameters of a polymorphic struct type template.
    * @returns a sequence of the names of all type parameters, in the correct order; for a plain struct type, or an instantiated polymorphic struct type, an emp
    */
  val TypeParameters: SafeArray[String]
  
  /**
    * Returns the type arguments of an instantiated polymorphic struct type.
    * @returns a sequence of all type arguments, in the correct order; for a plain struct type, or a polymorphic struct type template, an empty sequence is returned
    */
  def getTypeArguments(): SafeArray[XTypeDescription]
  
  /**
    * Returns the type parameters of a polymorphic struct type template.
    * @returns a sequence of the names of all type parameters, in the correct order; for a plain struct type, or an instantiated polymorphic struct type, an emp
    */
  def getTypeParameters(): SafeArray[String]
}
object XStructTypeDescription {
  
  @scala.inline
  def apply(
    BaseType: XTypeDescription,
    MemberNames: SafeArray[String],
    MemberTypes: SafeArray[XTypeDescription],
    Name: String,
    TypeArguments: SafeArray[XTypeDescription],
    TypeClass: TypeClass,
    TypeParameters: SafeArray[String],
    acquire: () => Unit,
    getBaseType: () => XTypeDescription,
    getMemberNames: () => SafeArray[String],
    getMemberTypes: () => SafeArray[XTypeDescription],
    getName: () => String,
    getTypeArguments: () => SafeArray[XTypeDescription],
    getTypeClass: () => TypeClass,
    getTypeParameters: () => SafeArray[String],
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XStructTypeDescription = {
    val __obj = js.Dynamic.literal(BaseType = BaseType.asInstanceOf[js.Any], MemberNames = MemberNames.asInstanceOf[js.Any], MemberTypes = MemberTypes.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], TypeArguments = TypeArguments.asInstanceOf[js.Any], TypeClass = TypeClass.asInstanceOf[js.Any], TypeParameters = TypeParameters.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getBaseType = js.Any.fromFunction0(getBaseType), getMemberNames = js.Any.fromFunction0(getMemberNames), getMemberTypes = js.Any.fromFunction0(getMemberTypes), getName = js.Any.fromFunction0(getName), getTypeArguments = js.Any.fromFunction0(getTypeArguments), getTypeClass = js.Any.fromFunction0(getTypeClass), getTypeParameters = js.Any.fromFunction0(getTypeParameters), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XStructTypeDescription]
  }
  
  @scala.inline
  implicit class XStructTypeDescriptionMutableBuilder[Self <: XStructTypeDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetTypeArguments(value: () => SafeArray[XTypeDescription]): Self = StObject.set(x, "getTypeArguments", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTypeParameters(value: () => SafeArray[String]): Self = StObject.set(x, "getTypeParameters", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTypeArguments(value: SafeArray[XTypeDescription]): Self = StObject.set(x, "TypeArguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParameters(value: SafeArray[String]): Self = StObject.set(x, "TypeParameters", value.asInstanceOf[js.Any])
  }
}
