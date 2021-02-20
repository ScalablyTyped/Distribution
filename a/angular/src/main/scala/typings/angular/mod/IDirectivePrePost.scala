package typings.angular.mod

import typings.angular.JQLite
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDirectivePrePost[TScope /* <: IScope */, TElement /* <: JQLite */, TAttributes /* <: IAttributes */, TController /* <: IDirectiveController */] extends StObject {
  
  var post: js.UndefOr[IDirectiveLinkFn[TScope, TElement, TAttributes, TController]] = js.native
  
  var pre: js.UndefOr[IDirectiveLinkFn[TScope, TElement, TAttributes, TController]] = js.native
}
object IDirectivePrePost {
  
  @scala.inline
  def apply[TScope /* <: IScope */, TElement /* <: JQLite */, TAttributes /* <: IAttributes */, TController /* <: IDirectiveController */](): IDirectivePrePost[TScope, TElement, TAttributes, TController] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDirectivePrePost[TScope, TElement, TAttributes, TController]]
  }
  
  @scala.inline
  implicit class IDirectivePrePostMutableBuilder[Self <: IDirectivePrePost[_, _, _, _], TScope /* <: IScope */, TElement /* <: JQLite */, TAttributes /* <: IAttributes */, TController /* <: IDirectiveController */] (val x: Self with (IDirectivePrePost[TScope, TElement, TAttributes, TController])) extends AnyVal {
    
    @scala.inline
    def setPost(
      value: (TScope, TElement, TAttributes, /* controller */ js.UndefOr[TController], /* transclude */ js.UndefOr[ITranscludeFunction]) => Unit
    ): Self = StObject.set(x, "post", js.Any.fromFunction5(value))
    
    @scala.inline
    def setPostUndefined: Self = StObject.set(x, "post", js.undefined)
    
    @scala.inline
    def setPre(
      value: (TScope, TElement, TAttributes, /* controller */ js.UndefOr[TController], /* transclude */ js.UndefOr[ITranscludeFunction]) => Unit
    ): Self = StObject.set(x, "pre", js.Any.fromFunction5(value))
    
    @scala.inline
    def setPreUndefined: Self = StObject.set(x, "pre", js.undefined)
  }
}
