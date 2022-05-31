package typings.amplitudeJs

import typings.amplitudeJs.mod.Callback
import typings.amplitudeJs.mod.Config
import typings.amplitudeJs.mod.LogReturn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object amplitude {
    
    @JSGlobal("amplitude")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("amplitude.AmplitudeClient")
    @js.native
    class AmplitudeClient ()
      extends typings.amplitudeJs.mod.AmplitudeClient {
      def this(instanceName: String) = this()
    }
    
    @JSGlobal("amplitude.Identify")
    @js.native
    class Identify_ ()
      extends typings.amplitudeJs.mod.Identify_
    
    @JSGlobal("amplitude.Revenue")
    @js.native
    class Revenue ()
      extends typings.amplitudeJs.mod.Revenue
    
    @JSGlobal("amplitude.__VERSION__")
    @js.native
    val __VERSION__ : String = js.native
    
    inline def clearUserProperties(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearUserProperties")().asInstanceOf[Unit]
    
    inline def getInstance(): typings.amplitudeJs.mod.AmplitudeClient = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[typings.amplitudeJs.mod.AmplitudeClient]
    inline def getInstance(instanceName: String): typings.amplitudeJs.mod.AmplitudeClient = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(instanceName.asInstanceOf[js.Any]).asInstanceOf[typings.amplitudeJs.mod.AmplitudeClient]
    
    inline def getSessionId(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getSessionId")().asInstanceOf[Double]
    
    inline def identify(identify: typings.amplitudeJs.mod.Identify_): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("identify")(identify.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def identify(identify: typings.amplitudeJs.mod.Identify_, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("identify")(identify.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def init(apiKey: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(apiKey.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def init(apiKey: String, userId: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(apiKey.asInstanceOf[js.Any], userId.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def init(
      apiKey: String,
      userId: String,
      options: Unit,
      callback: js.Function1[/* client */ typings.amplitudeJs.mod.AmplitudeClient, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(apiKey.asInstanceOf[js.Any], userId.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def init(apiKey: String, userId: String, options: Config): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(apiKey.asInstanceOf[js.Any], userId.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def init(
      apiKey: String,
      userId: String,
      options: Config,
      callback: js.Function1[/* client */ typings.amplitudeJs.mod.AmplitudeClient, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(apiKey.asInstanceOf[js.Any], userId.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def init(
      apiKey: String,
      userId: Unit,
      options: Unit,
      callback: js.Function1[/* client */ typings.amplitudeJs.mod.AmplitudeClient, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(apiKey.asInstanceOf[js.Any], userId.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def init(apiKey: String, userId: Unit, options: Config): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(apiKey.asInstanceOf[js.Any], userId.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def init(
      apiKey: String,
      userId: Unit,
      options: Config,
      callback: js.Function1[/* client */ typings.amplitudeJs.mod.AmplitudeClient, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(apiKey.asInstanceOf[js.Any], userId.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def isNewSession(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNewSession")().asInstanceOf[Boolean]
    
    inline def logEvent(event: String): LogReturn = ^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(event.asInstanceOf[js.Any]).asInstanceOf[LogReturn]
    inline def logEvent(event: String, data: js.Any): LogReturn = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(event.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[LogReturn]
    inline def logEvent(event: String, data: js.Any, callback: Callback): LogReturn = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(event.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[LogReturn]
    inline def logEvent(event: String, data: Unit, callback: Callback): LogReturn = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(event.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[LogReturn]
    
    inline def logEventWithGroups(event: String): LogReturn = ^.asInstanceOf[js.Dynamic].applyDynamic("logEventWithGroups")(event.asInstanceOf[js.Any]).asInstanceOf[LogReturn]
    inline def logEventWithGroups(event: String, data: js.Any): LogReturn = (^.asInstanceOf[js.Dynamic].applyDynamic("logEventWithGroups")(event.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[LogReturn]
    inline def logEventWithGroups(event: String, data: js.Any, groups: js.Any): LogReturn = (^.asInstanceOf[js.Dynamic].applyDynamic("logEventWithGroups")(event.asInstanceOf[js.Any], data.asInstanceOf[js.Any], groups.asInstanceOf[js.Any])).asInstanceOf[LogReturn]
    inline def logEventWithGroups(event: String, data: js.Any, groups: js.Any, callback: Callback): LogReturn = (^.asInstanceOf[js.Dynamic].applyDynamic("logEventWithGroups")(event.asInstanceOf[js.Any], data.asInstanceOf[js.Any], groups.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[LogReturn]
    inline def logEventWithGroups(event: String, data: js.Any, groups: Unit, callback: Callback): LogReturn = (^.asInstanceOf[js.Dynamic].applyDynamic("logEventWithGroups")(event.asInstanceOf[js.Any], data.asInstanceOf[js.Any], groups.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[LogReturn]
    inline def logEventWithGroups(event: String, data: Unit, groups: js.Any): LogReturn = (^.asInstanceOf[js.Dynamic].applyDynamic("logEventWithGroups")(event.asInstanceOf[js.Any], data.asInstanceOf[js.Any], groups.asInstanceOf[js.Any])).asInstanceOf[LogReturn]
    inline def logEventWithGroups(event: String, data: Unit, groups: js.Any, callback: Callback): LogReturn = (^.asInstanceOf[js.Dynamic].applyDynamic("logEventWithGroups")(event.asInstanceOf[js.Any], data.asInstanceOf[js.Any], groups.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[LogReturn]
    inline def logEventWithGroups(event: String, data: Unit, groups: Unit, callback: Callback): LogReturn = (^.asInstanceOf[js.Dynamic].applyDynamic("logEventWithGroups")(event.asInstanceOf[js.Any], data.asInstanceOf[js.Any], groups.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[LogReturn]
    
    inline def logEventWithTimestamp(event: String): LogReturn = ^.asInstanceOf[js.Dynamic].applyDynamic("logEventWithTimestamp")(event.asInstanceOf[js.Any]).asInstanceOf[LogReturn]
    inline def logEventWithTimestamp(event: String, data: js.Any): LogReturn = (^.asInstanceOf[js.Dynamic].applyDynamic("logEventWithTimestamp")(event.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[LogReturn]
    inline def logEventWithTimestamp(event: String, data: js.Any, timestamp: Double): LogReturn = (^.asInstanceOf[js.Dynamic].applyDynamic("logEventWithTimestamp")(event.asInstanceOf[js.Any], data.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any])).asInstanceOf[LogReturn]
    inline def logEventWithTimestamp(event: String, data: js.Any, timestamp: Double, callback: Callback): LogReturn = (^.asInstanceOf[js.Dynamic].applyDynamic("logEventWithTimestamp")(event.asInstanceOf[js.Any], data.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[LogReturn]
    inline def logEventWithTimestamp(event: String, data: js.Any, timestamp: Unit, callback: Callback): LogReturn = (^.asInstanceOf[js.Dynamic].applyDynamic("logEventWithTimestamp")(event.asInstanceOf[js.Any], data.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[LogReturn]
    inline def logEventWithTimestamp(event: String, data: Unit, timestamp: Double): LogReturn = (^.asInstanceOf[js.Dynamic].applyDynamic("logEventWithTimestamp")(event.asInstanceOf[js.Any], data.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any])).asInstanceOf[LogReturn]
    inline def logEventWithTimestamp(event: String, data: Unit, timestamp: Double, callback: Callback): LogReturn = (^.asInstanceOf[js.Dynamic].applyDynamic("logEventWithTimestamp")(event.asInstanceOf[js.Any], data.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[LogReturn]
    inline def logEventWithTimestamp(event: String, data: Unit, timestamp: Unit, callback: Callback): LogReturn = (^.asInstanceOf[js.Dynamic].applyDynamic("logEventWithTimestamp")(event.asInstanceOf[js.Any], data.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[LogReturn]
    
    inline def logRevenue(pric: Double, quantity: Double, product: String): LogReturn = (^.asInstanceOf[js.Dynamic].applyDynamic("logRevenue")(pric.asInstanceOf[js.Any], quantity.asInstanceOf[js.Any], product.asInstanceOf[js.Any])).asInstanceOf[LogReturn]
    
    inline def logRevenueV2(revenue_obj: typings.amplitudeJs.mod.Revenue): LogReturn = ^.asInstanceOf[js.Dynamic].applyDynamic("logRevenueV2")(revenue_obj.asInstanceOf[js.Any]).asInstanceOf[LogReturn]
    
    @JSGlobal("amplitude.options")
    @js.native
    val options: Config = js.native
    
    inline def regenerateDeviceId(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("regenerateDeviceId")().asInstanceOf[Unit]
    
    inline def setDeviceId(id: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDeviceId")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def setDomain(domain: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDomain")(domain.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def setGlobalUserProperties(properties: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setGlobalUserProperties")(properties.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def setGroup(groupType: String, groupName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setGroup")(groupType.asInstanceOf[js.Any], groupName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def setGroup(groupType: String, groupName: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setGroup")(groupType.asInstanceOf[js.Any], groupName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def setOptOut(optOut: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setOptOut")(optOut.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def setUserId(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setUserId")().asInstanceOf[Unit]
    inline def setUserId(userId: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setUserId")(userId.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def setUserProperties(properties: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setUserProperties")(properties.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def setVersionName(version: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setVersionName")(version.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
