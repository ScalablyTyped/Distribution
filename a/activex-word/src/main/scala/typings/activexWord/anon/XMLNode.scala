package typings.activexWord.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XMLNode extends StObject {
  
  val XMLNode: typings.activexWord.Word.XMLNode
}
object XMLNode {
  
  inline def apply(XMLNode: typings.activexWord.Word.XMLNode): XMLNode = {
    val __obj = js.Dynamic.literal(XMLNode = XMLNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[XMLNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XMLNode] (val x: Self) extends AnyVal {
    
    inline def setXMLNode(value: typings.activexWord.Word.XMLNode): Self = StObject.set(x, "XMLNode", value.asInstanceOf[js.Any])
  }
}
