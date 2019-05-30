package typings
package atAngularCompilerLib.srcCompilerUnderscoreFacadeUnderscoreInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceLoader extends js.Object {
  def get(url: java.lang.String): js.Promise[java.lang.String] | java.lang.String
}

object ResourceLoader {
  @scala.inline
  def apply(get: java.lang.String => js.Promise[java.lang.String] | java.lang.String): ResourceLoader = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[ResourceLoader]
  }
}

