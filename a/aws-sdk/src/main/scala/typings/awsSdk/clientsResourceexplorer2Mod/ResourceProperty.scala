package typings.awsSdk.clientsResourceexplorer2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceProperty extends StObject {
  
  /**
    * Details about this property. The content of this field is a JSON object that varies based on the resource type.
    */
  var Data: js.UndefOr[Document] = js.undefined
  
  /**
    * The date and time that the information about this resource property was last updated.
    */
  var LastReportedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of this property of the resource.
    */
  var Name: js.UndefOr[String] = js.undefined
}
object ResourceProperty {
  
  inline def apply(): ResourceProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceProperty]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResourceProperty] (val x: Self) extends AnyVal {
    
    inline def setData(value: Document): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "Data", js.undefined)
    
    inline def setLastReportedAt(value: js.Date): Self = StObject.set(x, "LastReportedAt", value.asInstanceOf[js.Any])
    
    inline def setLastReportedAtUndefined: Self = StObject.set(x, "LastReportedAt", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
