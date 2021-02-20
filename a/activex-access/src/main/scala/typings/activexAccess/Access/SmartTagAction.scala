package typings.activexAccess.Access

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmartTagAction extends StObject {
  
  @JSName("Access.SmartTagAction_typekey")
  var AccessDotSmartTagAction_typekey: SmartTagAction = js.native
  
  val Application: typings.activexAccess.Access.Application = js.native
  
  def Execute(): Unit = js.native
  
  def IsMemberSafe(dispid: Double): Boolean = js.native
  
  val Name: String = js.native
  
  val Parent: js.Any = js.native
}
object SmartTagAction {
  
  @scala.inline
  def apply(
    AccessDotSmartTagAction_typekey: SmartTagAction,
    Application: Application,
    Execute: () => Unit,
    IsMemberSafe: Double => Boolean,
    Name: String,
    Parent: js.Any
  ): SmartTagAction = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Execute = js.Any.fromFunction0(Execute), IsMemberSafe = js.Any.fromFunction1(IsMemberSafe), Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Access.SmartTagAction_typekey")(AccessDotSmartTagAction_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartTagAction]
  }
  
  @scala.inline
  implicit class SmartTagActionMutableBuilder[Self <: SmartTagAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessDotSmartTagAction_typekey(value: SmartTagAction): Self = StObject.set(x, "Access.SmartTagAction_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecute(value: () => Unit): Self = StObject.set(x, "Execute", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsMemberSafe(value: Double => Boolean): Self = StObject.set(x, "IsMemberSafe", js.Any.fromFunction1(value))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
  }
}
