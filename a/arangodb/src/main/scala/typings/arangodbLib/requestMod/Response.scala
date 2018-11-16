package typings
package arangodbLib.requestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Response extends js.Object {
  var body: java.lang.String | nodeLib.Buffer = js.native
  var headers: ScalablyTyped.runtime.StringDictionary[js.UndefOr[java.lang.String]] = js.native
  var json: js.UndefOr[js.Any] = js.native
  var message: java.lang.String = js.native
  var rawBody: nodeLib.Buffer = js.native
  var status: scala.Double = js.native
  var statusCode: scala.Double = js.native
  def `throw`(): scala.Unit | scala.Nothing = js.native
  def `throw`(message: java.lang.String): scala.Unit | scala.Nothing = js.native
}

