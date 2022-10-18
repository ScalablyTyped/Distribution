package typings.awsSdk.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateContinuousBackupsInput extends StObject {
  
  /**
    * Represents the settings used to enable point in time recovery.
    */
  var PointInTimeRecoverySpecification: typings.awsSdk.clientsDynamodbMod.PointInTimeRecoverySpecification
  
  /**
    * The name of the table.
    */
  var TableName: typings.awsSdk.clientsDynamodbMod.TableName
}
object UpdateContinuousBackupsInput {
  
  inline def apply(PointInTimeRecoverySpecification: PointInTimeRecoverySpecification, TableName: TableName): UpdateContinuousBackupsInput = {
    val __obj = js.Dynamic.literal(PointInTimeRecoverySpecification = PointInTimeRecoverySpecification.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateContinuousBackupsInput]
  }
  
  extension [Self <: UpdateContinuousBackupsInput](x: Self) {
    
    inline def setPointInTimeRecoverySpecification(value: PointInTimeRecoverySpecification): Self = StObject.set(x, "PointInTimeRecoverySpecification", value.asInstanceOf[js.Any])
    
    inline def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
  }
}
