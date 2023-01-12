package typings.activexOffice.Office

import typings.activexOutlook.Outlook.MailItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MsoEnvelope extends StObject {
  
  def CommandBars(Index: String): CommandBar
  def CommandBars(Index: Double): CommandBar
  @JSName("CommandBars")
  val CommandBars_Original: CommandBars
  
  var Introduction: String
  
  val Item: MailItem
  
  /* private */ @JSName("Office.MsoEnvelope_typekey")
  var OfficeDotMsoEnvelope_typekey: MsoEnvelope
  
  val Parent: Any
}
object MsoEnvelope {
  
  inline def apply(
    CommandBars: CommandBars,
    Introduction: String,
    Item: MailItem,
    OfficeDotMsoEnvelope_typekey: MsoEnvelope,
    Parent: Any
  ): MsoEnvelope = {
    val __obj = js.Dynamic.literal(CommandBars = CommandBars.asInstanceOf[js.Any], Introduction = Introduction.asInstanceOf[js.Any], Item = Item.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.MsoEnvelope_typekey")(OfficeDotMsoEnvelope_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[MsoEnvelope]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MsoEnvelope] (val x: Self) extends AnyVal {
    
    inline def setCommandBars(value: CommandBars): Self = StObject.set(x, "CommandBars", value.asInstanceOf[js.Any])
    
    inline def setIntroduction(value: String): Self = StObject.set(x, "Introduction", value.asInstanceOf[js.Any])
    
    inline def setItem(value: MailItem): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
    
    inline def setOfficeDotMsoEnvelope_typekey(value: MsoEnvelope): Self = StObject.set(x, "Office.MsoEnvelope_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
  }
}
