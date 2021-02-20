package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileConverters extends StObject {
  
  val Count: Double = js.native
  
  def Item(Index: js.Any): FileConverter = js.native
  
  @JSName("PowerPoint.FileConverters_typekey")
  var PowerPointDotFileConverters_typekey: FileConverters = js.native
}
object FileConverters {
  
  @scala.inline
  def apply(Count: Double, Item: js.Any => FileConverter, PowerPointDotFileConverters_typekey: FileConverters): FileConverters = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
    __obj.updateDynamic("PowerPoint.FileConverters_typekey")(PowerPointDotFileConverters_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileConverters]
  }
  
  @scala.inline
  implicit class FileConvertersMutableBuilder[Self <: FileConverters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: js.Any => FileConverter): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPowerPointDotFileConverters_typekey(value: FileConverters): Self = StObject.set(x, "PowerPoint.FileConverters_typekey", value.asInstanceOf[js.Any])
  }
}
