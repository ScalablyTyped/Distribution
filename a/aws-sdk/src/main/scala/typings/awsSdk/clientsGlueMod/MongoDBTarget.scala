package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MongoDBTarget extends StObject {
  
  /**
    * The name of the connection to use to connect to the Amazon DocumentDB or MongoDB target.
    */
  var ConnectionName: js.UndefOr[typings.awsSdk.clientsGlueMod.ConnectionName] = js.undefined
  
  /**
    * The path of the Amazon DocumentDB or MongoDB target (database/collection).
    */
  var Path: js.UndefOr[typings.awsSdk.clientsGlueMod.Path] = js.undefined
  
  /**
    * Indicates whether to scan all the records, or to sample rows from the table. Scanning all the records can take a long time when the table is not a high throughput table. A value of true means to scan all records, while a value of false means to sample the records. If no value is specified, the value defaults to true.
    */
  var ScanAll: js.UndefOr[NullableBoolean] = js.undefined
}
object MongoDBTarget {
  
  inline def apply(): MongoDBTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MongoDBTarget]
  }
  
  extension [Self <: MongoDBTarget](x: Self) {
    
    inline def setConnectionName(value: ConnectionName): Self = StObject.set(x, "ConnectionName", value.asInstanceOf[js.Any])
    
    inline def setConnectionNameUndefined: Self = StObject.set(x, "ConnectionName", js.undefined)
    
    inline def setPath(value: Path): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "Path", js.undefined)
    
    inline def setScanAll(value: NullableBoolean): Self = StObject.set(x, "ScanAll", value.asInstanceOf[js.Any])
    
    inline def setScanAllUndefined: Self = StObject.set(x, "ScanAll", js.undefined)
  }
}
