package typings.activexAccess.Access

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebService extends StObject {
  
  @JSName("Access.WebService_typekey")
  var AccessDotWebService_typekey: WebService
  
  def Entities(Index: js.Any): Entity
  @JSName("Entities")
  val Entities_Original: Entities
  
  def IsMemberSafe(dispid: Double): Boolean
  
  val Name: String
  
  val Parent: js.Any
}
object WebService {
  
  @scala.inline
  def apply(
    AccessDotWebService_typekey: WebService,
    Entities: Entities,
    IsMemberSafe: Double => Boolean,
    Name: String,
    Parent: js.Any
  ): WebService = {
    val __obj = js.Dynamic.literal(Entities = Entities.asInstanceOf[js.Any], IsMemberSafe = js.Any.fromFunction1(IsMemberSafe), Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Access.WebService_typekey")(AccessDotWebService_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebService]
  }
  
  @scala.inline
  implicit class WebServiceMutableBuilder[Self <: WebService] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessDotWebService_typekey(value: WebService): Self = StObject.set(x, "Access.WebService_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntities(value: Entities): Self = StObject.set(x, "Entities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMemberSafe(value: Double => Boolean): Self = StObject.set(x, "IsMemberSafe", js.Any.fromFunction1(value))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
  }
}
