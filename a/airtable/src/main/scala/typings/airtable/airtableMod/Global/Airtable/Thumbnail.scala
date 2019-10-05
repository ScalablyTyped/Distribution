package typings.airtable.airtableMod.Global.Airtable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Thumbnail extends js.Object {
  var height: Double
  var url: String
  var width: Double
}

object Thumbnail {
  @scala.inline
  def apply(height: Double, url: String, width: Double): Thumbnail = {
    val __obj = js.Dynamic.literal(height = height, url = url, width = width)
  
    __obj.asInstanceOf[Thumbnail]
  }
}

