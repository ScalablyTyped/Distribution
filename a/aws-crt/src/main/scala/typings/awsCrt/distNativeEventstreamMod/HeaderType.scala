package typings.awsCrt.distNativeEventstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HeaderType extends StObject
@JSImport("aws-crt/dist/native/eventstream", "HeaderType")
@js.native
object HeaderType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HeaderType & Double] = js.native
  
  /** Value is True. No actual value is transmitted on the wire. */
  @js.native
  sealed trait BooleanFalse
    extends StObject
       with HeaderType
  /* 1 */ val BooleanFalse: typings.awsCrt.distNativeEventstreamMod.HeaderType.BooleanFalse & Double = js.native
  
  /** Value is True. No actual value is transmitted on the wire. */
  @js.native
  sealed trait BooleanTrue
    extends StObject
       with HeaderType
  /* 0 */ val BooleanTrue: typings.awsCrt.distNativeEventstreamMod.HeaderType.BooleanTrue & Double = js.native
  
  /** Value is signed 8-bit int. */
  @js.native
  sealed trait Byte
    extends StObject
       with HeaderType
  /* 2 */ val Byte: typings.awsCrt.distNativeEventstreamMod.HeaderType.Byte & Double = js.native
  
  /** Value is raw bytes. */
  @js.native
  sealed trait ByteBuffer
    extends StObject
       with HeaderType
  /* 6 */ val ByteBuffer: typings.awsCrt.distNativeEventstreamMod.HeaderType.ByteBuffer & Double = js.native
  
  /** Value is signed 16-bit int. */
  @js.native
  sealed trait Int16
    extends StObject
       with HeaderType
  /* 3 */ val Int16: typings.awsCrt.distNativeEventstreamMod.HeaderType.Int16 & Double = js.native
  
  /** Value is signed 32-bit int. */
  @js.native
  sealed trait Int32
    extends StObject
       with HeaderType
  /* 4 */ val Int32: typings.awsCrt.distNativeEventstreamMod.HeaderType.Int32 & Double = js.native
  
  /** Value is signed 64-bit int. */
  @js.native
  sealed trait Int64
    extends StObject
       with HeaderType
  /* 5 */ val Int64: typings.awsCrt.distNativeEventstreamMod.HeaderType.Int64 & Double = js.native
  
  /** Value is a str.  Transmitted on the wire as utf-8. */
  @js.native
  sealed trait String
    extends StObject
       with HeaderType
  /* 7 */ val String: typings.awsCrt.distNativeEventstreamMod.HeaderType.String & Double = js.native
  
  /** Value is a posix timestamp (seconds since Unix epoch).  Transmitted on the wire as a 64-bit int. */
  @js.native
  sealed trait Timestamp
    extends StObject
       with HeaderType
  /* 8 */ val Timestamp: typings.awsCrt.distNativeEventstreamMod.HeaderType.Timestamp & Double = js.native
  
  /** Value is a UUID. Transmitted on the wire as 16 bytes. */
  @js.native
  sealed trait UUID
    extends StObject
       with HeaderType
  /* 9 */ val UUID: typings.awsCrt.distNativeEventstreamMod.HeaderType.UUID & Double = js.native
}
