package typings
package amazonDashCognitoDashAuthDashJsLib.amazonDashCognitoDashAuthDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait XDomainRequest extends js.Object {
  val responseText: java.lang.String
  var timeout: scala.Double
  def abort(): scala.Unit
  def onerror(): scala.Unit
  def onload(): scala.Unit
  def onprogress(): scala.Unit
  def ontimeout(): scala.Unit
  def open(method: java.lang.String, url: java.lang.String): scala.Unit
  def send(data: java.lang.String): scala.Unit
}

