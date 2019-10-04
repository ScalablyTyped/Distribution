package typings.akuminaDashCore.akuminaDashCoreMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("akumina-core", "AddIn")
@js.native
object AddInNs extends js.Object {
  @js.native
  class Alignment () extends js.Object
  
  @js.native
  class Cache () extends js.Object
  
  @js.native
  class Configuration () extends js.Object
  
  @js.native
  class Constants () extends js.Object
  
  @js.native
  class GenericListPaging () extends js.Object
  
  @js.native
  class Icons () extends js.Object
  
  @js.native
  class Instructions () extends js.Object {
    def executeAsync(widget: js.Any, instructionSet: String, propName: String): js.Promise[_] = js.native
  }
  
  @js.native
  class Location () extends js.Object
  
  @js.native
  class Logger () extends js.Object
  
  @js.native
  class Utilities () extends js.Object
  
  /* static members */
  @js.native
  object Cache extends js.Object {
    def Get(m: String): js.Any = js.native
    def Remove(m: String): Unit = js.native
    def Set(m: String, `object`: js.Any, interval: Double): Unit = js.native
  }
  
  /* static members */
  @js.native
  object Configuration extends js.Object {
    def containsInExcludeField(field: String): Boolean = js.native
    def getSelectFields(widget: String): js.Array[String] = js.native
  }
  
  /* static members */
  @js.native
  object Constants extends js.Object {
    var CACHE_EXPIRATION: Double = js.native
    var DAY_CACHE_EXPIRATION: Double = js.native
    var FOURHOUR_CACHE_EXPIRATION: Double = js.native
    var HOUR_CACHE_EXPIRATION: Double = js.native
    var LONG_CACHE_EXPIRATION: Double = js.native
    var MIN_CACHE_EXPIRATION: Double = js.native
    var SHORT_CACHE_EXPIRATION: Double = js.native
    var TWOHOUR_CACHE_EXPIRATION: Double = js.native
  }
  
  /* static members */
  @js.native
  object Icons extends js.Object {
    var None: String = js.native
  }
  
  /* static members */
  @js.native
  object Logger extends js.Object {
    def StartTraceLog(m: String): Unit = js.native
    def StopTraceLog(m: String): Unit = js.native
    def WriteErrorLog(m: js.Any): Unit = js.native
    def WriteInfoLog(m: js.Any): Unit = js.native
    def logConnectorCall(m: String): Unit = js.native
    def logSPCall(m: String): Unit = js.native
  }
  
  /* static members */
  @js.native
  object Utilities extends js.Object {
    def GetFriendlyUrl(url: String): String = js.native
    def GetIcon(iconName: String): String = js.native
    def IsNullOrEmpty(value: String): Boolean = js.native
    def ItemExpired(date: String): Boolean = js.native
    def TryParseInt(`val`: js.Any, defaultValue: js.Any): Double | Null = js.native
    def addRecurringEvents(data: js.Any, month: Double, year: Double): js.Any = js.native
    def getEditMode(): Boolean = js.native
    def getQueryStringParameter(url: String): String = js.native
    def isInDST(date: Date): Boolean = js.native
    def isInMonth(item: js.Any, month: Double, year: Double): js.Any = js.native
    def setDateValues(data: js.Any, startDate: Date, endDate: Date): js.Any = js.native
    def substring(str: String, maxChar: Double): String = js.native
  }
  
}

