package typings.actionsOnGoogle

import org.scalablytyped.runtime.StringDictionary
import typings.actionsOnGoogle.anon.Type
import typings.debug.mod.IDebugger
import typings.node.httpMod.ClientRequest
import typings.node.httpMod.IncomingMessage
import typings.node.httpsMod.RequestOptions
import typings.node.urlMod.URL_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonMod {
  
  @JSImport("actions-on-google/dist/common", "clone")
  @js.native
  def clone_[T](o: T): T = js.native
  
  @JSImport("actions-on-google/dist/common", "debug")
  @js.native
  val debug: IDebugger = js.native
  
  @JSImport("actions-on-google/dist/common", "deprecate")
  @js.native
  def deprecate(feature: String, alternative: String): Unit = js.native
  
  @JSImport("actions-on-google/dist/common", "error")
  @js.native
  def error(message: js.UndefOr[scala.Nothing], optionalParams: js.Any*): Unit = js.native
  @JSImport("actions-on-google/dist/common", "error")
  @js.native
  def error(message: js.Any, optionalParams: js.Any*): Unit = js.native
  
  @JSImport("actions-on-google/dist/common", "info")
  @js.native
  def info(message: js.UndefOr[scala.Nothing], optionalParams: js.Any*): Unit = js.native
  @JSImport("actions-on-google/dist/common", "info")
  @js.native
  def info(message: js.Any, optionalParams: js.Any*): Unit = js.native
  
  @JSImport("actions-on-google/dist/common", "request")
  @js.native
  def request(options: String): ClientRequest = js.native
  @JSImport("actions-on-google/dist/common", "request")
  @js.native
  def request(options: String, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
  @JSImport("actions-on-google/dist/common", "request")
  @js.native
  def request(options: RequestOptions): ClientRequest = js.native
  @JSImport("actions-on-google/dist/common", "request")
  @js.native
  def request(options: RequestOptions, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
  @JSImport("actions-on-google/dist/common", "request")
  @js.native
  def request(options: URL_): ClientRequest = js.native
  @JSImport("actions-on-google/dist/common", "request")
  @js.native
  def request(options: URL_, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
  @JSImport("actions-on-google/dist/common", "request")
  @js.native
  def request(url: String, options: RequestOptions): ClientRequest = js.native
  @JSImport("actions-on-google/dist/common", "request")
  @js.native
  def request(url: String, options: RequestOptions, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
  @JSImport("actions-on-google/dist/common", "request")
  @js.native
  def request(url: URL_, options: RequestOptions): ClientRequest = js.native
  @JSImport("actions-on-google/dist/common", "request")
  @js.native
  def request(url: URL_, options: RequestOptions, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
  
  @JSImport("actions-on-google/dist/common", "stringify")
  @js.native
  def stringify(root: js.Any, exclude: String*): String = js.native
  
  @JSImport("actions-on-google/dist/common", "toArray")
  @js.native
  def toArray[T](a: T): js.Array[T] = js.native
  @JSImport("actions-on-google/dist/common", "toArray")
  @js.native
  def toArray[T](a: js.Array[T]): js.Array[T] = js.native
  
  @JSImport("actions-on-google/dist/common", "values")
  @js.native
  def values[T](o: StringDictionary[T]): js.Array[T] = js.native
  
  @JSImport("actions-on-google/dist/common", "warn")
  @js.native
  val warn: IDebugger = js.native
  
  type ApiClientObjectMap[TValue] = StringDictionary[TValue]
  
  type JsonObject = StringDictionary[js.Any]
  
  type ProtoAny[TType, TSpec] = Type[TType] with TSpec
}
