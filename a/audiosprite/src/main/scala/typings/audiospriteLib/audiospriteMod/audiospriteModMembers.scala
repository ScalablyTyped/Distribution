package typings
package audiospriteLib.audiospriteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("audiosprite", JSImport.Namespace)
@js.native
object audiospriteModMembers extends js.Object {
  def apply(
    files: js.Array[java.lang.String],
    callback: js.Function2[
      /* error */ stdLib.Error, 
      /* obj */ audiospriteLib.audiospriteMod.audiospriteNs.Result, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def apply(
    files: js.Array[java.lang.String],
    option: audiospriteLib.audiospriteMod.audiospriteNs.Option,
    callback: js.Function2[
      /* error */ stdLib.Error, 
      /* obj */ audiospriteLib.audiospriteMod.audiospriteNs.Result, 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

