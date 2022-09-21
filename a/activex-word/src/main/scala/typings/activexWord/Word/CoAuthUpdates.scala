package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoAuthUpdates extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  val Count: Double
  
  val Creator: Double
  
  def Item(Index: Double): CoAuthUpdate
  
  val Parent: Any
  
  /* private */ @JSName("Word.CoAuthUpdates_typekey")
  var WordDotCoAuthUpdates_typekey: CoAuthUpdates
}
object CoAuthUpdates {
  
  inline def apply(
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: Double => CoAuthUpdate,
    Parent: Any,
    WordDotCoAuthUpdates_typekey: CoAuthUpdates
  ): CoAuthUpdates = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.CoAuthUpdates_typekey")(WordDotCoAuthUpdates_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoAuthUpdates]
  }
  
  extension [Self <: CoAuthUpdates](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => CoAuthUpdate): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setWordDotCoAuthUpdates_typekey(value: CoAuthUpdates): Self = StObject.set(x, "Word.CoAuthUpdates_typekey", value.asInstanceOf[js.Any])
  }
}
