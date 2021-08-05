package typings.activexExcel.anon

import typings.activexExcel.Excel.Workbook
import typings.activexOffice.Office.MsoSyncEventType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SyncEventType extends StObject {
  
  val SyncEventType: MsoSyncEventType
  
  val Wb: Workbook
}
object SyncEventType {
  
  inline def apply(SyncEventType: MsoSyncEventType, Wb: Workbook): SyncEventType = {
    val __obj = js.Dynamic.literal(SyncEventType = SyncEventType.asInstanceOf[js.Any], Wb = Wb.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyncEventType]
  }
  
  extension [Self <: SyncEventType](x: Self) {
    
    inline def setSyncEventType(value: MsoSyncEventType): Self = StObject.set(x, "SyncEventType", value.asInstanceOf[js.Any])
    
    inline def setWb(value: Workbook): Self = StObject.set(x, "Wb", value.asInstanceOf[js.Any])
  }
}
