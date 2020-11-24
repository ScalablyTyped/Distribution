package typings.activexWord.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XMLNode extends js.Object {
  
  val XMLNode: typings.activexWord.Word.XMLNode = js.native
}
object XMLNode {
  
  @scala.inline
  def apply(XMLNode: typings.activexWord.Word.XMLNode): XMLNode = {
    val __obj = js.Dynamic.literal(XMLNode = XMLNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[XMLNode]
  }
  
  @scala.inline
  implicit class XMLNodeOps[Self <: XMLNode] (val x: Self) extends AnyVal {
    
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
    def setXMLNode(value: typings.activexWord.Word.XMLNode): Self = this.set("XMLNode", value.asInstanceOf[js.Any])
  }
}
