package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoRGBType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtraColors extends StObject {
  
  def Add(Type: MsoRGBType): Unit
  
  val Application: typings.activexPowerpoint.PowerPoint.Application
  
  def Clear(): Unit
  
  val Count: Double
  
  def Item(Index: Double): MsoRGBType
  
  val Parent: js.Any
  
  /* private */ @JSName("PowerPoint.ExtraColors_typekey")
  var PowerPointDotExtraColors_typekey: ExtraColors
}
object ExtraColors {
  
  inline def apply(
    Add: MsoRGBType => Unit,
    Application: Application,
    Clear: () => Unit,
    Count: Double,
    Item: Double => MsoRGBType,
    Parent: js.Any,
    PowerPointDotExtraColors_typekey: ExtraColors
  ): ExtraColors = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction1(Add), Application = Application.asInstanceOf[js.Any], Clear = js.Any.fromFunction0(Clear), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.ExtraColors_typekey")(PowerPointDotExtraColors_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtraColors]
  }
  
  extension [Self <: ExtraColors](x: Self) {
    
    inline def setAdd(value: MsoRGBType => Unit): Self = StObject.set(x, "Add", js.Any.fromFunction1(value))
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setClear(value: () => Unit): Self = StObject.set(x, "Clear", js.Any.fromFunction0(value))
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => MsoRGBType): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPowerPointDotExtraColors_typekey(value: ExtraColors): Self = StObject.set(x, "PowerPoint.ExtraColors_typekey", value.asInstanceOf[js.Any])
  }
}
