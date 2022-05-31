package typings.apolloProtobufjs.global.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.apolloProtobufjs.mod.IMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("protobuf.Method")
@js.native
class Method protected ()
  extends typings.apolloProtobufjs.mod.Method {
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
    requestStream: js.UndefOr[Boolean | StringDictionary[js.UndefOr[js.Any]]],
    responseStream: js.UndefOr[Boolean | StringDictionary[js.UndefOr[js.Any]]],
    options: js.UndefOr[StringDictionary[js.UndefOr[js.Any]]],
    comment: js.UndefOr[String]
  ) = this()
}
/* static members */
object Method {
  
  @JSGlobal("protobuf.Method")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Constructs a method from a method descriptor.
    * @param name Method name
    * @param json Method descriptor
    * @returns Created method
    * @throws {TypeError} If arguments are invalid
    */
  inline def fromJSON(name: String, json: IMethod): typings.apolloProtobufjs.mod.Method = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(name.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[typings.apolloProtobufjs.mod.Method]
}
