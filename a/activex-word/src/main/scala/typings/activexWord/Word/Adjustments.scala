package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Adjustments extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  val Count: Double
  
  val Creator: Double
  
  def Item(Index: Double): Double
  
  val Parent: js.Any
  
  /* private */ @JSName("Word.Adjustments_typekey")
  var WordDotAdjustments_typekey: Adjustments
}
object Adjustments {
  
  inline def apply(
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: Double => Double,
    Parent: js.Any,
    WordDotAdjustments_typekey: Adjustments
  ): Adjustments = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Adjustments_typekey")(WordDotAdjustments_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Adjustments]
  }
  
  extension [Self <: Adjustments](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => Double): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setWordDotAdjustments_typekey(value: Adjustments): Self = StObject.set(x, "Word.Adjustments_typekey", value.asInstanceOf[js.Any])
  }
}
