package typings.akuminaCore.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AddIn {
  
  @JSImport("akumina-core", "AddIn.Alignment")
  @js.native
  class Alignment () extends StObject
  
  @JSImport("akumina-core", "AddIn.Cache")
  @js.native
  class Cache () extends StObject
  object Cache {
    
    /* static member */
    @JSImport("akumina-core", "AddIn.Cache.Get")
    @js.native
    def Get(m: String): js.Any = js.native
    
    /* static member */
    @JSImport("akumina-core", "AddIn.Cache.Remove")
    @js.native
    def Remove(m: String): Unit = js.native
    
    /* static member */
    @JSImport("akumina-core", "AddIn.Cache.Set")
    @js.native
    def Set(m: String, `object`: js.Any, interval: Double): Unit = js.native
  }
  
  @JSImport("akumina-core", "AddIn.Configuration")
  @js.native
  class Configuration () extends StObject
  object Configuration {
    
    /* static member */
    @JSImport("akumina-core", "AddIn.Configuration.containsInExcludeField")
    @js.native
    def containsInExcludeField(field: String): Boolean = js.native
    
    /* static member */
    @JSImport("akumina-core", "AddIn.Configuration.getSelectFields")
    @js.native
    def getSelectFields(widget: String): js.Array[String] = js.native
  }
  
  @JSImport("akumina-core", "AddIn.Constants")
  @js.native
  class Constants () extends StObject
  object Constants {
    
    @JSImport("akumina-core", "AddIn.Constants")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("akumina-core", "AddIn.Constants.CACHE_EXPIRATION")
    @js.native
    def CACHE_EXPIRATION: Double = js.native
    @scala.inline
    def CACHE_EXPIRATION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CACHE_EXPIRATION")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("akumina-core", "AddIn.Constants.DAY_CACHE_EXPIRATION")
    @js.native
    def DAY_CACHE_EXPIRATION: Double = js.native
    @scala.inline
    def DAY_CACHE_EXPIRATION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DAY_CACHE_EXPIRATION")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("akumina-core", "AddIn.Constants.FOURHOUR_CACHE_EXPIRATION")
    @js.native
    def FOURHOUR_CACHE_EXPIRATION: Double = js.native
    @scala.inline
    def FOURHOUR_CACHE_EXPIRATION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FOURHOUR_CACHE_EXPIRATION")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("akumina-core", "AddIn.Constants.HOUR_CACHE_EXPIRATION")
    @js.native
    def HOUR_CACHE_EXPIRATION: Double = js.native
    @scala.inline
    def HOUR_CACHE_EXPIRATION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HOUR_CACHE_EXPIRATION")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("akumina-core", "AddIn.Constants.LONG_CACHE_EXPIRATION")
    @js.native
    def LONG_CACHE_EXPIRATION: Double = js.native
    @scala.inline
    def LONG_CACHE_EXPIRATION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LONG_CACHE_EXPIRATION")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("akumina-core", "AddIn.Constants.MIN_CACHE_EXPIRATION")
    @js.native
    def MIN_CACHE_EXPIRATION: Double = js.native
    @scala.inline
    def MIN_CACHE_EXPIRATION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIN_CACHE_EXPIRATION")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("akumina-core", "AddIn.Constants.SHORT_CACHE_EXPIRATION")
    @js.native
    def SHORT_CACHE_EXPIRATION: Double = js.native
    @scala.inline
    def SHORT_CACHE_EXPIRATION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHORT_CACHE_EXPIRATION")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("akumina-core", "AddIn.Constants.TWOHOUR_CACHE_EXPIRATION")
    @js.native
    def TWOHOUR_CACHE_EXPIRATION: Double = js.native
    @scala.inline
    def TWOHOUR_CACHE_EXPIRATION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TWOHOUR_CACHE_EXPIRATION")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("akumina-core", "AddIn.GenericListPaging")
  @js.native
  class GenericListPaging () extends StObject
  
  @JSImport("akumina-core", "AddIn.Icons")
  @js.native
  class Icons () extends StObject
  object Icons {
    
    @JSImport("akumina-core", "AddIn.Icons")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("akumina-core", "AddIn.Icons.None")
    @js.native
    def None: String = js.native
    @scala.inline
    def None_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("None")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("akumina-core", "AddIn.Instructions")
  @js.native
  class Instructions () extends StObject {
    
    def executeAsync(widget: js.Any, instructionSet: String, propName: String): js.Promise[_] = js.native
  }
  
  @JSImport("akumina-core", "AddIn.Location")
  @js.native
  class Location () extends StObject
  
  @JSImport("akumina-core", "AddIn.Logger")
  @js.native
  class Logger () extends StObject
  object Logger {
    
    /* static member */
    @JSImport("akumina-core", "AddIn.Logger.StartTraceLog")
    @js.native
    def StartTraceLog(m: String): Unit = js.native
    
    /* static member */
    @JSImport("akumina-core", "AddIn.Logger.StopTraceLog")
    @js.native
    def StopTraceLog(m: String): Unit = js.native
    
    /* static member */
    @JSImport("akumina-core", "AddIn.Logger.WriteErrorLog")
    @js.native
    def WriteErrorLog(m: js.Any): Unit = js.native
    
    /* static member */
    @JSImport("akumina-core", "AddIn.Logger.WriteInfoLog")
    @js.native
    def WriteInfoLog(m: js.Any): Unit = js.native
    
    /* static member */
    @JSImport("akumina-core", "AddIn.Logger.logConnectorCall")
    @js.native
    def logConnectorCall(m: String): Unit = js.native
    
    /* static member */
    @JSImport("akumina-core", "AddIn.Logger.logSPCall")
    @js.native
    def logSPCall(m: String): Unit = js.native
  }
  
  @JSImport("akumina-core", "AddIn.Utilities")
  @js.native
  class Utilities () extends StObject
  object Utilities {
    
    /* static member */
    @JSImport("akumina-core", "AddIn.Utilities.GetFriendlyUrl")
    @js.native
    def GetFriendlyUrl(url: String): String = js.native
    
    /* static member */
    @JSImport("akumina-core", "AddIn.Utilities.GetIcon")
    @js.native
    def GetIcon(iconName: String): String = js.native
    
    /* static member */
    @JSImport("akumina-core", "AddIn.Utilities.IsNullOrEmpty")
    @js.native
    def IsNullOrEmpty(value: String): Boolean = js.native
    
    /* static member */
    @JSImport("akumina-core", "AddIn.Utilities.ItemExpired")
    @js.native
    def ItemExpired(date: String): Boolean = js.native
    
    /* static member */
    @JSImport("akumina-core", "AddIn.Utilities.TryParseInt")
    @js.native
    def TryParseInt(`val`: js.Any, defaultValue: js.Any): Double | Null = js.native
    
    /* static member */
    @JSImport("akumina-core", "AddIn.Utilities.addRecurringEvents")
    @js.native
    def addRecurringEvents(data: js.Any, month: Double, year: Double): js.Any = js.native
    
    /* static member */
    @JSImport("akumina-core", "AddIn.Utilities.getEditMode")
    @js.native
    def getEditMode(): Boolean = js.native
    
    /* static member */
    @JSImport("akumina-core", "AddIn.Utilities.getQueryStringParameter")
    @js.native
    def getQueryStringParameter(url: String): String = js.native
    
    /* static member */
    @JSImport("akumina-core", "AddIn.Utilities.isInDST")
    @js.native
    def isInDST(date: Date): Boolean = js.native
    
    /* static member */
    @JSImport("akumina-core", "AddIn.Utilities.isInMonth")
    @js.native
    def isInMonth(item: js.Any, month: Double, year: Double): js.Any = js.native
    
    /* static member */
    @JSImport("akumina-core", "AddIn.Utilities.setDateValues")
    @js.native
    def setDateValues(data: js.Any, startDate: Date, endDate: Date): js.Any = js.native
    
    /* static member */
    @JSImport("akumina-core", "AddIn.Utilities.substring")
    @js.native
    def substring(str: String, maxChar: Double): String = js.native
  }
}
