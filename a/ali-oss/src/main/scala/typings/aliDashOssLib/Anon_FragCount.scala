package typings
package aliDashOssLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FragCount extends js.Object {
  var FragCount: scala.Double
  var FragDuration: scala.Double
  var PlaylistName: java.lang.String
  var Type: java.lang.String
}

object Anon_FragCount {
  @scala.inline
  def apply(
    FragCount: scala.Double,
    FragDuration: scala.Double,
    PlaylistName: java.lang.String,
    Type: java.lang.String
  ): Anon_FragCount = {
    val __obj = js.Dynamic.literal(FragCount = FragCount, FragDuration = FragDuration, PlaylistName = PlaylistName, Type = Type)
  
    __obj.asInstanceOf[Anon_FragCount]
  }
}

