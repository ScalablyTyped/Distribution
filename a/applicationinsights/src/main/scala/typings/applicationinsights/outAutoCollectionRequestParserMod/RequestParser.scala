package typings.applicationinsights.outAutoCollectionRequestParserMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestParser extends js.Object {
  var duration: Double = js.native
  var method: String = js.native
  var properties: StringDictionary[String] = js.native
  var startTime: Double = js.native
  var statusCode: Double = js.native
  var url: String = js.native
  /* protected */ def RequestParser(): Unit = js.native
  /* protected */ def _isSuccess(): Boolean = js.native
  /* protected */ def _setStatus(status: Double, error: String): Unit = js.native
  /* protected */ def _setStatus(status: Double, error: Error): Unit = js.native
  /**
    * Gets a url parsed out from request options
    */
  def getUrl(): String = js.native
}

