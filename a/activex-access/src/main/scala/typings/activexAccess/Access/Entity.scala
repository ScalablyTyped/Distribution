package typings.activexAccess.Access

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Entity extends StObject {
  
  /* private */ @JSName("Access.Entity_typekey")
  var AccessDotEntity_typekey: Entity
  
  def IsMemberSafe(dispid: Double): Boolean
  
  val Name: String
  
  def Operations(Index: String): Operation
  def Operations(Index: Double): Operation
  @JSName("Operations")
  val Operations_Original: Operations
  
  val Parent: Any
}
object Entity {
  
  inline def apply(
    AccessDotEntity_typekey: Entity,
    IsMemberSafe: Double => Boolean,
    Name: String,
    Operations: Operations,
    Parent: Any
  ): Entity = {
    val __obj = js.Dynamic.literal(IsMemberSafe = js.Any.fromFunction1(IsMemberSafe), Name = Name.asInstanceOf[js.Any], Operations = Operations.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Access.Entity_typekey")(AccessDotEntity_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Entity] (val x: Self) extends AnyVal {
    
    inline def setAccessDotEntity_typekey(value: Entity): Self = StObject.set(x, "Access.Entity_typekey", value.asInstanceOf[js.Any])
    
    inline def setIsMemberSafe(value: Double => Boolean): Self = StObject.set(x, "IsMemberSafe", js.Any.fromFunction1(value))
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOperations(value: Operations): Self = StObject.set(x, "Operations", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
  }
}
