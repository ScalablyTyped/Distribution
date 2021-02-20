package typings.apolloProtobufjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IToJSONOptions extends StObject {
  
  /** Serializes comments. */
  var keepComments: js.UndefOr[Boolean] = js.native
}
object IToJSONOptions {
  
  @scala.inline
  def apply(): IToJSONOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IToJSONOptions]
  }
  
  @scala.inline
  implicit class IToJSONOptionsMutableBuilder[Self <: IToJSONOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeepComments(value: Boolean): Self = StObject.set(x, "keepComments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepCommentsUndefined: Self = StObject.set(x, "keepComments", js.undefined)
  }
}
