package typings.apolloDashServerDashEnv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distFetchMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.node.httpMod.Agent
  import typings.std.ArrayBuffer
  import typings.std.ArrayBufferView

  type BodyInit = ArrayBuffer | ArrayBufferView | String
  type HeadersInit = Headers | js.Array[js.Array[String]] | StringDictionary[String]
  type RequestAgent = Agent | typings.node.httpsMod.Agent
  type RequestInfo = Request | String
}
