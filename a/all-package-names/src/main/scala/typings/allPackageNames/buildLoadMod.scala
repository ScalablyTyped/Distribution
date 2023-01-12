package typings.allPackageNames

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildLoadMod {
  
  @JSImport("all-package-names/build/load", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isFresh(param0: Save_): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFresh")(param0.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isFresh(param0: Save_, maxAge: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isFresh")(param0.asInstanceOf[js.Any], maxAge.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def load(): js.Promise[Save_] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")().asInstanceOf[js.Promise[Save_]]
  inline def load(options: LoadOptions): js.Promise[Save_] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Save_]]
  
  inline def save(data: Save_): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("save")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  trait LoadOptions extends StObject {
    
    /**
      * Maximum milliseconds after a sync to avoid re-syncing
      */
    var maxAge: js.UndefOr[Double] = js.undefined
  }
  object LoadOptions {
    
    inline def apply(): LoadOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoadOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LoadOptions] (val x: Self) extends AnyVal {
      
      inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
    }
  }
  
  trait Save_ extends StObject {
    
    /**
      * Array of package names
      */
    var packageNames: js.Array[String]
    
    /**
      * Index of last package synced
      */
    var since: Double
    
    /**
      * Timestamp of last sync
      */
    var timestamp: Double
  }
  object Save_ {
    
    inline def apply(packageNames: js.Array[String], since: Double, timestamp: Double): Save_ = {
      val __obj = js.Dynamic.literal(packageNames = packageNames.asInstanceOf[js.Any], since = since.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[Save_]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Save_] (val x: Self) extends AnyVal {
      
      inline def setPackageNames(value: js.Array[String]): Self = StObject.set(x, "packageNames", value.asInstanceOf[js.Any])
      
      inline def setPackageNamesVarargs(value: String*): Self = StObject.set(x, "packageNames", js.Array(value*))
      
      inline def setSince(value: Double): Self = StObject.set(x, "since", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
}
