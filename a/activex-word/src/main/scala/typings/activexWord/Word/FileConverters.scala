package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileConverters extends StObject {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  var ConvertMacWordChevrons: WdChevronConvertRule = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: js.Any): FileConverter = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("Word.FileConverters_typekey")
  var WordDotFileConverters_typekey: FileConverters = js.native
}
object FileConverters {
  
  @scala.inline
  def apply(
    Application: Application,
    ConvertMacWordChevrons: WdChevronConvertRule,
    Count: Double,
    Creator: Double,
    Item: js.Any => FileConverter,
    Parent: js.Any,
    WordDotFileConverters_typekey: FileConverters
  ): FileConverters = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], ConvertMacWordChevrons = ConvertMacWordChevrons.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.FileConverters_typekey")(WordDotFileConverters_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileConverters]
  }
  
  @scala.inline
  implicit class FileConvertersMutableBuilder[Self <: FileConverters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConvertMacWordChevrons(value: WdChevronConvertRule): Self = StObject.set(x, "ConvertMacWordChevrons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: js.Any => FileConverter): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotFileConverters_typekey(value: FileConverters): Self = StObject.set(x, "Word.FileConverters_typekey", value.asInstanceOf[js.Any])
  }
}
