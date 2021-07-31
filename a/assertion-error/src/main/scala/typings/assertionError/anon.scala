package typings.assertionError

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ShowDiff extends StObject {
    
    var showDiff: Boolean
  }
  object ShowDiff {
    
    @scala.inline
    def apply(showDiff: Boolean): ShowDiff = {
      val __obj = js.Dynamic.literal(showDiff = showDiff.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShowDiff]
    }
    
    @scala.inline
    implicit class ShowDiffMutableBuilder[Self <: ShowDiff] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setShowDiff(value: Boolean): Self = StObject.set(x, "showDiff", value.asInstanceOf[js.Any])
    }
  }
}
