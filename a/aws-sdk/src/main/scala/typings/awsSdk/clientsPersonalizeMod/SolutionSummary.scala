package typings.awsSdk.clientsPersonalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SolutionSummary extends StObject {
  
  /**
    * The date and time (in Unix time) that the solution was created.
    */
  var creationDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The date and time (in Unix time) that the solution was last updated.
    */
  var lastUpdatedDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the solution.
    */
  var name: js.UndefOr[Name] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the solution.
    */
  var solutionArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The status of the solution. A solution can be in one of the following states:   CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED   DELETE PENDING &gt; DELETE IN_PROGRESS  
    */
  var status: js.UndefOr[Status] = js.undefined
}
object SolutionSummary {
  
  inline def apply(): SolutionSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SolutionSummary]
  }
  
  extension [Self <: SolutionSummary](x: Self) {
    
    inline def setCreationDateTime(value: js.Date): Self = StObject.set(x, "creationDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreationDateTimeUndefined: Self = StObject.set(x, "creationDateTime", js.undefined)
    
    inline def setLastUpdatedDateTime(value: js.Date): Self = StObject.set(x, "lastUpdatedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedDateTimeUndefined: Self = StObject.set(x, "lastUpdatedDateTime", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSolutionArn(value: Arn): Self = StObject.set(x, "solutionArn", value.asInstanceOf[js.Any])
    
    inline def setSolutionArnUndefined: Self = StObject.set(x, "solutionArn", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
