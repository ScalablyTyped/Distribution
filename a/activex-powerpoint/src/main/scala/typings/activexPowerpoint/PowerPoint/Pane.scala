package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pane extends StObject {
  
  def Activate(): Unit
  
  val Active: MsoTriState
  
  val Application: typings.activexPowerpoint.PowerPoint.Application
  
  val Parent: Any
  
  /* private */ @JSName("PowerPoint.Pane_typekey")
  var PowerPointDotPane_typekey: Pane
  
  val ViewType: PpViewType
}
object Pane {
  
  inline def apply(
    Activate: () => Unit,
    Active: MsoTriState,
    Application: Application,
    Parent: Any,
    PowerPointDotPane_typekey: Pane,
    ViewType: PpViewType
  ): Pane = {
    val __obj = js.Dynamic.literal(Activate = js.Any.fromFunction0(Activate), Active = Active.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], ViewType = ViewType.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.Pane_typekey")(PowerPointDotPane_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pane]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Pane] (val x: Self) extends AnyVal {
    
    inline def setActivate(value: () => Unit): Self = StObject.set(x, "Activate", js.Any.fromFunction0(value))
    
    inline def setActive(value: MsoTriState): Self = StObject.set(x, "Active", value.asInstanceOf[js.Any])
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPowerPointDotPane_typekey(value: Pane): Self = StObject.set(x, "PowerPoint.Pane_typekey", value.asInstanceOf[js.Any])
    
    inline def setViewType(value: PpViewType): Self = StObject.set(x, "ViewType", value.asInstanceOf[js.Any])
  }
}
