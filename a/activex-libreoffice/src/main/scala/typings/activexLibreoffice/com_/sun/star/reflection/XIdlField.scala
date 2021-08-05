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
  
  val Type: XIdlClass[js.Any]
  
  def get(obj: js.Any): js.Any
  
  def getAccessMode(): FieldAccessMode
  
  def getType(): XIdlClass[js.Any]
  
  def set(obj: js.Any, value: js.Any): Unit
}
object XIdlField {
  
  inline def apply(
    AccessMode: FieldAccessMode,
    DeclaringClass: XIdlClass[js.Any],
    Name: String,
    Type: XIdlClass[js.Any],
    acquire: () => Unit,
    get: js.Any => js.Any,
    getAccessMode: () => FieldAccessMode,
    getDeclaringClass: () => XIdlClass[js.Any],
    getName: () => String,
    getType: () => XIdlClass[js.Any],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    set: (js.Any, js.Any) => Unit
  ): XIdlField = {
    val __obj = js.Dynamic.literal(AccessMode = AccessMode.asInstanceOf[js.Any], DeclaringClass = DeclaringClass.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), get = js.Any.fromFunction1(get), getAccessMode = js.Any.fromFunction0(getAccessMode), getDeclaringClass = js.Any.fromFunction0(getDeclaringClass), getName = js.Any.fromFunction0(getName), getType = js.Any.fromFunction0(getType), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[XIdlField]
  }
  
  extension [Self <: XIdlField](x: Self) {
    
    inline def setAccessMode(value: FieldAccessMode): Self = StObject.set(x, "AccessMode", value.asInstanceOf[js.Any])
    
    inline def setGet(value: js.Any => js.Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setGetAccessMode(value: () => FieldAccessMode): Self = StObject.set(x, "getAccessMode", js.Any.fromFunction0(value))
    
    inline def setGetType(value: () => XIdlClass[js.Any]): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
    
    inline def setSet(value: (js.Any, js.Any) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    
    inline def setType(value: XIdlClass[js.Any]): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
