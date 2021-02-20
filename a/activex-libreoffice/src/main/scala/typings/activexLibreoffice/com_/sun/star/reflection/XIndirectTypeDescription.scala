package typings.activexLibreoffice.com_.sun.star.reflection

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.TypeClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Reflects a typedef or sequence type. The type class of this description is TypeClass_TYPEDEF or TypeClass_SEQUENCE. */
@js.native
trait XIndirectTypeDescription extends XTypeDescription {
  
  /**
    * Returns the typedefed type, if the type is a typedef, or the element type, if the type is a sequence.
    * @returns referenced type
    */
  val ReferencedType: XTypeDescription = js.native
  
  /**
    * Returns the typedefed type, if the type is a typedef, or the element type, if the type is a sequence.
    * @returns referenced type
    */
  def getReferencedType(): XTypeDescription = js.native
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
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], ReferencedType = ReferencedType.asInstanceOf[js.Any], TypeClass = TypeClass.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getName = js.Any.fromFunction0(getName), getReferencedType = js.Any.fromFunction0(getReferencedType), getTypeClass = js.Any.fromFunction0(getTypeClass), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XIndirectTypeDescription]
  }
  
  @scala.inline
  implicit class XIndirectTypeDescriptionMutableBuilder[Self <: XIndirectTypeDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetReferencedType(value: () => XTypeDescription): Self = StObject.set(x, "getReferencedType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReferencedType(value: XTypeDescription): Self = StObject.set(x, "ReferencedType", value.asInstanceOf[js.Any])
  }
}
