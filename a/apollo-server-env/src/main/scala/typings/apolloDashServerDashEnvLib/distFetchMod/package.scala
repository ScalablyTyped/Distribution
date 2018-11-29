package typings
package apolloDashServerDashEnvLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distFetchMod {
  type BodyInit = stdLib.ArrayBuffer | stdLib.ArrayBufferView | java.lang.String
  type HeadersInit = Headers | js.Array[js.Array[java.lang.String]] | ScalablyTyped.runtime.StringDictionary[java.lang.String]
  type ReferrerPolicy = apolloDashServerDashEnvLib.apolloDashServerDashEnvLibStrings.Empty | apolloDashServerDashEnvLib.apolloDashServerDashEnvLibStrings.`no-referrer` | apolloDashServerDashEnvLib.apolloDashServerDashEnvLibStrings.`no-referrer-when-downgrade` | apolloDashServerDashEnvLib.apolloDashServerDashEnvLibStrings.`same-origin` | apolloDashServerDashEnvLib.apolloDashServerDashEnvLibStrings.origin | apolloDashServerDashEnvLib.apolloDashServerDashEnvLibStrings.`strict-origin` | apolloDashServerDashEnvLib.apolloDashServerDashEnvLibStrings.`origin-when-cross-origin` | apolloDashServerDashEnvLib.apolloDashServerDashEnvLibStrings.`strict-origin-when-cross-origin` | apolloDashServerDashEnvLib.apolloDashServerDashEnvLibStrings.`unsafe-url`
  type RequestAgent = nodeLib.httpMod.Agent | nodeLib.httpsMod.Agent
  type RequestCache = apolloDashServerDashEnvLib.apolloDashServerDashEnvLibStrings.default | apolloDashServerDashEnvLib.apolloDashServerDashEnvLibStrings.`no-store` | apolloDashServerDashEnvLib.apolloDashServerDashEnvLibStrings.reload | apolloDashServerDashEnvLib.apolloDashServerDashEnvLibStrings.`no-cache` | apolloDashServerDashEnvLib.apolloDashServerDashEnvLibStrings.`force-cache` | apolloDashServerDashEnvLib.apolloDashServerDashEnvLibStrings.`only-if-cached`
  type RequestCredentials = apolloDashServerDashEnvLib.apolloDashServerDashEnvLibStrings.omit | apolloDashServerDashEnvLib.apolloDashServerDashEnvLibStrings.`same-origin` | apolloDashServerDashEnvLib.apolloDashServerDashEnvLibStrings.include
  type RequestInfo = Request | java.lang.String
  type RequestMode = apolloDashServerDashEnvLib.apolloDashServerDashEnvLibStrings.navigate | apolloDashServerDashEnvLib.apolloDashServerDashEnvLibStrings.`same-origin` | apolloDashServerDashEnvLib.apolloDashServerDashEnvLibStrings.`no-cors` | apolloDashServerDashEnvLib.apolloDashServerDashEnvLibStrings.cors
  type RequestRedirect = apolloDashServerDashEnvLib.apolloDashServerDashEnvLibStrings.follow | apolloDashServerDashEnvLib.apolloDashServerDashEnvLibStrings.error | apolloDashServerDashEnvLib.apolloDashServerDashEnvLibStrings.manual
}
