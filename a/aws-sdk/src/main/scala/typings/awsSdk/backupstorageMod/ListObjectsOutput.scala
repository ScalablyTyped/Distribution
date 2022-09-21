package typings.awsSdk.backupstorageMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListObjectsOutput extends StObject {
  
  /**
    * Pagination token
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Object list
    */
  var ObjectList: typings.awsSdk.backupstorageMod.ObjectList
}
object ListObjectsOutput {
  
  inline def apply(ObjectList: ObjectList): ListObjectsOutput = {
    val __obj = js.Dynamic.literal(ObjectList = ObjectList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListObjectsOutput]
  }
  
  extension [Self <: ListObjectsOutput](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setObjectList(value: ObjectList): Self = StObject.set(x, "ObjectList", value.asInstanceOf[js.Any])
    
    inline def setObjectListVarargs(value: BackupObject*): Self = StObject.set(x, "ObjectList", js.Array(value*))
  }
}
