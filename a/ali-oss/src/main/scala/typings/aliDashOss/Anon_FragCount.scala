package typings.aliDashOss

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FragCount extends js.Object {
  var FragCount: Double
  var FragDuration: Double
  var PlaylistName: String
  var Type: String
}

object Anon_FragCount {
  @scala.inline
  def apply(FragCount: Double, FragDuration: Double, PlaylistName: String, Type: String): Anon_FragCount = {
    val __obj = js.Dynamic.literal(FragCount = FragCount, FragDuration = FragDuration, PlaylistName = PlaylistName, Type = Type)
  
    __obj.asInstanceOf[Anon_FragCount]
  }
}

