package typings.awsSdk.clientsShieldMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttackProperty extends StObject {
  
  /**
    * The type of Shield event that was observed. NETWORK indicates layer 3 and layer 4 events and APPLICATION indicates layer 7 events. For infrastructure layer events (L3 and L4 events), you can view metrics for top contributors in Amazon CloudWatch metrics. For more information, see Shield metrics and alarms in the WAF Developer Guide. 
    */
  var AttackLayer: js.UndefOr[typings.awsSdk.clientsShieldMod.AttackLayer] = js.undefined
  
  /**
    * Defines the Shield event property information that is provided. The WORDPRESS_PINGBACK_REFLECTOR and WORDPRESS_PINGBACK_SOURCE values are valid only for WordPress reflective pingback events.
    */
  var AttackPropertyIdentifier: js.UndefOr[typings.awsSdk.clientsShieldMod.AttackPropertyIdentifier] = js.undefined
  
  /**
    * Contributor objects for the top five contributors to a Shield event. A contributor is a source of traffic that Shield Advanced identifies as responsible for some or all of an event.
    */
  var TopContributors: js.UndefOr[typings.awsSdk.clientsShieldMod.TopContributors] = js.undefined
  
  /**
    * The total contributions made to this Shield event by all contributors.
    */
  var Total: js.UndefOr[Long] = js.undefined
  
  /**
    * The unit used for the Contributor Value property. 
    */
  var Unit: js.UndefOr[typings.awsSdk.clientsShieldMod.Unit] = js.undefined
}
object AttackProperty {
  
  inline def apply(): AttackProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttackProperty]
  }
  
  extension [Self <: AttackProperty](x: Self) {
    
    inline def setAttackLayer(value: AttackLayer): Self = StObject.set(x, "AttackLayer", value.asInstanceOf[js.Any])
    
    inline def setAttackLayerUndefined: Self = StObject.set(x, "AttackLayer", js.undefined)
    
    inline def setAttackPropertyIdentifier(value: AttackPropertyIdentifier): Self = StObject.set(x, "AttackPropertyIdentifier", value.asInstanceOf[js.Any])
    
    inline def setAttackPropertyIdentifierUndefined: Self = StObject.set(x, "AttackPropertyIdentifier", js.undefined)
    
    inline def setTopContributors(value: TopContributors): Self = StObject.set(x, "TopContributors", value.asInstanceOf[js.Any])
    
    inline def setTopContributorsUndefined: Self = StObject.set(x, "TopContributors", js.undefined)
    
    inline def setTopContributorsVarargs(value: Contributor*): Self = StObject.set(x, "TopContributors", js.Array(value*))
    
    inline def setTotal(value: Long): Self = StObject.set(x, "Total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "Total", js.undefined)
    
    inline def setUnit(value: Unit): Self = StObject.set(x, "Unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "Unit", js.undefined)
  }
}
