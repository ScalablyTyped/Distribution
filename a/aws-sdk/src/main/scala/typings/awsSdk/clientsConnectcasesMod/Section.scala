package typings.awsSdk.clientsConnectcasesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Section extends StObject {
  
  /**
    * Consists of a group of fields and associated properties.
    */
  var fieldGroup: js.UndefOr[FieldGroup] = js.undefined
}
object Section {
  
  inline def apply(): Section = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Section]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Section] (val x: Self) extends AnyVal {
    
    inline def setFieldGroup(value: FieldGroup): Self = StObject.set(x, "fieldGroup", value.asInstanceOf[js.Any])
    
    inline def setFieldGroupUndefined: Self = StObject.set(x, "fieldGroup", js.undefined)
  }
}
