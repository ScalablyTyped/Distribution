package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Alias extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) that is assigned to a GameLift alias resource and uniquely identifies it. ARNs are unique across all Regions. Format is arn:aws:gamelift:&lt;region&gt;::alias/alias-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912. In a GameLift alias ARN, the resource ID matches the alias ID value.
    */
  var AliasArn: js.UndefOr[typings.awsSdk.clientsGameliftMod.AliasArn] = js.undefined
  
  /**
    * A unique identifier for the alias. Alias IDs are unique within a Region.
    */
  var AliasId: js.UndefOr[typings.awsSdk.clientsGameliftMod.AliasId] = js.undefined
  
  /**
    * A time stamp indicating when this data object was created. Format is a number expressed in Unix time as milliseconds (for example "1469498468.057").
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A human-readable description of an alias.
    */
  var Description: js.UndefOr[FreeText] = js.undefined
  
  /**
    * The time that this data object was last modified. Format is a number expressed in Unix time as milliseconds (for example "1469498468.057").
    */
  var LastUpdatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A descriptive label that is associated with an alias. Alias names do not need to be unique.
    */
  var Name: js.UndefOr[NonBlankAndLengthConstraintString] = js.undefined
  
  /**
    * The routing configuration, including routing type and fleet target, for the alias. 
    */
  var RoutingStrategy: js.UndefOr[typings.awsSdk.clientsGameliftMod.RoutingStrategy] = js.undefined
}
object Alias {
  
  inline def apply(): Alias = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Alias]
  }
  
  extension [Self <: Alias](x: Self) {
    
    inline def setAliasArn(value: AliasArn): Self = StObject.set(x, "AliasArn", value.asInstanceOf[js.Any])
    
    inline def setAliasArnUndefined: Self = StObject.set(x, "AliasArn", js.undefined)
    
    inline def setAliasId(value: AliasId): Self = StObject.set(x, "AliasId", value.asInstanceOf[js.Any])
    
    inline def setAliasIdUndefined: Self = StObject.set(x, "AliasId", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setDescription(value: FreeText): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setLastUpdatedTime(value: js.Date): Self = StObject.set(x, "LastUpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimeUndefined: Self = StObject.set(x, "LastUpdatedTime", js.undefined)
    
    inline def setName(value: NonBlankAndLengthConstraintString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setRoutingStrategy(value: RoutingStrategy): Self = StObject.set(x, "RoutingStrategy", value.asInstanceOf[js.Any])
    
    inline def setRoutingStrategyUndefined: Self = StObject.set(x, "RoutingStrategy", js.undefined)
  }
}
