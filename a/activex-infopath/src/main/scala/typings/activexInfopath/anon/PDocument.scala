package typings.activexInfopath.anon

import typings.activexInfopath.InfoPath._XDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PDocument extends js.Object {
  
  val pDocument: _XDocument = js.native
}
object PDocument {
  
  @scala.inline
  def apply(pDocument: _XDocument): PDocument = {
    val __obj = js.Dynamic.literal(pDocument = pDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[PDocument]
  }
  
  @scala.inline
  implicit class PDocumentOps[Self <: PDocument] (val x: Self) extends AnyVal {
    
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
    def setPDocument(value: _XDocument): Self = this.set("pDocument", value.asInstanceOf[js.Any])
  }
}
