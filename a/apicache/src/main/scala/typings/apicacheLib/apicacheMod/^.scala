package typings
package apicacheLib.apicacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apicache", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val id: scala.Double = js.native
  def clear(target: java.lang.String): js.Any = js.native
  def clear(target: js.Array[_]): js.Any = js.native
  def getDuration(duration: java.lang.String): js.Any = js.native
  def getIndex(): js.Any = js.native
  def middleware(): js.Any = js.native
  def middleware(duration: java.lang.String): js.Any = js.native
  def middleware(duration: java.lang.String, toggleMiddleware: js.Any): js.Any = js.native
  def middleware(duration: java.lang.String, toggleMiddleware: js.Any, localOptions: Options): js.Any = js.native
  def newInstance(config: Options): js.Any = js.native
  def options(options: Options): js.Any = js.native
  def resetIndex(): scala.Unit = js.native
}

