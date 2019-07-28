package typings.apolloDashEnv

import org.scalablytyped.runtime.StringDictionary
import typings.apolloDashEnv.libPolyfillsArrayMod.Global.Array
import typings.node.httpMod.Agent
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libFetchFetchMod {
  type BodyInit = ArrayBuffer | ArrayBufferView | String
  type HeadersInit = Headers | Array[Array[String]] | StringDictionary[String]
  type RequestAgent = Agent | typings.node.httpsMod.Agent
  type RequestInfo = Request | String
}
