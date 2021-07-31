package typings.asn1

import typings.asn1.anon.GrowthFactor
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object Ber {
    
    @JSImport("asn1", "Ber.BMPString")
    @js.native
    val BMPString: Double = js.native
    
    @JSImport("asn1", "Ber.BitString")
    @js.native
    val BitString: Double = js.native
    
    @JSImport("asn1", "Ber.Boolean")
    @js.native
    val Boolean: Double = js.native
    
    @JSImport("asn1", "Ber.CharacterString")
    @js.native
    val CharacterString: Double = js.native
    
    @JSImport("asn1", "Ber.Constructor")
    @js.native
    val Constructor: Double = js.native
    
    @JSImport("asn1", "Ber.Context")
    @js.native
    val Context: Double = js.native
    
    @JSImport("asn1", "Ber.EOC")
    @js.native
    val EOC: Double = js.native
    
    @JSImport("asn1", "Ber.Enumeration")
    @js.native
    val Enumeration: Double = js.native
    
    @JSImport("asn1", "Ber.External")
    @js.native
    val External: Double = js.native
    
    @JSImport("asn1", "Ber.GeneralString")
    @js.native
    val GeneralString: Double = js.native
    
    @JSImport("asn1", "Ber.GeneralizedTime")
    @js.native
    val GeneralizedTime: Double = js.native
    
    @JSImport("asn1", "Ber.GraphicString")
    @js.native
    val GraphicString: Double = js.native
    
    @JSImport("asn1", "Ber.IA5String")
    @js.native
    val IA5String: Double = js.native
    
    @JSImport("asn1", "Ber.Integer")
    @js.native
    val Integer: Double = js.native
    
    @JSImport("asn1", "Ber.Null")
    @js.native
    val Null: Double = js.native
    
    @JSImport("asn1", "Ber.NumericString")
    @js.native
    val NumericString: Double = js.native
    
    @JSImport("asn1", "Ber.OID")
    @js.native
    val OID: Double = js.native
    
    @JSImport("asn1", "Ber.ObjectDescriptor")
    @js.native
    val ObjectDescriptor: Double = js.native
    
    @JSImport("asn1", "Ber.OctetString")
    @js.native
    val OctetString: Double = js.native
    
    @JSImport("asn1", "Ber.PDV")
    @js.native
    val PDV: Double = js.native
    
    @JSImport("asn1", "Ber.PrintableString")
    @js.native
    val PrintableString: Double = js.native
    
    @JSImport("asn1", "Ber.Real")
    @js.native
    val Real: Double = js.native
    
    @JSImport("asn1", "Ber.RelativeOID")
    @js.native
    val RelativeOID: Double = js.native
    
    @JSImport("asn1", "Ber.Sequence")
    @js.native
    val Sequence: Double = js.native
    
    @JSImport("asn1", "Ber.Set")
    @js.native
    val Set: Double = js.native
    
    @JSImport("asn1", "Ber.T61String")
    @js.native
    val T61String: Double = js.native
    
    @JSImport("asn1", "Ber.UTCTime")
    @js.native
    val UTCTime: Double = js.native
    
    @JSImport("asn1", "Ber.UniversalString")
    @js.native
    val UniversalString: Double = js.native
    
    @JSImport("asn1", "Ber.Utf8String")
    @js.native
    val Utf8String: Double = js.native
    
    @JSImport("asn1", "Ber.VideotexString")
    @js.native
    val VideotexString: Double = js.native
    
    @JSImport("asn1", "Ber.VisibleString")
    @js.native
    val VisibleString: Double = js.native
  }
  
  @JSImport("asn1", "BerReader")
  @js.native
  class BerReader protected () extends StObject {
    def this(data: Buffer) = this()
    
    val _buf: Buffer = js.native
    
    var _offset: Double = js.native
    
    def _readTag(): Double = js.native
    def _readTag(tag: Double): Double = js.native
    
    var _size: Double = js.native
    
    val buffer: Buffer = js.native
    
    val length: Double = js.native
    
    val offset: Double = js.native
    
    def peek(): Double | Null = js.native
    
    def readBoolean(): Boolean = js.native
    
    def readByte(peek: Boolean): Double | Null = js.native
    
    def readEnumeration(): Double = js.native
    
    def readInt(): Double = js.native
    
    def readLength(): Double = js.native
    def readLength(offset: Double): Double = js.native
    
    def readOID(): String = js.native
    def readOID(tag: Double): String = js.native
    
    def readSequence(): Double | Null = js.native
    def readSequence(tag: Double): Double | Null = js.native
    
    def readString(): String = js.native
    def readString(tag: Double): String = js.native
    def readString(tag: Double, retbuf: Boolean): Buffer = js.native
    
    val remain: Double = js.native
  }
  
  @JSImport("asn1", "BerWriter")
  @js.native
  class BerWriter () extends StObject {
    def this(options: GrowthFactor) = this()
    
    val _buf: Buffer = js.native
    
    def _ensure(length: Double): Unit = js.native
    
    var _offset: Double = js.native
    
    val _size: Double = js.native
    
    val buffer: Buffer = js.native
    
    def endSequence(): Unit = js.native
    
    def startSequence(): Unit = js.native
    def startSequence(tag: Double): Unit = js.native
    
    def writeBoolean(b: Boolean): Unit = js.native
    def writeBoolean(b: Boolean, tag: Double): Unit = js.native
    
    def writeBuffer(buf: Buffer, tag: Double): Unit = js.native
    
    def writeByte(b: Double): Unit = js.native
    
    def writeEnumeration(i: Double): Unit = js.native
    def writeEnumeration(i: Double, tag: Double): Unit = js.native
    
    def writeInt(i: Double): Unit = js.native
    def writeInt(i: Double, tag: Double): Unit = js.native
    
    def writeLength(len: Double): Unit = js.native
    
    def writeNull(): Unit = js.native
    
    def writeOID(s: String, tag: Double): Unit = js.native
    
    def writeString(s: String): Unit = js.native
    def writeString(s: String, tag: Double): Unit = js.native
    
    def writeStringArray(strings: js.Array[String]): Unit = js.native
  }
}
