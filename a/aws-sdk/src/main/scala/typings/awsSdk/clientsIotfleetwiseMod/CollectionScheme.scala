package typings.awsSdk.clientsIotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollectionScheme extends StObject {
  
  /**
    * Information about a collection scheme that uses a simple logical expression to recognize what data to collect.
    */
  var conditionBasedCollectionScheme: js.UndefOr[ConditionBasedCollectionScheme] = js.undefined
  
  /**
    * Information about a collection scheme that uses a time period to decide how often to collect data.
    */
  var timeBasedCollectionScheme: js.UndefOr[TimeBasedCollectionScheme] = js.undefined
}
object CollectionScheme {
  
  inline def apply(): CollectionScheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionScheme]
  }
  
  extension [Self <: CollectionScheme](x: Self) {
    
    inline def setConditionBasedCollectionScheme(value: ConditionBasedCollectionScheme): Self = StObject.set(x, "conditionBasedCollectionScheme", value.asInstanceOf[js.Any])
    
    inline def setConditionBasedCollectionSchemeUndefined: Self = StObject.set(x, "conditionBasedCollectionScheme", js.undefined)
    
    inline def setTimeBasedCollectionScheme(value: TimeBasedCollectionScheme): Self = StObject.set(x, "timeBasedCollectionScheme", value.asInstanceOf[js.Any])
    
    inline def setTimeBasedCollectionSchemeUndefined: Self = StObject.set(x, "timeBasedCollectionScheme", js.undefined)
  }
}
