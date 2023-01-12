package typings.awsSdk.clientsDirectoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEventTopicsRequest extends StObject {
  
  /**
    * The Directory ID for which to get the list of associated Amazon SNS topics. If this member is null, associations for all Directory IDs are returned.
    */
  var DirectoryId: js.UndefOr[typings.awsSdk.clientsDirectoryserviceMod.DirectoryId] = js.undefined
  
  /**
    * A list of Amazon SNS topic names for which to obtain the information. If this member is null, all associations for the specified Directory ID are returned. An empty list results in an InvalidParameterException being thrown.
    */
  var TopicNames: js.UndefOr[typings.awsSdk.clientsDirectoryserviceMod.TopicNames] = js.undefined
}
object DescribeEventTopicsRequest {
  
  inline def apply(): DescribeEventTopicsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEventTopicsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeEventTopicsRequest] (val x: Self) extends AnyVal {
    
    inline def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    inline def setDirectoryIdUndefined: Self = StObject.set(x, "DirectoryId", js.undefined)
    
    inline def setTopicNames(value: TopicNames): Self = StObject.set(x, "TopicNames", value.asInstanceOf[js.Any])
    
    inline def setTopicNamesUndefined: Self = StObject.set(x, "TopicNames", js.undefined)
    
    inline def setTopicNamesVarargs(value: TopicName*): Self = StObject.set(x, "TopicNames", js.Array(value*))
  }
}
