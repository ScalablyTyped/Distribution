package typings.agGrid.xmlFactoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XmlElement extends js.Object {
  
  var children: js.UndefOr[js.Array[XmlElement]] = js.native
  
  var name: String = js.native
  
  var properties: js.UndefOr[XmlAttributes] = js.native
  
  var textNode: js.UndefOr[String] = js.native
}
object XmlElement {
  
  @scala.inline
  def apply(name: String): XmlElement = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[XmlElement]
  }
  
  @scala.inline
  implicit class XmlElementOps[Self <: XmlElement] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenVarargs(value: XmlElement*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: js.Array[XmlElement]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setProperties(value: XmlAttributes): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    
    @scala.inline
    def setTextNode(value: String): Self = this.set("textNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextNode: Self = this.set("textNode", js.undefined)
  }
}
