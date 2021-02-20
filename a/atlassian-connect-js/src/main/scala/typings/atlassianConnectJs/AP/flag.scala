package typings.atlassianConnectJs.AP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Flags are the primary method for providing system feedback in the product user interface.
  * Messages include notifications of various kinds: alerts, confirmations, notices, warnings, info and errors.
  */
object flag {
  
  @js.native
  trait Flag extends StObject {
    
    /**
      * Closes the Flag.
      */
    def close(): Unit = js.native
  }
  object Flag {
    
    @scala.inline
    def apply(close: () => Unit): Flag = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close))
      __obj.asInstanceOf[Flag]
    }
    
    @scala.inline
    implicit class FlagMutableBuilder[Self <: Flag] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    }
  }
}
