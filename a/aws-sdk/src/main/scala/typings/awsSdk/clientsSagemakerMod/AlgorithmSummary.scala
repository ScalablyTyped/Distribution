package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlgorithmSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the algorithm.
    */
  var AlgorithmArn: typings.awsSdk.clientsSagemakerMod.AlgorithmArn
  
  /**
    * A brief description of the algorithm.
    */
  var AlgorithmDescription: js.UndefOr[EntityDescription] = js.undefined
  
  /**
    * The name of the algorithm that is described by the summary.
    */
  var AlgorithmName: EntityName
  
  /**
    * The overall status of the algorithm.
    */
  var AlgorithmStatus: typings.awsSdk.clientsSagemakerMod.AlgorithmStatus
  
  /**
    * A timestamp that shows when the algorithm was created.
    */
  var CreationTime: js.Date
}
object AlgorithmSummary {
  
  inline def apply(
    AlgorithmArn: AlgorithmArn,
    AlgorithmName: EntityName,
    AlgorithmStatus: AlgorithmStatus,
    CreationTime: js.Date
  ): AlgorithmSummary = {
    val __obj = js.Dynamic.literal(AlgorithmArn = AlgorithmArn.asInstanceOf[js.Any], AlgorithmName = AlgorithmName.asInstanceOf[js.Any], AlgorithmStatus = AlgorithmStatus.asInstanceOf[js.Any], CreationTime = CreationTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlgorithmSummary]
  }
  
  extension [Self <: AlgorithmSummary](x: Self) {
    
    inline def setAlgorithmArn(value: AlgorithmArn): Self = StObject.set(x, "AlgorithmArn", value.asInstanceOf[js.Any])
    
    inline def setAlgorithmDescription(value: EntityDescription): Self = StObject.set(x, "AlgorithmDescription", value.asInstanceOf[js.Any])
    
    inline def setAlgorithmDescriptionUndefined: Self = StObject.set(x, "AlgorithmDescription", js.undefined)
    
    inline def setAlgorithmName(value: EntityName): Self = StObject.set(x, "AlgorithmName", value.asInstanceOf[js.Any])
    
    inline def setAlgorithmStatus(value: AlgorithmStatus): Self = StObject.set(x, "AlgorithmStatus", value.asInstanceOf[js.Any])
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
  }
}
