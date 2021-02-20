package typings.angularFormly.AngularFormly

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISelectOption
  extends /* key */ StringDictionary[js.Any] {
  
  var group: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var value: js.UndefOr[String] = js.native
}
object ISelectOption {
  
  @scala.inline
  def apply(): ISelectOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISelectOption]
  }
  
  @scala.inline
  implicit class ISelectOptionMutableBuilder[Self <: ISelectOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
