package typings.apolloProtobufjs.descriptorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMessageOptions extends StObject {
  
  var mapEntry: js.UndefOr[Boolean] = js.native
}
object IMessageOptions {
  
  @scala.inline
  def apply(): IMessageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMessageOptions]
  }
  
  @scala.inline
  implicit class IMessageOptionsMutableBuilder[Self <: IMessageOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMapEntry(value: Boolean): Self = StObject.set(x, "mapEntry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapEntryUndefined: Self = StObject.set(x, "mapEntry", js.undefined)
  }
}
