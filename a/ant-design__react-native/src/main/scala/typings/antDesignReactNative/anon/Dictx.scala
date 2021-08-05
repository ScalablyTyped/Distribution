package typings.antDesignReactNative.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dictx
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  def ref(picker: js.Any): Unit
}
object Dictx {
  
  inline def apply(ref: js.Any => Unit): Dictx = {
    val __obj = js.Dynamic.literal(ref = js.Any.fromFunction1(ref))
    __obj.asInstanceOf[Dictx]
  }
  
  extension [Self <: Dictx](x: Self) {
    
    inline def setRef(value: js.Any => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
  }
}
