package typings.antdDashMobileDashRn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContentSize extends js.Object {
  var contentSize: Anon_HeightWidth
  var eventCount: Double
  var target: Double
  var text: String
}

object Anon_ContentSize {
  @scala.inline
  def apply(contentSize: Anon_HeightWidth, eventCount: Double, target: Double, text: String): Anon_ContentSize = {
    val __obj = js.Dynamic.literal(contentSize = contentSize, eventCount = eventCount, target = target, text = text)
  
    __obj.asInstanceOf[Anon_ContentSize]
  }
}

