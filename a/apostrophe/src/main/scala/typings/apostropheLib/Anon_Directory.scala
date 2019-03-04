package typings
package apostropheLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Directory extends js.Object {
  var directory: java.lang.String
  var modules: js.Array[java.lang.String]
}

object Anon_Directory {
  @scala.inline
  def apply(directory: java.lang.String, modules: js.Array[java.lang.String]): Anon_Directory = {
    val __obj = js.Dynamic.literal(directory = directory, modules = modules)
  
    __obj.asInstanceOf[Anon_Directory]
  }
}

