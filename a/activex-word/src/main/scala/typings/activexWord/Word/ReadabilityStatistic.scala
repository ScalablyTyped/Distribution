package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadabilityStatistic extends StObject {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Creator: Double = js.native
  
  val Name: String = js.native
  
  val Parent: js.Any = js.native
  
  val Value: Double = js.native
  
  @JSName("Word.ReadabilityStatistic_typekey")
  var WordDotReadabilityStatistic_typekey: ReadabilityStatistic = js.native
}
object ReadabilityStatistic {
  
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Name: String,
    Parent: js.Any,
    Value: Double,
    WordDotReadabilityStatistic_typekey: ReadabilityStatistic
  ): ReadabilityStatistic = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.ReadabilityStatistic_typekey")(WordDotReadabilityStatistic_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadabilityStatistic]
  }
  
  @scala.inline
  implicit class ReadabilityStatisticMutableBuilder[Self <: ReadabilityStatistic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotReadabilityStatistic_typekey(value: ReadabilityStatistic): Self = StObject.set(x, "Word.ReadabilityStatistic_typekey", value.asInstanceOf[js.Any])
  }
}
