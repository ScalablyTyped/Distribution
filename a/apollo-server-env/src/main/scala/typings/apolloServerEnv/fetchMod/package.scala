package typings.apolloServerEnv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fetchMod {
  type BodyInit = typings.std.ArrayBuffer | typings.std.ArrayBufferView | java.lang.String
  type HeadersInit = typings.apolloServerEnv.fetchMod.Headers | js.Array[js.Array[java.lang.String]] | org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type RequestAgent = typings.node.httpMod.Agent | typings.node.httpsMod.Agent
  type RequestInfo = typings.apolloServerEnv.fetchMod.Request | java.lang.String
}
