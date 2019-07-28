package typings.adone

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BasenameDirname extends js.Object {
  var basename: String
  var dirname: String
  var extname: String
}

object Anon_BasenameDirname {
  @scala.inline
  def apply(basename: String, dirname: String, extname: String): Anon_BasenameDirname = {
    val __obj = js.Dynamic.literal(basename = basename, dirname = dirname, extname = extname)
  
    __obj.asInstanceOf[Anon_BasenameDirname]
  }
}

