package typings.awsSdk.clientsResiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhysicalResourceId extends StObject {
  
  /**
    * The Amazon Web Services account that owns the physical resource.
    */
  var awsAccountId: js.UndefOr[CustomerId] = js.undefined
  
  /**
    * The Amazon Web Services Region that the physical resource is located in.
    */
  var awsRegion: js.UndefOr[AwsRegion] = js.undefined
  
  /**
    * The identifier of the physical resource.
    */
  var identifier: String255
  
  /**
    * Specifies the type of physical resource identifier.  Arn  The resource identifier is an Amazon Resource Name (ARN) .  Native  The resource identifier is a Resilience Hub-native identifier.  
    */
  var `type`: PhysicalIdentifierType
}
object PhysicalResourceId {
  
  inline def apply(identifier: String255, `type`: PhysicalIdentifierType): PhysicalResourceId = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhysicalResourceId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PhysicalResourceId] (val x: Self) extends AnyVal {
    
    inline def setAwsAccountId(value: CustomerId): Self = StObject.set(x, "awsAccountId", value.asInstanceOf[js.Any])
    
    inline def setAwsAccountIdUndefined: Self = StObject.set(x, "awsAccountId", js.undefined)
    
    inline def setAwsRegion(value: AwsRegion): Self = StObject.set(x, "awsRegion", value.asInstanceOf[js.Any])
    
    inline def setAwsRegionUndefined: Self = StObject.set(x, "awsRegion", js.undefined)
    
    inline def setIdentifier(value: String255): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setType(value: PhysicalIdentifierType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
