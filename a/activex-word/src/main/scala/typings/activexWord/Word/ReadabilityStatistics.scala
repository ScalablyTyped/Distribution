package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadabilityStatistics extends StObject {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: js.Any): ReadabilityStatistic = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("Word.ReadabilityStatistics_typekey")
  var WordDotReadabilityStatistics_typekey: ReadabilityStatistics = js.native
}
object ReadabilityStatistics {
  
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: js.Any => ReadabilityStatistic,
    Parent: js.Any,
    WordDotReadabilityStatistics_typekey: ReadabilityStatistics
  ): ReadabilityStatistics = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.ReadabilityStatistics_typekey")(WordDotReadabilityStatistics_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadabilityStatistics]
  }
  
  @scala.inline
  implicit class ReadabilityStatisticsMutableBuilder[Self <: ReadabilityStatistics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: js.Any => ReadabilityStatistic): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotReadabilityStatistics_typekey(value: ReadabilityStatistics): Self = StObject.set(x, "Word.ReadabilityStatistics_typekey", value.asInstanceOf[js.Any])
  }
}
