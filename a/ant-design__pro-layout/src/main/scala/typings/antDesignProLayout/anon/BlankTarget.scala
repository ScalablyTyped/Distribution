package typings.antDesignProLayout.anon

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlankTarget extends StObject {
  
  var blankTarget: js.UndefOr[Boolean] = js.undefined
  
  var href: String
  
  var key: js.UndefOr[String] = js.undefined
  
  var title: ReactNode
}
object BlankTarget {
  
  inline def apply(href: String): BlankTarget = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlankTarget]
  }
  
  extension [Self <: BlankTarget](x: Self) {
    
    inline def setBlankTarget(value: Boolean): Self = StObject.set(x, "blankTarget", value.asInstanceOf[js.Any])
    
    inline def setBlankTargetUndefined: Self = StObject.set(x, "blankTarget", js.undefined)
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
