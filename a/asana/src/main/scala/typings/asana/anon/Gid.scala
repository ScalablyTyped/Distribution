package typings.asana.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Gid extends StObject {
  
  var gid: String
  
  var name: String
}
object Gid {
  
  inline def apply(gid: String, name: String): Gid = {
    val __obj = js.Dynamic.literal(gid = gid.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gid]
  }
  
  extension [Self <: Gid](x: Self) {
    
    inline def setGid(value: String): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
