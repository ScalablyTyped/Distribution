package typings.angularHttp

import typings.angularHttp.enumsMod.RequestMethod
import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object httpUtilsMod {
  
  @JSImport("@angular/http/src/http_utils", "getResponseURL")
  @js.native
  def getResponseURL(xhr: js.Any): String | Null = js.native
  
  @JSImport("@angular/http/src/http_utils", "isSuccess")
  @js.native
  def isSuccess(status: Double): Boolean = js.native
  
  @JSImport("@angular/http/src/http_utils", "normalizeMethodName")
  @js.native
  def normalizeMethodName(method: String): RequestMethod = js.native
  @JSImport("@angular/http/src/http_utils", "normalizeMethodName")
  @js.native
  def normalizeMethodName(method: RequestMethod): RequestMethod = js.native
  
  @JSImport("@angular/http/src/http_utils", "stringToArrayBuffer")
  @js.native
  def stringToArrayBuffer(input: String): ArrayBuffer = js.native
  
  @JSImport("@angular/http/src/http_utils", "stringToArrayBuffer8")
  @js.native
  def stringToArrayBuffer8(input: String): ArrayBuffer = js.native
}
