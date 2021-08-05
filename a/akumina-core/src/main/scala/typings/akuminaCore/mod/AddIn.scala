package typings.akuminaCore.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AddIn {
  
  @JSImport("akumina-core", "AddIn.Alignment")
  @js.native
  class Alignment () extends StObject
  
  @JSImport("akumina-core", "AddIn.Cache")
  @js.native
  class Cache () extends StObject
  object Cache {
    
    @JSImport("akumina-core", "AddIn.Cache")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def Get(m: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("Get")(m.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /* static member */
    inline def Remove(m: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Remove")(m.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /* static member */
    inline def Set(m: String, `object`: js.Any, interval: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Set")(m.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], interval.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @JSImport("akumina-core", "AddIn.Configuration")
  @js.native
  class Configuration () extends StObject
  object Configuration {
    
    @JSImport("akumina-core", "AddIn.Configuration")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def containsInExcludeField(field: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("containsInExcludeField")(field.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /* static member */
    inline def getSelectFields(widget: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSelectFields")(widget.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
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
    inline def CACHE_EXPIRATION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CACHE_EXPIRATION")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("akumina-core", "AddIn.Constants.DAY_CACHE_EXPIRATION")
    @js.native
    def DAY_CACHE_EXPIRATION: Double = js.native
    inline def DAY_CACHE_EXPIRATION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DAY_CACHE_EXPIRATION")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("akumina-core", "AddIn.Constants.FOURHOUR_CACHE_EXPIRATION")
    @js.native
    def FOURHOUR_CACHE_EXPIRATION: Double = js.native
    inline def FOURHOUR_CACHE_EXPIRATION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FOURHOUR_CACHE_EXPIRATION")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("akumina-core", "AddIn.Constants.HOUR_CACHE_EXPIRATION")
    @js.native
    def HOUR_CACHE_EXPIRATION: Double = js.native
    inline def HOUR_CACHE_EXPIRATION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HOUR_CACHE_EXPIRATION")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("akumina-core", "AddIn.Constants.LONG_CACHE_EXPIRATION")
    @js.native
    def LONG_CACHE_EXPIRATION: Double = js.native
    inline def LONG_CACHE_EXPIRATION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LONG_CACHE_EXPIRATION")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("akumina-core", "AddIn.Constants.MIN_CACHE_EXPIRATION")
    @js.native
    def MIN_CACHE_EXPIRATION: Double = js.native
    inline def MIN_CACHE_EXPIRATION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIN_CACHE_EXPIRATION")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("akumina-core", "AddIn.Constants.SHORT_CACHE_EXPIRATION")
    @js.native
    def SHORT_CACHE_EXPIRATION: Double = js.native
    inline def SHORT_CACHE_EXPIRATION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHORT_CACHE_EXPIRATION")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("akumina-core", "AddIn.Constants.TWOHOUR_CACHE_EXPIRATION")
    @js.native
    def TWOHOUR_CACHE_EXPIRATION: Double = js.native
    inline def TWOHOUR_CACHE_EXPIRATION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TWOHOUR_CACHE_EXPIRATION")(x.asInstanceOf[js.Any])
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
    inline def None_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("None")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("akumina-core", "AddIn.Instructions")
  @js.native
  class Instructions () extends StObject {
    
    def executeAsync(widget: js.Any, instructionSet: String, propName: String): js.Promise[js.Any] = js.native
  }
  
  @JSImport("akumina-core", "AddIn.Location")
  @js.native
  class Location () extends StObject
  
  @JSImport("akumina-core", "AddIn.Logger")
  @js.native
  class Logger () extends StObject
  object Logger {
    
    @JSImport("akumina-core", "AddIn.Logger")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def StartTraceLog(m: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("StartTraceLog")(m.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /* static member */
    inline def StopTraceLog(m: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("StopTraceLog")(m.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /* static member */
    inline def WriteErrorLog(m: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("WriteErrorLog")(m.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /* static member */
    inline def WriteInfoLog(m: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("WriteInfoLog")(m.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /* static member */
    inline def logConnectorCall(m: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logConnectorCall")(m.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /* static member */
    inline def logSPCall(m: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logSPCall")(m.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @JSImport("akumina-core", "AddIn.Utilities")
  @js.native
  class Utilities () extends StObject
  object Utilities {
    
    @JSImport("akumina-core", "AddIn.Utilities")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def GetFriendlyUrl(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("GetFriendlyUrl")(url.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /* static member */
    inline def GetIcon(iconName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("GetIcon")(iconName.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /* static member */
    inline def IsNullOrEmpty(value: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsNullOrEmpty")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /* static member */
    inline def ItemExpired(date: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("ItemExpired")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /* static member */
    inline def TryParseInt(`val`: js.Any, defaultValue: js.Any): Double | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("TryParseInt")(`val`.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Double | Null]
    
    /* static member */
    inline def addRecurringEvents(data: js.Any, month: Double, year: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addRecurringEvents")(data.asInstanceOf[js.Any], month.asInstanceOf[js.Any], year.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    /* static member */
    inline def getEditMode(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getEditMode")().asInstanceOf[Boolean]
    
    /* static member */
    inline def getQueryStringParameter(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getQueryStringParameter")(url.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /* static member */
    inline def isInDST(date: Date): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInDST")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /* static member */
    inline def isInMonth(item: js.Any, month: Double, year: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isInMonth")(item.asInstanceOf[js.Any], month.asInstanceOf[js.Any], year.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    /* static member */
    inline def setDateValues(data: js.Any, startDate: Date, endDate: Date): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setDateValues")(data.asInstanceOf[js.Any], startDate.asInstanceOf[js.Any], endDate.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    /* static member */
    inline def substring(str: String, maxChar: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("substring")(str.asInstanceOf[js.Any], maxChar.asInstanceOf[js.Any])).asInstanceOf[String]
  }
}
