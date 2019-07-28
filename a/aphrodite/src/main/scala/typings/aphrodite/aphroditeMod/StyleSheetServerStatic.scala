package typings.aphrodite.aphroditeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Utilities for using Aphrodite server-side.
  */
trait StyleSheetServerStatic extends js.Object {
  def renderStatic(renderFunc: js.Function0[String]): StaticRendererResult
}

object StyleSheetServerStatic {
  @scala.inline
  def apply(renderStatic: js.Function0[String] => StaticRendererResult): StyleSheetServerStatic = {
    val __obj = js.Dynamic.literal(renderStatic = js.Any.fromFunction1(renderStatic))
  
    __obj.asInstanceOf[StyleSheetServerStatic]
  }
}

