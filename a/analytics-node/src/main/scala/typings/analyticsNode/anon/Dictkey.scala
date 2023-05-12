package typings.analyticsNode.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dictkey
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var library: Name
}
object Dictkey {
  
  inline def apply(library: Name): Dictkey = {
    val __obj = js.Dynamic.literal(library = library.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictkey]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Dictkey] (val x: Self) extends AnyVal {
    
    inline def setLibrary(value: Name): Self = StObject.set(x, "library", value.asInstanceOf[js.Any])
  }
}
