package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinkFormat extends StObject {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  var AutoUpdate: PpUpdateOption = js.native
  
  def BreakLink(): Unit = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("PowerPoint.LinkFormat_typekey")
  var PowerPointDotLinkFormat_typekey: LinkFormat = js.native
  
  var SourceFullName: String = js.native
  
  def Update(): Unit = js.native
}
object LinkFormat {
  
  @scala.inline
  def apply(
    Application: Application,
    AutoUpdate: PpUpdateOption,
    BreakLink: () => Unit,
    Parent: js.Any,
    PowerPointDotLinkFormat_typekey: LinkFormat,
    SourceFullName: String,
    Update: () => Unit
  ): LinkFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], AutoUpdate = AutoUpdate.asInstanceOf[js.Any], BreakLink = js.Any.fromFunction0(BreakLink), Parent = Parent.asInstanceOf[js.Any], SourceFullName = SourceFullName.asInstanceOf[js.Any], Update = js.Any.fromFunction0(Update))
    __obj.updateDynamic("PowerPoint.LinkFormat_typekey")(PowerPointDotLinkFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkFormat]
  }
  
  @scala.inline
  implicit class LinkFormatMutableBuilder[Self <: LinkFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoUpdate(value: PpUpdateOption): Self = StObject.set(x, "AutoUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBreakLink(value: () => Unit): Self = StObject.set(x, "BreakLink", js.Any.fromFunction0(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotLinkFormat_typekey(value: LinkFormat): Self = StObject.set(x, "PowerPoint.LinkFormat_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceFullName(value: String): Self = StObject.set(x, "SourceFullName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdate(value: () => Unit): Self = StObject.set(x, "Update", js.Any.fromFunction0(value))
  }
}
