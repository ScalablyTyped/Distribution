package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSource extends StObject {
  
  /**
    * An Glue table.
    */
  var GlueTable: typings.awsSdk.clientsGlueMod.GlueTable
}
object DataSource {
  
  inline def apply(GlueTable: GlueTable): DataSource = {
    val __obj = js.Dynamic.literal(GlueTable = GlueTable.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataSource] (val x: Self) extends AnyVal {
    
    inline def setGlueTable(value: GlueTable): Self = StObject.set(x, "GlueTable", value.asInstanceOf[js.Any])
  }
}
