package typings.activexLibreoffice.com_.sun.star.reflection

import typings.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Deprecated. Use {@link com.sun.star.reflection.XIdlField2} instead.
  * @deprecated Deprecated
  */
trait XIdlField
  extends StObject
     with XIdlMember {
  
  val AccessMode: FieldAccessMode
  
  val Type: XIdlClass[Any]
  
  def get(obj: Any): Any
  
  def getAccessMode(): FieldAccessMode
  
  def getType(): XIdlClass[Any]
  
  def set(obj: Any, value: Any): Unit
}
object XIdlField {
  
  inline def apply(
    AccessMode: FieldAccessMode,
    DeclaringClass: XIdlClass[Any],
    Name: String,
    Type: XIdlClass[Any],
    acquire: () => Unit,
    get: Any => Any,
    getAccessMode: () => FieldAccessMode,
    getDeclaringClass: () => XIdlClass[Any],
    getName: () => String,
    getType: () => XIdlClass[Any],
    queryInterface: `type` => Any,
    release: () => Unit,
    set: (Any, Any) => Unit
  ): XIdlField = {
    val __obj = js.Dynamic.literal(AccessMode = AccessMode.asInstanceOf[js.Any], DeclaringClass = DeclaringClass.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), get = js.Any.fromFunction1(get), getAccessMode = js.Any.fromFunction0(getAccessMode), getDeclaringClass = js.Any.fromFunction0(getDeclaringClass), getName = js.Any.fromFunction0(getName), getType = js.Any.fromFunction0(getType), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[XIdlField]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XIdlField] (val x: Self) extends AnyVal {
    
    inline def setAccessMode(value: FieldAccessMode): Self = StObject.set(x, "AccessMode", value.asInstanceOf[js.Any])
    
    inline def setGet(value: Any => Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setGetAccessMode(value: () => FieldAccessMode): Self = StObject.set(x, "getAccessMode", js.Any.fromFunction0(value))
    
    inline def setGetType(value: () => XIdlClass[Any]): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
    
    inline def setSet(value: (Any, Any) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    
    inline def setType(value: XIdlClass[Any]): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
