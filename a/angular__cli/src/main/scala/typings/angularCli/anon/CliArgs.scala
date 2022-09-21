package typings.angularCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CliArgs extends StObject {
  
  var cliArgs: js.Array[String]
}
object CliArgs {
  
  inline def apply(cliArgs: js.Array[String]): CliArgs = {
    val __obj = js.Dynamic.literal(cliArgs = cliArgs.asInstanceOf[js.Any])
    __obj.asInstanceOf[CliArgs]
  }
  
  extension [Self <: CliArgs](x: Self) {
    
    inline def setCliArgs(value: js.Array[String]): Self = StObject.set(x, "cliArgs", value.asInstanceOf[js.Any])
    
    inline def setCliArgsVarargs(value: String*): Self = StObject.set(x, "cliArgs", js.Array(value*))
  }
}
