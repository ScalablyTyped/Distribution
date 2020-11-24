package typings.activexOutlook.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EntryIDCollection extends js.Object {
  
  val EntryIDCollection: String = js.native
}
object EntryIDCollection {
  
  @scala.inline
  def apply(EntryIDCollection: String): EntryIDCollection = {
    val __obj = js.Dynamic.literal(EntryIDCollection = EntryIDCollection.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntryIDCollection]
  }
  
  @scala.inline
  implicit class EntryIDCollectionOps[Self <: EntryIDCollection] (val x: Self) extends AnyVal {
    
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
    def setEntryIDCollection(value: String): Self = this.set("EntryIDCollection", value.asInstanceOf[js.Any])
  }
}
