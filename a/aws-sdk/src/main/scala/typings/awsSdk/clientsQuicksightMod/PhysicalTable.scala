package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhysicalTable extends StObject {
  
  /**
    * A physical table type built from the results of the custom SQL query.
    */
  var CustomSql: js.UndefOr[typings.awsSdk.clientsQuicksightMod.CustomSql] = js.undefined
  
  /**
    * A physical table type for relational data sources.
    */
  var RelationalTable: js.UndefOr[typings.awsSdk.clientsQuicksightMod.RelationalTable] = js.undefined
  
  /**
    * A physical table type for as S3 data source.
    */
  var S3Source: js.UndefOr[typings.awsSdk.clientsQuicksightMod.S3Source] = js.undefined
}
object PhysicalTable {
  
  inline def apply(): PhysicalTable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhysicalTable]
  }
  
  extension [Self <: PhysicalTable](x: Self) {
    
    inline def setCustomSql(value: CustomSql): Self = StObject.set(x, "CustomSql", value.asInstanceOf[js.Any])
    
    inline def setCustomSqlUndefined: Self = StObject.set(x, "CustomSql", js.undefined)
    
    inline def setRelationalTable(value: RelationalTable): Self = StObject.set(x, "RelationalTable", value.asInstanceOf[js.Any])
    
    inline def setRelationalTableUndefined: Self = StObject.set(x, "RelationalTable", js.undefined)
    
    inline def setS3Source(value: S3Source): Self = StObject.set(x, "S3Source", value.asInstanceOf[js.Any])
    
    inline def setS3SourceUndefined: Self = StObject.set(x, "S3Source", js.undefined)
  }
}
