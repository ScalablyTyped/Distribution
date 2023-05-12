package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Subpaths extends StObject {
  
  var path: String
  
  var subpaths: js.Array[String]
}
object Subpaths {
  
  inline def apply(path: String, subpaths: js.Array[String]): Subpaths = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], subpaths = subpaths.asInstanceOf[js.Any])
    __obj.asInstanceOf[Subpaths]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Subpaths] (val x: Self) extends AnyVal {
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setSubpaths(value: js.Array[String]): Self = StObject.set(x, "subpaths", value.asInstanceOf[js.Any])
    
    inline def setSubpathsVarargs(value: String*): Self = StObject.set(x, "subpaths", js.Array(value*))
  }
}
