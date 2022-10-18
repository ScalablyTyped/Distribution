package typings.angularFeatureFlags

import typings.angular.mod.IHttpPromise
import typings.angular.mod.IPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object angularMod {
  
  object featureflags {
    
    trait FeatureFlagsProvider extends StObject {
      
      def setInitialFlags(flags: js.Array[FlagData]): Unit
    }
    object FeatureFlagsProvider {
      
      inline def apply(setInitialFlags: js.Array[FlagData] => Unit): FeatureFlagsProvider = {
        val __obj = js.Dynamic.literal(setInitialFlags = js.Any.fromFunction1(setInitialFlags))
        __obj.asInstanceOf[FeatureFlagsProvider]
      }
      
      extension [Self <: FeatureFlagsProvider](x: Self) {
        
        inline def setSetInitialFlags(value: js.Array[FlagData] => Unit): Self = StObject.set(x, "setInitialFlags", js.Any.fromFunction1(value))
      }
    }
    
    @js.native
    trait FeatureFlagsService extends StObject {
      
      def set(flagsPromise: IHttpPromise[js.Array[FlagData]] | IPromise[js.Array[FlagData]]): Unit = js.native
    }
    
    trait FlagData extends StObject {
      
      /**
        * Boolean value for enabling/disabling the feature
        */
      var active: Boolean
      
      /**
        * A long description of the flag to further explain the feature being toggled
        * (only visible in the list of flags)
        */
      var description: String
      
      /**
        * Unique key that is used from the markup to resolve whether a flag is active or not.
        */
      var key: String
      
      /**
        * A short name of the flag (only visible in the list of flags)
        */
      var name: String
    }
    object FlagData {
      
      inline def apply(active: Boolean, description: String, key: String, name: String): FlagData = {
        val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[FlagData]
      }
      
      extension [Self <: FlagData](x: Self) {
        
        inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
        
        inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      }
    }
  }
}
