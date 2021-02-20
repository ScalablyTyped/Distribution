package typings.activexLibreoffice.com_.sun.star.reflection

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Base interface for XIdlField2s and XIdlMethods. */
@js.native
trait XIdlMember extends XInterface {
  
  /**
    * Returns the declaring type of this field, i.e. the type having the member declared (interface, enum, struct, exception).
    * @returns declaring type
    */
  val DeclaringClass: XIdlClass[_] = js.native
  
  /**
    * Returns the fully-qualified name of the member.
    * @returns fully-qualified name of the member
    */
  val Name: String = js.native
  
  /**
    * Returns the declaring type of this field, i.e. the type having the member declared (interface, enum, struct, exception).
    * @returns declaring type
    */
  def getDeclaringClass(): XIdlClass[_] = js.native
  
  /**
    * Returns the fully-qualified name of the member.
    * @returns fully-qualified name of the member
    */
  def getName(): String = js.native
}
object XIdlMember {
  
  @scala.inline
  def apply(
    DeclaringClass: XIdlClass[_],
    Name: String,
    acquire: () => Unit,
    getDeclaringClass: () => XIdlClass[_],
    getName: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XIdlMember = {
    val __obj = js.Dynamic.literal(DeclaringClass = DeclaringClass.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getDeclaringClass = js.Any.fromFunction0(getDeclaringClass), getName = js.Any.fromFunction0(getName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XIdlMember]
  }
  
  @scala.inline
  implicit class XIdlMemberMutableBuilder[Self <: XIdlMember] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeclaringClass(value: XIdlClass[_]): Self = StObject.set(x, "DeclaringClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetDeclaringClass(value: () => XIdlClass[_]): Self = StObject.set(x, "getDeclaringClass", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
