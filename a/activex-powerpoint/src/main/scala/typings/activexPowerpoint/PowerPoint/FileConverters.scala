package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileConverters extends js.Object {
  
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
  implicit class FileConvertersOps[Self <: FileConverters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: js.Any => FileConverter): Self = this.set("Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPowerPointDotFileConverters_typekey(value: FileConverters): Self = this.set("PowerPoint.FileConverters_typekey", value.asInstanceOf[js.Any])
  }
}
