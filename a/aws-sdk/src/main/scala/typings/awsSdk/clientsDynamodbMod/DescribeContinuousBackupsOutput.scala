package typings.awsSdk.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeContinuousBackupsOutput extends StObject {
  
  /**
    * Represents the continuous backups and point in time recovery settings on the table.
    */
  var ContinuousBackupsDescription: js.UndefOr[typings.awsSdk.clientsDynamodbMod.ContinuousBackupsDescription] = js.undefined
}
object DescribeContinuousBackupsOutput {
  
  inline def apply(): DescribeContinuousBackupsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeContinuousBackupsOutput]
  }
  
  extension [Self <: DescribeContinuousBackupsOutput](x: Self) {
    
    inline def setContinuousBackupsDescription(value: ContinuousBackupsDescription): Self = StObject.set(x, "ContinuousBackupsDescription", value.asInstanceOf[js.Any])
    
    inline def setContinuousBackupsDescriptionUndefined: Self = StObject.set(x, "ContinuousBackupsDescription", js.undefined)
  }
}
