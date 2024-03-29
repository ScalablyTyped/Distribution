package typings.activexOutlook.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Store extends StObject {
  
  val CommandBar: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Office.CommandBar */ Any
  
  val Store: typings.activexOutlook.Outlook.Store
}
object Store {
  
  inline def apply(
    CommandBar: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Office.CommandBar */ Any,
    Store: typings.activexOutlook.Outlook.Store
  ): Store = {
    val __obj = js.Dynamic.literal(CommandBar = CommandBar.asInstanceOf[js.Any], Store = Store.asInstanceOf[js.Any])
    __obj.asInstanceOf[Store]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Store] (val x: Self) extends AnyVal {
    
    inline def setCommandBar(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Office.CommandBar */ Any
    ): Self = StObject.set(x, "CommandBar", value.asInstanceOf[js.Any])
    
    inline def setStore(value: typings.activexOutlook.Outlook.Store): Self = StObject.set(x, "Store", value.asInstanceOf[js.Any])
  }
}
