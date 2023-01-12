package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutlookBarStorage extends StObject {
  
  val Application: typings.activexOutlook.Outlook.Application
  
  val Class: OlObjectClass
  
  val Groups: OutlookBarGroups
  
  /* private */ @JSName("Outlook.OutlookBarStorage_typekey")
  var OutlookDotOutlookBarStorage_typekey: OutlookBarStorage
  
  val Parent: Any
  
  val Session: NameSpace
}
object OutlookBarStorage {
  
  inline def apply(
    Application: Application,
    Class: OlObjectClass,
    Groups: OutlookBarGroups,
    OutlookDotOutlookBarStorage_typekey: OutlookBarStorage,
    Parent: Any,
    Session: NameSpace
  ): OutlookBarStorage = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Groups = Groups.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.OutlookBarStorage_typekey")(OutlookDotOutlookBarStorage_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutlookBarStorage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OutlookBarStorage] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    inline def setGroups(value: OutlookBarGroups): Self = StObject.set(x, "Groups", value.asInstanceOf[js.Any])
    
    inline def setOutlookDotOutlookBarStorage_typekey(value: OutlookBarStorage): Self = StObject.set(x, "Outlook.OutlookBarStorage_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
  }
}
