package typings.angularCli.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined yargs.yargs.Arguments<{}> */
trait Arguments
  extends StObject
     with /** All remaining options */
/* argName */ StringDictionary[Any] {
  
  /** The script name or node command */
  @JSName("$0")
  var $0: String
  
  /** Non-option arguments */
  @JSName("_")
  var _underscore: js.Array[String | Double]
}
object Arguments {
  
  inline def apply($0: String, _underscore: js.Array[String | Double]): Arguments = {
    val __obj = js.Dynamic.literal($0 = $0.asInstanceOf[js.Any])
    __obj.updateDynamic("_")(_underscore.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arguments]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Arguments] (val x: Self) extends AnyVal {
    
    inline def set$0(value: String): Self = StObject.set(x, "$0", value.asInstanceOf[js.Any])
    
    inline def set_underscore(value: js.Array[String | Double]): Self = StObject.set(x, "_", value.asInstanceOf[js.Any])
    
    inline def set_underscoreVarargs(value: (String | Double)*): Self = StObject.set(x, "_", js.Array(value*))
  }
}
