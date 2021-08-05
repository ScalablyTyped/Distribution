package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Node instance data.
  *
  * We have a separate type per NodeType to save memory
  * (TextData | ElementData | ProviderData | PureExpressionData | QueryList<any>)
  *
  * To keep our code monomorphic,
  * we prohibit using `NodeData` directly but enforce the use of accessors (`asElementData`, ...).
  * This way, no usage site can get a `NodeData` from view.nodes and then use it for different
  * purposes.
  */
trait NodeData extends StObject {
  
  /* private */ var __brand: js.Any
}
object NodeData {
  
  inline def apply(__brand: js.Any): NodeData = {
    val __obj = js.Dynamic.literal(__brand = __brand.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeData]
  }
  
  extension [Self <: NodeData](x: Self) {
    
    inline def set__brand(value: js.Any): Self = StObject.set(x, "__brand", value.asInstanceOf[js.Any])
  }
}
