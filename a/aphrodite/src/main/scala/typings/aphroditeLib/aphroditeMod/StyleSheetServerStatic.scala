package typings
package aphroditeLib.aphroditeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Utilities for using Aphrodite server-side.
  */
trait StyleSheetServerStatic extends js.Object {
  def renderStatic(renderFunc: js.Function0[java.lang.String]): StaticRendererResult
}

object StyleSheetServerStatic {
  @scala.inline
  def apply(renderStatic: js.Function1[js.Function0[java.lang.String], StaticRendererResult]): StyleSheetServerStatic = {
    val __obj = js.Dynamic.literal(renderStatic = renderStatic)
  
    __obj.asInstanceOf[StyleSheetServerStatic]
  }
}

