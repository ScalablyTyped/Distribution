package typings.admZip.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<adm-zip.adm-zip.InitOptions> */
trait PartialInitOptions extends StObject {
  
  var fs: js.UndefOr[Null | TypeofFS] = js.undefined
  
  var method: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 61 */ Any
  ] = js.undefined
  
  var noSort: js.UndefOr[Boolean] = js.undefined
  
  var readEntries: js.UndefOr[Boolean] = js.undefined
}
object PartialInitOptions {
  
  inline def apply(): PartialInitOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialInitOptions]
  }
  
  extension [Self <: PartialInitOptions](x: Self) {
    
    inline def setFs(value: TypeofFS): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
    
    inline def setFsNull: Self = StObject.set(x, "fs", null)
    
    inline def setFsUndefined: Self = StObject.set(x, "fs", js.undefined)
    
    inline def setMethod(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 61 */ Any): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setNoSort(value: Boolean): Self = StObject.set(x, "noSort", value.asInstanceOf[js.Any])
    
    inline def setNoSortUndefined: Self = StObject.set(x, "noSort", js.undefined)
    
    inline def setReadEntries(value: Boolean): Self = StObject.set(x, "readEntries", value.asInstanceOf[js.Any])
    
    inline def setReadEntriesUndefined: Self = StObject.set(x, "readEntries", js.undefined)
  }
}
