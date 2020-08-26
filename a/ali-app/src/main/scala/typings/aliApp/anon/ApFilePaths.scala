package typings.aliApp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApFilePaths extends js.Object {
  /**
    * 图片文件描述
    */
  var apFilePaths: js.Array[String] = js.native
}

object ApFilePaths {
  @scala.inline
  def apply(apFilePaths: js.Array[String]): ApFilePaths = {
    val __obj = js.Dynamic.literal(apFilePaths = apFilePaths.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApFilePaths]
  }
  @scala.inline
  implicit class ApFilePathsOps[Self <: ApFilePaths] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApFilePathsVarargs(value: String*): Self = this.set("apFilePaths", js.Array(value :_*))
    @scala.inline
    def setApFilePaths(value: js.Array[String]): Self = this.set("apFilePaths", value.asInstanceOf[js.Any])
  }
  
}

