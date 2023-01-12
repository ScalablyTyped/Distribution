package typings.angularCli.anon

import typings.angularDevkitSchematics.srcEngineInterfaceMod.Rule
import typings.angularDevkitSchematics.srcEngineInterfaceMod.RuleFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Path extends StObject {
  
  var path: String
  
  def ref(options: js.Object): Rule
  @JSName("ref")
  var ref_Original: RuleFactory[js.Object]
}
object Path {
  
  inline def apply(path: String, ref: js.Object => Rule): Path = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], ref = js.Any.fromFunction1(ref))
    __obj.asInstanceOf[Path]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Path] (val x: Self) extends AnyVal {
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setRef(value: js.Object => Rule): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
  }
}
