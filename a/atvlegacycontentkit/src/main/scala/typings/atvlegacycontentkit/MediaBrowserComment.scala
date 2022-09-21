package typings.atvlegacycontentkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A comment on an asset.
  */
// tslint:disable-next-line:strict-export-declare-modifiers
trait MediaBrowserComment extends StObject {
  
  /**
    * The footer of the comment (e.g. the author, or the date).
    */
  var footer: js.UndefOr[String] = js.undefined
  
  /**
    * The main body text of the comment
    */
  var text: String
}
object MediaBrowserComment {
  
  inline def apply(text: String): MediaBrowserComment = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaBrowserComment]
  }
  
  extension [Self <: MediaBrowserComment](x: Self) {
    
    inline def setFooter(value: String): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
