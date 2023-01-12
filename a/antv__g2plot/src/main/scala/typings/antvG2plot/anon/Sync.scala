package typings.antvG2plot.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sync extends StObject {
  
  var sync: String
}
object Sync {
  
  inline def apply(sync: String): Sync = {
    val __obj = js.Dynamic.literal(sync = sync.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sync]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Sync] (val x: Self) extends AnyVal {
    
    inline def setSync(value: String): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
  }
}
