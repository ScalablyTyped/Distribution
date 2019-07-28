package typings.aphrodite.aphroditeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleSheetStatic extends js.Object {
  /**
    * Create style sheet
    */
  def create[T /* <: StyleDeclaration */](styles: T): T
  /**
    * Rehydrate class names from server renderer
    */
  def rehydrate(renderedClassNames: js.Array[String]): Unit
}

object StyleSheetStatic {
  @scala.inline
  def apply(create: js.Any => js.Any, rehydrate: js.Array[String] => Unit): StyleSheetStatic = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), rehydrate = js.Any.fromFunction1(rehydrate))
  
    __obj.asInstanceOf[StyleSheetStatic]
  }
}

