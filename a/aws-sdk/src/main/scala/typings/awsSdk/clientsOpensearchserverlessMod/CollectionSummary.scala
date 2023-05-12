package typings.awsSdk.clientsOpensearchserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollectionSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the collection.
    */
  var arn: js.UndefOr[String] = js.undefined
  
  /**
    * The unique identifier of the collection.
    */
  var id: js.UndefOr[CollectionId] = js.undefined
  
  /**
    * The name of the collection.
    */
  var name: js.UndefOr[CollectionName] = js.undefined
  
  /**
    * The current status of the collection.
    */
  var status: js.UndefOr[CollectionStatus] = js.undefined
}
object CollectionSummary {
  
  inline def apply(): CollectionSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CollectionSummary] (val x: Self) extends AnyVal {
    
    inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setId(value: CollectionId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: CollectionName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStatus(value: CollectionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
