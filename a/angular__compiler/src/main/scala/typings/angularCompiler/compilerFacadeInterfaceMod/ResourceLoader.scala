package typings.angularCompiler.compilerFacadeInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceLoader extends js.Object {
  def get(url: String): js.Promise[String] | String
}

object ResourceLoader {
  @scala.inline
  def apply(get: String => js.Promise[String] | String): ResourceLoader = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[ResourceLoader]
  }
}

