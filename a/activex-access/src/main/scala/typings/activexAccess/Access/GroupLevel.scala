package typings.activexAccess.Access

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupLevel extends StObject {
  
  /* private */ @JSName("Access.GroupLevel_typekey")
  var AccessDotGroupLevel_typekey: GroupLevel
  
  val Application: typings.activexAccess.Access.Application
  
  var ControlSource: String
  
  var GroupFooter: Boolean
  
  var GroupHeader: Boolean
  
  var GroupInterval: Double
  
  var GroupOn: Double
  
  def IsMemberSafe(dispid: Double): Boolean
  
  var KeepTogether: Double
  
  val Parent: js.Any
  
  def Properties(Index: String): AccessProperty
  def Properties(Index: Double): AccessProperty
  @JSName("Properties")
  val Properties_Original: Properties
  
  var SortOrder: Boolean
}
object GroupLevel {
  
  inline def apply(
    AccessDotGroupLevel_typekey: GroupLevel,
    Application: Application,
    ControlSource: String,
    GroupFooter: Boolean,
    GroupHeader: Boolean,
    GroupInterval: Double,
    GroupOn: Double,
    IsMemberSafe: Double => Boolean,
    KeepTogether: Double,
    Parent: js.Any,
    Properties: Properties,
    SortOrder: Boolean
  ): GroupLevel = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], ControlSource = ControlSource.asInstanceOf[js.Any], GroupFooter = GroupFooter.asInstanceOf[js.Any], GroupHeader = GroupHeader.asInstanceOf[js.Any], GroupInterval = GroupInterval.asInstanceOf[js.Any], GroupOn = GroupOn.asInstanceOf[js.Any], IsMemberSafe = js.Any.fromFunction1(IsMemberSafe), KeepTogether = KeepTogether.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Properties = Properties.asInstanceOf[js.Any], SortOrder = SortOrder.asInstanceOf[js.Any])
    __obj.updateDynamic("Access.GroupLevel_typekey")(AccessDotGroupLevel_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupLevel]
  }
  
  extension [Self <: GroupLevel](x: Self) {
    
    inline def setAccessDotGroupLevel_typekey(value: GroupLevel): Self = StObject.set(x, "Access.GroupLevel_typekey", value.asInstanceOf[js.Any])
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setControlSource(value: String): Self = StObject.set(x, "ControlSource", value.asInstanceOf[js.Any])
    
    inline def setGroupFooter(value: Boolean): Self = StObject.set(x, "GroupFooter", value.asInstanceOf[js.Any])
    
    inline def setGroupHeader(value: Boolean): Self = StObject.set(x, "GroupHeader", value.asInstanceOf[js.Any])
    
    inline def setGroupInterval(value: Double): Self = StObject.set(x, "GroupInterval", value.asInstanceOf[js.Any])
    
    inline def setGroupOn(value: Double): Self = StObject.set(x, "GroupOn", value.asInstanceOf[js.Any])
    
    inline def setIsMemberSafe(value: Double => Boolean): Self = StObject.set(x, "IsMemberSafe", js.Any.fromFunction1(value))
    
    inline def setKeepTogether(value: Double): Self = StObject.set(x, "KeepTogether", value.asInstanceOf[js.Any])
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: Properties): Self = StObject.set(x, "Properties", value.asInstanceOf[js.Any])
    
    inline def setSortOrder(value: Boolean): Self = StObject.set(x, "SortOrder", value.asInstanceOf[js.Any])
  }
}
