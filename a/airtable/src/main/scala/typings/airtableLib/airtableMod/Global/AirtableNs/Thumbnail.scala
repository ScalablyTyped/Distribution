package typings
package airtableLib.airtableMod.Global.AirtableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Thumbnail extends js.Object {
  var height: scala.Double
  var url: java.lang.String
  var width: scala.Double
}

object Thumbnail {
  @scala.inline
  def apply(height: scala.Double, url: java.lang.String, width: scala.Double): Thumbnail = {
    val __obj = js.Dynamic.literal(height = height, url = url, width = width)
  
    __obj.asInstanceOf[Thumbnail]
  }
}

