package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sheet extends StObject {
  
  /**
    * The name of a sheet. This name is displayed on the sheet's tab in the Amazon QuickSight console.
    */
  var Name: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The unique identifier associated with a sheet.
    */
  var SheetId: js.UndefOr[RestrictiveResourceId] = js.undefined
}
object Sheet {
  
  inline def apply(): Sheet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Sheet]
  }
  
  extension [Self <: Sheet](x: Self) {
    
    inline def setName(value: NonEmptyString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setSheetId(value: RestrictiveResourceId): Self = StObject.set(x, "SheetId", value.asInstanceOf[js.Any])
    
    inline def setSheetIdUndefined: Self = StObject.set(x, "SheetId", js.undefined)
  }
}
