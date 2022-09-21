package typings.agoraRtcSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AREAS extends StObject
/**
  * Regions for the connection in {@link ClientConfig.areaCode}.
  */
@JSImport("agora-rtc-sdk", "AREAS")
@js.native
object AREAS extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AREAS & String] = js.native
  
  /**
    * Asia, excluding Mainland China.
    */
  @js.native
  sealed trait ASIA
    extends StObject
       with AREAS
  /* "ASIA" */ val ASIA: typings.agoraRtcSdk.mod.AREAS.ASIA & String = js.native
  
  /**
    * China.
    */
  @js.native
  sealed trait CHINA
    extends StObject
       with AREAS
  /* "CHINA" */ val CHINA: typings.agoraRtcSdk.mod.AREAS.CHINA & String = js.native
  
  /**
    * Europe.
    */
  @js.native
  sealed trait EUROPE
    extends StObject
       with AREAS
  /* "EUROPE" */ val EUROPE: typings.agoraRtcSdk.mod.AREAS.EUROPE & String = js.native
  
  /**
    * Global.
    */
  @js.native
  sealed trait GLOBAL
    extends StObject
       with AREAS
  /* "GLOBAL" */ val GLOBAL: typings.agoraRtcSdk.mod.AREAS.GLOBAL & String = js.native
  
  /**
    * India.
    */
  @js.native
  sealed trait INDIA
    extends StObject
       with AREAS
  /* "INDIA" */ val INDIA: typings.agoraRtcSdk.mod.AREAS.INDIA & String = js.native
  
  /**
    * Japan.
    */
  @js.native
  sealed trait JAPAN
    extends StObject
       with AREAS
  /* "JAPAN" */ val JAPAN: typings.agoraRtcSdk.mod.AREAS.JAPAN & String = js.native
  
  /**
    * North America.
    */
  @js.native
  sealed trait NORTH_AMERICA
    extends StObject
       with AREAS
  /* "NORTH_AMERICA" */ val NORTH_AMERICA: typings.agoraRtcSdk.mod.AREAS.NORTH_AMERICA & String = js.native
}
