package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Panes extends StObject {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application
  
  val Count: Double
  
  def Item(Index: Double): Pane
  
  val Parent: Any
  
  /* private */ @JSName("PowerPoint.Panes_typekey")
  var PowerPointDotPanes_typekey: Panes
}
object Panes {
  
  inline def apply(
    Application: Application,
    Count: Double,
    Item: Double => Pane,
    Parent: Any,
    PowerPointDotPanes_typekey: Panes
  ): Panes = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.Panes_typekey")(PowerPointDotPanes_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Panes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Panes] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => Pane): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPowerPointDotPanes_typekey(value: Panes): Self = StObject.set(x, "PowerPoint.Panes_typekey", value.asInstanceOf[js.Any])
  }
}
