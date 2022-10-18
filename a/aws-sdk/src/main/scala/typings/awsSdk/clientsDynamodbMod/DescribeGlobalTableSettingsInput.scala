package typings.awsSdk.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeGlobalTableSettingsInput extends StObject {
  
  /**
    * The name of the global table to describe.
    */
  var GlobalTableName: TableName
}
object DescribeGlobalTableSettingsInput {
  
  inline def apply(GlobalTableName: TableName): DescribeGlobalTableSettingsInput = {
    val __obj = js.Dynamic.literal(GlobalTableName = GlobalTableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeGlobalTableSettingsInput]
  }
  
  extension [Self <: DescribeGlobalTableSettingsInput](x: Self) {
    
    inline def setGlobalTableName(value: TableName): Self = StObject.set(x, "GlobalTableName", value.asInstanceOf[js.Any])
  }
}
