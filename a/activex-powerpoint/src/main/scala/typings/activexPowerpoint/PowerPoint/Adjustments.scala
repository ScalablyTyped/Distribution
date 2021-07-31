package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Adjustments extends StObject {
  
  val Application: js.Any
  
  val Count: Double
  
  val Creator: Double
  
  def Item(Index: Double): Double
  
  val Parent: js.Any
  
  @JSName("PowerPoint.Adjustments_typekey")
  var PowerPointDotAdjustments_typekey: Adjustments
}
object Adjustments {
  
  @scala.inline
  def apply(
    Application: js.Any,
    Count: Double,
    Creator: Double,
    Item: Double => Double,
    Parent: js.Any,
    PowerPointDotAdjustments_typekey: Adjustments
  ): Adjustments = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.Adjustments_typekey")(PowerPointDotAdjustments_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Adjustments]
  }
  
  @scala.inline
  implicit class AdjustmentsMutableBuilder[Self <: Adjustments] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: js.Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: Double => Double): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotAdjustments_typekey(value: Adjustments): Self = StObject.set(x, "PowerPoint.Adjustments_typekey", value.asInstanceOf[js.Any])
  }
}
