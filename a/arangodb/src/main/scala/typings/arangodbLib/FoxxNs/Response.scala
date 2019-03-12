package typings
package arangodbLib.FoxxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Response extends js.Object {
  var body: nodeLib.Buffer | java.lang.String = js.native
  var context: Context = js.native
  var headers: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  var statusCode: scala.Double = js.native
  def attachment(): this.type = js.native
  def attachment(filename: java.lang.String): this.type = js.native
  def cookie(name: java.lang.String, value: java.lang.String): this.type = js.native
  def cookie(name: java.lang.String, value: java.lang.String, options: arangodbLib.Anon_AlgorithmDomain): this.type = js.native
  def download(path: java.lang.String): this.type = js.native
  def download(path: java.lang.String, filename: java.lang.String): this.type = js.native
  def getHeader(name: java.lang.String): js.UndefOr[java.lang.String] = js.native
  def json(data: js.Any): this.type = js.native
  def redirect(path: java.lang.String): this.type = js.native
  def redirect(status: arangodbLib.ArangoDBNs.HttpStatus, path: java.lang.String): this.type = js.native
  def redirect(status: scala.Double, path: java.lang.String): this.type = js.native
  def removeHeader(name: java.lang.String): this.type = js.native
  def send(data: js.Any): this.type = js.native
  def send(data: js.Any, `type`: java.lang.String): this.type = js.native
  def sendFile(path: java.lang.String): this.type = js.native
  def sendFile(path: java.lang.String, options: arangodbLib.Anon_LastModified): this.type = js.native
  def sendStatus(status: arangodbLib.ArangoDBNs.HttpStatus): this.type = js.native
  def sendStatus(status: scala.Double): this.type = js.native
  def set(headers: org.scalablytyped.runtime.StringDictionary[java.lang.String]): this.type = js.native
  def set(name: java.lang.String, value: java.lang.String): this.type = js.native
  def setHeader(name: java.lang.String, value: java.lang.String): this.type = js.native
  def status(status: arangodbLib.ArangoDBNs.HttpStatus): this.type = js.native
  def status(status: scala.Double): this.type = js.native
  def `throw`(status: arangodbLib.ArangoDBNs.HttpStatus): scala.Nothing = js.native
  def `throw`(status: arangodbLib.ArangoDBNs.HttpStatus, error: stdLib.Error): scala.Nothing = js.native
  def `throw`(status: arangodbLib.ArangoDBNs.HttpStatus, options: arangodbLib.Anon_Cause): scala.Nothing = js.native
  def `throw`(status: arangodbLib.ArangoDBNs.HttpStatus, reason: java.lang.String): scala.Nothing = js.native
  def `throw`(status: arangodbLib.ArangoDBNs.HttpStatus, reason: java.lang.String, error: stdLib.Error): scala.Nothing = js.native
  def `throw`(
    status: arangodbLib.ArangoDBNs.HttpStatus,
    reason: java.lang.String,
    options: arangodbLib.Anon_Cause
  ): scala.Nothing = js.native
  def `throw`(status: scala.Double): scala.Nothing = js.native
  def `throw`(status: scala.Double, error: stdLib.Error): scala.Nothing = js.native
  def `throw`(status: scala.Double, options: arangodbLib.Anon_Cause): scala.Nothing = js.native
  def `throw`(status: scala.Double, reason: java.lang.String): scala.Nothing = js.native
  def `throw`(status: scala.Double, reason: java.lang.String, error: stdLib.Error): scala.Nothing = js.native
  def `throw`(status: scala.Double, reason: java.lang.String, options: arangodbLib.Anon_Cause): scala.Nothing = js.native
  def `type`(): java.lang.String = js.native
  def `type`(`type`: java.lang.String): java.lang.String = js.native
  def vary(names: java.lang.String*): this.type = js.native
  def vary(names: js.Array[java.lang.String]): this.type = js.native
  def write(data: java.lang.String): this.type = js.native
  def write(data: nodeLib.Buffer): this.type = js.native
}

