package typings.angularCompilerCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<typescript.typescript.CompilerHost, 'getCurrentDirectory' | 'getCanonicalFileName'> */
trait PickCompilerHostgetCurren extends StObject {
  
  def getCanonicalFileName(fileName: String): String
  @JSName("getCanonicalFileName")
  var getCanonicalFileName_Original: js.Function1[/* fileName */ String, String]
  
  def getCurrentDirectory(): String
  @JSName("getCurrentDirectory")
  var getCurrentDirectory_Original: js.Function0[String]
}
object PickCompilerHostgetCurren {
  
  inline def apply(getCanonicalFileName: /* fileName */ String => String, getCurrentDirectory: () => String): PickCompilerHostgetCurren = {
    val __obj = js.Dynamic.literal(getCanonicalFileName = js.Any.fromFunction1(getCanonicalFileName), getCurrentDirectory = js.Any.fromFunction0(getCurrentDirectory))
    __obj.asInstanceOf[PickCompilerHostgetCurren]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickCompilerHostgetCurren] (val x: Self) extends AnyVal {
    
    inline def setGetCanonicalFileName(value: /* fileName */ String => String): Self = StObject.set(x, "getCanonicalFileName", js.Any.fromFunction1(value))
    
    inline def setGetCurrentDirectory(value: () => String): Self = StObject.set(x, "getCurrentDirectory", js.Any.fromFunction0(value))
  }
}
