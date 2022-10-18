package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3JobDefinition extends StObject {
  
  /**
    * The property- and tag-based conditions that determine which S3 buckets to include or exclude from the analysis. Each time the job runs, the job uses these criteria to determine which buckets contain objects to analyze. A job's definition can contain a bucketCriteria object or a bucketDefinitions array, not both.
    */
  var bucketCriteria: js.UndefOr[S3BucketCriteriaForJob] = js.undefined
  
  /**
    * An array of objects, one for each Amazon Web Services account that owns specific S3 buckets to analyze. Each object specifies the account ID for an account and one or more buckets to analyze for that account. A job's definition can contain a bucketDefinitions array or a bucketCriteria object, not both.
    */
  var bucketDefinitions: js.UndefOr[listOfS3BucketDefinitionForJob] = js.undefined
  
  /**
    * The property- and tag-based conditions that determine which S3 objects to include or exclude from the analysis. Each time the job runs, the job uses these criteria to determine which objects to analyze.
    */
  var scoping: js.UndefOr[Scoping] = js.undefined
}
object S3JobDefinition {
  
  inline def apply(): S3JobDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3JobDefinition]
  }
  
  extension [Self <: S3JobDefinition](x: Self) {
    
    inline def setBucketCriteria(value: S3BucketCriteriaForJob): Self = StObject.set(x, "bucketCriteria", value.asInstanceOf[js.Any])
    
    inline def setBucketCriteriaUndefined: Self = StObject.set(x, "bucketCriteria", js.undefined)
    
    inline def setBucketDefinitions(value: listOfS3BucketDefinitionForJob): Self = StObject.set(x, "bucketDefinitions", value.asInstanceOf[js.Any])
    
    inline def setBucketDefinitionsUndefined: Self = StObject.set(x, "bucketDefinitions", js.undefined)
    
    inline def setBucketDefinitionsVarargs(value: S3BucketDefinitionForJob*): Self = StObject.set(x, "bucketDefinitions", js.Array(value*))
    
    inline def setScoping(value: Scoping): Self = StObject.set(x, "scoping", value.asInstanceOf[js.Any])
    
    inline def setScopingUndefined: Self = StObject.set(x, "scoping", js.undefined)
  }
}
