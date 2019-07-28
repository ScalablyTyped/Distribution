package typings.apicache.apicacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apicache", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val id: Double = js.native
  def clear(target: String): js.Any = js.native
  def clear(target: js.Array[_]): js.Any = js.native
  def getDuration(duration: String): js.Any = js.native
  def getIndex(): js.Any = js.native
  def middleware(): js.Any = js.native
  def middleware(duration: String): js.Any = js.native
  def middleware(duration: String, toggleMiddleware: js.Any): js.Any = js.native
  def middleware(duration: String, toggleMiddleware: js.Any, localOptions: Options): js.Any = js.native
  def newInstance(config: Options): js.Any = js.native
  def options(options: Options): js.Any = js.native
  def resetIndex(): Unit = js.native
}

