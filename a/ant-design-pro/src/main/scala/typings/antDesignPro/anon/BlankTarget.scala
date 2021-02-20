package typings.antDesignPro.anon

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlankTarget extends StObject {
  
  var blankTarget: js.UndefOr[Boolean] = js.native
  
  var href: String = js.native
  
  var key: js.UndefOr[String] = js.native
  
  var title: ReactNode = js.native
}
object BlankTarget {
  
  @scala.inline
  def apply(href: String): BlankTarget = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlankTarget]
  }
  
  @scala.inline
  implicit class BlankTargetMutableBuilder[Self <: BlankTarget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlankTarget(value: Boolean): Self = StObject.set(x, "blankTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlankTargetUndefined: Self = StObject.set(x, "blankTarget", js.undefined)
    
    @scala.inline
    def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
