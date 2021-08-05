package typings.agenda

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Address extends StObject {
    
    /**
      * The connection URL.
      * Required when using `db` option to connect.
      * Not required when an existing connection is passed as `mongo` property.
      */
    var address: js.UndefOr[String] = js.undefined
    
    /**
      * The name of the collection to use.
      */
    var collection: js.UndefOr[String] = js.undefined
    
    /**
      * Connection options to pass to MongoDB.
      * Not required when an existing connection is passed as `mongo` property.
      */
    var options: js.UndefOr[js.Any] = js.undefined
  }
  object Address {
    
    inline def apply(): Address = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Address]
    }
    
    extension [Self <: Address](x: Self) {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
      
      inline def setCollection(value: String): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
      
      inline def setCollectionUndefined: Self = StObject.set(x, "collection", js.undefined)
      
      inline def setOptions(value: js.Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
  
  trait InsertOnly extends StObject {
    
    var insertOnly: js.UndefOr[Boolean] = js.undefined
  }
  object InsertOnly {
    
    inline def apply(): InsertOnly = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InsertOnly]
    }
    
    extension [Self <: InsertOnly](x: Self) {
      
      inline def setInsertOnly(value: Boolean): Self = StObject.set(x, "insertOnly", value.asInstanceOf[js.Any])
      
      inline def setInsertOnlyUndefined: Self = StObject.set(x, "insertOnly", js.undefined)
    }
  }
  
  trait SkipImmediate extends StObject {
    
    var skipImmediate: js.UndefOr[Boolean] = js.undefined
    
    var timezone: js.UndefOr[String] = js.undefined
  }
  object SkipImmediate {
    
    inline def apply(): SkipImmediate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SkipImmediate]
    }
    
    extension [Self <: SkipImmediate](x: Self) {
      
      inline def setSkipImmediate(value: Boolean): Self = StObject.set(x, "skipImmediate", value.asInstanceOf[js.Any])
      
      inline def setSkipImmediateUndefined: Self = StObject.set(x, "skipImmediate", js.undefined)
      
      inline def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
      
      inline def setTimezoneUndefined: Self = StObject.set(x, "timezone", js.undefined)
    }
  }
}
