package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadabilityStatistics extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  val Count: Double
  
  val Creator: Double
  
  def Item(Index: Any): ReadabilityStatistic
  
  val Parent: Any
  
  /* private */ @JSName("Word.ReadabilityStatistics_typekey")
  var WordDotReadabilityStatistics_typekey: ReadabilityStatistics
}
object ReadabilityStatistics {
  
  inline def apply(
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: Any => ReadabilityStatistic,
    Parent: Any,
    WordDotReadabilityStatistics_typekey: ReadabilityStatistics
  ): ReadabilityStatistics = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.ReadabilityStatistics_typekey")(WordDotReadabilityStatistics_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadabilityStatistics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadabilityStatistics] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Any => ReadabilityStatistic): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setWordDotReadabilityStatistics_typekey(value: ReadabilityStatistics): Self = StObject.set(x, "Word.ReadabilityStatistics_typekey", value.asInstanceOf[js.Any])
  }
}
