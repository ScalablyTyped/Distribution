package typings.awsSdk.clientsBackupstorageMod

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
  var ObjectList: typings.awsSdk.clientsBackupstorageMod.ObjectList
}
object ListObjectsOutput {
  
  inline def apply(ObjectList: ObjectList): ListObjectsOutput = {
    val __obj = js.Dynamic.literal(ObjectList = ObjectList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListObjectsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListObjectsOutput] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setObjectList(value: ObjectList): Self = StObject.set(x, "ObjectList", value.asInstanceOf[js.Any])
    
    inline def setObjectListVarargs(value: BackupObject*): Self = StObject.set(x, "ObjectList", js.Array(value*))
  }
}
