package typings.antDesignReactNative.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dictx
  extends /* key */ StringDictionary[js.Any] {
  
  def ref(picker: js.Any): Unit = js.native
}
object Dictx {
  
  @scala.inline
  def apply(ref: js.Any => Unit): Dictx = {
    val __obj = js.Dynamic.literal(ref = js.Any.fromFunction1(ref))
    __obj.asInstanceOf[Dictx]
  }
  
  @scala.inline
  implicit class DictxMutableBuilder[Self <: Dictx] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRef(value: js.Any => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
  }
}
