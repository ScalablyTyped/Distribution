package typings.antd.esUploadInterfaceMod

import typings.std.Date
import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RcFile extends File {
  val lastModifiedDate: Date = js.native
  var uid: String = js.native
  val webkitRelativePath: String = js.native
}

