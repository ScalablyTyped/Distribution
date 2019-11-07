package typings.appleDashMusicDashApi.AppleMusicApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://developer.apple.com/documentation/applemusicapi/playparameters
trait PlayParameters extends js.Object {
  var id: String
  var kind: String
}

object PlayParameters {
  @scala.inline
  def apply(id: String, kind: String): PlayParameters = {
    val __obj = js.Dynamic.literal(id = id, kind = kind)
  
    __obj.asInstanceOf[PlayParameters]
  }
}

