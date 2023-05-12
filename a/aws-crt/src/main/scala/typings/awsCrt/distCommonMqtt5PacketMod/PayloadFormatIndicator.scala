package typings.awsCrt.distCommonMqtt5PacketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PayloadFormatIndicator extends StObject
@JSImport("aws-crt/dist/common/mqtt5_packet", "PayloadFormatIndicator")
@js.native
object PayloadFormatIndicator extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PayloadFormatIndicator & Double] = js.native
  
  /**
    * The payload is arbitrary binary data
    */
  @js.native
  sealed trait Bytes
    extends StObject
       with PayloadFormatIndicator
  /* 0 */ val Bytes: typings.awsCrt.distCommonMqtt5PacketMod.PayloadFormatIndicator.Bytes & Double = js.native
  
  /**
    * The payload is a well-formed utf-8 string value.
    */
  @js.native
  sealed trait Utf8
    extends StObject
       with PayloadFormatIndicator
  /* 1 */ val Utf8: typings.awsCrt.distCommonMqtt5PacketMod.PayloadFormatIndicator.Utf8 & Double = js.native
}
