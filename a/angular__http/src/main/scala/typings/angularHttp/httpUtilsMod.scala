package typings.angularHttp

import typings.angularHttp.enumsMod.RequestMethod
import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object httpUtilsMod {
  
  @JSImport("@angular/http/src/http_utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getResponseURL(xhr: js.Any): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getResponseURL")(xhr.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  @scala.inline
  def isSuccess(status: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSuccess")(status.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def normalizeMethodName(method: String): RequestMethod = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeMethodName")(method.asInstanceOf[js.Any]).asInstanceOf[RequestMethod]
  @scala.inline
  def normalizeMethodName(method: RequestMethod): RequestMethod = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeMethodName")(method.asInstanceOf[js.Any]).asInstanceOf[RequestMethod]
  
  @scala.inline
  def stringToArrayBuffer(input: String): ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("stringToArrayBuffer")(input.asInstanceOf[js.Any]).asInstanceOf[ArrayBuffer]
  
  @scala.inline
  def stringToArrayBuffer8(input: String): ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("stringToArrayBuffer8")(input.asInstanceOf[js.Any]).asInstanceOf[ArrayBuffer]
}
