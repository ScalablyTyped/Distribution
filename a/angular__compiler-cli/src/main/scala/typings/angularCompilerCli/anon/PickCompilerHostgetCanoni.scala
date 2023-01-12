package typings.angularCompilerCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<typescript.typescript.CompilerHost, 'getCanonicalFileName'> */
trait PickCompilerHostgetCanoni extends StObject {
  
  def getCanonicalFileName(fileName: String): String
  @JSName("getCanonicalFileName")
  var getCanonicalFileName_Original: js.Function1[/* fileName */ String, String]
}
object PickCompilerHostgetCanoni {
  
  inline def apply(getCanonicalFileName: /* fileName */ String => String): PickCompilerHostgetCanoni = {
    val __obj = js.Dynamic.literal(getCanonicalFileName = js.Any.fromFunction1(getCanonicalFileName))
    __obj.asInstanceOf[PickCompilerHostgetCanoni]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickCompilerHostgetCanoni] (val x: Self) extends AnyVal {
    
    inline def setGetCanonicalFileName(value: /* fileName */ String => String): Self = StObject.set(x, "getCanonicalFileName", js.Any.fromFunction1(value))
  }
}
