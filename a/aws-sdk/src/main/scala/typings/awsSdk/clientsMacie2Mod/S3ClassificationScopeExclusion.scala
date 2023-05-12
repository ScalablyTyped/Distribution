package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3ClassificationScopeExclusion extends StObject {
  
  /**
    * An array of strings, one for each S3 bucket that is excluded. Each string is the full name of an excluded bucket.
    */
  var bucketNames: listOfS3BucketName
}
object S3ClassificationScopeExclusion {
  
  inline def apply(bucketNames: listOfS3BucketName): S3ClassificationScopeExclusion = {
    val __obj = js.Dynamic.literal(bucketNames = bucketNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3ClassificationScopeExclusion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: S3ClassificationScopeExclusion] (val x: Self) extends AnyVal {
    
    inline def setBucketNames(value: listOfS3BucketName): Self = StObject.set(x, "bucketNames", value.asInstanceOf[js.Any])
    
    inline def setBucketNamesVarargs(value: S3BucketName*): Self = StObject.set(x, "bucketNames", js.Array(value*))
  }
}
