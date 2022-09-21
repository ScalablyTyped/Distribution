package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileConverters extends StObject {
  
  val Count: Double
  
  def Item(Index: Any): FileConverter
  
  /* private */ @JSName("PowerPoint.FileConverters_typekey")
  var PowerPointDotFileConverters_typekey: FileConverters
}
object FileConverters {
  
  inline def apply(Count: Double, Item: Any => FileConverter, PowerPointDotFileConverters_typekey: FileConverters): FileConverters = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
    __obj.updateDynamic("PowerPoint.FileConverters_typekey")(PowerPointDotFileConverters_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileConverters]
  }
  
  extension [Self <: FileConverters](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Any => FileConverter): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setPowerPointDotFileConverters_typekey(value: FileConverters): Self = StObject.set(x, "PowerPoint.FileConverters_typekey", value.asInstanceOf[js.Any])
  }
}
