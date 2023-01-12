package typings.activexShdocvw.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TheaterMode extends StObject {
  
  val TheaterMode: Boolean
}
object TheaterMode {
  
  inline def apply(TheaterMode: Boolean): TheaterMode = {
    val __obj = js.Dynamic.literal(TheaterMode = TheaterMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[TheaterMode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TheaterMode] (val x: Self) extends AnyVal {
    
    inline def setTheaterMode(value: Boolean): Self = StObject.set(x, "TheaterMode", value.asInstanceOf[js.Any])
  }
}
