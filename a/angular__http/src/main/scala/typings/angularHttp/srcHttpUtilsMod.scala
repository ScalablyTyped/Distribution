package typings.angularHttp

import typings.angularHttp.srcEnumsMod.RequestMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcHttpUtilsMod {
  
  @JSImport("@angular/http/src/http_utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getResponseURL(xhr: Any): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getResponseURL")(xhr.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def isSuccess(status: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSuccess")(status.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def normalizeMethodName(method: String): RequestMethod = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeMethodName")(method.asInstanceOf[js.Any]).asInstanceOf[RequestMethod]
  inline def normalizeMethodName(method: RequestMethod): RequestMethod = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeMethodName")(method.asInstanceOf[js.Any]).asInstanceOf[RequestMethod]
  
  inline def stringToArrayBuffer(input: String): js.typedarray.ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("stringToArrayBuffer")(input.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.ArrayBuffer]
  
  inline def stringToArrayBuffer8(input: String): js.typedarray.ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("stringToArrayBuffer8")(input.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.ArrayBuffer]
}
