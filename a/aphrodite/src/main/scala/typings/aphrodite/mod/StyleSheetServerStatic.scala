package typings.aphrodite.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Utilities for using Aphrodite server-side.
  */
@js.native
trait StyleSheetServerStatic extends js.Object {
  
  def renderStatic(renderFunc: js.Function0[String]): StaticRendererResult = js.native
}
object StyleSheetServerStatic {
  
  @scala.inline
  def apply(renderStatic: js.Function0[String] => StaticRendererResult): StyleSheetServerStatic = {
    val __obj = js.Dynamic.literal(renderStatic = js.Any.fromFunction1(renderStatic))
    __obj.asInstanceOf[StyleSheetServerStatic]
  }
  
  @scala.inline
  implicit class StyleSheetServerStaticOps[Self <: StyleSheetServerStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRenderStatic(value: js.Function0[String] => StaticRendererResult): Self = this.set("renderStatic", js.Any.fromFunction1(value))
  }
}
