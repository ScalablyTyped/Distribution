package typings.antDesignProUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShowTitle extends StObject {
  
  var showTitle: js.UndefOr[Boolean] = js.undefined
}
object ShowTitle {
  
  inline def apply(): ShowTitle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShowTitle]
  }
  
  extension [Self <: ShowTitle](x: Self) {
    
    inline def setShowTitle(value: Boolean): Self = StObject.set(x, "showTitle", value.asInstanceOf[js.Any])
    
    inline def setShowTitleUndefined: Self = StObject.set(x, "showTitle", js.undefined)
  }
}
