package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BookmarksConfigurations extends StObject {
  
  /**
    * A Boolean value that determines whether a user can bookmark an embedded dashboard.
    */
  var Enabled: Boolean
}
object BookmarksConfigurations {
  
  inline def apply(Enabled: Boolean): BookmarksConfigurations = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[BookmarksConfigurations]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BookmarksConfigurations] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
  }
}
