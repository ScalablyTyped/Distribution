package typings.actionsOnGoogle

import org.scalablytyped.runtime.StringDictionary
import typings.debug.mod.IDebugger
import typings.node.httpMod.ClientRequest
import typings.node.httpMod.IncomingMessage
import typings.node.httpsMod.RequestOptions
import typings.node.urlMod.URL_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/dist/common", JSImport.Namespace)
@js.native
object commonMod extends js.Object {
  val debug: IDebugger = js.native
  val warn: IDebugger = js.native
  def clone[T](o: T): T = js.native
  def deprecate(feature: String, alternative: String): Unit = js.native
  def stringify(root: js.Any, exclude: String*): String = js.native
  def toArray[T](a: T): js.Array[T] = js.native
  def toArray[T](a: js.Array[T]): js.Array[T] = js.native
  def values[T](o: StringDictionary[T]): js.Array[T] = js.native
  @js.native
  object error extends js.Object {
    def apply(): Unit = js.native
    def apply(message: js.Any, optionalParams: js.Any*): Unit = js.native
  }
  
  @js.native
  object info extends js.Object {
    def apply(): Unit = js.native
    def apply(message: js.Any, optionalParams: js.Any*): Unit = js.native
  }
  
  @js.native
  object request extends js.Object {
    def apply(options: String): ClientRequest = js.native
    def apply(options: String, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
    def apply(options: RequestOptions): ClientRequest = js.native
    def apply(options: RequestOptions, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
    def apply(options: URL_): ClientRequest = js.native
    def apply(options: URL_, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
    def apply(url: String, options: RequestOptions): ClientRequest = js.native
    def apply(url: String, options: RequestOptions, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
    def apply(url: URL_, options: RequestOptions): ClientRequest = js.native
    def apply(url: URL_, options: RequestOptions, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
  }
  
  type ApiClientObjectMap[TValue] = StringDictionary[TValue]
  type JsonObject = StringDictionary[js.Any]
  type ProtoAny[TType, TSpec] = AnonType[TType] with TSpec
}

