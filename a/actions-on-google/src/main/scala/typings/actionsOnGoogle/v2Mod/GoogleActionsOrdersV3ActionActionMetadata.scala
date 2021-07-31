package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsOrdersV3ActionActionMetadata extends StObject {
  
  /**
    * Time when this action will expire.
    */
  var expireTime: js.UndefOr[String] = js.undefined
}
object GoogleActionsOrdersV3ActionActionMetadata {
  
  @scala.inline
  def apply(): GoogleActionsOrdersV3ActionActionMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsOrdersV3ActionActionMetadata]
  }
  
  @scala.inline
  implicit class GoogleActionsOrdersV3ActionActionMetadataMutableBuilder[Self <: GoogleActionsOrdersV3ActionActionMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpireTime(value: String): Self = StObject.set(x, "expireTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpireTimeUndefined: Self = StObject.set(x, "expireTime", js.undefined)
  }
}
