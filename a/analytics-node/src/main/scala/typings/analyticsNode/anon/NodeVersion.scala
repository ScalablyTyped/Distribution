package typings.analyticsNode.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeVersion
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var nodeVersion: String
}
object NodeVersion {
  
  inline def apply(nodeVersion: String): NodeVersion = {
    val __obj = js.Dynamic.literal(nodeVersion = nodeVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeVersion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodeVersion] (val x: Self) extends AnyVal {
    
    inline def setNodeVersion(value: String): Self = StObject.set(x, "nodeVersion", value.asInstanceOf[js.Any])
  }
}
