package typings.amazonConnectStreams.connect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MonitoringMode extends StObject
@JSGlobal("connect.MonitoringMode")
@js.native
object MonitoringMode extends StObject {
  
  @js.native
  sealed trait BARGE
    extends StObject
       with MonitoringMode
  
  @js.native
  sealed trait SLIENT_MONITOR
    extends StObject
       with MonitoringMode
}
