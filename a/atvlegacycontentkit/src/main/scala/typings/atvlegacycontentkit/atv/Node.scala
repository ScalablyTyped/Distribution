package typings.atvlegacycontentkit.atv

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The type shared between Documents and Elements, equivalent to Node in the normal DOM.
  */
trait Node extends StObject {
  
  /**
    * The document that owns this particular node.
    */
  val ownerDocument: Document
}
object Node {
  
  inline def apply(ownerDocument: Document): Node = {
    val __obj = js.Dynamic.literal(ownerDocument = ownerDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  extension [Self <: Node](x: Self) {
    
    inline def setOwnerDocument(value: Document): Self = StObject.set(x, "ownerDocument", value.asInstanceOf[js.Any])
  }
}
