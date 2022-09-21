package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinkFormat extends StObject {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application
  
  var AutoUpdate: PpUpdateOption
  
  def BreakLink(): Unit
  
  val Parent: Any
  
  /* private */ @JSName("PowerPoint.LinkFormat_typekey")
  var PowerPointDotLinkFormat_typekey: LinkFormat
  
  var SourceFullName: String
  
  def Update(): Unit
}
object LinkFormat {
  
  inline def apply(
    Application: Application,
    AutoUpdate: PpUpdateOption,
    BreakLink: () => Unit,
    Parent: Any,
    PowerPointDotLinkFormat_typekey: LinkFormat,
    SourceFullName: String,
    Update: () => Unit
  ): LinkFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], AutoUpdate = AutoUpdate.asInstanceOf[js.Any], BreakLink = js.Any.fromFunction0(BreakLink), Parent = Parent.asInstanceOf[js.Any], SourceFullName = SourceFullName.asInstanceOf[js.Any], Update = js.Any.fromFunction0(Update))
    __obj.updateDynamic("PowerPoint.LinkFormat_typekey")(PowerPointDotLinkFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkFormat]
  }
  
  extension [Self <: LinkFormat](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setAutoUpdate(value: PpUpdateOption): Self = StObject.set(x, "AutoUpdate", value.asInstanceOf[js.Any])
    
    inline def setBreakLink(value: () => Unit): Self = StObject.set(x, "BreakLink", js.Any.fromFunction0(value))
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPowerPointDotLinkFormat_typekey(value: LinkFormat): Self = StObject.set(x, "PowerPoint.LinkFormat_typekey", value.asInstanceOf[js.Any])
    
    inline def setSourceFullName(value: String): Self = StObject.set(x, "SourceFullName", value.asInstanceOf[js.Any])
    
    inline def setUpdate(value: () => Unit): Self = StObject.set(x, "Update", js.Any.fromFunction0(value))
  }
}
