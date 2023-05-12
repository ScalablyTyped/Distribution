package typings.atlaskitFocusRing

import typings.atlaskitFocusRing.atlaskitFocusRingStrings.off
import typings.atlaskitFocusRing.atlaskitFocusRingStrings.on
import typings.atlaskitFocusRing.distTypesTypesMod.FocusEventHandlers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait FocusProps extends StObject {
    
    val focusProps: FocusEventHandlers
    
    val focusState: on | off
  }
  object FocusProps {
    
    inline def apply(focusProps: FocusEventHandlers, focusState: on | off): FocusProps = {
      val __obj = js.Dynamic.literal(focusProps = focusProps.asInstanceOf[js.Any], focusState = focusState.asInstanceOf[js.Any])
      __obj.asInstanceOf[FocusProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FocusProps] (val x: Self) extends AnyVal {
      
      inline def setFocusProps(value: FocusEventHandlers): Self = StObject.set(x, "focusProps", value.asInstanceOf[js.Any])
      
      inline def setFocusState(value: on | off): Self = StObject.set(x, "focusState", value.asInstanceOf[js.Any])
    }
  }
}
