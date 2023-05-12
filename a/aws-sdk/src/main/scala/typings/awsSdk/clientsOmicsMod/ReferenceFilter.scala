package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReferenceFilter extends StObject {
  
  /**
    * The filter's start date.
    */
  var createdAfter: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The filter's end date.
    */
  var createdBefore: js.UndefOr[js.Date] = js.undefined
  
  /**
    * An MD5 checksum to filter on.
    */
  var md5: js.UndefOr[Md5] = js.undefined
  
  /**
    * A name to filter on.
    */
  var name: js.UndefOr[ReferenceName] = js.undefined
}
object ReferenceFilter {
  
  inline def apply(): ReferenceFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReferenceFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReferenceFilter] (val x: Self) extends AnyVal {
    
    inline def setCreatedAfter(value: js.Date): Self = StObject.set(x, "createdAfter", value.asInstanceOf[js.Any])
    
    inline def setCreatedAfterUndefined: Self = StObject.set(x, "createdAfter", js.undefined)
    
    inline def setCreatedBefore(value: js.Date): Self = StObject.set(x, "createdBefore", value.asInstanceOf[js.Any])
    
    inline def setCreatedBeforeUndefined: Self = StObject.set(x, "createdBefore", js.undefined)
    
    inline def setMd5(value: Md5): Self = StObject.set(x, "md5", value.asInstanceOf[js.Any])
    
    inline def setMd5Undefined: Self = StObject.set(x, "md5", js.undefined)
    
    inline def setName(value: ReferenceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
