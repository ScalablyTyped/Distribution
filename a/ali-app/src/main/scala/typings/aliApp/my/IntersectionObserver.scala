package typings.aliApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntersectionObserver extends js.Object {
  def disconnect(): Unit = js.native
  def observe(): IntersectionObserver = js.native
  def observe(selector: String): IntersectionObserver = js.native
  def observe(selector: String, callback: js.Function1[/* response */ ObserveResponse, Unit]): IntersectionObserver = js.native
  def relativeTo(): IntersectionObserver = js.native
  def relativeTo(selector: String): IntersectionObserver = js.native
  def relativeTo(selector: String, margins: Margins): IntersectionObserver = js.native
  def relativeToViewport(): IntersectionObserver = js.native
  def relativeToViewport(margins: Margins): IntersectionObserver = js.native
}

