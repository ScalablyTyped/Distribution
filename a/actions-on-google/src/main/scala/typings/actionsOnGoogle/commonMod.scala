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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonMod {
  
  @JSImport("actions-on-google/dist/common", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def clone_[T](o: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(o.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @JSImport("actions-on-google/dist/common", "debug")
  @js.native
  val debug: IDebugger = js.native
  
  @scala.inline
  def deprecate(feature: String, alternative: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deprecate")(feature.asInstanceOf[js.Any], alternative.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def error(message: js.Any, optionalParams: js.Any*): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(message.asInstanceOf[js.Any], optionalParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def error(message: Unit, optionalParams: js.Any*): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(message.asInstanceOf[js.Any], optionalParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def info(message: js.Any, optionalParams: js.Any*): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("info")(message.asInstanceOf[js.Any], optionalParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def info(message: Unit, optionalParams: js.Any*): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("info")(message.asInstanceOf[js.Any], optionalParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def request(options: String): ClientRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("request")(options.asInstanceOf[js.Any]).asInstanceOf[ClientRequest]
  @scala.inline
  def request(options: String, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ClientRequest]
  @scala.inline
  def request(options: RequestOptions): ClientRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("request")(options.asInstanceOf[js.Any]).asInstanceOf[ClientRequest]
  @scala.inline
  def request(options: RequestOptions, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ClientRequest]
  @scala.inline
  def request(options: URL_): ClientRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("request")(options.asInstanceOf[js.Any]).asInstanceOf[ClientRequest]
  @scala.inline
  def request(options: URL_, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ClientRequest]
  @scala.inline
  def request(url: String, options: RequestOptions): ClientRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ClientRequest]
  @scala.inline
  def request(url: String, options: RequestOptions, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ClientRequest]
  @scala.inline
  def request(url: URL_, options: RequestOptions): ClientRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ClientRequest]
  @scala.inline
  def request(url: URL_, options: RequestOptions, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ClientRequest]
  
  @scala.inline
  def stringify(root: js.Any, exclude: String*): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(root.asInstanceOf[js.Any], exclude.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def toArray[T](a: T): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(a.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  @scala.inline
  def toArray[T](a: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(a.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  @scala.inline
  def values[T](o: StringDictionary[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")(o.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  @JSImport("actions-on-google/dist/common", "warn")
  @js.native
  val warn: IDebugger = js.native
  
  type ApiClientObjectMap[TValue] = StringDictionary[TValue]
  
  type JsonObject = StringDictionary[js.Any]
  
  type ProtoAny[TType, TSpec] = Type[TType] & TSpec
}
