package typings.awsCryptoSha256Browser

import typings.awsCryptoSha256Browser.awsCryptoSha256BrowserStrings.`SHA-256`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Name extends StObject {
    
    var name: `SHA-256`
  }
  object Name {
    
    @scala.inline
    def apply(): Name = {
      val __obj = js.Dynamic.literal(name = "SHA-256")
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit class NameMutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: `SHA-256`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
