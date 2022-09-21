package typings.appiumAdb.anon

import typings.appiumAdb.systemCallsMod.BinaryName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<appium-adb.appium-adb/lib/tools/system-calls.SystemCalls, 'getBinaryFromSdkRoot'> */
trait PickSystemCallsgetBinaryF extends StObject {
  
  def getBinaryFromSdkRoot(binaryName: BinaryName): js.Promise[String]
  @JSName("getBinaryFromSdkRoot")
  var getBinaryFromSdkRoot_Original: js.Function1[/* binaryName */ BinaryName, js.Promise[String]]
}
object PickSystemCallsgetBinaryF {
  
  inline def apply(getBinaryFromSdkRoot: /* binaryName */ BinaryName => js.Promise[String]): PickSystemCallsgetBinaryF = {
    val __obj = js.Dynamic.literal(getBinaryFromSdkRoot = js.Any.fromFunction1(getBinaryFromSdkRoot))
    __obj.asInstanceOf[PickSystemCallsgetBinaryF]
  }
  
  extension [Self <: PickSystemCallsgetBinaryF](x: Self) {
    
    inline def setGetBinaryFromSdkRoot(value: /* binaryName */ BinaryName => js.Promise[String]): Self = StObject.set(x, "getBinaryFromSdkRoot", js.Any.fromFunction1(value))
  }
}
