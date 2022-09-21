package typings.apolloProtobufjs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@apollo/protobufjs", "Method")
@js.native
open class Method protected () extends ReflectionObject {
  /**
    * Constructs a new service method instance.
    * @param name Method name
    * @param type Method type, usually `"rpc"`
    * @param requestType Request message type
    * @param responseType Response message type
    * @param [requestStream] Whether the request is streamed
    * @param [responseStream] Whether the response is streamed
    * @param [options] Declared options
    * @param [comment] The comment for this method
    */
  def this(
    name: String,
    `type`: js.UndefOr[String],
    requestType: String,
    responseType: String,
    requestStream: js.UndefOr[Boolean | StringDictionary[Any]],
    responseStream: js.UndefOr[Boolean | StringDictionary[Any]],
    options: js.UndefOr[StringDictionary[Any]],
    comment: js.UndefOr[String]
  ) = this()
  
  /** Whether requests are streamed or not. */
  var requestStream: js.UndefOr[Boolean] = js.native
  
  /** Request type. */
  var requestType: String = js.native
  
  /** Resolved request type. */
  var resolvedRequestType: Type | Null = js.native
  
  /** Resolved response type. */
  var resolvedResponseType: Type | Null = js.native
  
  /** Whether responses are streamed or not. */
  var responseStream: js.UndefOr[Boolean] = js.native
  
  /** Response type. */
  var responseType: String = js.native
  
  def toJSON(toJSONOptions: IToJSONOptions): IMethod = js.native
  
  /** Method type. */
  var `type`: String = js.native
}
/* static members */
object Method {
  
  @JSImport("@apollo/protobufjs", "Method")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Constructs a method from a method descriptor.
    * @param name Method name
    * @param json Method descriptor
    * @returns Created method
    * @throws {TypeError} If arguments are invalid
    */
  inline def fromJSON(name: String, json: IMethod): Method = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(name.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[Method]
}
