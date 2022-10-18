package typings.awsSdk.clientsRoute53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollectionSummary extends StObject {
  
  /**
    * The ARN of the collection summary. Can be used to reference the collection in IAM policy or cross-account.
    */
  var Arn: js.UndefOr[ARN] = js.undefined
  
  /**
    * Unique ID for the CIDR collection.
    */
  var Id: js.UndefOr[UUID] = js.undefined
  
  /**
    * The name of a CIDR collection.
    */
  var Name: js.UndefOr[CollectionName] = js.undefined
  
  /**
    * A sequential counter that Route 53 sets to 1 when you create a CIDR collection and increments by 1 each time you update settings for the CIDR collection.
    */
  var Version: js.UndefOr[CollectionVersion] = js.undefined
}
object CollectionSummary {
  
  inline def apply(): CollectionSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionSummary]
  }
  
  extension [Self <: CollectionSummary](x: Self) {
    
    inline def setArn(value: ARN): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setId(value: UUID): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setName(value: CollectionName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setVersion(value: CollectionVersion): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
