package typings.aureliaDashPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-path", JSImport.Namespace)
@js.native
object aureliaDashPathMod extends js.Object {
  def buildQueryString(params: js.Object): String = js.native
  def buildQueryString(params: js.Object, traditional: Boolean): String = js.native
  def join(path1: String, path2: String): String = js.native
  def parseQueryString(queryString: String): js.Object = js.native
  def relativeToFile(name: String, file: String): String = js.native
}

