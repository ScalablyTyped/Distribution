package typings.apolloDashEnv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libFetchFetchMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.apolloDashEnv.libPolyfillsArrayMod._Global_.Array
  import typings.node.httpMod.Agent
  import typings.std.ArrayBuffer
  import typings.std.ArrayBufferView

  type BodyInit = ArrayBuffer | ArrayBufferView | String
  type HeadersInit = Headers | Array[Array[String]] | StringDictionary[String]
  type RequestAgent = Agent | typings.node.httpsMod.Agent
  type RequestInfo = Request | String
}
