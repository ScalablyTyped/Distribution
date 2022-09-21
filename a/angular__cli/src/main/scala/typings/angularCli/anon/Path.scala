package typings.angularCli.anon

import typings.angularDevkitSchematics.interfaceMod.Rule
import typings.angularDevkitSchematics.interfaceMod.RuleFactory
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
  
  inline def apply(path: String, ref: RuleFactory[js.Object]): Path = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path]
  }
  
  extension [Self <: Path](x: Self) {
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setRef(value: RuleFactory[js.Object]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
  }
}
