package typings.activexLibreoffice.com_.sun.star.reflection

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.TypeClass
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Reflects an interface attribute, supporting extended attributes that are bound or raise exceptions.
  *
  * This type supersedes {@link XInterfaceAttributeTypeDescription} , which does not support extended attributes.
  * @since OOo 2.0
  */
@js.native
trait XInterfaceAttributeTypeDescription2 extends XInterfaceAttributeTypeDescription {
  
  /**
    * Returns the exceptions that can be raised by the attribute's getter.
    * @returns the reflections of all the exceptions that are listed in the `raises` specification of the attribute's getter (if any), in no particular order; a
    */
  val GetExceptions: SafeArray[XCompoundTypeDescription] = js.native
  
  /**
    * Returns the exceptions that can be raised by the attribute's setter.
    * @returns the reflections of all the exceptions that are listed in the `raises` specification of the attribute's setter (if any), in no particular order; a
    */
  val SetExceptions: SafeArray[XCompoundTypeDescription] = js.native
  
  /**
    * Returns the exceptions that can be raised by the attribute's getter.
    * @returns the reflections of all the exceptions that are listed in the `raises` specification of the attribute's getter (if any), in no particular order; a
    */
  def getGetExceptions(): SafeArray[XCompoundTypeDescription] = js.native
  
  /**
    * Returns the exceptions that can be raised by the attribute's setter.
    * @returns the reflections of all the exceptions that are listed in the `raises` specification of the attribute's setter (if any), in no particular order; a
    */
  def getSetExceptions(): SafeArray[XCompoundTypeDescription] = js.native
  
  /**
    * Returns whether this object reflects a bound attribute.
    * @returns `TRUE` iff this object reflects a bound attribute
    */
  def isBound(): Boolean = js.native
}
object XInterfaceAttributeTypeDescription2 {
  
  @scala.inline
  def apply(
    GetExceptions: SafeArray[XCompoundTypeDescription],
    MemberName: String,
    Name: String,
    Position: Double,
    SetExceptions: SafeArray[XCompoundTypeDescription],
    Type: XTypeDescription,
    TypeClass: TypeClass,
    acquire: () => Unit,
    getGetExceptions: () => SafeArray[XCompoundTypeDescription],
    getMemberName: () => String,
    getName: () => String,
    getPosition: () => Double,
    getSetExceptions: () => SafeArray[XCompoundTypeDescription],
    getType: () => XTypeDescription,
    getTypeClass: () => TypeClass,
    isBound: () => Boolean,
    isReadOnly: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XInterfaceAttributeTypeDescription2 = {
    val __obj = js.Dynamic.literal(GetExceptions = GetExceptions.asInstanceOf[js.Any], MemberName = MemberName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], SetExceptions = SetExceptions.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], TypeClass = TypeClass.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getGetExceptions = js.Any.fromFunction0(getGetExceptions), getMemberName = js.Any.fromFunction0(getMemberName), getName = js.Any.fromFunction0(getName), getPosition = js.Any.fromFunction0(getPosition), getSetExceptions = js.Any.fromFunction0(getSetExceptions), getType = js.Any.fromFunction0(getType), getTypeClass = js.Any.fromFunction0(getTypeClass), isBound = js.Any.fromFunction0(isBound), isReadOnly = js.Any.fromFunction0(isReadOnly), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XInterfaceAttributeTypeDescription2]
  }
  
  @scala.inline
  implicit class XInterfaceAttributeTypeDescription2Ops[Self <: XInterfaceAttributeTypeDescription2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetExceptions(value: SafeArray[XCompoundTypeDescription]): Self = this.set("GetExceptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetExceptions(value: SafeArray[XCompoundTypeDescription]): Self = this.set("SetExceptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetGetExceptions(value: () => SafeArray[XCompoundTypeDescription]): Self = this.set("getGetExceptions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSetExceptions(value: () => SafeArray[XCompoundTypeDescription]): Self = this.set("getSetExceptions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsBound(value: () => Boolean): Self = this.set("isBound", js.Any.fromFunction0(value))
  }
}
