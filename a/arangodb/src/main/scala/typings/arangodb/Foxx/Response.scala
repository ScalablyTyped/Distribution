package typings.arangodb.Foxx

import org.scalablytyped.runtime.StringDictionary
import typings.arangodb.AnonCause
import typings.arangodb.AnonDomain
import typings.arangodb.AnonLastModified
import typings.arangodb.ArangoDB.HttpStatus
import typings.node.Buffer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Response extends js.Object {
  var body: Buffer | String = js.native
  var context: Context = js.native
  var headers: StringDictionary[js.Any] = js.native
  var statusCode: Double = js.native
  def attachment(): this.type = js.native
  def attachment(filename: String): this.type = js.native
  def cookie(name: String, value: String): this.type = js.native
  def cookie(name: String, value: String, options: AnonDomain): this.type = js.native
  def download(path: String): this.type = js.native
  def download(path: String, filename: String): this.type = js.native
  def getHeader(name: String): js.UndefOr[String] = js.native
  def json(data: js.Any): this.type = js.native
  def redirect(path: String): this.type = js.native
  def redirect(status: Double, path: String): this.type = js.native
  def redirect(status: HttpStatus, path: String): this.type = js.native
  def removeHeader(name: String): this.type = js.native
  def send(data: js.Any): this.type = js.native
  def send(data: js.Any, `type`: String): this.type = js.native
  def sendFile(path: String): this.type = js.native
  def sendFile(path: String, options: AnonLastModified): this.type = js.native
  def sendStatus(status: Double): this.type = js.native
  def sendStatus(status: HttpStatus): this.type = js.native
  def set(headers: StringDictionary[String]): this.type = js.native
  def set(name: String, value: String): this.type = js.native
  def setHeader(name: String, value: String): this.type = js.native
  def status(status: Double): this.type = js.native
  def status(status: HttpStatus): this.type = js.native
  def `throw`(status: Double): scala.Nothing = js.native
  def `throw`(status: Double, error: Error): scala.Nothing = js.native
  def `throw`(status: Double, options: AnonCause): scala.Nothing = js.native
  def `throw`(status: Double, reason: String): scala.Nothing = js.native
  def `throw`(status: Double, reason: String, error: Error): scala.Nothing = js.native
  def `throw`(status: Double, reason: String, options: AnonCause): scala.Nothing = js.native
  def `throw`(status: HttpStatus): scala.Nothing = js.native
  def `throw`(status: HttpStatus, error: Error): scala.Nothing = js.native
  def `throw`(status: HttpStatus, options: AnonCause): scala.Nothing = js.native
  def `throw`(status: HttpStatus, reason: String): scala.Nothing = js.native
  def `throw`(status: HttpStatus, reason: String, error: Error): scala.Nothing = js.native
  def `throw`(status: HttpStatus, reason: String, options: AnonCause): scala.Nothing = js.native
  def `type`(): String = js.native
  def `type`(`type`: String): String = js.native
  def vary(names: String*): this.type = js.native
  def vary(names: js.Array[String]): this.type = js.native
  def write(data: String): this.type = js.native
  def write(data: Buffer): this.type = js.native
}

