package typings.arangodb.arangodbRequestMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Response extends js.Object {
  
  var body: String | Buffer = js.native
  
  var headers: StringDictionary[js.UndefOr[String]] = js.native
  
  var json: js.UndefOr[js.Any] = js.native
  
  var message: String = js.native
  
  var rawBody: Buffer = js.native
  
  var status: Double = js.native
  
  var statusCode: Double = js.native
  
  def `throw`(): Unit | scala.Nothing = js.native
  def `throw`(message: String): Unit | scala.Nothing = js.native
}
